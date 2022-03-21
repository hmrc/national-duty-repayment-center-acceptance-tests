**This is a template README.md.  Be sure to update this with project specific content that describes your ui test project.**

# national-duty-repayment-center-acceptance-tests
UI test suite for the `NDRC` using WebDriver and `cucumber`.  

## Running the tests

Prior to executing the tests ensure you have:
 - Appropriate [drivers installed](#install-driver-binary) - to run tests against locally installed Browser
 - Installed [MongoDB](https://docs.mongodb.com/manual/installation/) 
 - Installed/configured [service manager](https://github.com/hmrc/service-manager).
 - Mongo running on port 27017

Run the following command to start services locally:

    sm --start NDRC_ALL -r --appendArgs '{"NATIONAL_DUTY_REPAYMENT_CENTER_FRONTEND":["-J-Dmicroservice.services.address-lookup-frontend.port=6001"]}'

NDRC acceptance tests use [Wire Mock](https://wiremock.org/) to stub Address Lookup Frontend UI, hence the append args mapping `address-lookup-frontend` config to port `6001`

To run tests against `chromedriver`, execute the `run-acceptance-tests-local.sh` script:

    ./run-acceptance-tests-local.sh

If you are able to use Docker, and wish to run tests against a Docker-ised `remote-chrome` instance, once you have spun up your container, execute the `run-acceptance-tests-local-jenkins.sh` script:

    ./run-acceptance-tests-local-jenkins.sh

The script defaults to the `local` environment with the locally installed `chrome` driver binary.  For a complete list of supported param values, see:
 - `src/test/resources/application.conf` for **environment** 
 - [webdriver-factory](https://github.com/hmrc/webdriver-factory#2-instantiating-a-browser-with-default-options) for **browser-driver**
 
The script runs the following sbt command.  Run this command directly if you want to use different drivers or environments

    sbt -Dbrowser="chrome" -Denvironment="local" "testOnly ndrcApplication.suites.RunSuite"

#### Running the tests against a test environment

To run the tests against an environment set the corresponding `host` environment property as specified under
 `<env>.host.services` in the [application.conf](/src/test/resources/application.conf). 

For example, to execute against QA environment using Chrome remote-webdriver

    sbt -Dbrowser="remote-chrome" -Denvironment="qa" "testOnly ndrcApplication.suites.RunSuite"

## Running ZAP tests

ZAP tests can be automated using the HMRC [zap-automation](https://github.com/hmrc/zap-automation) library. It is not mandatory to do so and should not be considered a substitute for manual exploratory testing using OWASP ZAP.

#### Tagging tests for ZAP

It is not required to proxy every journey test via ZAP. The intention of proxying a test through ZAP is to expose all the
 relevant pages of an application to ZAP. So tagging a subset of the journey tests or creating a 
 single ZAP focused journey test is sufficient.

#### Configuring the browser to proxy via ZAP 

Setting the system property `zap.proxy=true` configures the browser specified in `browser` property to proxy via ZAP. 
This is achieved using [webdriver-factory](https://github.com/hmrc/webdriver-factory#proxying-trafic-via-zap).  

#### zap-automation config
Running ZAP tests require passing a zap-automation config object to the zap-automation library. `zap-automation` config is 
defined in the [application.conf](/src/test/resources/application.conf). The config is passed to the `zap-automation`
library via [ZapSpec](/src/test/scala/uk/gov/hmrc/test/ui/ZapSpec.scala) from which the ZAP tests are triggered.

#### Executing a DAST ZAP test

The shell script `dast_zap.sh.sh` is available to execute ZAP tests. The script first proxies a set of journey tests, 
tagged as `ZapTests`, via ZAP. Upon completion, the script then triggers a ZAP scan for the provided `zap-automation` config. 

For example, to execute ZAP tests locally using a Chrome browser

    ./dast_zap.sh.sh local chrome

For more information about ZAP tests, please refer to the `zap-automation` [documentation](https://github.com/hmrc/zap-automation/blob/master/README.md).

## Running accessibilityTest
The accessibility tests run as a subset of the main tests.  This can be run by using the script

    ./run_accessibilityTests.sh

### Running tests using BrowserStack
If you would like to run your tests via BrowserStack from your local development environment please refer to the [webdriver-factory](https://github.com/hmrc/webdriver-factory/blob/master/README.md/#user-content-running-tests-using-browser-stack) project.

## [Installing local driver binaries](#install-driver-binaries)

This project supports UI test execution using Firefox (Geckodriver) and Chrome (Chromedriver) browsers. 

See the `drivers/` directory for some helpful scripts to do the installation work for you.  They should work on both Mac and Linux by running the following command:

    ./installGeckodriver.sh <operating-system> <driver-version>
or

    ./installChromedriver <operating-system> <driver-version>

- *<operating-system>* defaults to **linux64**, however it also supports **macos**
- *<driver-version>* defaults to **0.21.0** for Gecko/Firefox, and the latest release for Chrome.  You can, however, however pass any version available at the [Geckodriver](https://github.com/mozilla/geckodriver/tags) or [Chromedriver](http://chromedriver.storage.googleapis.com/) repositories.

**Note 1:** *You will need to ensure that you have a recent version of Chrome and/or Firefox installed for the later versions of the drivers to work reliably.*

**Note 2** *These scripts use sudo to set the right permissions on the drivers so you will likely be prompted to enter your password.*
# national-duty-repayment-center-acceptance-tests
UI test suite for the `NDRC` using UITestRunner and `cucumber`.  

## Pre-requisites

Prior to executing the tests ensure you have:
 - Installed [MongoDB](https://docs.mongodb.com/manual/installation/) 
 - Installed/configured [service manager](https://github.com/hmrc/sm2).

### Services

Start Mongo as follows:

```bash
sudo mongod
```

Start `NDRC_ALL` services locally as follows:

```bash
sm2 --start NDRC_TESTS
```

## Tests

NDRC acceptance tests use NDRC stub to stub Address Lookup Frontend UI.
Run tests as follows:

* Argument `<browser>` must be `chrome`, `edge` or `firefox`.
* Argument `<environment>` must be `local`, `qa` or `staging`.

```bash
./run-tests.sh <browser> <environment>
```

## Formatting code
This library uses [Scalafmt](https://scalameta.org/scalafmt/), a code formatter for Scala. The formatting rules configured for this repository are defined within [.scalafmt.conf](.scalafmt.conf). Prior to checking in any changes to this repository, please make sure all files are formatted correctly.

To apply formatting to this repository using the configured rules in [.scalafmt.conf](.scalafmt.conf) execute:

```
sbt scalafmtAll 
or 
Intellij Format on save (recommended): Preferences > Editor > Code Style > Scala > Reformat on file save
```

To check files have been formatted as expected execute:

```
sbt scalafmtCheckAll scalafmtSbtCheck
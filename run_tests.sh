#!/bin/bash
ENV=${1:-local}
BROWSER=${2:-chrome}
DRIVER=

if [ "$BROWSER" = "chrome" ]; then
    DRIVER="-Dwebdriver.chrome.driver=/usr/local/bin/chromedriver"
elif [ "$BROWSER" = "firefox" ]; then
    DRIVER="-Dwebdriver.gecko.driver=/usr/local/bin/geckodriver"
fi

sbt -Dbrowser=chrome -Dzap.proxy=false -Dwebdriver.chrome.driver=/usr/local/bin/chromedriver "testOnly uk.gov.hmrc.test.ui.Runner"

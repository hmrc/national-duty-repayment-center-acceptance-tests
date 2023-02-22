#!/bin/bash

ENV=${1:-local}
BROWSER=${2:-headless-chrome}
DRIVER=

if [ "$BROWSER" = "remote-chrome" ] || [ "$BROWSER" = "chrome" ] || [ "$BROWSER" = "headless-chrome" ]; then
    DRIVER="-Dwebdriver.chrome.driver=/usr/local/bin/chromedriver"
elif [ "$BROWSER" = "firefox" ]; then
    DRIVER="-Dwebdriver.gecko.driver=/usr/local/bin/geckodriver"
fi

sbt -Dbrowser=$BROWSER -Denvironment=$ENV $DRIVER "testOnly ndrcApplication.suites.RunSuite"

#!/usr/bin/env bash

sbt -Dbrowser=remote-chrome -Denvironment=local -Dwebdriver.chrome.driver=/usr/local/bin/chromedriver "testOnly ndrcApplication.suites.RunZAP"
#!/bin/bash

# Run the tests that we want to proxy through ZAP
sbt -Dbrowser="remote-chrome" -Denvironment="local" -Dzap.proxy=true "testOnly ndrcApplication.suites.RunSuite"

# call zapRunner to trigger spider, active scan and generate a report
sbt 'testOnly ndrcApplication.utils.ZapRunner'

#!/bin/bash

sbt -Dbrowser="remote-chrome" -Denvironment="qa" "testOnly ndrcApplication.suites.RunSuiteQA"
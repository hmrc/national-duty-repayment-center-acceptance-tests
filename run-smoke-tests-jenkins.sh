#!/bin/bash

sbt -Dbrowser="remote-chrome" -Denvironment="staging" "testOnly ndrcApplication.suites.RunSmoke"
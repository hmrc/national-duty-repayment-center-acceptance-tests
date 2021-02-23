#!/bin/bash

sbt -Dbrowser="remote-chrome" -Denvironment="local" "testOnly ndrcApplication.suites.RunAccessibility"

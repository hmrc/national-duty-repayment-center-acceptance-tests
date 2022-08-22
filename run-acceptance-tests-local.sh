#!/bin/bash

sbt -Dbrowser="headless-chrome" -Denvironment="local" "testOnly ndrcApplication.suites.RunSuite"
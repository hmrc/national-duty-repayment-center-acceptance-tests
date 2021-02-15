#!/bin/bash

sbt -Dbrowser="chrome" -Denvironment="local" "testOnly ndrcApplication.suites.RunSuite"
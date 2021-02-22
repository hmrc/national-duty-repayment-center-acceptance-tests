#!/bin/bash

sbt -Dbrowser="remote-chrome" -Denvironment="local" "testOnly ndrcApplication.utils.RunAccessibility"

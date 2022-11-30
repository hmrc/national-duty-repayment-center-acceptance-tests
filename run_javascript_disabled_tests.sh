#!/bin/bash

sbt -Dbrowser="remote-chrome" -Denvironment="local" -Ddisable.javascript=true "testOnly ndrcApplication.suites.JsDisabledRunSuite"
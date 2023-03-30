#!/bin/bash

sbt -Dbrowser="firefox" -Denvironment="local" -Ddisable.javascript=true "testOnly ndrcApplication.suites.JsDisabledRunSuite"
#!/usr/bin/env bash

BROWSER=${1:-chrome}
ENVIRONMENT=${2:-local}

sbt clean -Dbrowser="${BROWSER}" -Denvironment="${ENVIRONMENT}" -Dbrowser.option.headless=true "testOnly ndrcApplication.suites.RunSuite" testReport

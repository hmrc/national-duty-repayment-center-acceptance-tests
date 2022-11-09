#!/usr/bin/env bash
sbt -Dbrowser=remote-chrome -Denvironment=staging clean "testOnly ndrcApplication.suites.SmokeRunner"
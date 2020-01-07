#!/bin/bash

## Starting the Deployment Process
echo -e "#################### Starting the deployment ###########################\n"

## Set the error logging from here
set -e

# Change to project repo directory
cd /Users/astikanand/IdeaProjects/LearnJavaProject

# Get the current date and time for the commit
# shellcheck disable=SC2006
COMMIT_TIME=`date '+%A %d-%B-%Y at %I:%M %p'`

# Commit changes and push
git add --a
git commit -m "Last updated on $COMMIT_TIME"
git push

## Stop the error logging
set +e

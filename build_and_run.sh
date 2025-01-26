#!/bin/bash

set -e
javac src/**/*.java

pushd src
java app.App
popd
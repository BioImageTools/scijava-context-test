#!/bin/sh
# Download and execute the SciJava CI build script
curl -fsLO https://raw.githubusercontent.com/scijava/scijava-scripts/main/ci-build.sh
sh ci-build.sh

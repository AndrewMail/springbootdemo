#!/bin/sh
ls
pwd
cd springbootdemo-001
pwd
echo "编译"
mvn -Dmaven.test.skip=true clean package



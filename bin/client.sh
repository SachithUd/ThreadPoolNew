#!/usr/bin/env bash

mvn -f ../client/pom.xml clean install

java -cp ../client/target/client-1.0-SNAPSHOT.jar com.example.tcp.server.project.SimpleClient

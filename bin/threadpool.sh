#!/usr/bin/env bash

mvn -f ../server/pom.xml clean install

java -cp ../server/target/server-1.0-SNAPSHOT.jar com.example.tcp.server.project.SimpleServer
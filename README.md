![Maven Build](https://github.com/ryanadams-code/qa-automation-sample/actions/workflows/maven.yml/badge.svg)

# QA Automation Sample (Java + Maven + JUnit)

## QA Automation Sample

This project demonstrates basic unit testing implementation using Maven and JUnit 5.

# Purpose
To simulate validation logic testing in a payment or monitoring system environment.

# Covered Test Scenario
 - CPU threshold alert validation
 - Negative transaction prevention
 - Business rule validation
 - Boundary testing
 
# Tech Stack
 - Java 17
 - Maven
 - JUnit 5

# How to Build
## Build & Run

Make sure Java 17 and Maven are installed.
Install dependencies and run tests

'''bash
    mvn test
'''

# Test Coverage

These unit tests validate:
 - Threshold-based CPU alert logic  
 - Business rule for transaction amount validation  
 - Positive and negative scenarios  
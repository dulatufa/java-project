# Java Project - Automated Software Delivery Pipeline

This project demonstrates an automated CI/CD pipeline using AWS services including CodeCommit, CodeBuild, and CodePipeline.

## Features
- Java application with basic functionality.
- CI/CD pipeline that:
  - Pulls source code from CodeCommit.
  - Builds the project using CodeBuild.
  - Stores build artifacts in an S3 bucket.

## Requirements
- AWS Account with permissions to create CodeCommit, CodeBuild, CodePipeline, and S3 resources.
- Java 17 (Amazon Corretto).
- AWS CLI configured locally.

## Build Process
1. Compile Java source code using Apache Ant.
2. Run unit tests using JUnit.
3. Package the application into a `.jar` file.

## Deployment
- CloudFormation template provisions the necessary AWS infrastructure for the pipeline.



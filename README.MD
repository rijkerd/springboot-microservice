# Getting Started

A walkthrough to build production ready spring boot container images without Dockerfile.

## Prerequisites
* [Docker](https://www.docker.com/) 
* [Pack](https://buildpacks.io/docs/tools/pack/)
* [Spring boot](https://spring.io/projects/spring-boot)

## Step 1: Initial
Ensure the above prerequisites are installed correctly and working.


## Step 2: Build Image
`
pack build springboot-microservice --builder=paketobuildpacks/builder-jammy-base
`

Note: 
* springboot-microservice -> is the name of the container images
* paketobuildpacks/builder-jammy-base -> Is the builder used to build the java spring boot application

## Step 3: Verify the Image
`
docker images | grep springboot-microservice
`

## Step 4: Run Image
`
docker run -d -p 8090:8090 springboot-microservice
`

## Step 5: Test the Application
`
curl -i http://0.0.0.0:8090/hello
`

## Step 6: Check health of the Application
`
curl -i http://0.0.0.0:8090/actuator/health
`









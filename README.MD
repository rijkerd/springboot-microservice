# Getting Started

A guide on creating production-ready Java Spring Boot container images without the use of a Dockerfile.

## Prerequisites
* [Docker](https://www.docker.com/) 
* [Pack](https://buildpacks.io/docs/tools/pack/)
* [Spring boot](https://spring.io/projects/spring-boot)

## Step 1: Clone the repository
```
git clone https://github.com/rijkerd/springboot-microservice.git
```

## Step 2: Build Image
```
pack build springboot-microservice --builder=paketobuildpacks/builder-jammy-base
```

Note: 
* springboot-microservice -> is the name of the container images
* paketobuildpacks/builder-jammy-base -> Is the builder used to build the java spring boot application

## Step 3: Verify the Image
```
docker images | grep springboot-microservice
```

## Step 4: Run Image
```
docker run -d -p 8090:8090 springboot-microservice
```

## Step 5: Test the Application
```
curl -i http://0.0.0.0:8090/hello
```

## Step 6: Check health of the Application
```
curl -i http://0.0.0.0:8090/actuator/health
```



### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.1.5-SNAPSHOT/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.1.5-SNAPSHOT/maven-plugin/reference/html/#build-image)
* [Spring Configuration Processor](https://docs.spring.io/spring-boot/docs/3.1.5-SNAPSHOT/reference/htmlsingle/index.html#appendix.configuration-metadata.annotation-processor)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.1.5-SNAPSHOT/reference/htmlsingle/index.html#web)
* [Spring Boot Actuator](https://docs.spring.io/spring-boot/docs/3.1.5-SNAPSHOT/reference/htmlsingle/index.html#actuator)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
* [Building a RESTful Web Service with Spring Boot Actuator](https://spring.io/guides/gs/actuator-service/)









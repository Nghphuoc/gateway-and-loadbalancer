# Getting Started

### Reference Documentation

For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/4.0.5/gradle-plugin)
* [Create an OCI image](https://docs.spring.io/spring-boot/4.0.5/gradle-plugin/packaging-oci-image.html)

### Additional Links

These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)

### API-GATEWAY run port 8080
- Acting as a proxy, all requests must go through this port.
- LoadBalancer config at here.
### EUREKA-SERVER run port 8761
- Eureka in Spring Cloud acts as a central service registry for microservices, allowing them to register themselves and discover others without hardcoding IPs
### APPLICATION run port 8081
- Process Business Logic.
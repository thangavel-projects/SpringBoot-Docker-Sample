# SpringBoot RESTFul on Docker Sample

- This is sample POC for Spring Boot with Docker. See below command to run docker image,
    
   ```
    mvn package docker:build
   ```
    
 - Check docker images using the below commands, the image name used here **springio/samplerestful** and Port number is **8761**
 
 ```
    docker images
  ```
  
  ```
    docker run -ti -p 8761:8761 springio/samplerestful /bin/bash
  ```

Just hit browser using **localhost:8761** then you can see Eureka server up and running.  Hit **localhost:8761/greetings** for hello world message in browser.

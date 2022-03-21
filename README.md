# songr
## how to run application
* Clone this repo
* add dependencies 
```
dependencies {
	implementation 'org.springframework.boot:spring-boot-starter-thymeleaf'
	implementation 'org.springframework.boot:spring-boot-starter-web'
	developmentOnly 'org.springframework.boot:spring-boot-devtools'
	testImplementation 'org.springframework.boot:spring-boot-starter-test'
}

```
* run in IDEA
* Visit ``http://localhost:8080/``

# my routs
* ``/``
* ``/hello``
* ``/upperCase/{name}``
* ``/albums``
----
# Lab 12 Overview
### Continue working in the same songr webapp you generated for the previous lab. Ensure that you have all of these dependencies in your build.gradle. (Note that when you add the dependencies on postgres and JPA, your app will stop working until you have the configuration in application.properties to access your Postgres database.)

****
## Feature Tasks
* Album model should be saved in a database
* Album has
   * Title
   * Artist
   * SongCount
   * Length
   * Img Url
* A user should be able to see information about all the albums on the site.
* A user should be able to add albums to the site.
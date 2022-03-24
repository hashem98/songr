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
* A user should be able to add albums to the site from form in album.html

## to run the app from CLI : ``./gradlew bootRun``

# Lab 13 Overview
## add  Songs to album 
## Feature Tasks
* Create a Song model
* A user should be able to see information about all the songs on the site.
* A user should be able to view a page with data about one particular album.
* A user should be able to add songs to an album.
* A user should be able to see the songs that belong to an album when looking at that album.
 
## to run the app from CLI : ``./gradlew bootRun``
# Note :
>>To view the album's content or to add to it ,Click on the album image 

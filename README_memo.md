# my-first-gitlab

## How to use

```
# We assume you are in the top directory of the project.

# startup Mysql
cd docker
docker compose up -d

# startup SpringBoot app
cd ..
./mvnw spring-boot:run
```


## Trouble shooting

mvnwが動かない

The error message said that.

```
Error: Could not find or load main class org.apache.maven.wrapper.MavenWrapperMain
```


https://www.baeldung.com/maven-wrapper
```
mvn -N wrapper:wrapper
```
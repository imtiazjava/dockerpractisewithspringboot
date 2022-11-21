# dockerpractisewithspringboot

----------------------------------------------
IN ORDER TO PULL THE IMAGE WE USE THE FOLLOWING COMMAND

```
docker pull mongo:latest
```

------------------------------------------------------

IN ORDER TO LIST OUT ALL THE IMAGES WE USE THE FOLLOWING COMMAND:

```
docker images
```
---------------------------------------------------------

IN ORDER TO RUN THE IMAGE WE USE THE FOLLOWING COMMAND:

```
docker run –name mymongo -d -p 27011:27017 mongo
- This command is used to run the image with port 27011 and name mymongo

```
-------------------------------------------------------------

IN ORDER TO LIST ALL THE CONTAINER WHICH IS RUNNING WE CAN USE THE FOLLOWING COMMAND:
```
docker container ps

```
-------------------------------------------------------------------
WORKING WITH MYSQL

```
docker pull mysql:8.0

docker run --name d-mysql -p 3307:3306 -e MYSQL_ROOT_PASSWORD=my_secret -d mysql:8.0

```
--------------------------------------------------------------------------
IN ORDER TO PUSH THE IMAGE TO DOCKER HUB WE USE THE FOLLOWING COMMAND:
```
 docker tag  myapp:1.0 imtiaz123/myapp
 
 docker push imtiaz123/myapp
```


# Dockerized Microservices Project

This project consists in Dockerized microservices using springboot and docker-compose.

## Requirements
- Docker
- Java jdk -17 with Maven
![image](https://github.com/BryanAtiencia/Proyectos/assets/107514773/77da2c5d-9dec-44b2-8b90-f67bd9d81411)


## Project Structure
We have 3 folders with 3 projects springboot, each has his own Dockerfile, and the docker-compose.yml
![image](https://github.com/BryanAtiencia/Proyectos/assets/107514773/c48247be-6068-4a21-a811-8a5866a49bea)


## Run
Clone the repo in your machine.

to run the project you need open the project on VSC and execute the next command:
```
docker-compose up --build
```
![image](https://github.com/BryanAtiencia/Proyectos/assets/107514773/2254fa06-6ad0-4552-8119-b8ce8d08d65b)

##### Note: Make sure to be in the right directory in each step.

## Access to the microservices

http://localhost:8081/holamundo

http://localhost:8082/holaspider

http://localhost:8083/hora

## If you see the "Whitelabel Error Page" with a 404 error:

- Build each microservice on command line with:
```
mvn clean package
```
- Check that your application controllers are correctly mapped.
- Check the directory of your docker-compose.yml

## Annex
![image](https://github.com/BryanAtiencia/Proyectos/assets/107514773/23f5c298-7d5d-454c-8ef6-c64ce2067f4f)

![image](https://github.com/BryanAtiencia/Proyectos/assets/107514773/fc9495e4-cceb-40d7-86ae-3aa4602c0627)

### Results 

![image](https://github.com/BryanAtiencia/Proyectos/assets/107514773/8dcb0945-cf02-45a2-ae8e-19bc63cfe8cd)

![image](https://github.com/BryanAtiencia/Proyectos/assets/107514773/85a7eb6b-4f54-4d00-8273-b40b861f97e5)

![image](https://github.com/BryanAtiencia/Proyectos/assets/107514773/2cec2421-d41a-4579-a86a-32fec4d5dac5)


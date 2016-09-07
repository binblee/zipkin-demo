# Spring Cloud Sleuth Zipkin Demo

## Run application

```
cd tracedemo
./gradlew bootRun
```

## Run Zipkin server

```
cd zipkin 
./gradlew bootRun
```

Visit [http://localhost:9411/](http://localhost:9411/) to see zipkin dashboard


## Trace

```
curl http://localhost:8080/callhome
```

## Aliyun Container Service Deployment

Deploy use docker-compose.yml
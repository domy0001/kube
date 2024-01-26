#!/bin/bash
docker run -d -p 5000:5000 --name registry registry:2.7
docker tag kube-app-kafka-producer:latest localhost:5000/kube-app-kafka-producer:latest
docker tag kube-app-kafka-consumer:latest localhost:5000/kube-app-kafka-consumer:latest

docker push  localhost:5000/kube-app-kafka-consumer:latest
docker push  localhost:5000/kube-app-kafka-producer:latest
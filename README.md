Test project

For correct use, before using send-file endpoint - you need to create and run kafka with zookeeper.
And create the according topics. To do that you will need: 
1. Navigate to `docker` directory
2. Run `docker-compose up -d`
3. After containers started, execute `docker exec -it <kafka_container_id> sh`
4. Inside the container navigate to `opt/kafka`
5. Execute `./bin/kafka-topics.sh --create --zookeeper zookeeper:2181 --replication-factor 1 --partitions 5 --topic files-topic`

After that, the topics will be created. You can listen to the incoming message with `./bin/kafka-console-consumer.sh --topic files-topic --from-beginning --bootstrap-server localhost:9092`


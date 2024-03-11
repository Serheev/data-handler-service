# Data handle service

Receives data
from [Data generator service](https://github.com/Serheev/data-generator-service)
with Apache Kafka.

Next, data is processed
by [Client info service](https://github.com/Serheev/data-info-service).

### Usage

To start an application you need to pass variables to `.env` file.

You can find Docker compose file in `docker/docker-compose.yaml`.

Application is running on port `8082`.

All insignificant features (checkstyle, build check, dto validation) are not
presented.

Just after startup application will try to connect to Apache Kafka and begin to
listen topics from `KAFKA_SUBSCRIBED_TOPICS`.

### Docker

You can run all applications via `docker-compose.yaml` from `docker`
folder.

It contains all needed configs.

**NOTE**: after Debezium connect is started, apply source config manually.

```shell
cd /on-startup/

curl -i -X POST -H "Accept:application/json" -H \
"Content-Type:application/json"  http://localhost:8083/connectors/ -d \
@postgres-connector.json
```

Note that all services must be in the same network to communicate with each
other.

Debezium needs different group id than Kafka uses, so default values from `.env`
are 1 and 2.

Debezium is configured to push messages to `data` topic due to routing in
configuration.
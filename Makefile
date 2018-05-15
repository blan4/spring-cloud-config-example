jarService1:
	./gradlew service_1:clean service_1:assemble

jar: jarService1

start: jar
	docker-compose up

reload: jar
	docker-compose restart service-1

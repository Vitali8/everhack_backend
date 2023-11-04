FROM bellsoft/liberica-openjdk-alpine:17
WORKDIR /app
RUN addgroup docker
RUN adduser \
    --no-create-home \
    --gecos "" \
    --ingroup docker \
    --disabled-password \
    docker
COPY target/*.jar ./app.jar
CMD java $JAVA_OPTS -jar app.jar

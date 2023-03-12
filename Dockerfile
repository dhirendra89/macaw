FROM openjdk:21-slim

RUN mkdir /home/app

WORKDIR /home/app

COPY ./build/libs /home/app

ENV JAVA_OPTS="-Xms128m -Xmx256m"

CMD ["java", "-jar", "macaw-1.0.jar"]
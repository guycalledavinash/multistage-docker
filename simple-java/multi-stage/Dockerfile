FROM ubuntu

WORKDIR /app

COPY . .

RUN apt update && apt install default-jre

RUN javac -d . Multiply.java && jar cvf multiply.jar .

FROM openjdk:latest

COPY --from=builder /app/multiply.jar /app/multiply.jar

ENTRYPOINT ["java", "-jar", "multiply.jar"]

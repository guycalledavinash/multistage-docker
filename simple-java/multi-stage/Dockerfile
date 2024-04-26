FROM ubuntu AS build

WORKDIR /app

COPY . .

RUN apt update && \
    apt install default-jre && \
    javac -d . multiply.java && \
    jar cvf multiply.jar .

FROM openjdk:latest

# Copy the compiled JAR file from the builder stage
COPY --from=builder /app/multiply.jar /app/multiply.jar

ENTRYPOINT ["java", "-jar", "multiply.jar"]

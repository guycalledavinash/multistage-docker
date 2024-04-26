FROM ubuntu

WORKDIR /app

COPY . .

RUN apt update && apt install default-jre

RUN javac -d . Multiply.java && jar cvf multiply.jar .

ENTRYPOINT ["java", "-jar", "multiply.jar"]

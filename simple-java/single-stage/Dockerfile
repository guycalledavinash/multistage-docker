FROM ubuntu

WORKDIR /app

COPY . .

RUN apt update && \
    apt install -y default-jre && \
    javac -d . multiply.java && \
    jar cvf multiply.jar .

ENTRYPOINT ["java", "-jar", "multiply.jar"]

FROM openjdk

WORKDIR /

COPY . /

RUN javac PersonQuiz.java

CMD [ "java", "PersonQuiz" ]
## Integration between Java and PostgreSQL instance on Windows

The first thing you have to do is download the JDBC driver (JAR file). For the time of this development the jar file is called "postgresql-42.2.18.jar".

Then you have to create (or update) the CLASSPATH system variable.

In order to execute your class your have to invoke JAVAC compiler indicating the JDBC driver's name:

```
C:\jdk-15\bin>java -Djdbc.drivers=org.postgresql.Driver prueba
```

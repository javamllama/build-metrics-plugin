cd C:\workspace\jenkinsplugins\build-metrics-plugin
set MAVEN_OPTS=-Xdebug -Xrunjdwp:transport=dt_socket,server=y,address=8000,suspend=n
mvn hpi:run
pause

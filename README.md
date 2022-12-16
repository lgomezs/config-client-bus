Spring Cloud Config Client Refresh Strategies
==========================

# Required:
 
  start config server bus 

      https://github.com/lgomezs/config-server-bus

# Generate Library

    mvn clean install 

# start application

    mvn spring-boot:run

# get properties

 - view properties with endpoint:  http://localhost:8080/config

    view : javasampleapproach 

 - Now change properties in repository and commit changes.

 - Can validate that it doesn't show the property change yet.
    http://localhost:8080/config

 - execute POST to config server:

      curl --location --request POST 'http://localhost:8888/monitor' \
      --header 'X-Github-Event: push' \
      --header 'Content-Type: application/json' \
      --data-raw '{
      "commits": [
      {
      "modified": [
      "application.properties"
      ]
      }
      ]
      }'

  - Now you can view your change
    http://localhost:8080/config


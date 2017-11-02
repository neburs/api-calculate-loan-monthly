This is a simple api to calculate the monthly Re Payment quotes following this simple formula

Formula used to calculate the monthly payment

     (interest * quantity requested)                0.07 * 1000
  ------------------------------------  =>  --------------------------- = 76.715309691
     1 - (1 + interest) ^ (- quotes)              1 - (1 + 0.07)^-36


Requirements

- Java 8 sdk
- docker
- docker-compose

To Build & run

1. Run ./gradlew clean copyWarToDocker

2. Go to docker/develop directory and run docker-compose up -d

3. Go to your favourite bowser and write http://localhost:8888/
   You must view the next message:
   
   {"status": "The api is live"}
   
   
To play

You can calculate your monthly repayment go to calculate-monthly-repayment url and indicate tne interest, the quantity
and the quotes.

Ex:
http://localhost:8888/calculate-monthly-repayment?interest=0.07&quantity=1000&quotes=36

{"interest": 0.07,"quantity": 1000.0,"quotes": 36,"monthly-repayment": 76.71530969127662}
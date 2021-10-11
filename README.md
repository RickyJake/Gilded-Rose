# Gilded-Rose


## Prerequisites

Clone and build project [Gilded-Rose](https://github.com/RickyJake/Gilded-Rose/tree/main/Java "github project") 

### Minimum version

Maven 3.6.x https://maven.apache.org/

Java 1.8


### Build Maven package fat jar

mvn clean package



## Test scenario


### Prerequisites

*   Java 8
*   Junit 5 Jupiter

Scenarios are located under package `com.gildedrose` in directory `src/test/java`

An example implementation is `GildedRoseTest.java`

### Run

mvn test


## Code Explain Choices

To resolve this Kata, I've used the Specification Pattern. Because we have many rules and many oncoming rules, I've tought the best choice would be
to have a rule pattern.
That's why I have a rule's package where in business I specify all the business rules.
In this package, there is the specification's package where I design the pattern.


## Test Explain

In the test, I've not covered all the tests because it wasn't the goal of the exercise but I've covered the main tests.
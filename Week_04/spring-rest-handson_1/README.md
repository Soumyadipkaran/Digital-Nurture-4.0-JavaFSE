## Hands-on 1 – Create a Spring Web Project using Maven
Created a Spring Boot project with group `com.cognizant` and artifact `spring-learn`.
Added Spring Web and DevTools dependencies.
Built the project using Maven.
Added a `System.out.println()` just to verify the setup.
## Hands-on 2 – Spring Core – Load SimpleDateFormat from Spring Configuration XML
Created `date-format.xml` in src/main/resources.
Defined a SimpleDateFormat bean with pattern dd/MM/yyyy.
Loaded the bean using ApplicationContext in displayDate() method.
Parsed the date '31/12/2018' and printed the result.
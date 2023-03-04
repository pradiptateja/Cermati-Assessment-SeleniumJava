# Register at Cermati.com

Tools Used: Selenium, Cucumber, Junit, JavaFaker, and Maven Surefire Plugin

# Setting up and running tests

* Open project as Maven Project in Eclipse, Intellij, or other IDE. Ensure all dependencies are installed properly
* You may required to adjust the absolute directory for variables
```
{projectDirectory}src/test/java/config/setUp.java
```
* Install Maven on PC/Laptop used
* Open terminal/cmd, go to the project directory
* Run this command:
```
mvn clean test
``` 
* Screenshots when any successful and failed test will be generated in this directory:
```
{projectDirectory}src/test/resources/screenshots
```
* HTML Report will be generated in this directory:
```
{projectDirectory}target/HTML_Report.html
```

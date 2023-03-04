package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class setUp {

    protected static WebDriver driver;
    protected static WebDriverWait wait;

    protected static int duration = 30;
    protected static Boolean isHeadless = false;

    protected static String WebURL = "https://www.cermati.com/gabung";

    //directoryVariable

    protected static String variableEmail = "C:\\Users\\ThinkPad\\IdeaProjects\\CermatiAssessment\\src\\test\\resources\\Variable\\variableEmail.txt";
    protected static String variableFirstName ="C:\\Users\\ThinkPad\\IdeaProjects\\CermatiAssessment\\src\\test\\resources\\Variable\\variableFirstName.txt";
    protected static String variableLastName = "C:\\Users\\ThinkPad\\IdeaProjects\\CermatiAssessment\\src\\test\\resources\\Variable\\variableLastName.txt";
    protected static String variablePassword = "C:\\Users\\ThinkPad\\IdeaProjects\\CermatiAssessment\\src\\test\\resources\\Variable\\variablePassword.txt";
    protected static String variablePhoneNumber = "C:\\Users\\ThinkPad\\IdeaProjects\\CermatiAssessment\\src\\test\\resources\\Variable\\variablePhoneNumber.txt";
    protected static String variableRegency = "C:\\Users\\ThinkPad\\IdeaProjects\\CermatiAssessment\\src\\test\\resources\\Variable\\variableRegency.txt";

}
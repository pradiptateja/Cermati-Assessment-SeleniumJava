package stepDefinitions;

import com.github.javafaker.Faker;
import config.setUp;
import io.cucumber.java.en.Then;
import object.*;
import helper.accessFiles;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;
import java.util.Random;

public class register extends setUp {

    pageRegister pageRegister = new pageRegister();
    pageOTP pageOTP = new pageOTP();
    Faker faker = new Faker();
    accessFiles accessFiles = new accessFiles();

    String email = faker.internet().emailAddress();
    String phoneNumber = "0878" + faker.number().digits(8);
    String password = faker.internet().password(8,50,true,true,true);
    String firstName = faker.name().firstName();
    String lastName = faker.name().lastName();
    @Given("user is at register page")
    public void user_is_at_register_page() {
        WebElement logo_Cermati = wait.until(ExpectedConditions.presenceOfElementLocated(pageRegister.getLogo_Cermati()));
        logo_Cermati.isDisplayed();

        WebElement btn_register = wait.until(ExpectedConditions.presenceOfElementLocated(pageRegister.getBtn_register()));
        btn_register.isDisplayed();
    }
    @When("user inputs email")
    public void user_inputs_email() {
        WebElement input_email = wait.until(ExpectedConditions.presenceOfElementLocated(pageRegister.getInput_email()));
        input_email.sendKeys(email);

        accessFiles.writeToFile(email,variableEmail);

    }
    @When("user inputs phone number")
    public void user_inputs_phone_number() {
        WebElement input_phoneNumber = wait.until(ExpectedConditions.presenceOfElementLocated(pageRegister.getInput_phoneNumber()));
        input_phoneNumber.sendKeys(phoneNumber);
        accessFiles.writeToFile(phoneNumber,variablePhoneNumber);
    }
    @When("user inputs password")
    public void user_inputs_password() {
        WebElement input_password = wait.until(ExpectedConditions.presenceOfElementLocated(pageRegister.getInput_password()));
        input_password.sendKeys(password);
        accessFiles.writeToFile(password, variablePassword);
    }
    @When("user re-inputs password")
    public void user_re_inputs_password() {
        WebElement input_confirmPassword = wait.until(ExpectedConditions.presenceOfElementLocated(pageRegister.getInput_confirmPassword()));
        input_confirmPassword.sendKeys(password);
    }
    @When("user inputs First Name")
    public void user_inputs_first_name() {
        WebElement input_firstName = wait.until(ExpectedConditions.presenceOfElementLocated(pageRegister.getInput_firstName()));
        input_firstName.sendKeys(firstName);
        accessFiles.writeToFile(firstName,variableFirstName);
    }
    @When("user inputs Last Name")
    public void user_inputs_last_name() {
        WebElement input_lastName = wait.until(ExpectedConditions.presenceOfElementLocated(pageRegister.getInput_lastName()));
        input_lastName.sendKeys(lastName);
        accessFiles.writeToFile(lastName,variableLastName);
    }

    @When("user inputs Kabupaten or Kota")
    public void user_inputs_kabupaten_or_kota() throws InterruptedException {

        //inputting keyword to show possible option
        WebElement input_regency = wait.until(ExpectedConditions.presenceOfElementLocated(pageRegister.getInput_Regency()));
        input_regency.sendKeys("Kota");

        //waiting for the option comes up
        Thread.sleep(3000);

        //retrieving all options data
        List<WebElement> list_regency = driver.findElements(pageRegister.getList_Regency());
        int listAmount = list_regency.size();

        String[] regencies = new String[listAmount];
        int i = 1;

        for (WebElement listRegencyLooping : list_regency) {
            String getValue = listRegencyLooping.getText();
            regencies[i-1]= getValue;
            i++;
        }

        //Randomize choosing the data
        Random random = new Random();
        int randomChoice = random.nextInt(listAmount);

        //selecting the chosen data
        WebElement selectRegency = wait.until(ExpectedConditions.presenceOfElementLocated(pageRegister.getSelect_Regency(regencies[randomChoice])));
        selectRegency.click();

        //storing chosen data to variable
        accessFiles.writeToFile(regencies[randomChoice], variableRegency);

    }
    @When("user clicks Daftar button")
    public void user_clicks_daftar_button() {
        WebElement btn_register = wait.until(ExpectedConditions.presenceOfElementLocated(pageRegister.getBtn_register()));
        btn_register.click();
    }

    @Then("user is directed to OTP verification page")
    public void user_is_directed_to_otp_verification_page() throws InterruptedException {

        Thread.sleep(3000);

        String pageSource = driver.getPageSource();
        Assert.assertTrue(pageSource.contains("verification"));
    }

    @Then("user can see OTP via Whatsapp")
    public void user_can_see_otp_via_whatsapp() {
        WebElement btn_OTPWhatsapp = wait.until(ExpectedConditions.presenceOfElementLocated(pageOTP.getBtn_OTPWhatsapp()));
        btn_OTPWhatsapp.isDisplayed();
    }

    @Then("user can see OTP via Message")
    public void user_can_see_otp_via_message() {
        WebElement btn_OTPMessage = wait.until(ExpectedConditions.presenceOfElementLocated(pageOTP.getBtn_OTPMessage()));
        btn_OTPMessage.isDisplayed();
    }


}

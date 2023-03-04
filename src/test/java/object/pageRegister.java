package object;

import org.openqa.selenium.By;

public class pageRegister {

    By logo_Cermati = By.xpath("//a[@href='/app']");
    public By getLogo_Cermati() {
        return logo_Cermati;
    }

    By btn_register = By.xpath("//p[text() = 'Daftar']/ancestor::button");
    public By getBtn_register() {
        return btn_register;
    }

    By input_email = By.xpath("//input[@id='email']");
    public By getInput_email() {
        return input_email;
    }

    By input_phoneNumber = By.xpath("//input[@id='mobilePhone']");
    public By getInput_phoneNumber() {
        return input_phoneNumber;
    }

    By input_password = By.xpath("//input[@id='password']");
    public By getInput_password() {
        return input_password;
    }

    By input_confirmPassword = By.xpath("//input[@name='confirmPassword']");
    public By getInput_confirmPassword() {
        return input_confirmPassword;
    }

    By input_firstName = By.xpath("//input[@id='firstName']");
    public By getInput_firstName() {
        return input_firstName;
    }

    By input_lastName = By.xpath("//input[@id='lastName']");
    public By getInput_lastName() {
        return input_lastName;
    }

    By list_Regency = By.xpath("//button[contains(@class, 'autocomplete__list')]//div");
    public By getList_Regency() {
        return list_Regency;
    }

    public By getSelect_Regency(String Regency) {
        By select_Regency = By.xpath("//div[text()='"+Regency+"']/parent::button");
        return select_Regency;
    }

    By input_Regency = By.xpath("//input[@name='cityAndProvince']");
    public By getInput_Regency() {
        return input_Regency;
    }
}

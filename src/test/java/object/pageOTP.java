package object;

import org.openqa.selenium.By;

public class pageOTP {

    By btn_OTPWhatsapp = By.xpath("//button[@data-button-name=\"send-otp-whatsapp\"]");
    public By getBtn_OTPWhatsapp() {
        return btn_OTPWhatsapp;
    }

    By btn_OTPMessage = By.xpath("//button[@data-button-name=\"send-otp-sms\"]");
    public By getBtn_OTPMessage() {
        return btn_OTPMessage;
    }
}


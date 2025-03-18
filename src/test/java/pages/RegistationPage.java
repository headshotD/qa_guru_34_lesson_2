package pages;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistationPage {
    public static SelenideElement firstNameInput = $("$firstName");
    public static SelenideElement lastNameInput = $(".lastName");

    public static void openPage() {
        open("https://demoqa.com/automation-practice-form");
    }


    public static void setFirstName(String value) {
        firstNameInput.setValue(value);
    }

    public static void setLastName(String value) {
        lastNameInput.setValue(value);
    }
}

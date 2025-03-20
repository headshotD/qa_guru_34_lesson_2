package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxPage {
    @Step("Открытие стартовой страницы TextBox")
    public static TextBoxPage openPage() {
        open("https://demoqa.com/text-box");
        return new TextBoxPage();
    }

    private final SelenideElement fullName = $("#userName"),
            userEmail = $("#userEmail"),
            currentAddress = $("#currentAddress"),
            permanentAddress = $("#permanentAddress"),
            submit = $("#submit"),
            resultName = $("#output #name");

    public TextBoxPage setFirstName(String value) {
        fullName.setValue(value);
        return this;
    }

    public TextBoxPage setUserEmail(String value) {
        userEmail.setValue(value);
        return this;
    }

    public TextBoxPage setCurrentAddress(String value) {
        currentAddress.setValue(value);
        return this;
    }

    public TextBoxPage setPermanentAddress(String value) {
        permanentAddress.setValue(value);
        return this;
    }

    public TextBoxPage clickSubmit() {
        submit.click();
        return this;
    }

    public void checkResult(String value) {
        resultName.shouldHave(text(value));
    }


}

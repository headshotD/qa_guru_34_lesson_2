package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import pages.components.CalendarComponent;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistationPage {
    @Step("Открытие стартовой страницы")
    public static RegistationPage openPage() {
        open("https://demoqa.com/automation-practice-form");
        executeJavaScript("$('#footer').remove()");
        executeJavaScript("$('#fixedban').remove()");
        return new RegistationPage();
    }

    CalendarComponent calendarComponent = new CalendarComponent();
    private SelenideElement firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            emailInput = $("#userEmail"),
            genderWrapper = $("#genterWrapper"),
            userNumber = $("#userNumber"),
            calendarInput = $("#dateOfBirthInput"),
            subjectsInput = $("#subjectsInput");


    @Step("Set {{value}} to FirstName")
    public RegistationPage setFirstName(String value) {
        firstNameInput.setValue(value);
        return this;
    }

    @Step("Set {{value}} to LastName")
    public RegistationPage setLastName(String value) {
        lastNameInput.setValue(value);
        return this;
    }

    @Step("Set {{value}} to Email")
    public RegistationPage setEmailInput(String value) {
        emailInput.setValue(value);
        return this;
    }

    @Step("Set {{value}} to Gender")
    public RegistationPage setGender(String value) {
        genderWrapper.$(byText(value)).click();
        return this;

    }

    @Step("Set {{value}} to userNumber")
    public RegistationPage setUserNumber(String value) {
        userNumber.setValue(value);
        return this;
    }

    public RegistationPage setDateOfBirth(String day, String month, String year) {
        calendarInput.click();
        calendarComponent.setDate(day, month, year);

        return this;
    }

    @Step("Set {{value}} to Subjects")
    public RegistationPage setSubjects(String value) {
        subjectsInput.setValue(value).pressEnter();
        return this;
    }
    // Добавить остальные поля. Сначала Селенид элемент, потом метод, и потом в основной класс
}

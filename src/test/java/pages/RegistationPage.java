package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import pages.components.CalendarComponent;

import static com.codeborne.selenide.Condition.text;
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
            subjectsInput = $("#subjectsInput"),
            hobbiesCheckBoxReading = $("#hobbies-checkbox-2"),
            hobbiesCheckBoxMusic = $("#hobbies-checkbox-3"),
            uploadFile = $(".form-control-file"),
            currentAddress = $("#currentAddress"),
            stateDropDown = $("#state"),
            state = $("#react-select-3-option-2"),
            cityDropDown = $("#city"),
            city = $("#react-select-4-option-1"),
            submit = $("#submit"),
            results = $(".modal-body");


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
    public RegistationPage setSubjects(String value, String value2) {
        subjectsInput.setValue(value).pressEnter();
        subjectsInput.setValue(value2).pressEnter();
        return this;
    }

    @Step("Set {{value}} to hobbies")
    public RegistationPage setHobbies(String value, String value2) {
        hobbiesCheckBoxReading.parent().$(byText(value)).click();
        hobbiesCheckBoxMusic.parent().$(byText(value2)).click();
        return this;
    }

    @Step("Upload file {{value}}")
    public RegistationPage uploadFiles(String value) {
        uploadFile.uploadFromClasspath(value);
        return this;
    }

    @Step("Set {{value}} to currentAddress")
    public RegistationPage setCurrentAddress(String value) {
        currentAddress.setValue(value);
        return this;
    }

    public RegistationPage clickStateDropDown() {
        stateDropDown.click();
        return this;
    }

    public RegistationPage setState() {
        state.click();
        return this;
    }

    public RegistationPage clickCityDropDown() {
        cityDropDown.click();
        return this;
    }

    public RegistationPage setCity() {
        city.click();
        return this;
    }

    public RegistationPage clickSubmit() {
        submit.click();
        return this;
    }

    public RegistationPage result(String Student, String Email, String Mobile, String Gender, String
            DateofBirth, String Subjects, String Hobbies, String Picture, String Address, String StateAndCity) {
        results.shouldHave(text(Student));
        results.shouldHave(text(Email));
        results.shouldHave(text(Mobile));
        results.shouldHave(text(Gender));
        results.shouldHave(text(DateofBirth));
        results.shouldHave(text(Subjects));
        results.shouldHave(text(Hobbies));
        results.shouldHave(text(Picture));
        results.shouldHave(text(Address));
        results.shouldHave(text(StateAndCity));
        return this;
    }
}

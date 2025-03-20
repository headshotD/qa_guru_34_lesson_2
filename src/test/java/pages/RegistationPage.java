package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import pages.components.CalendarComponent;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistationPage {
    
    public static RegistationPage openPage() {
        open("https://demoqa.com/automation-practice-form");
        return new RegistationPage();
    }

    public RegistationPage removeBanner() {
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
        return this;
    }

    CalendarComponent calendarComponent = new CalendarComponent();
    private final SelenideElement firstNameInput = $("#firstName"),
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
            submit = $("#submit");


    public RegistationPage setFirstName(String value) {
        firstNameInput.setValue(value);
        return this;
    }

    public RegistationPage setLastName(String value) {
        lastNameInput.setValue(value);
        return this;
    }

    public RegistationPage setEmailInput(String value) {
        emailInput.setValue(value);
        return this;
    }

    public RegistationPage setGender(String value) {
        genderWrapper.$(byText(value)).click();
        return this;

    }

    public RegistationPage setUserNumber(String value) {
        userNumber.setValue(value);
        return this;
    }

    public RegistationPage setDateOfBirth(String day, String month, String year) {
        calendarInput.click();
        calendarComponent.setDate(day, month, year);

        return this;
    }

    public RegistationPage setSubjects(String value, String value2) {
        subjectsInput.setValue(value).pressEnter();
        subjectsInput.setValue(value2).pressEnter();
        return this;
    }

    public RegistationPage setHobbies(String value, String value2) {
        hobbiesCheckBoxReading.parent().$(byText(value)).click();
        hobbiesCheckBoxMusic.parent().$(byText(value2)).click();
        return this;
    }

    public RegistationPage uploadFiles(String value) {
        uploadFile.uploadFromClasspath(value);
        return this;
    }

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

    public void clickSubmit() {
        submit.click();
    }

}

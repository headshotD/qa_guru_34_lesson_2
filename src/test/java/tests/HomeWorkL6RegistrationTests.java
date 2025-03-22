package tests;

import org.junit.jupiter.api.Test;
import pages.RegistationPage;
import pages.components.ResultTableRegistationPageComponent;


public class HomeWorkL6RegistrationTests extends TestBase {

    @Test
    void RegistrationTest() {
        RegistationPage.openPage()
                .removeBanner()
                .setFirstName("Oleg")
                .setLastName("Namozov")
                .setUserNumber("1234567890")
                .setEmailInput("oleg@mail.ru")
                .setGender("Other")
                .setDateOfBirth("15", "April", "2020")
                .setSubjects("English", "Arts")
                .setHobbies("Reading", "Music")
                .uploadFiles("eda.tiff")
                .setCurrentAddress("My current address")
                .clickStateDropDown()
                .setState()
                .clickCityDropDown()
                .setCity()
                .clickSubmit();
        ResultTableRegistationPageComponent resultTable = new ResultTableRegistationPageComponent();
        resultTable.resultTable("Student Name", "Oleg Namozov");
        resultTable.resultTable("Student Email", "oleg@mail.ru");
        resultTable.resultTable("Gender", "Other");
        resultTable.resultTable("Mobile", "1234567890");
        resultTable.resultTable("Date of Birth", "15 April,2020");
        resultTable.resultTable("Subjects", "English, Arts");
        resultTable.resultTable("Hobbies", "Reading, Music");
        resultTable.resultTable("Picture", "eda.tiff");
        resultTable.resultTable("Address", "My current address");
        resultTable.resultTable("State and City", "Haryana Panipat");
    }

    @Test
    void minimalRegistrationFormTest() {
        RegistationPage.openPage()
                .removeBanner()
                .setFirstName("OLEG")
                .setLastName("NAMOZOV")
                .setGender("Other")
                .setUserNumber("1234567890")
                .clickSubmit();
        ResultTableRegistationPageComponent resultTable = new ResultTableRegistationPageComponent();
        resultTable.resultTable("Student Name", "OLEG NAMOZOV");
        resultTable.resultTable("Gender", "Other");
        resultTable.resultTable("Mobile", "1234567890");

    }

    @Test
    void notVisibleFormTest() {
        RegistationPage.openPage()
                .removeBanner()
                .setFirstName("OLEG")
                .setLastName("   ")
                .setGender("Other")
                .setUserNumber("1232")
                .clickSubmit();
        ResultTableRegistationPageComponent resultTable = new ResultTableRegistationPageComponent();
        resultTable.resultTableNotVisible();

    }

}

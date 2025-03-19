package tests;

import org.junit.jupiter.api.Test;
import pages.RegistationPage;


public class HomeWorkL6 extends TestBase {

    @Test
    void RegistrationTest() {
        RegistationPage.openPage()
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
                .clickSubmit()
                .result("Oleg Namozov", "oleg@mail.ru",
                        "1234567890", "Other",
                        "15 April,2020", "English, Arts",
                        "Reading", "eda.tiff",
                        "My current address", "Haryana Panipat");
    }
}

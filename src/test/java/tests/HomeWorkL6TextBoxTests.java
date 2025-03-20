package tests;

import org.junit.jupiter.api.Test;
import pages.TextBoxPage;

public class HomeWorkL6TextBoxTests extends TestBase{
    @Test
    void textBoxTest() {
        TextBoxPage.openPage()
                .setFirstName("Oleg Namozov")
                .setUserEmail("Oleg@mail.ru")
                .setCurrentAddress("Moscow")
                .setPermanentAddress("Moscow never sleeps")
                .clickSubmit()
                .checkResult("Oleg Namozov");
    }
}


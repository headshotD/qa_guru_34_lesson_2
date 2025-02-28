import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Demoqa {
    @AfterEach
    void afterEach(){
        System.out.println("### AfterEach");
    }
    @BeforeEach
    void beforeEach(){
        System.out.println("###  beforeEach");
    }
    @Test
    void textBox() throws InterruptedException {
        open ("https://demoqa.com/text-box");
        $("[id='username']").setValue("Oleg Namozov");
        wait(1000);
        $("[id='userEmail']").setValue("Oleg@mail.ru");
        wait(1000);
        $("[id='currentAddress'").setValue("Moscow");
        wait(1000);
        $("[id='permanentAddress']").setValue("Moscow never sleeps");
        wait(1000);
        $("[id='submit']").click();
        wait(1000);

    }
}

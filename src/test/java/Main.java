import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class Main {
    @Test
    void test(){
        Assertions.assertTrue( 3 > 2);
    }
}

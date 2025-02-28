import org.junit.jupiter.api.*;

public class Main {

    int result;

    @BeforeAll
    static void beforeall() {
        System.out.println("### BeforeAll\n");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("###       beforeEach");
        result = getResult();
    }

    @AfterEach
    void afterEach() {
        System.out.println("###       afterEach\n");
        result = 0;
    }

    @AfterAll
    static void afterAll() {
        System.out.println("###    AfterAll\n");
    }

    @Test
    void onetest() {
        System.out.println("###          one test");
        Assertions.assertTrue(result > 2);
    }

    @Test
    void twotest() {
        System.out.println("###          two test");
        Assertions.assertTrue(result > 2);
    }

    @Test
    void threetest() {
        System.out.println("###          three test");
        Assertions.assertTrue(result >= 1);
    }

    private int getResult() {
        return 3;
    }
}

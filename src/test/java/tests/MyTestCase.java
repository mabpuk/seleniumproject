package tests;

import core.framework.TestBase;
import org.junit.Test;


public class MyTestCase extends TestBase {

    @Test
    public void test_SS_LV() {
        driver.get("http://www.google.com");
    }
}

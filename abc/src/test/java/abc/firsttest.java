package abc;

import org.testng.annotations.Test;

public class firsttest extends basetest {

    @Test
    public void testGoogle() {
        getDriver().get("https://www.google.com"); 
 
    }
}
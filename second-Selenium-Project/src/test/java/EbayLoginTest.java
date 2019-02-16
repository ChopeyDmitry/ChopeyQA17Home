import org.testng.annotations.Test;

public class EbayLoginTest extends TestBase{

    @Test
    public void loginTest() {

        app.initLogin();
        app.fillLoginForm("username", "dddhhh");
        app.confirmLogin();
    }

}

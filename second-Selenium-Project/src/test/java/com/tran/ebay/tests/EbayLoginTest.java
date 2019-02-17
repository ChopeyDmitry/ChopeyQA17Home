package com.tran.ebay.tests;

import com.tran.ebay.model.User;
import org.testng.annotations.Test;

public class EbayLoginTest extends TestBase {

    @Test
    public void loginTest() {

        TestBase.app.getUser().initLogin();
        TestBase.app.getUser().fillLoginForm(new User().setUser("username").setPwd("dddhhh"));
        TestBase.app.getUser().confirmLogin();
    }

}

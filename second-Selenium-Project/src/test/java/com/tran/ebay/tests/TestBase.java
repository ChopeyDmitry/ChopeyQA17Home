package com.tran.ebay.tests;

import com.tran.ebay.app.ApplicationManager;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase {

    protected static ApplicationManager app = new ApplicationManager(BrowserType.FIREFOX);

    @BeforeClass
    public void setUp() {
        app.init();

    }

    @AfterClass
    public void tearDown() {
        app.stop();
    }

}

package com.tran.ebay.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ItemHelper extends HelperBase {

    public ItemHelper(WebDriver wd) {
        super(wd);
    }

    public void startSearch() {
        click(By.id("gh-btn"));
    }

    public void typeToTheSearchBar(String item) {
        type(By.cssSelector("#gh-ac"), item);
    }

    public boolean isSearchBarPresenr() {
        return isElementPresent(By.cssSelector("#gh-ac"));
    }
}

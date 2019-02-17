package com.tran.ebay.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SearchItem extends TestBase {

    @BeforeClass
//    public void isSearchBarPresent() {
//        if (!app.isSearchBarPresenr()) {
//            app.clickOnLogo();
//        }
//    }

    @Test
    public void testSearchItem() {
        TestBase.app.getItem().typeToTheSearchBar("box");
        TestBase.app.getItem().startSearch();
    }

    @Test
    public  void testSearchItem2(){
        TestBase.app.getItem().typeToTheSearchBar("coat");
        TestBase.app.getItem().startSearch();
    }



}

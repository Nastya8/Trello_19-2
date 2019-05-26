package com.tr.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;

public class AddPhotoToProfile extends TestBase{
    @BeforeMethod
    public void ensurePreconditions() throws InterruptedException {
        if(!app.getBoardHelper().isOnTheHomePage()){
            app.getHeader().clickOnHomeButtonOnHeader();
        }
    }
    @Test
    public void testAddPhoto() throws InterruptedException {
        //click on avatar
        app.getUser().clickOnAvatar();
        //click profile
        app.getUser().clickProfileFromDropDown();
        //clickChangePhoto
        app.getUser().clickChangePhoto();
       File file = new File("src/test/resources/player-male.png");
        app.getUser().attachPicture(file);

       Thread.sleep(10000);
        //uploadPicture

    }
}

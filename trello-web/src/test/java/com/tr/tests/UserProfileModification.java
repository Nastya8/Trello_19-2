package com.tr.tests;

import com.tr.model.UserProfile;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UserProfileModification extends TestBase {

    @DataProvider
    public Iterator<Object[]>profile(){
        List<Object[]>list=new ArrayList<>();
        list.add(new Object[]{"bob51215","baby111b2","ii"});
        list.add(new Object[]{"ken25216","kinderb1123","io"});
        list.add(new Object[]{"john35127","small311b4","ij"});
        list.add(new Object[]{"sam45512","gang4611b","im"});

        return list.iterator();
    }
 @Test(enabled=false)
         public void testProfileModification() {
     app.getUser().clickOnAvatar();
     app.getUser().clickProfileFromDropDown();
     app.getUser().initProfileModification();
     app.getUser().fillProfileForm(new UserProfile()
             .withFullName("hhh")
             .withUserName("bbb")
             .withInitials("kkk") );
     app.getUser().submitModification();
 }
    @Test(dataProvider = "profile")
    public void testProfileModificationDataProvider(String userName, String fullName, String initials) {
        UserProfile userProfile = new UserProfile()
                .withUserName(userName)
                .withFullName(fullName)
                .withInitials(initials);

        app.getUser().clickOnAvatar();
        app.getUser().clickProfileFromDropDown();
        app.getUser().initProfileModification();
        app.getUser().fillProfileForm(userProfile );
        app.getUser().submitModification();
    }
}

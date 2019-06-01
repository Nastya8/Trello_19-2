package com.tr.manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HeaderHelper  extends HelperBase{
  public HeaderHelper(WebDriver wd) {
    super(wd);
  }

  public void clickOnPlusButtonOnHeader() throws InterruptedException {
    Thread.sleep(15000);
    //click(By.name("add"));
      click(By.cssSelector("[class='header-btn-icon icon-lg icon-add light']"));
      }

      public void waitAndClickOnPlusButtonOnHeader() {
   waitForElementAndClick(15, By.name("add"));
   //waitForElementAndClick(15, By.cssSelector("[class='header-btn-icon icon-lg icon-add light']"));
  //  click(By.name("add"));
      }

      public  void clickOnHomeButtonOnHeader() throws InterruptedException {
    //click(By.cssSelector(".icon-house"));
        Thread.sleep(7000);
        if(isElementPresent(By.cssSelector(".icon-house"))){
            click(By.cssSelector(".icon-house"));
          }else click(By.name("house"));

      }




}

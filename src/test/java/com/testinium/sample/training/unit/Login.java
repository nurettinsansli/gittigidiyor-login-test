package com.testinium.sample.training.unit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;



public class Login extends BaseTest{

    @Test
    public void login(){
        driver.findElement(By.xpath("//*[@data-cy='header-user-menu']")).click();
        driver.navigate().to("https://www.gittigidiyor.com/uye-girisi");
        driver.findElement(By.id("L-UserNameField")).sendKeys("tetestuser");
        driver.findElement(By.id("L-PasswordField")).sendKeys("test123456");
        driver.findElement(By.id("gg-login-enter")).click();
        String failLoginTxt = driver.findElement(By.cssSelector("span:nth-child(3)")).getText();
        String actualUrl="https://www.gittigidiyor.com/";
        String expectedUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }

}

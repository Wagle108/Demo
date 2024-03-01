package com.demowebshop.testscripts;

import org.testng.annotations.Test;

import com.demowebshop.genericLibrary.BaseTest;
import com.demowebshop.pomRepo.WelcomePage;

public class LoginTest extends BaseTest {
@Test
public void TC_Login_001() {
	WelcomePage wp=new WelcomePage(driver);
    wp.clickLogin();
}
}

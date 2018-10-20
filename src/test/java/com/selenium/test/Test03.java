package com.selenium.test;

import org.testng.annotations.Test;

import com.selenium.config.ConfiguracionBase;
import com.selenium.page.CartPage;
import com.selenium.page.HomePage;
import com.selenium.page.PDPpage;

public class Test03 extends ConfiguracionBase {

	@Test
	public void example02() {
		HomePage homepage = new HomePage(driver);
		PDPpage pdppage = homepage.searchProduct();
		pdppage.clickAddToCart();
		CartPage cartPage = pdppage.clickGoToCart();
		cartPage.validCartItem();
	}
}
 
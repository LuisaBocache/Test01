package com.selenium.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.selenium.config.ConfiguracionBase;

public class PDPpage extends ConfiguracionBase {
	public PDPpage(WebDriver driver) {
		super();
		this.driver = driver;	
		PageFactory.initElements(driver, this);
	}
		
	@FindBy(xpath = "//*[@class='pull-left btn-red btn-addToCart col-md-4 paddingHReset']")
	private WebElement agregarcarroBtn;
	@FindBy(xpath = "//*[@class='btn-addToCart col-xs-12 col-md-3 pull-right btn-red']")
	private WebElement iracarroBtn;
	

	public void clickAddToCart() {
		 WebDriverWait wait = new WebDriverWait(driver, 5) ;
		wait.until(ExpectedConditions.visibilityOf(agregarcarroBtn));
		agregarcarroBtn.click();
		  }

		  // create method
		  public CartPage clickGoToCart() {
		    Actions action = new Actions(driver);
		    WebDriverWait wait = new WebDriverWait(driver, 5) ;
			wait.until(ExpectedConditions.visibilityOf(iracarroBtn));
		    action.moveToElement(iracarroBtn).click().perform();
		    return new CartPage(driver);
		  }
	
}

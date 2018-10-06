package com.selenium.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.selenium.config.ConfiguracionBase;

public class HomePage extends ConfiguracionBase {

	public HomePage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// create Element
	@FindBy(id = "searchBoxInput")
	private WebElement searchBoxInput;

	@FindBy(xpath = "//div[@class='searchIcon_-xI-Ide9']")
	private WebElement searchIconBtn;

	// create method
	public PDPpage searchProduct() {
		searchBoxInput.sendKeys("145863-9");
		searchIconBtn.click();
		return new PDPpage(driver);
		
	}
}

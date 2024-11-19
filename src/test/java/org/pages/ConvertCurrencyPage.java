package org.pages;

import org.baseclass.BaseClassQ2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class ConvertCurrencyPage extends BaseClassQ2 {
	
	public ConvertCurrencyPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@id='email']")
	private WebElement txtId;
	
	
	@FindBy(id="amount")
	private WebElement txtInput;
	
	@FindBy(xpath="//input[@aria-describedby='midmarketFromCurrency-current-selection']")
	private WebElement selectInputCurrency;
	
	@FindBy(xpath="//li[@id='midmarketFromCurrency-option-0']")
	private WebElement selectCurrecyType;
	
	@FindBy(xpath="//input[@aria-describedby='midmarketToCurrency-current-selection']")
	private WebElement selectOutputCurrency;
	
	@FindBy(xpath="//li[@id='midmarketToCurrency-option-6']")
	private WebElement selectOutputCurrecyType;
	
	@FindBy(xpath="//button[text()='Convert']")
	private WebElement btnConvert;
	
	@FindBy(xpath="//p[@class='sc-423c2a5f-1 gPUWGS']")
	private WebElement txtConvertedAmount;

	public WebElement getTxtInput() {
		return txtInput;
	}

	public WebElement getSelectInputCurrency() {
		return selectInputCurrency;
	}

	public WebElement getSelectCurrecyType() {
		return selectCurrecyType;
	}

	public WebElement getSelectOutputCurrency() {
		return selectOutputCurrency;
	}

	public WebElement getSelectOutputCurrecyType() {
		return selectOutputCurrecyType;
	}

	public WebElement getBtnConvert() {
		return btnConvert;
	}

	public WebElement getTxtConvertedAmount() {
		return txtConvertedAmount;
	}

	public void convertValues(String string) {
		elementSendKeys(txtInput, string);																	
		elementClick(selectInputCurrency);
		elementClick(selectCurrecyType);
		elementClick(selectOutputCurrency);
		elementClick(selectOutputCurrecyType);
		
	}
	
	public void convertBtnClick() {
		elementClick(btnConvert);
	}
	
	public String convertedAmount() {
		String text = getText(txtConvertedAmount);
		return text;
	}
}


 
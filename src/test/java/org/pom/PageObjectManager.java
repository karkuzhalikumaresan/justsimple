package org.pom;

import org.pages.ConvertCurrencyPage;

public class PageObjectManager {
	private ConvertCurrencyPage convertCurrency;
	
	
	public ConvertCurrencyPage getConvertCurrencyPage() {
		return (convertCurrency==null)? convertCurrency=new ConvertCurrencyPage():convertCurrency;
	}
}

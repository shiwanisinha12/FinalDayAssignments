package com.cg;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonPom {

	
	@FindBy(xpath="//*[@id=\"twotabsearchtextbox\"]")
	WebElement searchBox;
	
	@FindBy(xpath="//*[@id=\"nav-search\"]/form/div[2]/div/input")
	WebElement clickSearch;
	
	@FindBy(xpath="//*[@id=\"result_0\"]/div/div[2]/div/a/img")
	WebElement view1;
	
	@FindBy(xpath="//*[@id=\"native_dropdown_selected_size_name\"]")
	WebElement selectSize;
	
	@FindBy(xpath="//*[@id=\"add-to-cart-button\"]")
	WebElement add;
	
	@FindBy(xpath="//*[@id=\"upsell_0_2\"]/div/a/img")
	WebElement view2;
	
	@FindBy(xpath="//*[@id=\"upsell_0_1\"]/div/a/img")
	WebElement view3;
	
	@FindBy(xpath="//*[@id=\"result_0\"]/div/div[4]/div[1]/a/h2")
	WebElement view4;
	
	@FindBy(xpath="//*[@id=\"hlb-ptc-btn-native\"]")
	WebElement proceed;
	
	
}

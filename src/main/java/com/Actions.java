package com;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Actions extends Base {
    protected WebDriver driver;
    protected Locators webLocators;


    public Actions(WebDriver driver){
        this.driver = driver;
        webLocators = new Locators();
        PageFactory.initElements(driver,webLocators);
    }

    // send a text a search Bar and enter
    public void sendTextSearchBar(String text){
        webLocators.searchBar.sendKeys(text);
        webLocators.searchBar.sendKeys(Keys.ENTER);
    }

    public void clickFindedResults(int index){
        webLocators.searchResults.get(index).click();
    }

    public void assertPoductNameExist(){
        boolean isVisible = webLocators.producName.isDisplayed();
        Assert.assertTrue("The name of the product is not displayed.",isVisible);
    }

    public void assertNullSearchResult(){
        boolean isVisible = webLocators.nullSearchResult.get(0).isDisplayed();
        System.out.println(webLocators.nullSearchResult.get(0).getText());
        Assert.assertTrue("The message of non found any prodc is not displayed",isVisible);
    }

    public void assertNintendoSwitchLiteRosa(){
        boolean consoleColor = webLocators.pinkProduct.isDisplayed();
        boolean consoleName = webLocators.namePinkProduct.isDisplayed();

        System.out.println(webLocators.namePinkProduct.getText());

        Assert.assertTrue("The pink product color is not displayed",consoleColor);
        Assert.assertTrue("The name of the product is not displayed ",consoleName);
    }

    public void sendTxtBrandFilter(String text){
        webLocators.brandFilter.sendKeys(text);
    }

    public void clickOnSamsumgCheckBox(){
        webLocators.samsumgCheckbox.click();
    }

    public void clickOnPulgadasLocator(){
        webLocators.pilgadasLocator.click();
    }

    public void clickOnPriceFilter(){
        webLocators.priceFilter.click();
    }

    public void assertTvNameExist(){
        boolean tvDisplayed = webLocators.tvName.isDisplayed();
        System.out.println(tvDisplayed);
        Assert.assertTrue("The tv title is not displayed",tvDisplayed);
    }

    public void openRegisterPage() throws InterruptedException {
        webLocators.startSessionButton.click();
        Thread.sleep(900);
        webLocators.createAccountLink.click();
    }

    public void completeBaseInfo(String user, String pass) throws InterruptedException {
        webLocators.email.sendKeys(user);
        webLocators.password.sendKeys(pass);
        Thread.sleep(500);
        webLocators.crearCuentaButton.click();

    }

    public void completeFullName(String user, String patern, String matern){

        webLocators.registerUserName.sendKeys(user);
        webLocators.registerPaternName.sendKeys(patern);
        webLocators.registerMaternName.sendKeys(matern);
    }

    public  void completeDayOfBirth() throws InterruptedException {
        Select dayDropDown = new Select(webLocators.selectDay);
        Select monthDropDown = new Select(webLocators.selectMonth);
        Select yearDropDown = new Select(webLocators.selectYear);

        dayDropDown.selectByVisibleText("23");
        Thread.sleep(300);
        monthDropDown.selectByVisibleText("May");
        Thread.sleep(300);
        yearDropDown.selectByVisibleText("1992");
        Thread.sleep(300);
    }

    public void selectGender() throws InterruptedException {
        webLocators.createAccountButton.click();
        Thread.sleep(300);
    }
}

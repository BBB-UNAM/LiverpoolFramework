package com;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Locators {
    @FindBy(id = "mainSearchbar")
    public WebElement searchBar;

    @FindBy(xpath = "//img[@loading='lazy']")
    public List<WebElement> searchResults;

    @FindBy(xpath = "//h1[contains(text(),'Play')]")
    public  WebElement producName;

    @FindBy(xpath = "//p[text()='Lo sentimos, no encontramos nada para ']")
    public List<WebElement> nullSearchResult;

    @FindBy(xpath = "//a[@style='background-color: rgb(240, 111, 111);']")
    public WebElement pinkProduct;

    @FindBy(xpath = "//h1[contains(text(),'Consola')]")
    public WebElement namePinkProduct;

    @FindBy(id = "search-filter-brands")
    public WebElement brandFilter;

    @FindBy(id = "brand-SAMSUNG")
    public WebElement samsumgCheckbox;

    @FindBy(id = "variants.normalizedSize-43 pulgadas")
    public WebElement pilgadasLocator;

    @FindBy(id = "variants.prices.sortPrice-10000-700000")
    public WebElement priceFilter;

    @FindBy(xpath = "//h1[contains(text(),'Pantalla Samsung QLED smart TV de 43')]")
    public WebElement tvName;

    @FindBy(xpath = "//span[contains(text(),'Iniciar ')]")
    public WebElement startSessionButton;

    @FindBy(xpath = "//a[text()='Crear cuenta']")
    public WebElement createAccountLink;

    @FindBy(id = "email")
    public WebElement email;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(xpath = "//button[text()='Crear cuenta']")
    public WebElement crearCuentaButton;

    @FindBy(id = "input-user__name")
    public WebElement registerUserName;

    @FindBy(id = "input-user__apaterno")
    public WebElement registerPaternName;

    @FindBy(id = "input-user__amaterno")
    public WebElement registerMaternName;

    @FindBy(id = "daySelectorLabel")
    public WebElement selectDay;

    @FindBy(id = "monthSelectorLabel")
    public WebElement selectMonth;

    @FindBy(id = "yearSelectorLabel")
    public WebElement selectYear;

    @FindBy(id = "male")
    public  WebElement checkBoxSex;

    @FindBy(xpath = "//button[text()='Crear cuenta']")
    public WebElement createAccountButton;
}

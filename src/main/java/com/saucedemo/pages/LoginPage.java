package com.saucedemo.pages;

import com.base.BasePage;
import org.openqa.selenium.By;

public class LoginPage extends BasePage {
    private By usernameFeild=By.id("user-name");
    private By passwordFeild=By.id("password");
    private By loginButtonFeild=By.id("login-button");
    private By errorMessage = By.cssSelector("#login_button_container h3");
    public void setUsername(String username){
        set(usernameFeild,username);
    }
    public void setPassword(String password){
        set(passwordFeild,password);
    }
    public ProductsPage clickLoginButton(){
        click(loginButtonFeild);
        return new ProductsPage();
    }
    public ProductsPage loginIntoApplication(String username,String password){
        setUsername(username);
        setPassword(password);
        return clickLoginButton();
    }
    public String getErrorMessage(){
        return find(errorMessage).getText();
    }
}

package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class pom {



//https://www.facebook.com/
@FindBy(xpath="//input[@id='email']")
private WebElement userName;
@FindBy(xpath="//input[@id='pass']")
private WebElement pwd;
@FindBy(xpath="//input[@value='Log In']")
public WebElement loginBtn;
public WebElement getuserName()
{
	return userName;
}
public WebElement getpwd()
{
	return pwd;
}
public void setpwd(WebElement pwd)
{
	this.pwd=pwd;
}
public void setuserName()
{
	this.userName=userName;
}
}

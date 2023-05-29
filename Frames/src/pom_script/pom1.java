package pom_script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.Base_Page;

public class pom1 extends Base_Page
{
	@FindBy(name="email")
	private WebElement emailTbox;
	@FindBy(name="pass")
	private WebElement pwdTbox;
	@FindBy(name="login")
	private WebElement loginBtn;
	
	//initialization
	
	public pom1(WebDriver driver)
	{
		super(driver);
	}
	//Utilization
	
    public void emailData(String email)
    {
    	emailTbox.sendKeys(email);
    }
    public void pwdData(String pwd)
    {
    	pwdTbox.sendKeys(pwd);
    }
    public void clickLogin()
    {
    	loginBtn.click();
    }
//sdfghfchmgv,j
	}
	




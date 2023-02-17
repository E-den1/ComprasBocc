package pages;

import org.openqa.selenium.*;

public class PageSsoLogin {
	WebDriver driver;
	By pgSsoLoginUser = By.name("UserName");
	By pgSsologinPassword = By.name("TallyHawk");
	By pgSsoClicIniciar = By.name("ButtonLogin");
	By cookies = By.id("onetrust-accept-btn-handler");
	By buttonlogin = By.id ("ButtonLogin");
	
		public PageSsoLogin(WebDriver driver) {
			this.driver = driver;	
			driver.findElement(cookies).click();
		}
		
		public void PageSsoSetUser(String usr) {
			driver.findElement(pgSsoLoginUser).clear();
			driver.findElement(pgSsoLoginUser).sendKeys(usr);
			driver.findElement(buttonlogin).click();
			
		}
		
		public void PageSsoSetPasswrd(String psswrd) {
			
			driver.findElement(pgSsologinPassword).clear();
			driver.findElement(pgSsologinPassword).sendKeys(psswrd);
		}
		
		public String PageSsoGetTitle() {
			return driver.getTitle();
		}
		
		public void PageSsocliconIniciar() {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.findElement(pgSsoClicIniciar).click();;
		}
		
	 public void PageSSoMainFunction(String correo,String contra) {
		 this.PageSsoGetTitle();
		 this.PageSsoSetUser(correo);
		 this.PageSsoSetPasswrd(contra);
		 this.PageSsocliconIniciar();
	 }
}



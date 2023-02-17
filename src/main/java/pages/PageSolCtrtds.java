package pages;
import org.openqa.selenium.*;

public class PageSolCtrtds {
	
	WebDriver driver;
	By pgSolCtrtdsImgBocc = By.id("imgPrd0");
	
		public PageSolCtrtds(WebDriver driver) {
			this.driver = driver;
		}
		
		public String PageSolCtrtdsGetTitle() {
			return driver.getTitle();
		}
		
		public void PageSolCtrtdsClicBocc() {
			driver.findElement(pgSolCtrtdsImgBocc).click();
		}
		
	public void PageSolCtrtdsMainFunction() {
		this.PageSolCtrtdsGetTitle();
		this.PageSolCtrtdsClicBocc();
	}
}

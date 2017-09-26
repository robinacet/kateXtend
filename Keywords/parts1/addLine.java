package parts1;


import com.kms.katalon.core.annotation.*;
import org.openqa.selenium.*;
import com.kms.katalon.core.webui.driver.*;

public class addLine {
	
	@Keyword
	public static void addtheLine()
	{
		WebDriver driver = DriverFactory.getWebDriver();
		driver.findElement(By.id("tdtre4101s002-2-grid-1-tdsls401.oqua-93-0")).sendKeys("3");
		System.out.println("Send Text Done");
		
	}

}

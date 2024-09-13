package SeleniumJava;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class UploadFileDemo {
	
	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		driver.manage().window().maximize();
		
		WebElement btnChoosefile = driver.findElement(By.cssSelector("input[name='upfile']"));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));//Explicit wait
		
		wait.until(ExpectedConditions.elementToBeClickable(btnChoosefile));
		

		
		btnChoosefile.sendKeys("C:\\Users\\612387094\\OneDrive - BT Plc\\Desktop\\Test Document.docx");
		
		
		
	}

}

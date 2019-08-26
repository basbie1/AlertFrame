import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;

System.setProperty("webdriver.chrome.driver", "C:\\Users\\bbieszk\\Downloads\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
			driver.navigate().to("https://www.pekao24.pl");
			String mainPage = driver.getWindowHandle();
			driver.findElement(By.linkText("Wersja demo")).click();
			Set<String> allPages = driver.getWindowHandles();
			for (String handle : allPages) {
				if (!handle.equals(mainPage)) {
					driver.switchTo().window(handle);
				}
			}
			driver.findElement(By.id("parUsername")).sendKeys("123456");
			driver.findElement(By.id("butLogin")).click();
	
			String key = "0";
			WebElement password = driver.findElement(By.className("accoutNumber"));
			//password.findElements(By.xpath("//*[@type='password']")).forEach(webElement -> webElement.sendKeys(key));
			driver.findElement(By.id("f0")).sendKeys(key);
			driver.findElement(By.id("f4")).sendKeys(key);
			driver.findElement(By.id("f5")).sendKeys(key);
			driver.findElement(By.id("f7")).sendKeys(key);
			driver.findElement(By.id("fSubmit")).click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			WebElement title = driver.findElement(By.xpath("//*[@id=\"right\"]/form[2]/div[1]/h2"));
		//	wait.until(ExpectedConditions.visibilityOf(title));
			driver.quit();
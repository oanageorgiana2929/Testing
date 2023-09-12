import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;


public class myelectrica {
	public static void main(String[] args) {
		
		//Invoking Browser
		//chromedriver.exe ->Chrome browser
		
		System.setProperty("webdriver.chrome.driver", "E:\\Automation testing\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://myelectrica.ro/index.php?pagina=login");
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.name("myelectrica_utilizator")).sendKeys("mail.gmail.com");
		driver.findElement(By.xpath("//*[@id=\"myelectrica_pass\"]")).sendKeys("1234");
		driver.findElement(By.id("myelectrica_login_btn")).click();
	}

// test ActualTitle = Expected Title ( this case is false)	
	@Test
		public void testAssertFunction() {
		System.setProperty("webdriver.chrome.driver", "E:\\Automation testing\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://myelectrica.ro/index.php?pagina=login");
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "MyElectricaa | Login";
		Assert.assertEquals(ExpectedTitle,ActualTitle);
		System.out.println("Assert passed");
		}

// test ActualTitle = Expected Title ( this case is true)
	@Test
	public void verifyTitle() {
	System.setProperty("webdriver.chrome.driver", "E:\\Automation testing\\chromedriver-win64\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.navigate().to("https://myelectrica.ro/index.php?pagina=login");
	String ActualTitle = driver.getTitle();
	String ExpectedTitle = "MyElectrica | Login";
	Assert.assertEquals(ExpectedTitle,ActualTitle);
	
	//System.out.println("Assert passed");
	}
	
	
	
		//driver.close();
		

}


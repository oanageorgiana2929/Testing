import org.openqa.selenium.chrome.ChromeDriver;

public class IntroducereSelenium {
  
	public static void main(String[] args) {
		
		// Invoking Browser
		// chromedriver.exe --> Chrome browser
		System.setProperty("webdriver.chrome.driver", "E:\\Automation testing\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
		System.out.println(driver.getCurrentUrl());
		driver.close();
	}
}

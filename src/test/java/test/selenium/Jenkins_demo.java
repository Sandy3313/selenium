package test.selenium;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jenkins_demo {

	@Test
	public void testgooglrsearch() {

		System.setProperty("webdriver.chrome.driver", "//Users//sandy.ting.shan//Documents//Selenium//chromedriver");
		WebDriver driver = new ChromeDriver();
		// it will open the goggle page
		driver.get("https://www.fotor.com.cn/");
		// we expect the title “Google “ should be present
		String Expectedtitle = "Fotor在线设计工具_免费设计素材和模板_在线平面设计网站";
		// it will fetch the actual title
		String Actualtitle = driver.getTitle();
		System.out.println("Before Assertion " + Expectedtitle + " & " + Actualtitle);
		// it will compare actual title and expected title
		AssertJUnit.assertEquals(Actualtitle, Expectedtitle);
		// print out the result
		System.out.println("After Assertion " + Expectedtitle + " & " + Actualtitle + " Title matched ");
	}
}
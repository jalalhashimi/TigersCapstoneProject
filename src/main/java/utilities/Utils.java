package utilities ;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import core.Base;
import io.cucumber.java.Scenario;

public class Utils extends Base{
	public static Scenario verify;
	
	public static void scrolldownPage() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// from (0, 1000), you can modify the 100 field and scroll down the page as per
		// your testing needs
		js.executeScript("window.scrollBy(0, 1000)");
		// scroll all the way down the page
//		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
	public static void takeScreenshotForStep() {
		final byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		
		verify.attach(screenshot, "image/png", "Step Screenshot");
	}
		
	public static String  screenshotName(){
		Date date = new Date();
		String screenShot = date.toString().replace(":", "_").replace(" ", "_");
		return screenShot;
	}
	
	public static void takeScreenshotwithFileUtils () {
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
	try {
		
		FileUtils.copyFile(file, new File(".\\output\\screenshots\\"+screenshotName()+".png"));
		
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
	}

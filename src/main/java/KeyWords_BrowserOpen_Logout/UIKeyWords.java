package KeyWords_BrowserOpen_Logout;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.Set;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class UIKeyWords extends BrowserUtil {

	public static void SwitchToWindow(String byTitle) {

		String parentHandle = driver.getWindowHandle();
		Set<String> window = driver.getWindowHandles();
		String Title = driver.getTitle();

		System.out.println(Title);

		for (String windows : window) {
			if (driver.switchTo().window(windows).getTitle().equals(byTitle)) {
				System.out.println("Switched on window:- " + byTitle);
			}
		}
	}

	public static String WinDowHandlingparent() {

		Set<String> AllwindowHandle = driver.getWindowHandles();
		System.out.println(AllwindowHandle);

		Iterator<String> iterator = AllwindowHandle.iterator();
		String parenthandle = iterator.next();
		String ChildHandle = iterator.next();
		driver.switchTo().window(parenthandle);
		String title = driver.getTitle();
		System.out.println("Window Title:- " + title);
		return title;
	}

	public static String WinDowHandlingChild() {

		Set<String> AllwindowHandle = driver.getWindowHandles();
		System.out.println(AllwindowHandle);

		Iterator<String> iterator = AllwindowHandle.iterator();
		String parenthandle = iterator.next();
		String ChildHandle = iterator.next();

		driver.switchTo().window(ChildHandle);
		String title = driver.getTitle();
		System.out.println("Title:- " + title);
		return title;
	}

	public static void ClickMe(By element) {
		driver.findElement(element).click();
	}

	public static void SendKeys(By element, String text) {
		driver.findElement(element).sendKeys(text);
	}

	public static void getTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	public static void gettext(By element) {
		WebElement text = driver.findElement(element);
		System.out.println(text);
	}

	public static void ExplicitlyWait(By element) {

		FluentWait wait = new FluentWait(driver);
		wait.pollingEvery(Duration.ofMillis(300));
		wait.withTimeout(Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(element));

	}
	
	public static void takeScreenShots(String testCaseName) throws IOException, InterruptedException {

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("ddMMyyHHmmss");
		LocalDateTime now = LocalDateTime.now();
		String date = dtf.format(now);
		String baseDir = System.getProperty("user.dir");

		AShot ashot = new AShot();
		ashot.shootingStrategy(ShootingStrategies.viewportPasting(1000));
		Screenshot srcshot = ashot.takeScreenshot(driver);
		BufferedImage img = srcshot.getImage();

		Thread.sleep(2000);
		ImageIO.write(img, "png", new File(baseDir + "\\Screenshots\\" + testCaseName + "__" + date + ".png"));
	}

	public static void elemenyttToBeClickable(By element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(4000));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public static void keyPress() throws AWTException, InterruptedException {
		Robot robo = new Robot();
		robo.keyPress(KeyEvent.VK_DOWN);
		robo.keyRelease(KeyEvent.VK_PAGE_DOWN);
	}

	public static void RobotScreenshots(String testCaseName) throws AWTException, InterruptedException, IOException {
		Robot robo = new Robot();
		Rectangle rect = new Rectangle();
		rect.setSize(1500, 900);
		Thread.sleep(4000);
		String baseDir = System.getProperty("user.dir");
		BufferedImage img = robo.createScreenCapture(rect);
		File file = new File(testCaseName + ".jpg");
		ImageIO.write(img, "jpg", new File(baseDir + "\\Screenshots\\" + testCaseName + "__" + ".jpg"));
		Thread.sleep(4000);
	}

	public static void mouseMove(By element) {
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(element)).build().perform();
	}

	public static void pagedown(int n) throws AWTException {
		Robot robo = new Robot();
		for (int i = 1; i <= n; i++) {
			robo.keyPress(KeyEvent.VK_PAGE_DOWN);
			robo.keyRelease(KeyEvent.VK_PAGE_DOWN);
		}
	}
}
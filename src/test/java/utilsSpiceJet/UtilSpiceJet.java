package utilsSpiceJet;

import java.io.File;
import java.io.FileInputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;

import io.github.bonigarcia.wdm.WebDriverManager;
import pagesSpiceJet.HomePage;

public class UtilSpiceJet {
	public static WebDriver driver;
	public String sheetName;
	public static ExtentReports extent;
	public static ExtentTest test;
	public String testName;
	public String testDescription;
	public String testCategory;
	public String testAuthor;

	public static void launchUrl(String url) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
	}

	public static String readProperty(String key) throws Exception {
		String projectPath = System.getProperty("user.dir");
		File file = new File(projectPath + "/configSpiceJet.properties");
		FileInputStream fileInput = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fileInput);
		return prop.get(key).toString();
	}

	public static void launchBrowser(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--headless");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions options = new FirefoxOptions();
			options.addArguments("--headless");
			driver = new FirefoxDriver(options);
		} else if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else {
			System.out.println("Opening Chrome browser as Default browser");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		waitImplicit();
	}

	public static void waitExplicit(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public static void waitExplicitUntillTitle(String titleToWait) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleIs(titleToWait));
	}

	public static void waitImplicit() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	public static void getApplication(String url) {
		driver.get(url);
	}

	public static void type(WebElement element, String text) {
		waitExplicit(element);
		element.clear();
		element.sendKeys(text);
	}

	public static void clickOn(WebElement element) {
		waitExplicit(element);
		element.click();
	}
	public static void switchingTodefault() {
		driver.switchTo().defaultContent();
	}

	public void dob() {
		driver.findElement(By.xpath("//img[@class='d-inline-block datepicker']")).click();

		driver.findElement(By.xpath("//div[contains(@class,'react-datepicker__month-dropdown')]")).click();

		WebElement tool = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
		Select opt = new Select(tool);
		opt.selectByVisibleText("January");
		List<WebElement> d = driver.findElements(By.xpath("//div[contains(@class,'react-datepicker__day')]"));
		for (int i = 0; i < d.size(); i++) {
			// check expected data
			String s = d.get(i).getText();
			if (s.equals("31")) {
				clickOn(d.get(i));
				break;
			}
		}
	}

	public static void calender() {
		Scanner sc = new Scanner(System.in);
		String year = sc.next();
		String month = sc.next();
		String date = sc.next();

		driver.findElement(By.xpath("//input[@id='dobDate']")).click();
		while (true) {
			String monthYear = driver.findElement(By.xpath("//div[contains(text(),'June 1994')]")).getText();
			String arr[] = monthYear.split(" ");
			String mm = arr[0];
			String yy = arr[1];
			if (mm.equalsIgnoreCase(month) && yy.equals(year)) {
				break;
			} else {
				driver.findElement(By.xpath("//span[contains(text(),'Next Month')]")).click();
			}
			// date selection

		}
	}

	public static String getPageTitle() {
		waitExplicitUntillTitle(driver.getTitle());
		return driver.getTitle();
	}

	
	public static int getResponseCode(String url) throws Exception, Exception {
		URL link = new URL(url);
		HttpURLConnection connect = (HttpURLConnection) link.openConnection();
		// connect.setRequestMethod("Head");
		// connect.connect();
		int responseCode = connect.getResponseCode();
		return responseCode;
	}

	public static Object[][] dataReader(String sheetName) throws Exception {
		String excelPath = System.getProperty("user.dir");
		XSSFWorkbook workBook = new XSSFWorkbook(excelPath + "/Excel/spiceJet.xlsx");
		XSSFSheet sheet = workBook.getSheet(sheetName);
		int row = sheet.getPhysicalNumberOfRows();
		int column = sheet.getRow(0).getPhysicalNumberOfCells();
		Object[][] data = new Object[row][column];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				data[i][j] = sheet.getRow(i).getCell(j) + "".toString();
				// data[i][j] = sheet.getRow(i).getCell(j).getStringCellValue();
			}
		}
		workBook.close();
		return data;
	}

	public static void selectFromDropDown(WebElement element, String visibleText) {
		Select select = new Select(element);
		select.selectByVisibleText(visibleText);
	}

	public static void titleAssertion(String expTitle) {
		Assert.assertEquals(getPageTitle(), expTitle);
	}

	public static void jsScrollUntillElement(WebElement element) {
		waitExplicit(element);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	}

	public static void jsClickOn(WebElement element) {
		waitExplicit(element);
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
	}

	public static int screenShot(String testName) throws Exception {
		int ranNum = (int) (Math.random() * 9999999 + 1000000);
		Thread.sleep(3000);
		String projectPath = System.getProperty("user.dir");
		FileUtils.copyFile(((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE),
				new File(projectPath + "/Screenshot/" + testName + ranNum + ".png"));
		return ranNum;
	}

	public static void softAssert(String actResult, String expResult) {
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actResult, expResult);
	}

	public void reportStep(String stepDetails, String stepStatus, String testName) throws Exception {
		int ranNum = screenShot(testName);
		String projectPath = System.getProperty("user.dir");
		if (stepStatus.equalsIgnoreCase("pass")) {
			test.pass(stepDetails, MediaEntityBuilder
					.createScreenCaptureFromPath(projectPath + "/Screenshot/" + testName + ranNum + ".png").build());
		} else if (stepStatus.equalsIgnoreCase("fail")) {
			test.fail(stepDetails, MediaEntityBuilder
					.createScreenCaptureFromPath(projectPath + "/Screenshot/" + testName + ranNum + ".png").build());
			throw new RuntimeException("See extent report for more details");
		}
	}

	public static void windowsHandle() throws InterruptedException {
		String currentWindow = driver.getWindowHandle();
		
		Thread.sleep(1000);
		Set<String> openWindow = driver.getWindowHandles();
		for (String newWindow : openWindow) {
			if (!(newWindow.equals(currentWindow))) {
				driver.switchTo().window(newWindow);
				break;
			}
		}

		driver.get("https://spiceclub.spicejet.com/signup");
		
		}

}

package com.keyword.sample;

import static org.testng.Assert.assertEquals;
//import static Assert.assertTrue;
import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import sun.security.ec.ECDHKeyAgreement;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.TagName;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableCell;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class KeyWordExample {

	static WebDriver driver;
	static String caso;
	static String protocolo;
	static String Icad_IM;
	static String gerarCNPJ;
	static String numerodanotaMobile;
	static String codigodoContato;
	
	static String teste;
	// static KeyWordExecution exeKey = new KeyWordExecution();
	// static Report.extentReports Report.extent =
	// Report.extentReports.get(KeyWordExecution.class);
	// static Report .extent = new Report();
	// static {

	// Report.extent.config().displayCallerClass(false);
	// Report.extent.config()
<<<<<<< HEAD
	// .chartTitle(Chart.TEST, "caso")
	// .chartTitle(Chart.STEP, "Passo a Passo");
	// Report.extent.init("//srvdc06\\Departamentos\\Anexos CAC\\QUALIDADE\\ATIVIDADES\\AUTOMACAO\\RESULTADO\\"+caso+".html",
	// false);
	// Report.extent.startTest(caso);
	// }

	// public void pass (String metodo,String parametro, String imgPG ) {
	//
	// Report.Report.extent.log(LogStatus.PASS,metodo, parametro, imgPG);
	//
	// }

	public static String createScreenshot(WebDriver driver, String metodo) {

		UUID uuid = UUID.randomUUID();
		String reportLocation = "C:\\Automacao\\GithubQA\\PlusoftQA\\Datadriven\\Evidencias\\";

		// generate screenshot as a file object
		File scrFile = ((TakesScreenshot) driver)
				.getScreenshotAs(OutputType.FILE);
		try {
			// copy file object to designated location
			FileUtils.copyFile(scrFile, new File(reportLocation + metodo + uuid
					+ ".png"));
		} catch (IOException e) {
			System.out.println("Error while generating screenshot:\n"
					+ e.toString());
		}
		return reportLocation + metodo + uuid + ".png";
	}

	@Parameters("browserName")
	public void open_Browser(String browserName) throws Exception {

		try {
			if (browserName.equalsIgnoreCase("Firefox")) {
				driver = new FirefoxDriver();
				Report.pass("open_Browser", browserName.toString(),
						KeyWordExample.imgPg(Report.caso));
			} else if (browserName.equalsIgnoreCase("chrome")) {
				
//				System.setProperty("webdriver.chrome.driver","C:\\Automacao\\browser\\chromedriver.exe");
//				ChromeOptions options = new ChromeOptions();
//				options.addArguments("user-data-dir=C:\\Users\\amarinho\\appdata\\Local\\Google\\Chrome\\User Data\\Default");
//				options.addArguments("--start-maximized");
//				driver = new ChromeDriver(options);
				
				
				
				System.setProperty("webdriver.chrome.driver",
						"C:\\Automacao\\GithubQA\\PlusoftQA\\Datadriven\\browser\\chromedriver.exe");
				driver = new ChromeDriver();
				Report.pass("open_Browser", browserName.toString(),
						KeyWordExample.imgPg(Report.caso));
		
			
		       
				
			} else if (browserName.equalsIgnoreCase("IE")) {
				DesiredCapabilities caps = DesiredCapabilities
						.internetExplorer();
				caps.setCapability(
						InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,
						true);
				System.setProperty("webdriver.ie.driver",
						"C:\\Automacao\\GithubQA\\PlusoftQA\\Datadriven\\browserIEDriverServer.exe");
				driver = new InternetExplorerDriver(caps);
				
				
				Report.pass("open_Browser", browserName.toString(),
						KeyWordExample.imgPg(Report.caso));
				
			} else if (browserName.equalsIgnoreCase("mobile")){
				System.setProperty("webdriver.chrome.driver",
						"C:\\Automacao\\GithubQA\\PlusoftQA\\Datadriven\\chromedriver.exe");
				
				
				Map<String, String> mobileEmulation = new HashMap<String, String>();
				mobileEmulation.put("deviceName", "Google Nexus 5");

				Map<String, Object> chromeOptions = new HashMap<String, Object>();
				chromeOptions.put("mobileEmulation", mobileEmulation);
				DesiredCapabilities capabilities = DesiredCapabilities.chrome();
				capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
				 driver = new ChromeDriver(capabilities);
			
			}else if (browserName.equalsIgnoreCase("edge")) {
				File file = new File("/Datadriven/browser/MicrosoftWebDriver.exe");
=======
	// .chartTitle(Chart.TEST, "Caso")
	// .chartTitle(Chart.STEP, "Passo a Passo");
	// Report.extent.init("//srvdc06\\Departamentos\\Anexos CAC\\QUALIDADE\\ATIVIDADES\\AUTOMACAO\\RESULTADO\\"+caso+".html",
	// false);
	// Report.extent.startTest(caso);
	// }

	// public void pass (String metodo,String parametro, String imgPG ) {
	//
	// Report.Report.extent.log(LogStatus.PASS,metodo, parametro, imgPG);
	//
	// }

	public static String createScreenshot(WebDriver driver, String metodo) {

		UUID uuid = UUID.randomUUID();
		String reportLocation = "C:\\Automacao\\Evidencias\\";

		// generate screenshot as a file object
		File scrFile = ((TakesScreenshot) driver)
				.getScreenshotAs(OutputType.FILE);
		try {
			// copy file object to designated location
			FileUtils.copyFile(scrFile, new File(reportLocation + metodo + uuid
					+ ".png"));
		} catch (IOException e) {
			System.out.println("Error while generating screenshot:\n"
					+ e.toString());
		}
		return reportLocation + metodo + uuid + ".png";
	}

	@Parameters("browserName")
	public void open_Browser(String browserName) throws Exception {

		try {
			if (browserName.equalsIgnoreCase("Firefox")) {
				driver = new FirefoxDriver();
				Report.pass("open_Browser", browserName.toString(),
						KeyWordExample.imgPg(Report.caso));
			} else if (browserName.equalsIgnoreCase("chrome")) {
				
//				System.setProperty("webdriver.chrome.driver","C:\\Automacao\\browser\\chromedriver.exe");
//				ChromeOptions options = new ChromeOptions();
//				options.addArguments("user-data-dir=C:\\Users\\amarinho\\appdata\\Local\\Google\\Chrome\\User Data\\Default");
//				options.addArguments("--start-maximized");
//				driver = new ChromeDriver(options);
				
				
				
				System.setProperty("webdriver.chrome.driver",
						"C:\\Automacao\\browser\\chromedriver.exe");
				driver = new ChromeDriver();
				Report.pass("open_Browser", browserName.toString(),
						KeyWordExample.imgPg(Report.caso));
		
			
		       
				
			} else if (browserName.equalsIgnoreCase("IE")) {
				DesiredCapabilities caps = DesiredCapabilities
						.internetExplorer();
				caps.setCapability(
						InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,
						true);
				System.setProperty("webdriver.ie.driver",
						"C:\\Automacao\\browser\\IEDriverServer.exe");
				driver = new InternetExplorerDriver(caps);
				
				
				Report.pass("open_Browser", browserName.toString(),
						KeyWordExample.imgPg(Report.caso));
				
			} else if (browserName.equalsIgnoreCase("mobile")){
				System.setProperty("webdriver.chrome.driver",
						"C:\\Automacao\\browser\\chromedriver.exe");
				
				
				Map<String, String> mobileEmulation = new HashMap<String, String>();
				mobileEmulation.put("deviceName", "Google Nexus 5");

				Map<String, Object> chromeOptions = new HashMap<String, Object>();
				chromeOptions.put("mobileEmulation", mobileEmulation);
				DesiredCapabilities capabilities = DesiredCapabilities.chrome();
				capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
				 driver = new ChromeDriver(capabilities);
			
			}else if (browserName.equalsIgnoreCase("edge")) {
				File file = new File("C:\\Automacao\\browser\\MicrosoftWebDriver.exe");
>>>>>>> refs/remotes/origin/master

			    System.setProperty("webdriver.edge.driver", file.getAbsolutePath());
			    DesiredCapabilities capabilities = DesiredCapabilities.edge();
			    driver = new EdgeDriver(capabilities);
			}
		} catch (WebDriverException e) {
			Report.fail("open_Browser", browserName.toString(),
					KeyWordExample.imgPg(Report.caso));
			System.out.println(e.getMessage());
		}
	}

	public void URL(String URL) throws Exception {
		try {
			driver.navigate().to(URL);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Report.pass(KeyWordExecution.descricao, URL, KeyWordExample.imgPg(Report.caso));
			//System.out.println(driver.getCurrentUrl());
			

		} catch (WebDriverException e) {
			Report.fail("URL", URL, KeyWordExample.imgPg(Report.caso));
			System.out.println(e.getMessage());
		}
	}

	@Test
	public By locatorvalue(String locatorTpye, String value) {
		By by;
		switch (locatorTpye) {
		case "id":
			by = By.id(value);
			break;
		case "name":
			by = By.name(value);
			break;
		case "xpath":
			by = By.xpath(value);
			break;
		case "css":
			by = By.cssSelector(value);
			break;
		case "linkText":
			by = By.linkText(value);
			break;
		case "partialLinkText":
			by = By.partialLinkText(value);
			break;
		case "tagname":
			by = By.tagName(value);
			break;
		case "classname":
			by = By.className(value);
			break;
		default:
			by = null;
			break;
		}
		return by;
	}

	public void Digitar(String locatorType, String value, String text)
			throws Exception {
		try {

			By locator;
			locator = locatorvalue(locatorType, value);
			WebElement element = driver.findElement(locator);
			element.clear();
			element.sendKeys(text);
			Thread.sleep(2000);
			//System.out.println(driver.getPageSource());
			Report.pass(
					KeyWordExecution.descricao,
					locatorType + " " + value + " " + text,
					KeyWordExample.imgPg(Report.caso));

		} catch (NoSuchElementException e) {
			System.err.format("No Element Found to enter text" + e);
			Report.fail(
					"",
					locatorType + " " + value + " " + text,
					KeyWordExample.imgPg(Report.caso));
		}
	}

	public void Clicar(String locatorType, String value) throws Exception {
		try {
			By locator;
			locator = locatorvalue(locatorType, value);
			WebElement element = driver.findElement(locator);
			if (element.isDisplayed()) {
				equals(ExpectedConditions.elementToBeClickable(locator));
				element.click();
				//Thread.sleep(2000);
			}
			Report.pass(KeyWordExecution.descricao, locatorType + " " + value, KeyWordExample
					.imgPg(Report.caso));
		} catch (NoSuchElementException e) {
			System.err.format("No Element Found to enter text" + e);
			Report.fail(KeyWordExecution.descricao, locatorType + " " + value, KeyWordExample
					.imgPg(Report.caso));
		}
	}

	public void FrameIndex(String value) throws Exception {
		try {

			int v = Integer.parseInt(value);
			driver.switchTo().frame(v);
			Report.pass(KeyWordExecution.descricao, value,
					KeyWordExample.imgPg(Report.caso));

		}

		catch (NoSuchElementException e1) {
			System.err.format("No Element Found to perform click" + e1);
			Report.fail(KeyWordExecution.descricao, value,
					KeyWordExample.imgPg(Report.caso));
		}
	}

	public void Frame(String value) throws Exception {
		try {

			driver.switchTo().frame(value);
			Report.pass(KeyWordExecution.descricao, value,
					KeyWordExample.imgPg(Report.caso));
		}

		catch (NoSuchElementException e1) {
			System.err.format("No Element Found to perform click" + e1);
			Report.fail(KeyWordExecution.descricao, value,
					KeyWordExample.imgPg(Report.caso));
		}
	}
	
	public void Iframe (String locatorType, String value ) throws Exception {
		
		
		try{
			By locator;
			locator = locatorvalue(locatorType, value);
			driver.switchTo().frame(driver.findElement(locator));
			
		}catch (NoSuchElementException e1) {
			System.err.format("No Element Found to perform click" + e1);
			Report.fail(KeyWordExecution.descricao, value,
					KeyWordExample.imgPg(Report.caso));
		} 
	}
	
	public void CaptchaPortalGiss() throws Exception {
		String CAPTCHA = null;
		try {

			List<WebElement> links = driver.findElements(By.tagName("img"));
			List<String> webList = new ArrayList<String>();
			for (WebElement link : links)
				webList.add(link.getAttribute("value"));
			CAPTCHA = webList.get(0) + webList.get(1) + webList.get(2)
					+ webList.get(3);

			driver.switchTo().defaultContent();
			// WebElement Valida = driver.findElement(By.name("txtValida"));
			WebElement Valida = driver.findElement(By.name("txtValidacao"));
			Valida.click();

			List<WebElement> Numeros = driver.findElements(By.tagName("img"));

			for (int i = 0; i < CAPTCHA.length(); i++) {
				String valorCatcha = String.valueOf(CAPTCHA.charAt(i));

				for (WebElement numero : Numeros) {
					if (numero.getAttribute("src").contains("/teclado/")) {

						String valorTecla = numero.getAttribute("src")
								.substring(57, 58);

						if (valorCatcha.equals(valorTecla)) {
							// System.out.println("valorTecla = " + valorTecla);
							numero.click();
							break;
						}

					}
				}

			}
			Report.pass("CaptchaPortalGiss", CAPTCHA,
					KeyWordExample.imgPg(Report.caso));
		}

		catch (NoSuchElementException e) {
			System.err.format("No Element Found to perform click" + e);
			Report.fail("CaptchaPortalGiss", CAPTCHA,
					KeyWordExample.imgPg(Report.caso));
		}

	}

	public void alert() throws Exception {
		String texto = null;
		// System.out.println("teste");
		WebDriverWait wait = new WebDriverWait(driver, 500);
		try {
			wait.until(ExpectedConditions.alertIsPresent());
			// Check the presence of alert

			Alert alert = driver.switchTo().alert();
			// System.out.println(alert.getText());
			// Alert present; set the flag
			texto = alert.getText();
			// if present consume the alert
			Report.pass("alert", texto,
					KeyWordExample.imgPg(Report.caso));
			alert.accept();

		} catch (NoSuchElementException e) {
			System.err.format("No Element Found to perform click" + e);
			Report.fail("alert", texto,
					KeyWordExample.imgPg(Report.caso));
		}
	}

	public void Esperar(String value) throws Exception {
		try {
			int tempo = Integer.parseInt(value);
			Thread.sleep(tempo);
			Report.pass(KeyWordExecution.descricao, value,
					KeyWordExample.imgPg(Report.caso));
			// System.out.println(tempo + "--" + driver.getCurrentUrl());

		} catch (NoSuchElementException e) {
			System.err.format("No Element Found to perform click" + e);
			Report.fail(KeyWordExecution.descricao, value,
					KeyWordExample.imgPg(Report.caso));
		}
	}

	public void Janela(String value) throws Exception {
		try {
			value = driver.getWindowHandle();
			for (String winHandle : driver.getWindowHandles()) {
				driver.switchTo().window(winHandle);
			}
			Report.pass(KeyWordExecution.descricao, value,
					KeyWordExample.imgPg(Report.caso));
		} catch (NoSuchElementException e) {
			System.err.format("No Element Found to perform click" + e);
			Report.fail(KeyWordExecution.descricao, value,
					KeyWordExample.imgPg(Report.caso));

		}
	}

	public void DoubleClick(String locatorType, String value) throws Exception {
		try {
			By locator;
			locator = locatorvalue(locatorType, value);
			WebElement dblClick = driver.findElement(locator);
			// dblClick.sendKeys(Keys.ENTER);
			Actions builder = new Actions(driver);
			builder.doubleClick(dblClick).perform();
		//	driver.getPageSource().contains(locator);
			Report.pass(KeyWordExecution.descricao, locatorType + " " + value,
					KeyWordExample
							.imgPg(Report.caso));
		} catch (NoSuchElementException e) {
			System.err.format("No Element Found to perform click" + e);
			Report.fail(KeyWordExecution.descricao, locatorType + " " + value,
					KeyWordExample
							.imgPg(Report.caso));
		}
	}

	public void Fechar_Popup(String value) throws Exception {
		try {
			

			driver.switchTo().window(value).close();

			// System.out.println(driver + "POPUP:Inconsistencia");

			driver.switchTo().window(value).close();

			// System.out.println(driver + "POPUP:Inconsistencia");
			Thread.sleep(1000);
			Report.pass(KeyWordExecution.descricao, value,
					KeyWordExample.imgPg(Report.caso));

		} catch (NoSuchElementException e) {
			System.err.format("No Element Found to perform click" + e);
			Report.fail(KeyWordExecution.descricao, value,
					KeyWordExample.imgPg(Report.caso));
		}
	}

	public void retornaPrincipal(String value) throws Exception {
		try {
			driver.switchTo().window(value);
			Report.pass(KeyWordExecution.descricao, value,
					KeyWordExample.imgPg(Report.caso));

		} catch (NoSuchElementException e) {
			System.err.format("No Element Found to perform click" + e);
			Report.fail(KeyWordExecution.descricao, value,
					KeyWordExample.imgPg(Report.caso));
		}
	}

	public void retornarFrameprincipal() throws Exception {
		try {
			driver.switchTo().defaultContent();
			Thread.sleep(800);
			Report.pass(KeyWordExecution.descricao, "retornarFrameprincipal",
					KeyWordExample.imgPg(Report.caso));

		} catch (NoSuchElementException e) {
			System.err.format("No Element Found to perform click" + e);
			Report.fail(KeyWordExecution.descricao, "retornarFrameprincipal",
					KeyWordExample.imgPg(Report.caso));
		}
	}

	public void Select(String locatorType, String value, String text)
			throws Exception {
		try {
			By locator;
			locator = locatorvalue(locatorType, value);
			driver.findElement(locator).isDisplayed();
			Select select = new Select(driver.findElement(locator));

			 //System.out.println(select.getOptions().contains(text) + "/n");
			//select.getFirstSelectedOption().isSelected();
			//select.selectByIndex(1);
			select.selectByVisibleText(text);
			Report.pass(
					KeyWordExecution.descricao,
					locatorType + " " + value + " " + text,
					KeyWordExample.imgPg(Report.caso
							+ " " + text));

			
			
			
		} catch (NoSuchElementException e) {
			System.err.format("No Element Found to perform click" + e);
			Report.fail(
					KeyWordExecution.descricao,
					locatorType + " " + value + " " + text,
					KeyWordExample.imgPg(Report.caso
							+ " " + text));

		}
	}

	public void SelectFiscalizacao (String locatorType, String value, String text, String page) {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(page)));
		System.out.println(ExpectedConditions.visibilityOfElementLocated(By.id(page)));
		JavascriptExecutor js = null;
		if (driver instanceof JavascriptExecutor) {
		    js = (JavascriptExecutor)driver;
		}
		js.executeScript("document.getElementById('"+value+"').style.display='inline-block';");
		System.out.println(js.executeScript("document.getElementById('"+value+"').style.display='inline-block';"));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(value)));
		System.out.println(ExpectedConditions.visibilityOfElementLocated(By.id(value)));
		By locator;
		locator = locatorvalue(locatorType, value);
		driver.findElement(locator).isDisplayed();
		Select select = new Select(driver.findElement(locator));

		// System.out.println(select.getOptions().contains(text) + "/n");
		
		select.selectByVisibleText(text);
	}
	
	public void FiscSelecionarEmpresa() {
		
		List<WebElement> links = driver.findElements(By.tagName("td"));

		for (WebElement link : links) {
			
			if(link.getText().contains(gerarCNPJ)){
				link.click();
			}
			
			
			
		}
		}
		
		
	public void ClicarGetText(String locatorType, String value, String text) throws Exception {

		try {
			By locator;
			locator = locatorvalue(locatorType, value);
	
		List<WebElement> links = driver.findElements(locator);
		
		
		for (WebElement link : links) {			
			if (link.getText().equals(text)){
				
				link.isDisplayed();
				link.click();
				break;
			
			}
		}
		Report.pass(
				KeyWordExecution.descricao,
				locatorType + " " + value + " " + text,
				KeyWordExample.imgPg(Report.caso));

	} catch (org.openqa.selenium.StaleElementReferenceException ex) {
		By locator;
		locator = locatorvalue(locatorType, value);

	List<WebElement> links = driver.findElements(locator);
	
	
	for (WebElement link : links) {			
		if (link.getText().equals(text)){
			
			link.isDisplayed();
			link.click();
			break;
	
		
		}
	}
	Report.pass(
			KeyWordExecution.descricao,
			locatorType + " " + value + " " + text,
			KeyWordExample.imgPg(Report.caso));
	}
}
	public void DigitarGetText(String locatorType, String value, String text, String text1) throws Exception {
		By locator;
		locator = locatorvalue(locatorType, value);
		try{
	//	List<WebElement> links = driver.findElements(By.tagName("td"));
		List<WebElement> links = driver.findElements(locator);
		
		
		for (WebElement link : links) {
			//System.out.println(link.getText());
			if (link.getText().contains(text)){
				link.clear();
				link.sendKeys(text1);
			}
			
	
		}
				Report.pass(
						KeyWordExecution.descricao,
			locatorType + " " + value + " " + text,
			KeyWordExample.imgPg(Report.caso));

} catch (NoSuchElementException e) {
	System.err.format("No Element Found to enter text" + e);
	Report.fail(
			KeyWordExecution.descricao,
			locatorType + " " + value + " " + text,
			KeyWordExample.imgPg(Report.caso));
}
}
	
	public static String imgPg(String pasta) throws Exception {

		UUID uuid = UUID.randomUUID();
		Date now = new Date();
		DateFormat diaf = new SimpleDateFormat("dd");
		DateFormat mesf = new SimpleDateFormat("MM");
		DateFormat anof = new SimpleDateFormat("yyyy");
		String diaF = diaf.format(now);
		String mesF = mesf.format(now);
		String anoF = anof.format(now);
		String dataPasta = diaF + "_" + mesF + "_" + anoF;

		File diretorio = new File(
				"C:\\Automacao\\Evidencias\\"
						+ dataPasta + "//" + pasta + "//" + "_");

		// System.out.println(diretorio);

		diretorio.mkdirs();
		// System.out.println(diretorio.mkdirs());
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension screenSize = toolkit.getScreenSize();
		Rectangle screenRect = new Rectangle(screenSize);

		Robot robot = null;
		try {
			robot = new Robot();
		} catch (AWTException e1) {

			e1.printStackTrace();
		}
		BufferedImage image = robot.createScreenCapture(screenRect);
		int new_w = 1600, new_h = 900;
		BufferedImage new_img = new BufferedImage(new_w, new_h,
				BufferedImage.TYPE_INT_RGB);
		Graphics2D g = new_img.createGraphics();
		g.drawImage(image, 0, 0, new_w, new_h, null);
		ImageIO.write(new_img, "JPG", new File(diretorio  + "_" + uuid
				+ ".jpg"));

		// System.out.println(diretorio
		// + method + "_" + uuid
		// + ".jpg");
		return diretorio +  "_" + uuid + ".jpg";

	}

	public void CaptchaAuditorGiss() throws Exception {
		String CAPTCHA = null;
		try {

			List<WebElement> links = driver.findElements(By.tagName("img"));

			for (WebElement link : links) {

				if (link.getAttribute("src").contains("autentica")) {
					CAPTCHA = link.getAttribute("src").substring(65, 66);

					WebElement Valida = driver.findElement(By
							.name("txtValidacao"));
					Valida.click();

					List<WebElement> Numeros = driver.findElements(By
							.tagName("img"));

					for (int i = 0; i < CAPTCHA.length(); i++) {
						String valorCatcha = String.valueOf(CAPTCHA.charAt(i));

						for (WebElement numero : Numeros) {
							if (numero.getAttribute("src")
									.contains("/teclado/")) {

								String valorTecla = numero.getAttribute("src")
										.substring(58, 59);

								if (valorCatcha.equals(valorTecla)) {
									System.out.println("valorCatcha "
											+ valorCatcha);

									numero.click();
									break;
								}

							}
						}

					}

				}
			}
			Report.pass("CaptchaAuditorGiss", CAPTCHA,
					KeyWordExample.imgPg(Report.caso));

		}

		catch (NoSuchElementException e) {
			System.err.format("No Element Found to perform click" + e);
			Report.fail("CaptchaAuditorGiss", CAPTCHA,
					KeyWordExample.imgPg(Report.caso));
		}

	}

	public void tagAtributoDigitar(String locatorType, String value, String text, String text1, String text2)
			throws Exception {
		try {

			By locator;
			locator = locatorvalue(locatorType, value);

			List<WebElement> links = driver.findElements(locator);
			for (WebElement link : links) {
				
				if (link.getAttribute(text).contains(text1)) {
					link.clear();
					link.sendKeys(text2);
					break;
				}

			}
			Report.pass(
					KeyWordExecution.descricao,
					locatorType + " " + value + " " + text,
					KeyWordExample.imgPg(Report.caso));

		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			By locator;
			locator = locatorvalue(locatorType, value);

			List<WebElement> links = driver.findElements(locator);
			for (WebElement link : links) {
				
				if (link.getAttribute(text).contains(text1)) {
					link.clear();
					link.sendKeys(text2);
					break;
				}

			}
			Report.pass(
					KeyWordExecution.descricao,
					locatorType + " " + value + " " + text,
					KeyWordExample.imgPg(Report.caso));

		}
	}

	public void tagAtributoClicar(String locatorType, String value, String text, String text1)
			throws Exception {
		try {

			By locator;
			locator = locatorvalue(locatorType, value);

			List<WebElement> links = driver.findElements(locator);
			for (WebElement link : links) {
				System.out.println(link.getAttribute(text));
				if (link.getAttribute(text).contains(text1)) {
					
					link.click();
					break;
				}

			}
			Report.pass(
					KeyWordExecution.descricao,
					locatorType + " " + value + " " + text + " " + text1,
					KeyWordExample.imgPg(Report.caso
							+ " " + text + " " + text1));
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			By locator;
			locator = locatorvalue(locatorType, value);

			List<WebElement> links = driver.findElements(locator);
			for (WebElement link : links) {
				System.out.println(link.getAttribute(text));
				if (link.getAttribute(text).contains(text1)) {
					
					link.click();
					break;
				}

			}
			Report.pass(
					KeyWordExecution.descricao,
					locatorType + " " + value + " " + text + " " + text1,
					KeyWordExample.imgPg(Report.caso
							+ " " + text + " " + text1));

		}
	}
	public void Novajanela(String value) throws Exception {
		try {

			Set<String> windows = driver.getWindowHandles();

			for (String window : windows) {
				driver.switchTo().window(window);
				if (driver.getCurrentUrl().contains(value)) {
					System.out.println(driver.getCurrentUrl());
					driver.manage().timeouts()
							.implicitlyWait(30, TimeUnit.SECONDS);

					// System.out.println(driver.getCurrentUrl() + "\n" +
					// driver.getTitle());

					return;
				}
			}
			Report.pass("Novajanela", value,
					KeyWordExample.imgPg(Report.caso));
		} catch (NoSuchElementException e) {
			System.err.format("No Element Found to perform click" + e);
			Report.fail("Novajanela", value,
					KeyWordExample.imgPg(Report.caso));
		}
	}

	public void fecharjanela(String value) throws Exception {
		try {
			Set<String> windows = driver.getWindowHandles();

			for (String window : windows) {
				driver.switchTo().window(window);
				if (driver.getCurrentUrl().contains(value)) {
					System.out.println(driver.getCurrentUrl());
					driver.manage().timeouts()
							.implicitlyWait(30, TimeUnit.SECONDS);
					System.out.println(driver.getCurrentUrl() + "\n"
							+ driver.getTitle());

					driver.close();

					return;
				}
			}
			Report.pass("fecharjanela", value,
					KeyWordExample.imgPg(Report.caso));
		} catch (NoSuchElementException e) {
			System.err.format("No Element Found to perform click" + e);
			Report.fail("fecharjanela", value,
					KeyWordExample.imgPg(Report.caso));
		}
	}

	public void CaptchaAuditorIcad() throws Exception {
		String CAPTCHA = null;
		try {

			List<WebElement> links = driver.findElements(By.tagName("img"));

			for (WebElement link : links) {

				if (link.getAttribute("src").contains(
						"/biblioteca/imagem/captcha")) {
					CAPTCHA = link.getAttribute("src").substring(64, 68);
					System.out.println(CAPTCHA);

					WebElement Valida = driver.findElement(By.name("captcha"));
					Valida.click();

					List<WebElement> Numeros = driver.findElements(By
							.tagName("img"));

					for (int i = 0; i < CAPTCHA.length(); i++) {
						String valorCatcha = String.valueOf(CAPTCHA.charAt(i));

						for (WebElement numero : Numeros) {
							if (numero.getAttribute("src")
									.contains("/teclado/")) {

								String valorTecla = numero.getAttribute("src")
										.substring(60, 61);

								if (valorCatcha.equals(valorTecla)) {
									System.out.println("valorCatcha "
											+ valorCatcha);

									numero.click();
									break;
								}

							}
						}

					}

				}
			}
			Report.pass("CaptchaAuditorIcad", CAPTCHA,
					KeyWordExample.imgPg(Report.caso));
		}

		catch (NoSuchElementException e) {
			System.err.format("No Element Found to perform click" + e);
			Report.fail("CaptchaAuditorIcad", CAPTCHA,
					KeyWordExample.imgPg(Report.caso));
		}

	}

	public static String capturarProtocoloIcad() throws Exception {
		try {
			List<WebElement> links = driver.findElements(By.tagName("img"));
			for (WebElement link : links) {
				if (link.getAttribute("class").contains("1,")) {

					protocolo = link.getAttribute("class").substring(2);
					System.out.println(protocolo);
					break;

				}

			}
			Report.pass("capturarProtocoloIcad", protocolo,
					KeyWordExample.imgPg(Report.caso));

		} catch (NoSuchElementException e) {
			System.err.format("No Element Found to perform click" + e);
			Report.fail("capturarProtocoloIcad", protocolo,
					KeyWordExample.imgPg(Report.caso));
		}
		return protocolo;
	}

	// public void testa() {
	// // TODO Auto-generated constructor stub
	// this.capturarProtocoloIcad(protocolo)
	// }

	public void usarProtocolo(String locatorType, String value)
			throws Exception {

		try {

			By locator;
			locator = locatorvalue(locatorType, value);
			WebElement element = driver.findElement(locator);
			element.clear();
			element.sendKeys(protocolo);
			Thread.sleep(2000);
			Report.pass("usarProtocolo", locatorType + " " + value,
					KeyWordExample
							.imgPg(Report.caso));

		} catch (NoSuchElementException e) {
			System.err.format("No Element Found to enter text" + e);
			Report.fail("usarProtocolo", locatorType + " " + value,
					KeyWordExample
							.imgPg(Report.caso));
		}
	}

	// public void index(String locatorType, String value, String text)
	// throws Exception {
	// try {
	// int index = Integer.parseInt(text);
	//
	// By locator;
	// locator = locatorvalue(locatorType, value);
	//
	// WebElement links = driver.findElements(locator).get(index);
	// // WebElement links =
	// //
	// driver.findElements(By.cssSelector("a[title='gerar relatório']")).get(0);
	// System.out.println(driver.findElements(
	// By.cssSelector("a[title='gerar relatório']")).get(0));
	// links.click();
	// Thread.sleep(10000);
	//
	// } catch (NoSuchElementException e) {
	// System.err.format("No Element Found to perform click" + e);
	// Report.fail("Erro", "index", imgPg("Report.fail", "testew"));
	// }
	//
	// }
	
	public void teclado(String tecla) throws Exception {
		try {

			Actions action = new Actions(driver);

			action.sendKeys(Keys.PAGE_DOWN).build().perform();
			Report.pass(KeyWordExecution.descricao, "enter",
					KeyWordExample.imgPg(Report.caso));
		} catch (NoSuchElementException e) {
			System.err.format("No Element Found to perform click" + e);
			Report.fail(KeyWordExecution.descricao, "enter",
					KeyWordExample.imgPg(Report.caso));
		}

	}
	
	

	public void enter() throws Exception {
		try {

			Actions action = new Actions(driver);

			action.sendKeys(Keys.ENTER).build().perform();
			Report.pass("enter", "enter",
					KeyWordExample.imgPg(Report.caso));
		} catch (NoSuchElementException e) {
			System.err.format("No Element Found to perform click" + e);
			Report.fail("enter", "enter",
					KeyWordExample.imgPg(Report.caso));
		}

	}

	public void aguardar() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public static String CapturarIM_Icad() throws Exception {
		try {
			Icad_IM = driver
					.findElement(
							By.xpath("html/body/div[1]/div[3]/form[1]/table[3]/tbody/tr[2]/td[1]"))
					.getText();
			Report.pass("CapturarIM_Icad", Icad_IM,
					KeyWordExample.imgPg(Report.caso));
		} catch (NoSuchElementException e) {
			System.err.format("No Element Found to perform click" + e);
			Report.fail("CapturarIM_Icad", Icad_IM,
					KeyWordExample.imgPg(Report.caso));

		}

		return Icad_IM;

	}

	public void usarIM(String locatorType, String value) throws Exception {

		try {

			By locator;
			locator = locatorvalue(locatorType, value);
			WebElement element = driver.findElement(locator);
			element.clear();
			element.sendKeys(Icad_IM);
			Thread.sleep(2000);
			Report.pass("usarIM", locatorType + " " + value, KeyWordExample
					.imgPg(Report.caso));
		} catch (NoSuchElementException e) {
			System.err.format("No Element Found to enter text" + e);
			Report.fail("usarIM", locatorType + " " + value, KeyWordExample
					.imgPg(Report.caso));
		}
	}
	
	
	
		
	
	
    public Object gerarCNPJ(){   
        int cnpj1digito[] = new int[12];
        int cnpj2digito[] = new int[13];
        int cnpjpronto[] = new int[14];
        int i,a, aux = 6,aux2 = 9,contagemreversa = 5, soma = 0, resto1, resto2, soma1 = 0, subtracao = 0, somadigito2 = 0;
      int auxcontagem=0, contagemreversa2 = 9, auxcontagem1=0;
          Random gerador = new Random(); // Gera os numeros aleatórios para geração do cpf
          
          //for para achar o primero digito
          for (i=0;i<12;i++){
                             cnpj1digito[i] = gerador.nextInt(10);
                             cnpjpronto[i] = cnpj1digito[i];
                             if (auxcontagem<5){
                                                               cnpj1digito[i] = cnpj1digito[i] * contagemreversa; 
                                                               contagemreversa--;
                                               }if(auxcontagem>3){
                                                            
                                                                             cnpj1digito[i] = cnpj1digito[i] * contagemreversa2; 
                                                                             contagemreversa2--;                                  
                                                                           }
                                                                           auxcontagem++;
//                                                                         System.out.println("Valores-----------= "+cnpj1digito[i]);                               
                             soma = soma + cnpj1digito[i];                              
//                               System.out.println("For-----------= "+cnpjpronto[i]);                  
                                 }
          resto1 = soma % 11;
//        System.out.println("Soma 1-----------= "+soma);
//        System.out.println("Resto 1-----------= "+resto1);
          
          
          //for para achar o segundo digito
          for (a=0;a<12;a++){
                             if (auxcontagem1<5){
                             cnpj2digito[a] = cnpjpronto[a] * aux;   
                                  aux--;        
                                  }if (auxcontagem1>4){
                                   cnpj2digito[a] = cnpjpronto[a] * aux2;                          
                                        aux2--;                                                 
                                        }
                                 auxcontagem1++;
                                 soma1 = soma1 + cnpj2digito[a];                                 
          }
//        System.out.println("Soma 1-----------= "+soma1);
          if (resto1 < 2){
                           cnpj2digito[12] = 0;
                              }else{
                                    cnpj2digito[12] = 11 - resto1 ;
                                     somadigito2 = cnpj2digito[12] * 2;                             
                              }   
          soma1 = soma1 + somadigito2;
//        System.out.println("Soma 2-----------= "+soma1);     
          resto2 = soma1 % 11;
          if (resto2 < 2){
                           subtracao = 0;
                           }else{
                              subtracao = 11 - resto2;
                              }

          gerarCNPJ = cnpjpronto[0]+""+cnpjpronto[1]+""+cnpjpronto[2]+""+cnpjpronto[3]+""+cnpjpronto[4]+""+cnpjpronto[5]+""+cnpjpronto[6]+""+cnpjpronto[7]+""+cnpjpronto[8]+""+cnpjpronto[9]+""+cnpjpronto[10]+""+cnpjpronto[11]+""+cnpj2digito[12]+""+subtracao;      
//        System.out.println(codigocnpj);
          return gerarCNPJ;
    }
	
    
    public void usarcnpj(String locatorType, String value)
			throws Exception {

		try {

			By locator;
			locator = locatorvalue(locatorType, value);
			WebElement element = driver.findElement(locator);
			element.clear();
			element.sendKeys(gerarCNPJ);
			Thread.sleep(2000);
			Report.pass("usarcnpj", locatorType + " " + value,
					KeyWordExample
							.imgPg(Report.caso));

		} catch (NoSuchElementException e) {
			System.err.format("No Element Found to enter text" + e);
			Report.fail("usarcnpj", locatorType + " " + value,
					KeyWordExample
							.imgPg(Report.caso));
		}
	}
    
    public void SelectGinfesMobile (String tag, String value, String text) {
    	
    	
    	
    	List<WebElement> links = driver.findElements(By.tagName(tag));
    	
		//links.stream().filter(lnk -> lnk.getAttribute("class").contains("gwt-TextBox")).get(1);
    	
		for (WebElement link : links) {
			//if(link.getAttribute("class").contains("gwt-TextBox")){
				if(link.getAttribute(value).contains(text)){
					
					
					link.click();
					}
										
					
					
				}}
    
    
    public void buscaelemnt () {
    	
    	
    	
    	List<WebElement> links = driver.findElements(By.tagName("button"));
    	
    	
		//links.stream().filter(lnk -> lnk.getAttribute("class").contains("gwt-TextBox")).get(1);
    	
		for (WebElement link : links) {
			System.out.println(link.getText());
						System.out.println(link.getText().length());
			links.get(15).click();
			continue;
			//if(link.getAttribute("class").contains("gwt-TextBox")){
			//	if(link.getAttribute("maxlength").contains("22")){
					
					//System.out.println(link.getAttribute("maxlength").contains("22"));
					
					
					//link.click();
					//}
										
					
					
				}}
				
	
	public String  CapturarNumerodaNotaMobile() throws Exception {
//		WebDriverWait wait = new WebDriverWait(driver, 15);
		
		try {
			 
//			 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/div[2]/div[2]/div")));
//			 System.out.println(wait);
			WebDriverWait wait = new WebDriverWait(driver, 15);
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("/html/body/div[3]/div[2]/div[2]/div")));
			
			if(driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div")).getText().contains("Nota emitida com número")){
				
			String teste = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/div")).getText();
			numerodanotaMobile = teste.substring(24, 26);
			System.out.println(teste);
			System.out.println(numerodanotaMobile);
			Report.pass("numerodanotaMobile", numerodanotaMobile,
					KeyWordExample.imgPg(Report.caso));
		}} catch (NoSuchElementException e) {
			System.err.format("No Element Found to perform click" + e);
			Report.fail("numerodanotaMobile", numerodanotaMobile,
					KeyWordExample.imgPg(Report.caso));

		}
		
		return numerodanotaMobile;


	}
	
	
	public void UsarNota(String locatorType, String value) throws Exception {

		try {

			By locator;
			locator = locatorvalue(locatorType, value);
			WebElement element = driver.findElement(locator);
			element.clear();
			element.sendKeys(numerodanotaMobile);
			Thread.sleep(2000);
			Report.pass("numerodanotaMobile", locatorType + " " + value, KeyWordExample
					.imgPg(Report.caso));
		} catch (NoSuchElementException e) {
			System.err.format("No Element Found to enter text" + e);
			Report.fail("numerodanotaMobile", locatorType + " " + value, KeyWordExample
					.imgPg(Report.caso));
		}
	}

   public void EditarContatoAtendimento (String value) throws Exception {
		try {
		WebElement editar = driver.findElement(By.id("row-crm_person-contacts"));
		 List<WebElement> div = editar.findElements(By.tagName("tr"));
		 for (WebElement divs : div){
			 if(divs.getText().contains(value)){
				 divs.findElement(By.cssSelector("button[data-original-title='Editar Registro']")).click();

							break;
			 }
	 
			 
		 }
		
		

	}catch (NoSuchElementException e) {
		System.err.format("No Element Found to enter text" + e);
		
	}
   }

   
   public void EditarContatoAtendimentoAutomatico () throws Exception {
 		try {
 		WebElement editar = driver.findElement(By.id("row-crm_person-contacts"));
 		 List<WebElement> div = editar.findElements(By.tagName("td"));
 		 for (WebElement divs : div){
 			codigodoContato = divs.getText();
 			System.out.println(codigodoContato);
 			break;
 		 }//break;
 		System.out.println(codigodoContato);
 		List<WebElement> div1 = editar.findElements(By.tagName("tr"));
 		
 		for (WebElement divs1 : div1){
 			System.out.print(divs1.getText());
 			 if(divs1.getText().contains(codigodoContato)){
 				System.out.println(codigodoContato);
 				
 			 divs1.findElement(By.cssSelector("button[data-original-title='Editar Registro']")).click();

 						//	break;
 			 }}
 	 
 			 
 		// }
 		
 		

 	}catch (NoSuchElementException e) {
 		System.err.format("No Element Found to enter text" + e);
 		
 	}
    
   }
   
   
   public void ADMUsuarioEditarRegistro () throws Exception {
 		
 			try {
 				List<WebElement> editar = driver.findElements(By.tagName("td"));
 				for (WebElement editars : editar){
 					if(editars.getAttribute("class").contains("table-row-actions")){
 						System.out.println("Passou");
 						List <WebElement> editars1 = editars.findElements(By.tagName("button"));
 						System.out.println("Passou");
 						for (WebElement edita : editars1){
 							System.out.println("Passou");
 						if (edita.getAttribute("title").contains("Editar Registro")){
 							System.out.println("Passou");
 							edita.click();
 						}
 						
 					}}}

 				
 					 
 				 
 				
 				

 				Report.pass(KeyWordExecution.descricao, "teste" + " " , KeyWordExample
 						.imgPg(Report.caso));
 			} catch (org.openqa.selenium.StaleElementReferenceException ex) {
 				List<WebElement> editar = driver.findElements(By.tagName("td"));
 				for (WebElement editars : editar){
 					if(editars.getAttribute("class").contains("table-row-actions")){
 						System.out.println("Passou");
 						List <WebElement> editars1 = editars.findElements(By.tagName("button"));
 						System.out.println("Passou");
 						for (WebElement edita : editars1){
 							System.out.println("Passou");
 						if (edita.getAttribute("title").contains("Editar Registro")){
 							System.out.println("Passou");
 							edita.click();
 						}
 						
 					}}}
 			}
 		}
   
   
   public void ADMUsuarioExcluirRegistro () throws Exception {
		
		try {
			List<WebElement> editar = driver.findElements(By.tagName("td"));
			for (WebElement editars : editar){
				if(editars.getAttribute("class").contains("table-row-actions")){
					System.out.println("Passou");
					List <WebElement> editars1 = editars.findElements(By.tagName("button"));
					System.out.println("Passou");
					for (WebElement edita : editars1){
						System.out.println("Passou");
					if (edita.getAttribute("title").contains("Remover Registro")){
						System.out.println("Passou");
						edita.click();
					}
					
				}}}
			//	System.out.println(editars.getTagName().contains("button"));
//				if(divs.getTagName().contains("button")){
//					divs.click();
//				}
				
			//System.out.println(divs.getText()); 
			
				 
			 
			
			
			Report.pass(KeyWordExecution.descricao, "teste" + " " , KeyWordExample
					.imgPg(Report.caso));
		} catch (org.openqa.selenium.StaleElementReferenceException ex) {
			List<WebElement> editar = driver.findElements(By.tagName("td"));
			for (WebElement editars : editar){
				if(editars.getAttribute("class").contains("table-row-actions")){
					System.out.println("Passou");
					List <WebElement> editars1 = editars.findElements(By.tagName("button"));
					System.out.println("Passou");
					for (WebElement edita : editars1){
						System.out.println("Passou");
					if (edita.getAttribute("title").contains("Remover Registro")){
						System.out.println("Passou");
						edita.click();
					}
					
				}}}}
	}
   
   public void testes () throws Exception {
	   Actions builder = new Actions(driver);
		try {
			
			WebElement from = driver.findElement(By.xpath("//*[@id='objectsContainer-left']/li[1]"));
			WebElement to = driver.findElement(By.xpath("//*[@id='objectsDestiny']"));
			
			Action dragAndDrop = builder.clickAndHold(from).moveToElement(to).release(to).build();
			dragAndDrop.perform();
		}catch (NoSuchElementException e) {
			System.err.format("No Element Found to enter text" + e);
			
		}
	   }

	public void close_Browser() {
		driver.close();

	}
	
	public void scroll () {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0, 250);");		
		
	}
	
	public void validacaoComparar(String value) throws Exception {
		try {
		String pagina = driver.getPageSource();
		
		assertTrue(pagina.contains(value));
		System.out.println(pagina.contains(value));
		//System.out.println(pagina.);
		
		Report.pass("validacaoPagina", "teste" + " " + value, KeyWordExample
				.imgPg(Report.caso));
	} catch (NoSuchElementException e) {
		System.err.format("No Element Found to enter text" + e);
		
	}
}
	
	public void validacaoPagina(String value) throws Exception {
		
		try {
		String pagina = driver.getPageSource();
		assertTrue(pagina.contains(value));
		System.out.println(pagina.contains(value));
		
		Report.pass("validacaoPagina", "teste" + " " + value, KeyWordExample
					.imgPg(Report.caso));
		} catch (NoSuchElementException e) {
			System.err.format("No Element Found to enter text" + e);
			Report.fail("validacaoPagina", "teste" + value, KeyWordExample
					.imgPg(Report.caso));
		}
	}

	
	public void botaosalvarform2 (String value) throws Exception {
	 		
 			try {
 				List<WebElement> editar = driver.findElements(By.tagName("form"));
 				for (WebElement editars : editar){
 					if(editars.getAttribute("form-key").contains(value)){
 						System.out.println("Passou");
 						List <WebElement> editars1 = editars.findElements(By.tagName("div"));
 						
 						
 						for (WebElement edita : editars1){
 							System.out.println(edita.getAttribute("class") + "Passou");
 							System.out.println("Passou");
 						if (edita.getAttribute("class").contains("modal-footer")){
 							System.out.println("Passou 1");
 								List<WebElement> salvar = edita.findElements(By.tagName("button"));
 								System.out.println("Passou 2");
 								for (WebElement salvar1: salvar) {
 									System.out.println("Passou 3");
 									System.out.println(salvar1.getAttribute("role"));
 									if(salvar1.getAttribute("role").contains("save")){
 										System.out.println("Passou 5");
 										salvar1.click();
 									}
 								}
 								
 								

 						}
 						
 					}}}

 				
 					 
 				 
 				
 				Report.pass(KeyWordExecution.descricao, "teste" + " " + value, KeyWordExample
 						.imgPg(Report.caso));
 			} catch (NoSuchElementException e) {
 				System.err.format("No Element Found to enter text" + e);
 				Report.fail(KeyWordExecution.descricao, "teste" + value, KeyWordExample
 						.imgPg(Report.caso));
 			}
 		}
		
		
		public void teste () throws Exception {
			try {

			//	By locator;
			//	locator = locatorvalue(locatorType, value);

				List<WebElement> links = driver.findElements(By.tagName("input"));
				for (WebElement link : links) {
					//System.out.println(link.getAttribute(text).contains(text1));
					if (link.getAttribute("placeholder").contains("Buscar")) {
						link.clear();
						link.sendKeys("TESTE QAAa");
						ADMUsuarioEditarRegistro();
						break;
					}

				}
				
//				Report.pass(
//						KeyWordExecution.descricao,
//						locatorType + " " + value + " " + text,
//						KeyWordExample.imgPg(Report.caso));

			} catch (NoSuchElementException e) {
//				System.err.format("No Element Found to enter text" + e);
//				Report.fail(
//						KeyWordExecution.descricao,
//						locatorType + " " + value + " " + text,
//						KeyWordExample.imgPg(Report.caso));
			}
		}
			
		
	public void botaosalvarform () throws Exception {
	 		
 			try {
 				
 				List<WebElement> editar = driver.findElements(By.xpath("html/body/div[3]/form"));
 				for (WebElement editars : editar){
 					
 						List <WebElement> editars1 = editars.findElements(By.tagName("div"));
 						
 						
 						for (WebElement edita : editars1){
 							System.out.println(edita.getAttribute("class") + "Passou");
 							System.out.println("Passou");
 						if (edita.getAttribute("class").contains("modal-footer")){
 							System.out.println("Passou 1");
 								List<WebElement> salvar = edita.findElements(By.tagName("button"));
 								System.out.println("Passou 2");
 								for (WebElement salvar1: salvar) {
 									System.out.println("Passou 3");
 									System.out.println(salvar1.getAttribute("role"));
 									if(salvar1.getAttribute("role").contains("save")){
 										System.out.println("Passou 5");
 										salvar1.click();
 									}
 								}
 								
 								

 						}
 						
 					}}

 				
 					 
 				 
 				
 				Report.pass(KeyWordExecution.descricao, "teste" + " " + "value", KeyWordExample
 						.imgPg(Report.caso));
 			} catch (NoSuchElementException e) {
 				System.err.format("No Element Found to enter text" + e);
 				Report.fail(KeyWordExecution.descricao, "teste" + "value", KeyWordExample
 						.imgPg(Report.caso));
 			}
 		}
		
		
		
		
	
		}
	


package phantomJS;

import java.util.regex.Pattern;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class SampleTest {
 private WebDriver driver;
 private String baseUrl;
 private StringBuffer verificationErrors = new StringBuffer();
 protected static DesiredCapabilities dCaps;

 @Before
 public void setUp() throws Exception {
  DesiredCapabilities capabilities = DesiredCapabilities.phantomjs();
//  capabilities.setPlatform(Platform.LINUX);
  URL url = new URL("http://localhost:2322");
  driver = new org.openqa.selenium.remote.RemoteWebDriver(url, capabilities);
  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  capabilities.setJavascriptEnabled(true);
  baseUrl = "http://assertselenium.com/";
 }

 @Test
 public void getLinksOfAssertSelenium() throws Exception {
  driver.get(baseUrl + "/");
  //Getting all the links present in the page by a HTML tag.
  java.util.List links = driver.findElements(By.tagName("a"));

  //Printing the size, will print the no of links present in the page.
  System.out.println("Total Links present is " + links.size());

  //Printing the links in the page, we get through the href attribute.
  for (int i = 0; i < links.size(); i++) {

   System.out.println("Links are listed " +  ((WebElement)  links.get(i)).getAttribute("href"));
  }
 }
 
 @After
 public void tearDown() throws Exception {
  driver.quit();
  String verificationErrorString = verificationErrors.toString();
  if (!equals(verificationErrorString)) {
   fail(verificationErrorString);
  }
 }

}
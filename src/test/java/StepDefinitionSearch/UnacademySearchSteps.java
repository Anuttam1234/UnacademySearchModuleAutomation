package StepDefinitionSearch;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import Libraries.Utility;

public class UnacademySearchSteps {

	
	
	@Before
	public void setUp() {
		
	}
	
	//path and url in config.properties
//	@After
//	public void driverClose() {
//		driver.close();
//	}
//	
	
	@Given("User on unacademy home page")
	public void user_on_unacademy_home_page() {
	    System.out.println(driver.getTitle());
	    //*[@id="preSubscribedBlocks"]/div[1]/div[1]/h1/text()[1] || Crack UPSC CSE - GS with 
	    
	    System.out.println("Home Page: "+driver.findElement(By.xpath("//h1[contains(text()[1],'Crack UPSC CSE - GS with')]")).isDisplayed());

	}

	@When("user searches educator name")
	public void user_searches_educator_name(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
		

	    driver.findElement(By.xpath("//div[@id=\"searchTab\"]/div[contains(@class,'MuiInputBase-root')]")).click(); //first click
	    Thread.sleep(4000);
	    List<String> data = dataTable.asList();
		String searchItem = data.get(0);
		System.out.println(searchItem);
		WebElement test = driver.findElement(By.xpath("//input[@id='searchInput']"));                                                              
		System.out.println(test.isDisplayed());
		test.sendKeys(searchItem);
		
		System.out.println("Search value inserted");
		
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//a[contains(@href,'@sahilchhapola')]")).click();
		
		Thread.sleep(5000); //use explicit wait
		
	}

	//WebDriverWait(driver,60).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[@title='Log me out']"))));


	@Then("user on the educator profile details page")
	public void user_on_the_educator_profile_details_page() {
	    System.out.println(driver.getTitle());
	    System.out.println("Educator profile page: "+driver.findElement(By.xpath("//h2[contains(text(),'Sahil Chhapola')]")).isDisplayed());
	}

	@Then("user clicks on dedication icon")
	public void user_clicks_on_dedication_icon() {
	    driver.findElement(By.xpath("//div[@class=\"MuiPaper-root Paper-f6r4fl-0 EducatorDedicationStats__Stats-sc-1hlwx9w-0 hpAChX bKHyGh MuiPaper-elevation1 MuiPaper-rounded\"]")).click();
	}
	
	@Then("dedication drawyer open")
	public void dedication_drawyer_open() {

		System.out.println("Dedication Drawyer: "+driver.findElement(By.xpath("//h2[contains(text(),'Dedications')]")).isDisplayed());
	}
	
	@Then("user clicks on each hat icon")
	public void user_clicks_on_each_hat_icon() throws InterruptedException {
	    driver.findElement(By.xpath("//*[@id=\"DrawerPaper\"]/div[2]/div[1]/div[1]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"DrawerPaper\"]/div[2]/div[2]/div[1]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"DrawerPaper\"]/div[2]/div[3]/div[1]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"DrawerPaper\"]/div[2]/div[4]/div[1]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"DrawerPaper\"]/div[2]/div[5]/div[1]")).click();
	    Thread.sleep(2000);
	}

	@Then("user clicks on cross icon")
	public void user_clicks_on_cross_icon() {
//		driver.findElement(By.xpath("//*[name()='svg']/*[name()='path']")).click();  

		//h2[text()='Dedications']/preceding::*[1]
				driver.findElement(By.xpath("//h2[text()='Dedications']/preceding::*[1]")).click();
		
	}

	@Then("user clicks on profile highlighter")
	public void user_clicks_on_profile_highlighter() {
	    driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div/div/section/h6")).click();
	}

	@Then("profile highlighter drwayer open")
	public void profile_highlighter_drwayer_open() {
		
		System.out.println("Profil highlighter Drawyer: "+driver.findElement(By.xpath("//h2[contains(text(),'Bank Exams Educators')]")).isDisplayed());
		
	}
	
	@Then("user clicks on cross icon again")
	public void user_clicks_on_cross_icon_again() {
		//h2[text()='Dedications']/preceding::*[1]
				driver.findElement(By.xpath("//h2[text()='Bank Exams Educators']/preceding::*[1]")).click();
	}

	@When("user click on search textbox")
	public void user_click_on_search_textbox() throws InterruptedException {
		driver.findElement(By.xpath("//div[@id=\"searchTab\"]/div[contains(@class,'MuiInputBase-root')]")).click(); //first click
	    Thread.sleep(4000);
	}

	@Then("Trending search list appears")
	public void trending_search_list_appears() {
	   System.out.println("Trending search list appeared!");
	}

	@Then("user clicks an item from Trending search list")
	public void user_clicks_an_item_from_Trending_search_list() {
		WebElement test = driver.findElement(By.xpath("//*[@id=\"searchTab\"]/div[2]/div/div/a[2]")); //do it by index  
		System.out.println("Sahil is clickable from Trending search list"+test.isDisplayed());
		test.click();
	}

	//mention your xpaths in page object model

	@Then("Educator search list appear")
	public void educator_search_list_appear() {
		System.out.println(driver.getTitle());
	    
		System.out.println("Educator Search list "+driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/div[2]/h4[1]")).isDisplayed()); 
		
	  
		System.out.println("Educator search list appear!");
	}

	
	@When("user searches course name as {string}")
	public void user_searches_course_name_as(String CourseName) throws InterruptedException {
		
		driver.findElement(By.xpath("//div[@id=\"searchTab\"]/div[contains(@class,'MuiInputBase-root')]")).click(); //first click
	    Thread.sleep(4000);

		WebElement Coursename = driver.findElement(By.xpath("//input[@id='searchInput']"));                                                              
		System.out.println(Coursename.isDisplayed());
		Coursename.sendKeys(CourseName);
		
		System.out.println("Search value inserted");
		
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//*[@id=\"searchTab\"]/div[2]/div/div/a[1]/div/div")).click();
		
		Thread.sleep(5000);
	}

	@Then("course search list appear")
	public void course_search_list_appear() {
		
		System.out.println("Courses search list: "+driver.findElement(By.xpath("//h2[contains(text(),'Courses & test series')]")).isDisplayed());
	}

	@Then("user clicks on specific course")
	public void user_clicks_on_specific_course() {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(45,65)");
	    driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/div[2]/div[4]/div/div[1]/div/a/div")).click();
	}

	@Then("course preview page appear")
	public void course_preview_page_appear() {
		driver.findElement(By.xpath("//h2[text()='Login']/preceding::*[1]")).click();

	System.out.println("Course preview Page: "+driver.findElement(By.xpath("//h1[@class=\"H3-sc-1rp46r8-0 PlusCourseHeader__CourseTitle-sc-1lavlgt-4 joSVbX cXmHxN\"]")).isDisplayed());
	}

	@Then("user clicks on share button")
	public void user_clicks_on_share_button() {
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/button[2]")).click();
	}

	@Then("user copies the share link")
	public void user_copies_the_share_link() {
		
		System.out.println("Share dialogue box: "+driver.findElement(By.xpath("//h3[contains(text(),'Share via')]")).isDisplayed());
	    driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div[2]/h6[2]")).click();
	    System.out.println("Share link copied!");
	}
	@Then("user clicks on the facebook icon")
	public void user_clicks_on_the_facebook_icon() {
	    driver.findElement(By.xpath("//h3[text()='Share via']/following::*[2]")).click();
	    driver.findElement(By.xpath("//h3[text()='Share via']/following::*[4]")).click();
	}

}

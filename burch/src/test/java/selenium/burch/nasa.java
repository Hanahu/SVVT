package selenium.burch;

import static org.junit.Assert.*;



import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class nasa {
	private static WebDriver webDriver;
	private static String baseUrl;

	@Before
	public void setUp() throws Exception {
				System.setProperty("webdriver.chrome.driver", "/Users/Admin/Downloads/chromedriver_win32/chromedriver.exe");
				webDriver = new ChromeDriver();
				baseUrl = "https://www.nasa.gov/";
	}

	@After
	public void tearDown() throws Exception {
		webDriver.quit();
	}

	/*@Test
	//Test1
	public void test()throws InterruptedException {
		 
			webDriver.get(baseUrl);
			webDriver.manage().window().maximize();
			Thread.sleep(2000);
			 //Search for Mars
	        webDriver.findElement(By.xpath("//*[@id=\"ember21\"]")).sendKeys("Mars");
	        webDriver.findElement(By.xpath("//*[@id=\"ember24\"]")).click();
	        //Go to featured results
	        webDriver.findElement(By.xpath("//*[@id=\"search-nav\"]/ul/li[3]/a")).click();
	        //Filter them by Last year
	        webDriver.findElement(By.xpath("//*[@id=\"time-filter-dropdown\"]/a")).click();
	        webDriver.findElement(By.xpath("//*[@id=\"time-filter-dropdown\"]/ul/li[5]/a")).click();
	        //Click on the first link
	        webDriver.findElement(By.xpath("//*[@id=\"result-1\"]/h4/a")).click();
	        //Assert that the first result takes you to: https://www.nasa.gov/feature/ames/chemin
	        Thread.sleep(3000);
	        String url = webDriver.getCurrentUrl();
	        assertEquals("https://www.nasa.gov/feature/ames/chemin", url);
	        //Go back to NASA Home Page
	        webDriver.navigate().back();
	        webDriver.findElement(By.xpath("//*[@id=\"menu-button\"]")).click();
	        webDriver.findElement(By.xpath("//*[@id=\"header-links-menu-dropdown\"]/ul/li[1]/a")).click();
	        //Assert that you are back at the main page
	        Thread.sleep(2000);
	        String url2 = webDriver.getCurrentUrl();
	        assertEquals(baseUrl, url2);
	    }
	    /*
		
	/*@Test
	//Test2
	public void test()throws InterruptedException {
		 
			webDriver.get(baseUrl);
			webDriver.manage().window().maximize();
			Thread.sleep(2000);
			 //Go to Image Gallery
	        webDriver.findElement(By.xpath("//*[@id=\"nasa-main-menu\"]/li[3]/a")).click();
	        webDriver.findElement(By.xpath("//*[@id=\"nasa-main-menu\"]/li[3]/ul/li[2]/a")).click();
	        Thread.sleep(5000);
	        //Go to Earth Observatory Images
	        webDriver.findElement(By.xpath("//*[@id=\"ember64\"]")).click();
	        //Select Snow & Ice section
	        webDriver.findElement(By.xpath("/html/body/div[5]/div/div[1]/div[2]/a[8]")).click();
	        Thread.sleep(5000);
	        //Click on the Clear Days for Iceberg Spotting
	        webDriver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div[2]/div/div[2]/h4/a")).click();
	        Thread.sleep(5000);
	        //Assert that the image was taken by the Aqua Satelite
	        String text = webDriver.findElement(By.xpath("/html/body/div[5]/div[2]/div[2]/div[1]/p[1]")).getText();
	        assertTrue(text.contains("Aqua"));
	        //Go back and select the Human option
	        webDriver.navigate().back();
	        Thread.sleep(5000);
	        webDriver.findElement(By.xpath("/html/body/div[5]/div/div[1]/div[2]/a[8]")).click();
	        Thread.sleep(5000);
	        webDriver.findElement(By.xpath("/html/body/div[5]/div/div[1]/div[2]/a[3]")).click();
	        Thread.sleep(5000);
	        //Select the Worlds Longest Conveyor belt System
	        webDriver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div[1]/div/div[2]/h4/a")).click();
	        Thread.sleep(5000);
	        //Assert that the photo is of the Sahara desert
	        String desert = webDriver.findElement(By.xpath("/html/body/div[5]/div[2]/div[2]/div[1]/p[1]")).getText();
	        assertTrue(desert.contains("Sahara"));
	    }
 */
	/*@Test
	//Test3
	public void test()throws InterruptedException {
		 
			webDriver.get(baseUrl);
			webDriver.manage().window().maximize();
			Thread.sleep(2000);
			//Go to Videos
	        webDriver.findElement(By.xpath("//*[@id=\"nasa-main-menu\"]/li[3]/a")).click();
	        webDriver.findElement(By.xpath("//*[@id=\"nasa-main-menu\"]/li[3]/ul/li[5]/a")).click();
	        //Click on the video 133 Days on the Sun
	        Thread.sleep(3000);
	        webDriver.findElement(By.xpath("//*[@id=\"ember52\"]/div/a")).click();
	        Thread.sleep(3000);
	        //Play the video for 10 seconds
	        webDriver.findElement(By.xpath("//*[@id=\"full-view\"]/div[2]/div/div[1]/iframe")).click();
	        Thread.sleep(10000);
	        webDriver.findElement(By.xpath("//*[@id=\"full-view\"]/div[2]/div/div[1]/iframe")).click();
	        //check if the video has been played for 10 seconds
	        String sec = webDriver.findElement(By.xpath("//*[@id=\"full-view\"]/div[2]/div/div[1]/iframe")).getAttribute("currentTime");
	        assertEquals("10", sec);
	    }
	    /*

	/*@Test
	//Test4
	public void test()throws InterruptedException {
		 
			webDriver.get(baseUrl);
			webDriver.manage().window().maximize();
			Thread.sleep(2000);
			 //Go to Social Media Page
	        webDriver.findElement(By.xpath("//*[@id=\"nasa-main-menu\"]/li[5]/a")).click();
	        webDriver.findElement(By.xpath("//*[@id=\"nasa-main-menu\"]/li[5]/ul/li[6]/a")).click();
	        Thread.sleep(3000);
	        //Verify that the title is  "Social Media at NASA"
	        String text = webDriver.findElement(By.xpath("//*[@id=\"content\"]/div/h1")).getText();
	        assertEquals("Social Media at NASA", text);
	        //Go to Snapchat Page and verify that you are on the right page
	        webDriver.findElement(By.xpath("//*[@id=\"ember27\"]/div/p[2]/a[4]")).click();
	        Thread.sleep(3000);
	        String url1 = webDriver.getCurrentUrl();
	        assertEquals("https://snapchat.com/add/nasa", url1);
	        webDriver.navigate().back();
	        Thread.sleep(3000);
	        //Go to the Twitter Page and verify that you are on the right page
	        webDriver.findElement(By.xpath("//*[@id=\"ember27\"]/div/p[2]/a[1]")).click();
	        String url2 = webDriver.getCurrentUrl();
	        assertEquals("https://twitter.com/nasa", url2);
	
	}
	
	*/
	/*@Test
	//Test5
	public void test()throws InterruptedException {
		 
			webDriver.get(baseUrl);
			webDriver.manage().window().maximize();
			Thread.sleep(2000);
			//Go to "Contact NASA" at bottom of page
	        webDriver.findElement(By.xpath("//*[@id=\"footer-links\"]/li[7]/a")).click();
	        Thread.sleep(2000);
	        webDriver.findElement(By.xpath("//*[@id=\"ember20\"]/div/p[21]/a")).click();
	        Thread.sleep(2000);
	        //Fill in the required information
	        webDriver.findElement(By.xpath("//*[@id=\"Sender\"]")).sendKeys("Hanah");
	        webDriver.findElement(By.xpath("//*[@id=\"emailaddress\"]")).sendKeys("email.my@gmail.com");
	        
	        Select s = new Select(webDriver.findElement(By.xpath("//*[@id=\"inquiry_subject\"]")));
	        s.selectByValue("#askNASA");
	        webDriver.findElement(By.xpath("//*[@id=\"question_or_comment\"]")).sendKeys("Test Message");
	        //Send message 
	        //webDriver.findElement(By.xpath("//*[@id=\"contact_us_request\"]/div[5]/button")).click();
	    }
	*/
	/*@Test
	//Test6
	public void test()throws InterruptedException {
		 
			webDriver.get(baseUrl);
			webDriver.manage().window().maximize();
			Thread.sleep(2000);
			webDriver.get(baseUrl);
	        //Go to Moon to Mars page
	        webDriver.findElement(By.xpath("//*[@id=\"nasa-main-menu\"]/li[1]/ul/li[2]/a")).click();
	        Thread.sleep(2000);
	        //Go to Overview
	        webDriver.findElement(By.xpath("/html/body/div[3]/div[2]/div/ul/li[2]/a")).click();
	        Thread.sleep(3000);
	        //assert that main title is "Moon to Mars Overview"
	        String text = webDriver.findElement(By.xpath("/html/body/div[3]/div[3]/section/section/div[2]/div/h1")).getText();
	        assertEquals("Moon to Mars Overview", text);
	        //Go to Images
	        webDriver.findElement(By.xpath("//*[@id=\"ember42\"]/a")).click();
	        Thread.sleep(3000);
	        //click on the third image and assert it is "Space Station Swings by Kennedy"
	        webDriver.findElement(By.xpath("//*[@id=\"ember130\"]/div/a")).click();
	        Thread.sleep(3000);
	        String text2 = webDriver.findElement(By.xpath("//*[@id=\"title\"]")).getText();
	        assertEquals("Space Station Swings by Kennedy", text2);
	        webDriver.findElement(By.xpath("//*[@id=\"ember199\"]/div/a")).click();
	        Thread.sleep(3000);
	        //exit this image and select the sixth image and assert it is "Mass Spectrometer Destined for the Moon Finishes Testing at Kennedy"
	        webDriver.findElement(By.xpath("/html/body/div[3]/div[3]/section/section/div[2]/div/div/div/div[1]/div[6]/div/a")).click();
	        Thread.sleep(3000);
	        String text3 = webDriver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div[2]/div[2]/div/div/div[1]/div[1]/h3/span")).getText();
	        assertEquals("Mass Spectrometer Destined for the Moon Finishes Testing at Kennedy", text3);
	    }
	*/
	/*@Test
	//Test7
	public void test()throws InterruptedException {
		 
			webDriver.get(baseUrl);
			webDriver.manage().window().maximize();
			Thread.sleep(2000);
			webDriver.get(baseUrl);
			//Go to NASA Blog
	        webDriver.findElement(By.xpath("//*[@id=\"nasa-main-menu\"]/li[5]/a")).click();
	        webDriver.findElement(By.xpath("/html/body/div[2]/div/nav/div[3]/ul/li[5]/ul/li[2]/a")).click();
	        Thread.sleep(3000);
	        //verify that the first blog title has "Axiom"
	        String title = webDriver.findElement(By.xpath("//*[@id=\"main\"]/article[1]/header/h2/a")).getText();
	        assertTrue(title.contains("Axiom"));
	        //Enter the Blog
	        webDriver.findElement(By.xpath("//*[@id=\"main\"]/article[1]/header/h2/a")).click();
	        Thread.sleep(3000);
	        //Assert that the date of post is "January 20, 2023"
	        String time = webDriver.findElement(By.xpath("//*[@id=\"post-18225\"]/footer/span[2]/a/time")).getText();
	        assertEquals("January 20, 2023", time);
	        //Leave a Reply
	        webDriver.findElement(By.xpath("//*[@id=\"comment\"]")).sendKeys("Sample Text");
	        webDriver.findElement(By.xpath("//*[@id=\"author\"]")).sendKeys("Hanah");
	        webDriver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("some.email@gmail.com");
	        webDriver.findElement(By.xpath("//*[@id=\"url\"]")).sendKeys("some url");
	        Thread.sleep(3000);
	        //This part is commented so that it doesn't send the message because I don't want to bother NASA
	        //webDriver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
	}
	*/
	
	/*@Test
	//Test8
	public void test()throws InterruptedException {
		 
			webDriver.get(baseUrl);
			webDriver.manage().window().maximize();
			Thread.sleep(2000);
			webDriver.get(baseUrl);
			//Go to College and University site
	        webDriver.findElement(By.xpath("//*[@id=\"nasa-main-menu\"]/li[8]/a")).click();
	        webDriver.findElement(By.xpath("//*[@id=\"nasa-main-menu\"]/li[8]/ul/li[8]/a")).click();
	        Thread.sleep(3000);
	        //Go to Career
	        webDriver.findElement(By.xpath("//*[@id=\"ember39\"]")).sendKeys("Astronaut Information");
	        webDriver.findElement(By.xpath("//*[@id=\"ember38\"]/div/div/button")).click();
	        Thread.sleep(3000);
	        //Go to "Astronaut Information"
	        webDriver.findElement(By.xpath("//*[@id=\"ember51\"]/div[3]/div/h4/a")).click();
	        Thread.sleep(3000);
	        //Check is this article
	        String text = webDriver.findElement(By.xpath("/html/body/div[3]/div[1]/div[6]/div[2]/div/div/ol/li[2]/section/p[1]")).getText();
	        assertEquals("Educators", text);
	        //Click the astronaut facebook link
	        webDriver.findElement(By.xpath("/html/body/div[3]/div[1]/div[6]/div[2]/p/a")).click();
	        Thread.sleep(3000);
	        webDriver.findElement(By.xpath("/html/body/div[3]/div[3]/section/section/div[2]/div/div/div/h3[1]/a")).click();
	        Thread.sleep(3000);
	        //Confirm that you are on this pdf "https://www.nasa.gov/pdf/740566main_current.pdf"
	        String url = webDriver.getCurrentUrl();
	        assertEquals("https://www.nasa.gov/pdf/740566main_current.pdf", url);
	       
	}
	/*
	
	/*@Test
	//Test9
	public void test()throws InterruptedException {
		 
			webDriver.get(baseUrl);
			webDriver.manage().window().maximize();
			Thread.sleep(2000);
			webDriver.get(baseUrl);
			//Go to Space Tech
	        webDriver.findElement(By.xpath("//*[@id=\"nasa-main-menu\"]/li[1]/ul/li[4]/a")).click();
	        Thread.sleep(2000);
	        //Go to Orion Spacecraft
	        webDriver.findElement(By.xpath("//*[@id=\"ember45\"]/section/div[2]/ul/li[3]/a")).click();
	        Thread.sleep(2000);
	        //Select the topic "Bird, Rocket Prepare for Flight at Kennedy Space Center"
	        webDriver.findElement(By.xpath("/html/body/div[3]/div[3]/section/section/div[2]/div/div[2]/div/div[1]/a[7]")).click();
	        Thread.sleep(2000);
	        String title = webDriver.findElement(By.xpath("/html/body/div[3]/div[2]/section/section/div[2]/div/div[1]/div[1]/div[2]/div[1]/div[3]/h1")).getText();
	        assertEquals("Bird, Rocket Prepare for Flight at Kennedy Space Center",title);
	        // assert that the editor is "Monika Luabeya"
	        String text = webDriver.findElement(By.xpath("/html/body/div[3]/div[2]/section/section/div[2]/div/div[1]/div[1]/div[2]/section/div[1]/div/div[2]")).getText();
	        assertTrue(text.contains("Monika Luabeya"));
	        //Go back to main using the icon in top left corner
	        webDriver.findElement(By.xpath("/html/body/div[2]/div/nav/div[1]/a")).click();
	        Thread.sleep(2000);
	        String url = webDriver.getCurrentUrl();
	        assertEquals(baseUrl, url);
	    }
	*/
	/*@Test
	//Test10
	public void test()throws InterruptedException {
		 
			webDriver.get(baseUrl);
			webDriver.manage().window().maximize();
			Thread.sleep(2000);
			webDriver.get(baseUrl);
		     //Go to Missions and select "James Webb Space Telescope"
	        webDriver.findElement(By.xpath("/html/body/div[2]/div/nav/div[3]/ul/li[2]/a")).click();
	        webDriver.findElement(By.xpath("/html/body/div[2]/div/nav/div[3]/ul/li[2]/ul/li[4]/a")).click();
	        Thread.sleep(3000);
	        //Select The first article
	        webDriver.findElement(By.xpath("/html/body/div[3]/div[3]/section/section/div[2]/div/div[2]/div/div[1]/a[1]")).click();
	        Thread.sleep(3000);
	        //Check if the author is Peter Sooy
	        String by = webDriver.findElement(By.xpath("/html/body/div[3]/div[2]/section/section/div[2]/div/div[1]/div[1]/div[2]/section/div[1]/div[3]/p/em/strong/a[1]")).getText();
	        assertEquals("Peter Sooy", by);
	        //Go to "No Fear Act" in the footer of the page
	        webDriver.findElement(By.xpath("/html/body/div[3]/div[2]/section/section/div[2]/div/div[3]/div/ul/li[1]/a")).click();
	        Thread.sleep(3000);
	        //Assert that you are on the right page and go back to main page
	        String check = webDriver.findElement(By.xpath("/html/body/div[3]/div[3]/section/section/div[2]/div/h1")).getText();
	        assertEquals("No Fear Act",check);
	        webDriver.findElement(By.xpath("/html/body/div[2]/div/nav/div[1]/a"));
	    }
	   */ 
}


	




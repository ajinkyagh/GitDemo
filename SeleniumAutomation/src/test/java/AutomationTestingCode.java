import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

class Automation_Testing {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajink\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Actions builder = new Actions(driver);
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		int j,k = 0;
		
		//Test Case 1-Title Test
		driver.get("F:\\study\\BE\\LP2\\Mini Project\\Automation\\Code\\TestingWebsite\\store.html");
		driver.manage().window().maximize();	
		
		
		String exptitle="Shop | Store";
		String acttitle=driver.getTitle();
		if(exptitle.equals(acttitle)) {
			System.out.println("Test Case 1 Passed(Title Test)");
		}
		else
		{
			System.out.println("Test Case 1 Failed(Title Case) ");
		}
		
		Thread.sleep(3000);
        
        //Test Case 2-Add to Cart
		for(int i=1;i<=6;i++) {
			 j=i+1;
			if(i==1) {
				driver.findElement(By.id("btn"+i)).click();
				Thread.sleep(2000);
				js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
				Thread.sleep(2000);
				driver.findElement(By.id("btn")).click();
				Thread.sleep(2000);
				js.executeScript("scroll(0, -250);");
				System.out.println("Test Case " +j+ " Passed(Add to Cart Test) ");
			}
			else {
				driver.findElement(By.id("btn"+i)).click();
				Thread.sleep(2000);
				js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
				Thread.sleep(2000);
				driver.findElement(By.id("btn")).click();
				Thread.sleep(2000);
				js.executeScript("scroll(0, -250);");
				System.out.println("Test Case " +j+ " Passed(Add to cart test)");
				k=j;
			}	
		}
		Thread.sleep(3000);
		
		
		//Test Case-Total Test
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		for(int i=1;i<=6;i++) 
		{
				k++;
				driver.findElement(By.id("btn"+i)).click();
				Thread.sleep(2000);
				js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
				Thread.sleep(2000);
				System.out.println("Test Case " +k+ " Passed(Total Test) ");
			
		}
		Thread.sleep(3000);
		
		//Test Case-Remove
		for(int i=1;i<=6;i++) 
		{
				k++;
				js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
				driver.findElement(By.id("btn")).click();
				Thread.sleep(2000);
				System.out.println("Test Case " +k+ " Passed(Remove Product Test) ");
			
		}
		Thread.sleep(3000);
		
		//Test Case-Add one item multiple times
		k++;
		Thread.sleep(2000);
		js.executeScript("scroll(0, -250);");
		driver.findElement(By.id("btn1")).click();
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		Thread.sleep(2000);
		js.executeScript("scroll(0, -250);");
		driver.findElement(By.id("btn1")).click();
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		System.out.println("Test Case " +k+ " Failed (Adding one item multiple times)");
		driver.findElement(By.id("btn")).click();
		Thread.sleep(3000);
		
		
		
		//Test Case-Change Quantity
		driver.findElement(By.id("btn1")).click();
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(2000);
		
			k++;
			driver.findElement(By.id("quantity")).sendKeys("2");
			driver.findElement(By.id("quantity")).sendKeys(Keys.RETURN);
			Thread.sleep(2000);
			System.out.println("Test Case " +k+ " Passed (Change Quantity Test)");
			driver.findElement(By.id("btn")).click();
			
			k++;
			driver.findElement(By.id("btn1")).click();
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			Thread.sleep(2000);
			driver.findElement(By.id("quantity")).sendKeys("2.7");
			driver.findElement(By.id("quantity")).sendKeys(Keys.RETURN);
			Thread.sleep(2000);
			System.out.println("Test Case " +k+ " Failed(Change Quantity Test) ");
			driver.findElement(By.id("btn")).click();
			
			k++;
			driver.findElement(By.id("btn1")).click();
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			Thread.sleep(2000);
			driver.findElement(By.id("quantity")).sendKeys("-1");
			driver.findElement(By.id("quantity")).sendKeys(Keys.RETURN);
			Thread.sleep(2000);
			System.out.println("Test Case " +k+ " Failed(Change Quantity Test) ");
			driver.findElement(By.id("btn")).click();
			Thread.sleep(3000);
		
		
		//Test case-Purchase item
		k++;
		Thread.sleep(2000);
		driver.findElement(By.id("btn2")).click();
				Thread.sleep(3000);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(2000);
		js.executeScript("scroll(0, -250);");
		driver.findElement(By.id("btn3")).click();
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(2000);
		driver.findElement(By.id("purchase")).click();
		Thread.sleep(2000);
		exptitle="Thankyou";
		acttitle=driver.getTitle();
		if(exptitle.equals(acttitle))
		{
			System.out.println("Test case "+k+" passed(Purchase item test)");
		}
		else
		{
			System.out.println("Test case "+k+" failed(Purchase item test)");
		}
		Thread.sleep(3000);
		
		
		
		driver.close();
        
    }

}

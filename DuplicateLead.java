package week6.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead extends Baseclass{
	@Test
	public void DuplicatedLead() throws InterruptedException {

		driver.findElement(By.linkText("Leads")).click();
		//Click Find leads
		driver.findElement(By.linkText("Find Leads")).click();
		//Click on Email
		driver.findElement(By.linkText("Email")).click();
		//Enter Email
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("krajesh@gmail.com");
		//Click find leads button
		driver.findElement(By.linkText("Find Leads")).click();
		//Capture name of First Resulting lead
		String LeadId = driver.findElement(By.xpath("//div[contains(@class,'x-grid3-cell-inner x-grid3-col-partyId')]/a")).getText();
		System.out.println(LeadId);
		Thread.sleep(3000);
		//Click First Resulting lead
		driver.findElement(By.xpath("//div[contains(@class,'x-grid3-cell-inner x-grid3-col-partyId')]/a")).click();
		Thread.sleep(3000);
		//Click Duplicate Lead
		driver.findElement(By.xpath("(//a[@class='subMenuButton'])[1]")).click();
		Thread.sleep(3000);
		//Verify the title as 'Duplicate Lead'
		String title= driver.getTitle();
		if(title.contains("Duplicate Lead"))
		{
				System.out.println(title);
		} else
	
			System.out.println("Title is not match");
		
		Thread.sleep(3000);
		//Click Create Lead
		driver.findElement(By.name("submitButton")).click();
		//Confirm the duplicated lead name is same as captured name
		String DupeLead=driver.findElement(By.xpath("//span[contains(@id,'viewLead_firstName_sp')]")).getText();
		System.out.println("DupeLead");
		
		
	}

	}



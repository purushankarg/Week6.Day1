package week6.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact extends Baseclass {
	@Test
	public void createcontact() {
		
		 // 5. Click on contacts Button
		driver.findElement(By.linkText("Contacts")).click();
		// 6. Click on Create Contact
		driver.findElement(By.linkText("Create Contact")).click(); 
		 // 7. Enter FirstName Field Using id Locator
		driver.findElement(By.id("firstNameField")).sendKeys("Sekar");
		 // 8. Enter LastName Field Using id Locator
		driver.findElement(By.id("lastNameField")).sendKeys("Mudhali");
		 // 9. Enter FirstName(Local) Field Using id Locator
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Sekar");		 
		 // 10. Enter LastName(Local) Field Using id Locator 
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Uncle");		 
		 // 11. Enter Department Field Using any Locator of Your Choice 
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Family Head");  
		 // 12. Enter Description Field Using any Locator of your choice 
		driver.findElement(By.id("createContactForm_description")).sendKeys("HE is our family head"); 
		 // 13. Enter your email in the E-mail address Field using the locator of your choice 
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("puru_shankarg@yahoo.com"); 
		 // 14. Select State/Province as NewYork Using Visible Text
		WebElement drpdwn1 = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select country=new Select(drpdwn1);
		country.selectByValue("NY");
		 // 15. Click on Create Contact
		 driver.findElement(By.name("submitButton")).click();
		 // 16. Click on edit button 
		 driver.findElement(By.linkText("Edit")).click();
		 // 17. Clear the Description Field using .clear
		 driver.findElement(By.id("updateContactForm_description")).clear();
		 // 18. Fill ImportantNote Field with Any text
		 driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Notes Updated");
		 // 19. Click on update button using Xpath locator
		 driver.findElement(By.xpath("//input[@value='Update']")).click();
		 // 20. Get the Title of Resulting Page.
		 System.out.println(driver.getTitle());


	}

}

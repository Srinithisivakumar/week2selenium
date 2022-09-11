package week2.day1.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class classassignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				// TODO Auto-generated method stub
				WebDriverManager.chromedriver().setup();
				//String pat = System.getProperty("hi");
				//System.out.println(pat);
				ChromeDriver drive=new ChromeDriver();
				drive.get("http://leaftaps.com/opentaps/control/main");
				WebElement username = drive.findElement(By.id("username"));
				username.sendKeys("Demosalesmanager");
				
				drive.findElement(By.id("password")).sendKeys("crmsfa");
				drive.findElement(By.className("decorativeSubmit")).click();
				drive.findElement(By.partialLinkText("CRM/SFA")).click();//Leads
				drive.findElement(By.partialLinkText("Leads")).click();
				drive.findElement(By.partialLinkText("Create Lead")).click();
				drive.findElement(By.id("createLeadForm_companyName")).sendKeys("IBM");
				drive.findElement(By.id("createLeadForm_firstName")).sendKeys("srinithi");
				drive.findElement(By.id("createLeadForm_lastName")).sendKeys("sivakumar");
				drive.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("tha");//
				drive.findElement(By.id("createLeadForm_departmentName")).sendKeys("sel");
				drive.findElement(By.id("createLeadForm_description")).sendKeys("good envi ");
				drive.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("xyz@gmail.com");
				
				WebElement drivee = drive.findElement(By.name("generalStateProvinceGeoId"));
				 Select ddf= new Select(drivee);
				 ddf.selectByVisibleText("New York");
				 
				 drive.findElement(By.name("submitButton")).click();;
				 System.out.println("name of the url"+      drive.getTitle());
				 
				 
				
				
				
					

			}



	}



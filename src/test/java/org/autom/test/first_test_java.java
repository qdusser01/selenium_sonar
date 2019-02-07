package org.autom.test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class first_test_java {
	
	
	@Test
	public void acheterDesAnimaux() {
		
		//renseigne l'emplacement du driver
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\formation\\Desktop\\SUT\\geckodriver.exe");
		
		//instanciation de WebDriver
		WebDriver driver = new FirefoxDriver();
		
		//navigation
		driver.get("http://localhost:8090/jpetstore");
		
		//trouver un élément sur la page et entrer dans JpetStore
		driver.findElement(By.xpath("//*[@href=\"actions/Catalog.action\"]")).click();
		
		//se loguer 
		driver.findElement(By.xpath("//div[@id=\"MenuContent\"]/a[2]")).click();
		driver.findElement(By.xpath("//*[@name=\"username\"]")).sendKeys("j2ee");;
		driver.findElement(By.xpath("//*[@name=\"password\"]")).clear();
		driver.findElement(By.xpath("//*[@name=\"password\"]")).sendKeys("j2ee");
		driver.findElement(By.xpath("//*[@name=\"signon\"]")).click();
		
		//acheter un chien en tant que client J2ee
		driver.findElement(By.xpath("//div[@id=\"SidebarContent\"]/a[2]/img")).click();
		driver.findElement(By.xpath("//*[@href=\"/jpetstore/actions/Catalog.action?viewProduct=&productId=K9-BD-01\"]")).click();
		driver.findElement(By.xpath("//*[@href=\"/jpetstore/actions/Cart.action?addItemToCart=&workingItemId=EST-6\"]")).click();
		driver.findElement(By.xpath("//div[@id=\"BackLink\"]/a[@href=\"/jpetstore/actions/Catalog.action\"]")).click();
		
		//acheter un chat en tant que client J2EE
		driver.findElement(By.xpath("//div[@id=\"SidebarContent\"]/a[@href=\"/jpetstore/actions/Catalog.action?viewCategory=&categoryId=CATS\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a")).click();
		driver.findElement(By.xpath("//div[@id=\"BackLink\"]/a[@href=\"/jpetstore/actions/Catalog.action\"]")).click();
		
		//acheter un reptile en tant que client J2EE
		driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[4]/img")).click();
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[5]/a")).click();
		driver.findElement(By.xpath("//div[@id=\"BackLink\"]/a[@href=\"/jpetstore/actions/Catalog.action\"]")).click();
		
		//acheter un oiseau en tant que client J2EE
		driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[5]/img")).click();
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a")).click();
		driver.findElement(By.xpath("//div[@id=\"BackLink\"]/a[@href=\"/jpetstore/actions/Catalog.action\"]")).click();
		
		//acheter plusieurs poissons en tant que client J2EE
		driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[1]/img")).click();
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"Cart\"]/form/table/tbody/tr[6]/td[5]/input")).clear();
		driver.findElement(By.xpath("//*[@id=\"Cart\"]/form/table/tbody/tr[6]/td[5]/input")).sendKeys("10");
		driver.findElement(By.xpath("//*[@id=\"QuickLinks\"]/a[1]/img")).click();
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"Cart\"]/form/table/tbody/tr[7]/td[5]/input")).clear();
		driver.findElement(By.xpath("//*[@id=\"Cart\"]/form/table/tbody/tr[7]/td[5]/input")).sendKeys("10");
		driver.findElement(By.xpath("//div[@id=\"BackLink\"]/a[@href=\"/jpetstore/actions/Catalog.action\"]")).click();
		
		//mon compte
		driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[3]")).click();
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("j2ee");
		driver.findElement(By.xpath("//input[@name=\"repeatedPassword\"]")).sendKeys("j2ee");
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/input")).click();
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[1]/img")).click();
		
		
		//payer
		driver.findElement(By.xpath("//*[@id=\"Cart\"]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/input")).click();
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/a")).click();
		driver.findElement(By.xpath("//div[@id=\"BackLink\"]/a[@href=\"/jpetstore/actions/Catalog.action\"]")).click();
		
		//se déconnecter en tant qu'utilisateur J2EE et quitter le webdriver
		driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[2]")).click();
		driver.quit();
				
	}

}
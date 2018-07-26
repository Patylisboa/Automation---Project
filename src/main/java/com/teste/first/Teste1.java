package com.teste.first;

import org.testng.annotations.Test;
import javax.swing.plaf.basic.BasicTreeUI.SelectionModelPropertyChangeHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Teste1 {
	
	public WebDriver driver;
	
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\IBM_ADMIN\\Desktop\\Projeto-C\\teste-1\\drivers\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();              
      driver.get("http://localhost:8080/cards/create");
        
      
  }
  
  @Test
  public void duringMethod() {
	  driver.findElement(By.name("gathererId")).sendKeys("1");
	  driver.findElement(By.name("searchName")).sendKeys("teste");
	  driver.findElement(By.name("englishName")).sendKeys("test");
	  driver.findElement(By.name("linkName")).sendKeys("teste - link");
	  driver.findElement(By.name("color")).sendKeys("red");
	  driver.findElement(By.name("rarity")).sendKeys("test");
	  driver.findElement(By.name("rules")).sendKeys("test");
	  driver.findElement(By.name("flavorText")).sendKeys("test");
	  driver.findElement(By.name("superTypes")).sendKeys("test");
	  driver.findElement(By.name("cardTypes")).sendKeys("test");
	  driver.findElement(By.name("expansionId")).sendKeys("test");
	  driver.findElement(By.name("artistId")).sendKeys("test");
	  driver.findElement(By.id("submit")).click();
	 
	  
	  
	  
	  
	  
	  
  }
  
  @AfterMethod
  public void afterMethod() {
	 driver.quit();
  }

}

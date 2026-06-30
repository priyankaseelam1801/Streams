package Streams;

import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Filterfunction1 {

	public static void main(String[] args) {
	

		WebDriver driver = (WebDriver) new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		driver.findElement(By.id("search-field")).sendKeys("Rice");
		List<WebElement> veggies = driver.findElements(By.xpath("//tr/td[1]"));
		
		List<WebElement> filteredList = veggies.stream().filter(veggie->veggie.getText().
				contains("Rice")).collect(Collectors.toList());
		System.out.println(veggies.size()==filteredList.size());

	}
}

	
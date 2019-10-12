package qsp;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelectDropdown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("file:///D:/HTML/MultipleSelectDropdown.html");
		
		WebElement dd = driver.findElement(By.id("mtr"));
		Select sel=new Select(dd);
		
		List<WebElement> allOptions = sel.getOptions();
		int count = allOptions.size();
		System.out.println(count);
		
		//to select all the options from top to bottum
		
		for(int i=0;i<count;i++)
		{
			sel.selectByIndex(i);
		}
		
		

		//to deselect all the options in the reverse order
		
		for(int i=count-1;i>=0;i--)
		{
			sel.deselectByIndex(i);
		}
		
		
		
	//to print all the text of all the options 
		System.out.println("to print all the text of all the options");
		 for(int i=0;i<count;i++)
		 {
			 System.out.println(allOptions.get(i).getText());
		 }
		
		System.out.println("----------"); 
		
		 //to print without duplicate without maintaining order
		System.out.println("to print without duplicate without maintaining order");
		Set<String> s=new HashSet<String>();
		for(int i=0;i<count;i++)
		{
			String text = allOptions.get(i).getText();
			s.add(text);
		}
		
		for(String str : s)
		{
			System.out.println(str);
		}
		
		System.out.println("---------");
		
		//to print without duplicate but maintaining order of insertion
		System.out.println("to print without duplicate but maintaining order of insertion");
		Set<String> l=new LinkedHashSet<String>();
		for(int i=0;i<count;i++)
		{
			String text = allOptions.get(i).getText();
			l.add(text);
		}
		
		for(String str : l)
		{
			System.out.println(str);
		}
		
		System.out.println("-------");
		
		//to print without duplicate in a sorted order
		System.out.println("to print without duplicate in a sorted order");
		Set<String> t=new TreeSet<String>();
		for(int i=0;i<count;i++)
		{
			String text = allOptions.get(i).getText();
			t.add(text);
		}
		
		for(String str : t)
		{
			System.out.println(str);
		}
		
		
	
	}

}

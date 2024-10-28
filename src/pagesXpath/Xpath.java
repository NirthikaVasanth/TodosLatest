package pagesXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Xpath {
	
	
	public static By typingfield = By.xpath ("//input[@id='todo-input' and @data-testid='text-input' and @class = 'new-todo' ]");
	public static By toggle = By.xpath ("//input[@class=\"toggle\"]");
	public static By all = By.xpath ( "//footer[@class=\"footer\"]//ul//li[1]//a");
	public static By active = By.xpath ( "//footer[@class=\"footer\"]//ul//li[2]//a");
	public static By completed = By.xpath ( "//footer[@class=\"footer\"]//ul//li[3]//a");
	public static By clearCompleted = By.xpath ( "//button[@class=\"clear-completed\"]");
	public static By Xbutton = By.xpath ("//label[text()=\"wenfiwe\"]/following-sibling::button");
	public static By addlabel = By.xpath ( "//label[text()=\"wenfiwe\"]");
	public static By downarrow = By.xpath ( "//input[@class=\"toggle-all\"]");
	
	

	

}

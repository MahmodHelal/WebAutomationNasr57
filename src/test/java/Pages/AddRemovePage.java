package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AddRemovePage {
    WebDriver driver;

    public AddRemovePage(WebDriver driver) {
        this.driver = driver;
    }

    By addButtonLocator = By.xpath("//button[@onclick='addElement()']");
    By deleteButtonLocator = By.xpath("//button[contains(text(),'Delete')]");


    public void clickOnAddButton(int times){
        for (int i =0 ; i< times;i++){
            driver.findElement(addButtonLocator).click();
        }
    }
    public void clickDelete(int times){
        List<WebElement> deleteButtons = driver.findElements(deleteButtonLocator);
        int numberOfButtons = deleteButtons.size();//5
        if (times <= numberOfButtons){
            for (int i = 0 ; i< times;i++){
                deleteButtons.get(i).click();
            }
        }else {
            System.out.println("out of bound your target is + "+times+ "but buttons number is "+ numberOfButtons);
        }
    }
    public int getNumberOfDeleteButtons(){
        List<WebElement> deleteButtons = driver.findElements(deleteButtonLocator);
        return deleteButtons.size();
    }
}

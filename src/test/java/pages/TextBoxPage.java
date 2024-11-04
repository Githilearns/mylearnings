package pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class TextBoxPage extends Form {
    private static final String NAME="Text Box";
    private final ITextBox FULLNAME= getElementFactory().getTextBox(By.id("userName"), "Full Name");
    private final IButton SUBMIT= getElementFactory().getButton(By.id("submit"), "Submit");
    private final ILabel BOTTOMNAME= getElementFactory().getLabel(By.id("name"), "Bottom Name");
    public TextBoxPage() {
        super(By.xpath("//div[@class='col-12 mt-4 col-md-6']"), NAME);
    }

    public void enterFullName(String fullName){
        FULLNAME.clearAndType(fullName);
    }
    public void clickSubmit() {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) AqualityServices.getBrowser().getDriver();
        jsExecutor.executeScript("arguments[0].click();", SUBMIT.getElement());
    }
    public String getBottomName(){
       return BOTTOMNAME.getText();
    }


}

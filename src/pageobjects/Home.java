package pageobjects;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.provar.core.testapi.annotations.*;

@Page( title="Home"                                
     , summary=""
     , relativeUrl=""
     , connection="Bank_RetailDepartment"
     )             
public class Home {

	@TextType()
	@FindBy(id = "createNewButton")
	public WebElement CreateNew;
	@LinkType()
	@FindBy(xpath = "//*[@id=\"createNewMenu\"]/a[2]")
	public WebElement task;
			
}

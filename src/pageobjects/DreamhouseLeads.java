package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Dreamhouse Leads"                                
               , summary=""
               , page="DreamhouseLeads"
               , namespacePrefix=""
               , object=""
               , connection="DemoOrg"
     )             
public class DreamhouseLeads {

	@ButtonType()
	@VisualforceBy(componentXPath = "apex:commandButton[@action='{!URLFOR($Action.Lead.New)}']")
	public WebElement new_;
	
}

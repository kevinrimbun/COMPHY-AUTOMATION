import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://cms-comphy.herokuapp.com/')

for(def rowNum=1; rowNum<=findTestData("COMPHY DATA BINDING/LOGIN CMS COMPHY").getRowNumbers(); rowNum++)
{

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Admin Comphy - Login/img_Welcome Back Admin Comphy_w-50'), 
    0)

WebUI.setText(findTestObject('Object Repository/Page_Admin Comphy - Login/input_Welcome Back Admin Comphy_inputEmail'), 
    findTestData("COMPHY DATA BINDING/LOGIN CMS COMPHY").getValue(1,1))

WebUI.setText(findTestObject('Object Repository/Page_Admin Comphy - Login/input_Welcome Back Admin Comphy_inputPassword'), 
    findTestData("COMPHY DATA BINDING/LOGIN CMS COMPHY").getValue(2,1))

Thread.sleep(2000)
}

WebUI.click(findTestObject('Object Repository/Page_Admin Comphy - Login/a_Login'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Comphy - Admin/div_CMS Comphy'), 0)

WebUI.click(findTestObject('Object Repository/Page_Comphy - Admin/span_Admin'))

WebUI.click(findTestObject('Object Repository/Page_Comphy - Admin/a_Logout'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Comphy - Admin/div_Select Logout below if you are ready to_ea7f33'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Comphy - Admin/a_Logout_1'))

WebUI.closeBrowser()


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

//Order Unsuccessful
WebUI.openBrowser('')

WebUI.navigateToUrl('https://petstore.octoperf.com/actions/Catalog.action')

WebUI.click(findTestObject('Object Repository/Booking Unsuccessfully/Page_JPetStore Demo/img'))

WebUI.click(findTestObject('Object Repository/Booking Unsuccessfully/Page_JPetStore Demo/a_K9-PO-02'))

WebUI.click(findTestObject('Object Repository/Booking Unsuccessfully/Page_JPetStore Demo/a_Add to Cart'))

WebUI.setText(findTestObject('Object Repository/Booking Unsuccessfully/Page_JPetStore Demo/input_true_EST-8'), '2')

WebUI.click(findTestObject('Object Repository/Booking Unsuccessfully/Page_JPetStore Demo/input_Sub Total 18.50_updateCartQuantities'))

WebUI.click(findTestObject('Object Repository/Booking Unsuccessfully/Page_JPetStore Demo/a_Proceed to Checkout'))

// Wait for the element to be visible
WebUI.waitForElementVisible(findTestObject('Object Repository/Booking Unsuccessfully/Page_JPetStore Demo/li_You must sign on before attempting to check out.  Please sign on and try checking out again'),  10)
// Check for the login page or sign-in button to confirm that the user is not logged in
String loginRequiredText = WebUI.getText(findTestObject('Object Repository/Booking Unsuccessfully/Page_JPetStore Demo/li_You must sign on before attempting to check out.  Please sign on and try checking out again'))
if (loginRequiredText == 'You must sign on before attempting to check out.  Please sign on and try checking out again') {
	
	WebUI.comment('User is not logged in.')
} else {
	// Handle case if user is logged in
	WebUI.comment('User is already logged in.')
}

//WebUI.verifyEqual(loginRequiredText, 'You must sign on before attempting to check out.  Please sign on and try checking out again')
WebUI.closeBrowser()

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

WebUI.navigateToUrl('https://petstore.octoperf.com/')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_JPetStore Demo/h2_Welcome to JPetStore 6'), 0)

WebUI.click(findTestObject('Object Repository/Page_JPetStore Demo/a_Enter the Store'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_JPetStore Demo/img'), 0)

WebUI.click(findTestObject('Object Repository/Page_JPetStore Demo/img_1'))

WebUI.click(findTestObject('Object Repository/Page_JPetStore Demo/div_FishProduct IDNameFI-SW-01AngelfishFI-S_1fe894'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_JPetStore Demo/div_FishProduct IDNameFI-SW-01AngelfishFI-S_1fe894'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_JPetStore Demo/a_FI-SW-01'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_JPetStore Demo/div_AngelfishItem IDProduct IDDescriptionLi_4c213d'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_JPetStore Demo/a_EST-1'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_JPetStore Demo/img_1_2'), 0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_JPetStore Demo/a_Add to Cart'))

WebUI.click(findTestObject('Object Repository/Page_JPetStore Demo/a_Add to Cart'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_JPetStore Demo/div_Shopping CartItem IDProduct IDDescripti_f30008'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_JPetStore Demo/td_FI-SW-01'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_JPetStore Demo/td_EST-1'), 0)

WebUI.closeBrowser()


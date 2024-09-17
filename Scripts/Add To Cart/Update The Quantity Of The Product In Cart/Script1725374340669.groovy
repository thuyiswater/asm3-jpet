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

WebUI.verifyElementVisible(findTestObject('Object Repository/Add To Cart/Update The Quantity Of The Product In Cart/a_Enter the Store'))

WebUI.click(findTestObject('Object Repository/Add To Cart/Update The Quantity Of The Product In Cart/a_Enter the Store'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Add To Cart/Update The Quantity Of The Product In Cart/img'))

WebUI.click(findTestObject('Object Repository/Add To Cart/Update The Quantity Of The Product In Cart/img'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Add To Cart/Update The Quantity Of The Product In Cart/a_FI-SW-01'))

WebUI.click(findTestObject('Object Repository/Add To Cart/Update The Quantity Of The Product In Cart/a_FI-SW-01'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Add To Cart/Update The Quantity Of The Product In Cart/a_Add to Cart'))

WebUI.click(findTestObject('Object Repository/Add To Cart/Update The Quantity Of The Product In Cart/a_Add to Cart'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Add To Cart/Update The Quantity Of The Product In Cart/a_EST-1'))
String itemId = WebUI.getText(findTestObject('Object Repository/Add To Cart/Update The Quantity Of The Product In Cart/a_EST-1'))
assert itemId == 'EST-1' : "Expected Item ID is 'EST-1', but found '${itemId}'"

WebUI.verifyElementVisible(findTestObject('Object Repository/Add To Cart/Update The Quantity Of The Product In Cart/td_FI-SW-01'))
String productId = WebUI.getText(findTestObject('Object Repository/Add To Cart/Update The Quantity Of The Product In Cart/td_FI-SW-01'))
assert productId == 'FI-SW-01' : "Expected Product ID is 'FI-SW-01', but found '${productId}'"

WebUI.verifyElementVisible(findTestObject('Object Repository/Add To Cart/Update The Quantity Of The Product In Cart/input_false_EST-1'))
TestObject quantityInput = findTestObject('Object Repository/Add To Cart/Update The Quantity Of The Product In Cart/input_false_EST-1')
if (quantityInput != null) {
	String quantity = WebUI.getAttribute(quantityInput, 'value')
	assert quantity == '1' : "Expected quantity is '1', but found '${quantity}'"
} else {
	WebUI.comment('TestObject input_quantity_EST-1 is null')
}

WebUI.verifyElementVisible(findTestObject('Object Repository/Add To Cart/Update The Quantity Of The Product In Cart/td_16.50'))
String totalCost = WebUI.getText(findTestObject('Object Repository/Add To Cart/Update The Quantity Of The Product In Cart/td_16.50'))
assert totalCost == '$16.50' : "Expected total cost is '\$16.50', but found '${totalCost}'"

WebUI.setText(findTestObject('Object Repository/Add To Cart/Update The Quantity Of The Product In Cart/input_false_EST-1'), '3')

WebUI.click(findTestObject('Object Repository/Add To Cart/Update The Quantity Of The Product In Cart/input_Sub Total 16.50_updateCartQuantities'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Add To Cart/Update The Quantity Of The Product In Cart/a_EST-1'))
itemId = WebUI.getText(findTestObject('Object Repository/Add To Cart/Update The Quantity Of The Product In Cart/a_EST-1'))
assert itemId == 'EST-1' : "Expected Item ID is 'EST-1', but found '${itemId}'"

WebUI.verifyElementVisible(findTestObject('Object Repository/Add To Cart/Update The Quantity Of The Product In Cart/td_FI-SW-01'))
productId = WebUI.getText(findTestObject('Object Repository/Add To Cart/Update The Quantity Of The Product In Cart/td_FI-SW-01'))
assert productId == 'FI-SW-01' : "Expected Product ID is 'FI-SW-01', but found '${productId}'"

WebUI.verifyElementVisible(findTestObject('Object Repository/Add To Cart/Update The Quantity Of The Product In Cart/input_false_EST-1'))
quantityInput = findTestObject('Object Repository/Add To Cart/Update The Quantity Of The Product In Cart/input_false_EST-1')
if (quantityInput != null) {
	String quantity = WebUI.getAttribute(quantityInput, 'value')
	assert quantity == '3' : "Expected quantity is '3', but found '${quantity}'"
} else {
	WebUI.comment('TestObject input_quantity_EST-1 is null')
}

WebUI.verifyElementVisible(findTestObject('Object Repository/Add To Cart/Update The Quantity Of The Product In Cart/td_49.50'))
totalCost = WebUI.getText(findTestObject('Object Repository/Add To Cart/Update The Quantity Of The Product In Cart/td_49.50'))
assert totalCost == '$49.50' : "Expected total cost is '\$49.50', but found '${totalCost}'"


WebUI.closeBrowser()


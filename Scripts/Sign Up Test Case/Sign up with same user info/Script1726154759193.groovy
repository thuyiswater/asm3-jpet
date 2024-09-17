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

WebUI.click(findTestObject('Object Repository/Sign Up/Sign up with same user info/Page_JPetStore Demo/a_Enter the Store'))

WebUI.click(findTestObject('Object Repository/Sign Up/Sign up with same user info/Page_JPetStore Demo/a_Sign In'))

WebUI.click(findTestObject('Object Repository/Sign Up/Sign up with same user info/Page_JPetStore Demo/a_Register Now'))

WebUI.setText(findTestObject('Object Repository/Sign Up/Sign up with same user info/Page_JPetStore Demo/input_User ID_username'), 
    'kaka')

WebUI.verifyElementVisible(findTestObject('Object Repository/Sign Up/Sign up with same user info/Page_JPetStore Demo/input_User ID_username'))
String userID = WebUI.getAttribute(findTestObject('Object Repository/Sign Up/Sign up with same user info/Page_JPetStore Demo/input_User ID_username'), 'value')
assert userID == 'kaka' : "Expect userID is kaka1, but found '${userID}'"

WebUI.setText(findTestObject('Object Repository/Sign Up/Sign up with same user info/Page_JPetStore Demo/input_New password_password'), '12345')

WebUI.verifyElementVisible(findTestObject('Object Repository/Sign Up/Sign up with same user info/Page_JPetStore Demo/input_New password_password'))
String password = WebUI.getAttribute(findTestObject('Object Repository/Sign Up/Sign up with same user info/Page_JPetStore Demo/input_New password_password'), 'value')
assert password == '12345' : "Expect password is 12345, but found '${password}'"

WebUI.setText(findTestObject('Object Repository/Sign Up/Sign up with same user info/Page_JPetStore Demo/input_Repeat password_repeatedPassword'), '12345')

WebUI.verifyElementVisible(findTestObject('Object Repository/Sign Up/Sign up with same user info/Page_JPetStore Demo/input_Repeat password_repeatedPassword'))
String repeat_password = WebUI.getAttribute(findTestObject('Object Repository/Sign Up/Sign up with same user info/Page_JPetStore Demo/input_Repeat password_repeatedPassword'), 'value')
assert repeat_password == '12345' : "Expect password is 12345, but found '${repeat_password}'"

WebUI.setText(findTestObject('Object Repository/Sign Up/Sign up with same user info/Page_JPetStore Demo/input_First name_account.firstName'), 'hi')

WebUI.verifyElementVisible(findTestObject('Object Repository/Sign Up/Sign up with same user info/Page_JPetStore Demo/input_First name_account.firstName'))
String firstname = WebUI.getAttribute(findTestObject('Object Repository/Sign Up/Sign up with same user info/Page_JPetStore Demo/input_First name_account.firstName'), 'value')
assert firstname == 'hi' : "Expect user firstname is hi, but found '${firstname}'"

WebUI.setText(findTestObject('Object Repository/Sign Up/Sign up with same user info/Page_JPetStore Demo/input_Last name_account.lastName'), 'hi')

WebUI.verifyElementVisible(findTestObject('Object Repository/Sign Up/Sign up with same user info/Page_JPetStore Demo/input_Last name_account.lastName'))
String lastname = WebUI.getAttribute(findTestObject('Object Repository/Sign Up/Sign up with same user info/Page_JPetStore Demo/input_Last name_account.lastName'), 'value')
assert lastname == 'hi' : "Expect user lastname is hi, but found '${lastname}'"

WebUI.setText(findTestObject('Object Repository/Sign Up/Sign up with same user info/Page_JPetStore Demo/input_Email_account.email'), 'hi12@gmail.com')

WebUI.verifyElementVisible(findTestObject('Object Repository/Sign Up/Sign up with same user info/Page_JPetStore Demo/input_Email_account.email'))
String email = WebUI.getAttribute(findTestObject('Object Repository/Sign Up/Sign up with same user info/Page_JPetStore Demo/input_Email_account.email'), 'value')
assert email == 'hi12@gmail.com' : "Expect user email is hi12@gmail.com, but found '${email}'"

WebUI.setText(findTestObject('Object Repository/Sign Up/Sign up with same user info/Page_JPetStore Demo/input_Phone_account.phone'), 
    '123456')

WebUI.verifyElementVisible(findTestObject('Object Repository/Sign Up/Sign up with same user info/Page_JPetStore Demo/input_Phone_account.phone'))
String phone = WebUI.getAttribute(findTestObject('Object Repository/Sign Up/Sign up with same user info/Page_JPetStore Demo/input_Phone_account.phone'), 'value')
assert phone == '123456' : "Expect user phone is 123456, but found '${phone}'"

WebUI.setText(findTestObject('Object Repository/Sign Up/Sign up with same user info/Page_JPetStore Demo/input_Address 1_account.address1'), '123 abc')

WebUI.verifyElementVisible(findTestObject('Object Repository/Sign Up/Sign up with same user info/Page_JPetStore Demo/input_Address 1_account.address1'))
String address1 = WebUI.getAttribute(findTestObject('Object Repository/Sign Up/Sign up with same user info/Page_JPetStore Demo/input_Address 1_account.address1'), 'value')
assert address1 == '123 abc' : "Expect user address 1 is 123 abc, but found '${address1}'"

WebUI.setText(findTestObject('Object Repository/Sign Up/Sign up with same user info/Page_JPetStore Demo/input_Address 2_account.address2'), 
    '123 abc')

WebUI.verifyElementVisible(findTestObject('Object Repository/Sign Up/Sign up with same user info/Page_JPetStore Demo/input_Address 2_account.address2'))
String address2 = WebUI.getAttribute(findTestObject('Object Repository/Sign Up/Sign up with same user info/Page_JPetStore Demo/input_Address 2_account.address2'), 'value')
assert address2 == '123 abc' : "Expect user address 2 is 123 abc, but found '${address2}'"

WebUI.setText(findTestObject('Object Repository/Sign Up/Sign up with same user info/Page_JPetStore Demo/input_City_account.city'), 
    'ab')

WebUI.verifyElementVisible(findTestObject('Object Repository/Sign Up/Sign up with same user info/Page_JPetStore Demo/input_City_account.city'))
String city = WebUI.getAttribute(findTestObject('Object Repository/Sign Up/Sign up with same user info/Page_JPetStore Demo/input_City_account.city'), 'value')
assert city == 'ab' : "Expect user city is ab, but found '${city}'"

WebUI.setText(findTestObject('Object Repository/Sign Up/Sign up with same user info/Page_JPetStore Demo/input_State_account.state'), 
    'ab')

WebUI.verifyElementVisible(findTestObject('Object Repository/Sign Up/Sign up with same user info/Page_JPetStore Demo/input_State_account.state'))
String state = WebUI.getAttribute(findTestObject('Object Repository/Sign Up/Sign up with same user info/Page_JPetStore Demo/input_State_account.state'), 'value')
assert state == 'ab' : "Expect user state is ab, but found '${state}'"

WebUI.setText(findTestObject('Object Repository/Sign Up/Sign up with same user info/Page_JPetStore Demo/input_Zip_account.zip'), 
    '20')

WebUI.verifyElementVisible(findTestObject('Object Repository/Sign Up/Sign up with same user info/Page_JPetStore Demo/input_Zip_account.zip'))
String zip = WebUI.getAttribute(findTestObject('Object Repository/Sign Up/Sign up with same user info/Page_JPetStore Demo/input_Zip_account.zip'), 'value')
assert zip == '20' : "Expect user zip code is 20, but found '${zip}'"

WebUI.setText(findTestObject('Object Repository/Sign Up/Sign up with same user info/Page_JPetStore Demo/input_Country_account.country'), 
    'thailand')

WebUI.verifyElementVisible(findTestObject('Object Repository/Sign Up/Sign up with same user info/Page_JPetStore Demo/input_Country_account.country'))
String country = WebUI.getAttribute(findTestObject('Object Repository/Sign Up/Sign up with same user info/Page_JPetStore Demo/input_Country_account.country'), 'value')
assert country == 'thailand' : "Expect user country is thailand, but found '${country}'"

WebUI.click(findTestObject('Object Repository/Sign Up/Sign up with same user info/Page_JPetStore Demo/input_Enable MyBanner_newAccount'))

WebUI.closeBrowser()


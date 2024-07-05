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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://dashboard.melaka.app/register')

WebUI.verifyElementPresent(findTestObject('Object Repository/Functional Test/Login Negative Test/Page_Daftar Sekarang  Melaka/a_Masuk'), 
    0)

WebUI.click(findTestObject('Object Repository/Functional Test/Login Negative Test/Page_Daftar Sekarang  Melaka/a_Masuk'))

WebUI.setText(findTestObject('Object Repository/Functional Test/Login Negative Test/Page_Login  Melaka/input_Login_identifier'), 
    'qwerty@123.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Functional Test/Login Negative Test/Page_Login  Melaka/input_Email_password'), 
    '4nvbrPglk7k=')

WebUI.click(findTestObject('Object Repository/Functional Test/Login Negative Test/Page_Login  Melaka/button_Login'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Functional Test/Login Negative Test/Page_Login  Melaka/div_Email atau kata sandi tidak valid'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Functional Test/Login Negative Test/Page_Login  Melaka/p_Email atau kata sandi tidak valid'), 
    'Email atau kata sandi tidak valid.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Functional Test/Login Negative Test/Page_Login  Melaka/div_Email atau kata sandi tidak valid'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Functional Test/Login Negative Test/Page_Login  Melaka/p_Email atau kata sandi tidak valid'), 
    'Email atau kata sandi tidak valid.')

WebUI.setText(findTestObject('Object Repository/Functional Test/Login Negative Test/Page_Login  Melaka/input_Login_identifier'), 
    '')

WebUI.setEncryptedText(findTestObject('Object Repository/Functional Test/Login Negative Test/Page_Login  Melaka/input_Email_password'), 
    '9NLz+4tGZcQ=')

WebUI.click(findTestObject('Object Repository/Functional Test/Login Negative Test/Page_Login  Melaka/button_Login'))

WebUI.verifyElementText(findTestObject('Object Repository/Functional Test/Login Negative Test/Page_Login  Melaka/p_Wajib diisi'), 
    'Wajib diisi.')

WebUI.verifyElementText(findTestObject('Object Repository/Functional Test/Login Negative Test/Page_Login  Melaka/p_Wajib diisi'), 
    'Wajib diisi.')

WebUI.closeBrowser()


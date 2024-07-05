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

WebUI.click(findTestObject('Object Repository/Functional Test/Login Valid Account/Page_Daftar Sekarang  Melaka/a_Masuk'))

WebUI.setText(findTestObject('Object Repository/Functional Test/Login Valid Account/Page_Login  Melaka/input_Login_identifier'), 
    'fahmi.katalondemo.wiradika@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Functional Test/Login Valid Account/Page_Login  Melaka/input_Email_password'), 
    'xPWO3tDTdMNo8kZBD1kiGA==')

WebUI.click(findTestObject('Object Repository/Functional Test/Login Valid Account/Page_Login  Melaka/button_Login'))

WebUI.verifyElementText(findTestObject('Object Repository/Functional Test/Login Valid Account/Page_Laporan  Melaka/div_Aktifkan notifikasi untuk terus update _765753'), 
    'Aktifkan notifikasi untuk terus update pesanan baru dan pemberitahuan lainnya!')

WebUI.click(findTestObject('Object Repository/Functional Test/Login Valid Account/Page_Laporan  Melaka/button_Nanti saja'))


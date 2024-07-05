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

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Login Page/Page_Daftar Sekarang  Melaka/a_Masuk'), 
    0)

WebUI.click(findTestObject('Object Repository/Register Dashboard Verification/Login Page/Page_Daftar Sekarang  Melaka/a_Masuk'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Login Page/Page_Login  Melaka/button_Jadwalkan Demo'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Login Page/Page_Login  Melaka/div_LoginSelamat datang kembali Masukkan em_3da10b'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Login Page/Page_Login  Melaka/h1_Login'), 'Login')

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Login Page/Page_Login  Melaka/p_Selamat datang kembali Masukkan email dan_8ff690'), 
    'Selamat datang kembali! Masukkan email dan kata sandi terdaftarmu.')

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Login Page/Page_Login  Melaka/p_Wajib diisi'), 
    'Wajib diisi.')

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Login Page/Page_Login  Melaka/a_Lupa kata sandi'), 
    'Lupa kata sandi?')

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Login Page/Page_Login  Melaka/div_Wajib diisi'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Login Page/Page_Login  Melaka/p_Lupa kata sandi'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Login Page/Page_Login  Melaka/input_Login_identifier'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Login Page/Page_Login  Melaka/input_Email_password'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Login Page/Page_Login  Melaka/svg_Icon_text-neutral-N600 h-6 w-6'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Login Page/Page_Login  Melaka/button_Login'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Register Dashboard Verification/Login Page/Page_Login  Melaka/button_Login'))

WebUI.closeBrowser()


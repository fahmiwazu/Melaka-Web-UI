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

WebUI.setText(findTestObject('Object Repository/Functional Test/Register Negative Test/Page_Daftar Sekarang  Melaka/input_Selamat Datang diMelaka_name'), 
    'abc')

WebUI.setText(findTestObject('Object Repository/Functional Test/Register Negative Test/Page_Daftar Sekarang  Melaka/input_Nama_phone'), 
    '123')

WebUI.setText(findTestObject('Object Repository/Functional Test/Register Negative Test/Page_Daftar Sekarang  Melaka/input_Nomor Telepon_businessName'), 
    'qwerty')

WebUI.setText(findTestObject('Object Repository/Functional Test/Register Negative Test/Page_Daftar Sekarang  Melaka/input_Penjual Online_email'), 
    '1234@qwer.cim')

WebUI.setEncryptedText(findTestObject('Object Repository/Functional Test/Register Negative Test/Page_Daftar Sekarang  Melaka/input_Email_password'), 
    '4nvbrPglk7k=')

WebUI.click(findTestObject('Object Repository/Functional Test/Register Negative Test/Page_Daftar Sekarang  Melaka/svg_Icon_text-neutral-N600 h-6 w-6'))

WebUI.setEncryptedText(findTestObject('Object Repository/Functional Test/Register Negative Test/Page_Daftar Sekarang  Melaka/input_Kata Sandi_confirmPassword'), 
    'DEjB8j5Rr30=')

WebUI.click(findTestObject('Object Repository/Functional Test/Register Negative Test/Page_Daftar Sekarang  Melaka/input_Konfirmasi Kata Sandi_isTncChecked'))

WebUI.click(findTestObject('Object Repository/Functional Test/Register Negative Test/Page_Daftar Sekarang  Melaka/button_Daftar'))

WebUI.verifyElementText(findTestObject('Object Repository/Functional Test/Register Negative Test/Page_Daftar Sekarang  Melaka/p_Wajib diisi, min. 5 karakter'), 
    'Wajib diisi, min. 5 karakter.')

WebUI.verifyElementText(findTestObject('Object Repository/Functional Test/Register Negative Test/Page_Daftar Sekarang  Melaka/p_Wajib diisi. Nomor telepon tidak boleh ku_46eafc'), 
    'Wajib diisi. Nomor telepon tidak boleh kurang dari 10 atau lebih dari 12 karakter.')

WebUI.verifyElementText(findTestObject('Object Repository/Functional Test/Register Negative Test/Page_Daftar Sekarang  Melaka/p_Min. 8 karakter, harus kombinasi dari hur_4e4c33'), 
    'Min. 8 karakter, harus kombinasi dari huruf dan angka.')

WebUI.verifyElementText(findTestObject('Object Repository/Functional Test/Register Negative Test/Page_Daftar Sekarang  Melaka/p_Belum sesuai dengan kata sandi'), 
    'Belum sesuai dengan kata sandi.')

WebUI.setText(findTestObject('Object Repository/Functional Test/Register Negative Test/Page_Daftar Sekarang  Melaka/input_Selamat Datang diMelaka_name'), 
    'abcdef')

WebUI.setText(findTestObject('Object Repository/Functional Test/Register Negative Test/Page_Daftar Sekarang  Melaka/input_Nama_phone'), 
    '1234567890')

WebUI.setText(findTestObject('Object Repository/Functional Test/Register Negative Test/Page_Daftar Sekarang  Melaka/input_Kata Sandi_confirmPassword_1'), 
    '1234')

WebUI.click(findTestObject('Object Repository/Functional Test/Register Negative Test/Page_Daftar Sekarang  Melaka/button_Daftar'))

WebUI.click(findTestObject('Object Repository/Functional Test/Register Negative Test/Page_Daftar Sekarang  Melaka/div_Selamat Datang di MelakaDaftarkan dirim_508182'))

WebUI.setText(findTestObject('Object Repository/Functional Test/Register Negative Test/Page_Daftar Sekarang  Melaka/input_Email_password_1'), 
    '1234asas')

WebUI.click(findTestObject('Object Repository/Functional Test/Register Negative Test/Page_Daftar Sekarang  Melaka/button_Daftar'))

WebUI.setText(findTestObject('Object Repository/Functional Test/Register Negative Test/Page_Daftar Sekarang  Melaka/input_Kata Sandi_confirmPassword_1'), 
    '1234asas')

WebUI.click(findTestObject('Object Repository/Functional Test/Register Negative Test/Page_Daftar Sekarang  Melaka/input_Konfirmasi Kata Sandi_isTncChecked'))

WebUI.verifyElementNotClickable(findTestObject('Object Repository/Functional Test/Register Negative Test/Page_Daftar Sekarang  Melaka/button_Daftar'))

WebUI.click(findTestObject('Object Repository/Functional Test/Register Negative Test/Page_Daftar Sekarang  Melaka/input_Konfirmasi Kata Sandi_isTncChecked'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Functional Test/Register Negative Test/Page_Daftar Sekarang  Melaka/button_Daftar'))

WebUI.closeBrowser()


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

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Register Menu/Page_Daftar Sekarang  Melaka/div_Selamat Datang di MelakaDaftarkan dirim_508182'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Register Menu/Page_Daftar Sekarang  Melaka/div_Selamat Datang di MelakaDaftarkan dirim_01f369'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Register Menu/Page_Daftar Sekarang  Melaka/h1_Selamat Datang di Melaka'), 
    'Selamat Datang di Melaka')

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Register Menu/Page_Daftar Sekarang  Melaka/p_Daftarkan dirimu dan nikmati fitur-fitur _fbd506'), 
    'Daftarkan dirimu dan nikmati fitur-fitur terbaik dari Melaka untuk operasional bisnismu.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Register Menu/Page_Daftar Sekarang  Melaka/div_Wajib diisi, min. 5 karakter'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Register Menu/Page_Daftar Sekarang  Melaka/p_Wajib diisi, min. 5 karakter'), 
    'Wajib diisi, min. 5 karakter.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Register Menu/Page_Daftar Sekarang  Melaka/input_Selamat Datang diMelaka_name'), 
    0)

WebUI.setText(findTestObject('Object Repository/Register Dashboard Verification/Register Menu/Page_Daftar Sekarang  Melaka/input_Selamat Datang diMelaka_name'), 
    'abcdefg')

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Register Menu/Page_Daftar Sekarang  Melaka/div_Wajib diisi. Nomor telepon tidak boleh _1db64e'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Register Menu/Page_Daftar Sekarang  Melaka/p_Wajib diisi. Nomor telepon tidak boleh ku_46eafc'), 
    'Wajib diisi. Nomor telepon tidak boleh kurang dari 10 atau lebih dari 12 karakter.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Register Menu/Page_Daftar Sekarang  Melaka/input_Nama_phone'), 
    0)

WebUI.setText(findTestObject('Object Repository/Register Dashboard Verification/Register Menu/Page_Daftar Sekarang  Melaka/input_Nama_phone'), 
    '1234567890')

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Register Menu/Page_Daftar Sekarang  Melaka/div_Wajib diisi'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Register Menu/Page_Daftar Sekarang  Melaka/p_Wajib diisi'), 
    'Wajib diisi.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Register Menu/Page_Daftar Sekarang  Melaka/input_Nomor Telepon_businessName'), 
    0)

WebUI.setText(findTestObject('Object Repository/Register Dashboard Verification/Register Menu/Page_Daftar Sekarang  Melaka/input_Nomor Telepon_businessName'), 
    'qwerty store')

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Register Menu/Page_Daftar Sekarang  Melaka/div_Tipe BisnisDistributorToko RetailBrandP_ca92ae'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Register Menu/Page_Daftar Sekarang  Melaka/div_Tipe Bisnis'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Register Menu/Page_Daftar Sekarang  Melaka/span_Tipe Bisnis'), 
    'Tipe Bisnis')

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Register Menu/Page_Daftar Sekarang  Melaka/svg_Tipe Bisnis_text-neutral-N600 h-4 w-4'), 
    0)

WebUI.click(findTestObject('Object Repository/Register Dashboard Verification/Register Menu/Page_Daftar Sekarang  Melaka/svg_Tipe Bisnis_text-neutral-N600 h-4 w-4'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Register Menu/Page_Daftar Sekarang  Melaka/div_Info Tipe BisnisDistributor yang menjua_5e6de4'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Register Menu/Page_Daftar Sekarang  Melaka/p_Info Tipe Bisnis'), 
    'Info Tipe Bisnis:')

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Register Menu/Page_Daftar Sekarang  Melaka/li_Distributor yang menjual produk dari pab_c8add1'), 
    'Distributor yang menjual produk dari pabrik ke toko atau langsung ke pembeli.')

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Register Menu/Page_Daftar Sekarang  Melaka/li_Toko retail adalah tempat yang menjual b_7b74d4'), 
    'Toko retail adalah tempat yang menjual barang atau jasa kepada pembeli.')

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Register Menu/Page_Daftar Sekarang  Melaka/li_Brand adalah entitas yang memiliki merek_686106'), 
    'Brand adalah entitas yang memiliki merek sendiri dalam menjalankan bisnisnya.')

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Register Menu/Page_Daftar Sekarang  Melaka/li_Penjual Online adalah pihak yang menjual_973974'), 
    'Penjual Online adalah pihak yang menjual barang atau jasa di internet.')

WebUI.click(findTestObject('Object Repository/Register Dashboard Verification/Register Menu/Page_Daftar Sekarang  Melaka/svg_Tipe Bisnis_text-neutral-N600 h-4 w-4'))

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Register Dashboard Verification/Register Menu/Page_Daftar Sekarang  Melaka/div_Info Tipe BisnisDistributor yang menjua_5e6de4'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Register Menu/Page_Daftar Sekarang  Melaka/div_DistributorToko RetailBrandPenjual Online'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Register Menu/Page_Daftar Sekarang  Melaka/label_Penjual Online'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Register Menu/Page_Daftar Sekarang  Melaka/label_Penjual Online'), 
    'Penjual Online')

WebUI.click(findTestObject('Object Repository/Register Dashboard Verification/Register Menu/Page_Daftar Sekarang  Melaka/input_Brand_businessType'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Register Menu/Page_Daftar Sekarang  Melaka/p_Kebutuhan mengelola seluruh transaksi pes_ea499f'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Register Menu/Page_Daftar Sekarang  Melaka/p_Kebutuhan mengelola seluruh transaksi pes_ea499f'), 
    'Kebutuhan mengelola seluruh transaksi pesanan dari berbagai marketplace sekaligus')

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Register Menu/Page_Daftar Sekarang  Melaka/label_Brand'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Register Menu/Page_Daftar Sekarang  Melaka/label_Brand'), 
    'Brand')

WebUI.click(findTestObject('Object Repository/Register Dashboard Verification/Register Menu/Page_Daftar Sekarang  Melaka/input_Toko Retail_businessType'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Register Menu/Page_Daftar Sekarang  Melaka/p_Kebutuhan analisis tren pasar, pelanggan,_320df1'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Register Menu/Page_Daftar Sekarang  Melaka/p_Kebutuhan analisis tren pasar, pelanggan,_320df1'), 
    'Kebutuhan analisis tren pasar, pelanggan, brand marketing')

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Register Menu/Page_Daftar Sekarang  Melaka/label_Toko Retail'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Register Menu/Page_Daftar Sekarang  Melaka/label_Toko Retail'), 
    'Toko Retail')

WebUI.click(findTestObject('Object Repository/Register Dashboard Verification/Register Menu/Page_Daftar Sekarang  Melaka/input_Distributor_businessType'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Register Menu/Page_Daftar Sekarang  Melaka/p_Kebutuhan sistem kasir, chat CRM, program_387253'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Register Menu/Page_Daftar Sekarang  Melaka/p_Kebutuhan sistem kasir, chat CRM, program_387253'), 
    'Kebutuhan sistem kasir, chat CRM, program loyalti, promosi')

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Register Menu/Page_Daftar Sekarang  Melaka/label_Distributor'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Register Menu/Page_Daftar Sekarang  Melaka/label_Distributor'), 
    'Distributor')

WebUI.click(findTestObject('Object Repository/Register Dashboard Verification/Register Menu/Page_Daftar Sekarang  Melaka/input_Tipe Bisnis_businessType'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Register Menu/Page_Daftar Sekarang  Melaka/p_Kebutuhan aplikasi dan performa sales, ke_d8cc91'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Register Menu/Page_Daftar Sekarang  Melaka/p_Kebutuhan aplikasi dan performa sales, ke_d8cc91'), 
    'Kebutuhan aplikasi dan performa sales, kelola inventori gudang')

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Register Menu/Page_Daftar Sekarang  Melaka/div_Wajib diisi'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Register Menu/Page_Daftar Sekarang  Melaka/p_Wajib diisi'), 
    'Wajib diisi.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Register Menu/Page_Daftar Sekarang  Melaka/input_Penjual Online_email'), 
    0)

WebUI.setText(findTestObject('Object Repository/Register Dashboard Verification/Register Menu/Page_Daftar Sekarang  Melaka/input_Penjual Online_email'), 
    'asdfghjkl@qwerty.com')

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Register Menu/Page_Daftar Sekarang  Melaka/div_Min. 8 karakter, harus kombinasi dari h_dc1bca'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Register Menu/Page_Daftar Sekarang  Melaka/p_Min. 8 karakter, harus kombinasi dari hur_4e4c33'), 
    'Min. 8 karakter, harus kombinasi dari huruf dan angka.')

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Register Menu/Page_Daftar Sekarang  Melaka/input_Email_password'), 
    0)

WebUI.setEncryptedText(findTestObject('Object Repository/Register Dashboard Verification/Register Menu/Page_Daftar Sekarang  Melaka/input_Email_password'), 
    'cZFrDSk31FeXmk+9CXLjXA==')

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Register Menu/Page_Daftar Sekarang  Melaka/svg_Icon_text-neutral-N600 h-6 w-6'), 
    0)

WebUI.click(findTestObject('Object Repository/Register Dashboard Verification/Register Menu/Page_Daftar Sekarang  Melaka/svg_Icon_text-neutral-N600 h-6 w-6'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Register Menu/Page_Daftar Sekarang  Melaka/input_Kata Sandi_confirmPassword'), 
    0)

WebUI.setEncryptedText(findTestObject('Object Repository/Register Dashboard Verification/Register Menu/Page_Daftar Sekarang  Melaka/input_Kata Sandi_confirmPassword'), 
    'cZFrDSk31FeXmk+9CXLjXA==')

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Register Menu/Page_Daftar Sekarang  Melaka/svg_Icon_text-neutral-N600 h-6 w-6_1'), 
    0)

WebUI.click(findTestObject('Object Repository/Register Dashboard Verification/Register Menu/Page_Daftar Sekarang  Melaka/svg_Icon_text-neutral-N600 h-6 w-6_1'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Register Menu/Page_Daftar Sekarang  Melaka/div_Baca dan setuju dengan syarat dan keten_4e48fb'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Register Menu/Page_Daftar Sekarang  Melaka/input_Konfirmasi Kata Sandi_isTncChecked'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Register Dashboard Verification/Register Menu/Page_Daftar Sekarang  Melaka/input_Konfirmasi Kata Sandi_isTncChecked'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Register Menu/Page_Daftar Sekarang  Melaka/span_Dengan melanjutkan pendaftaran, kamu s_ea91f6'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Register Menu/Page_Daftar Sekarang  Melaka/button_Daftar'), 
    0)

WebUI.verifyElementNotClickable(findTestObject('Object Repository/Register Dashboard Verification/Register Menu/Page_Daftar Sekarang  Melaka/button_Daftar'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Register Menu/Page_Daftar Sekarang  Melaka/p_Sudah punya akun Masuk disini'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Register Menu/Page_Daftar Sekarang  Melaka/span_Sudah punya akun'), 
    'Sudah punya akun?')

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Register Menu/Page_Daftar Sekarang  Melaka/a_Masuk'), 
    'Masuk')

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Register Menu/Page_Daftar Sekarang  Melaka/span_disini'), 
    'disini.')

WebUI.closeBrowser()


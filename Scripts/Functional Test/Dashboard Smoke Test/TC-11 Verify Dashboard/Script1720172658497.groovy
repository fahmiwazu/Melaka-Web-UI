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

WebUI.callTestCase(findTestCase('Functional Test/Dashboard Smoke Test/TC-10 Login with valid account'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/Functional Test/Login Valid Account/Page_Laporan  Melaka/div_Yang Perlu Kamu LakukanOrderPerlu Dipro_245e38'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Functional Test/Login Valid Account/Page_Laporan  Melaka/div_Info MelakaSlide 1 of 1'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Functional Test/Login Valid Account/Page_Laporan  Melaka/div_Overview Bisnis30 hari terakhir (Data d_fbee16'), 
    0)

WebUI.click(findTestObject('Object Repository/Functional Test/Login Valid Account/Page_Laporan  Melaka/span_Saldo Saya'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Functional Test/Login Valid Account/Page_Saldo Saya  Melaka/div_Saldo Saya'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Functional Test/Login Valid Account/Page_Saldo Saya  Melaka/div_Saldo AktifRp0Tarik Saldo'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Functional Test/Login Valid Account/Page_Saldo Saya  Melaka/div_Saldo TertahanSaldo yang belum diselesa_26e6fd'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Functional Test/Login Valid Account/Page_Saldo Saya  Melaka/div_Riwayat transaksi belum tersediaJika ad_fc320f'), 
    0)

WebUI.click(findTestObject('Object Repository/Functional Test/Login Valid Account/Page_Saldo Saya  Melaka/svg_Toko Saya_text-le transition rotate-0'))

WebUI.click(findTestObject('Object Repository/Functional Test/Login Valid Account/Page_Saldo Saya  Melaka/span_Tim Sales'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Functional Test/Login Valid Account/Page_Tim Sales  Melaka/div_Tim Sales'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Functional Test/Login Valid Account/Page_Tim Sales  Melaka/button_Tambah Sales'))

WebUI.click(findTestObject('Object Repository/Functional Test/Login Valid Account/Page_Tim Sales  Melaka/span_Katalog Melaka'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Functional Test/Login Valid Account/Page_Promosi Katalog Melaka  Melaka/div_Promosi Katalog MelakaKatalog Promosi'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Functional Test/Login Valid Account/Page_Promosi Katalog Melaka  Melaka/div_Informasi TokoSettingsBelum tersediaBel_7ba29e'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Functional Test/Login Valid Account/Page_Promosi Katalog Melaka  Melaka/div_Daftar Promosi Katalog MelakaDaftar Pro_8b0f78'), 
    0)

WebUI.verifyElementNotClickable(findTestObject('Object Repository/Functional Test/Login Valid Account/Page_Promosi Katalog Melaka  Melaka/button_Katalog'))

WebUI.click(findTestObject('Object Repository/Functional Test/Login Valid Account/Page_Promosi Katalog Melaka  Melaka/span_Piutang'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Functional Test/Login Valid Account/Page_Piutang  Melaka/h1_Piutang'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Functional Test/Login Valid Account/Page_Piutang  Melaka/h2_Belum Ada Data Catatan Piutang'), 
    'Belum Ada Data Catatan Piutang')

WebUI.click(findTestObject('Object Repository/Functional Test/Login Valid Account/Page_Order  Melaka/svg_Toko Saya_text-le transition rotate-180'))

WebUI.click(findTestObject('Object Repository/Functional Test/Login Valid Account/Page_Piutang  Melaka/span_Order Saya'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Functional Test/Login Valid Account/Page_Order  Melaka/div_Belum ada transaksiAyo buat transaksi p_37d849'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Functional Test/Login Valid Account/Page_Order  Melaka/button_Tambah Koneksi Toko Online'))

WebUI.click(findTestObject('Object Repository/Functional Test/Login Valid Account/Page_Order  Melaka/svg_Produk  Stok_text-le transition rotate-0'))

WebUI.click(findTestObject('Object Repository/Functional Test/Login Valid Account/Page_Order  Melaka/span_Produk'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Functional Test/Login Valid Account/Page_Daftar Produk  Melaka/div_ProdukEksporTambah Produk'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Functional Test/Login Valid Account/Page_Daftar Produk  Melaka/button_Tambah Produk'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Functional Test/Login Valid Account/Page_Daftar Produk  Melaka/span_Sinkronisasi Data Produk'))

WebUI.click(findTestObject('Object Repository/Functional Test/Login Valid Account/Page_Daftar Produk  Melaka/span_Stok Inventori'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Functional Test/Login Valid Account/Page_Stok Inventori  Melaka/h2_Stok Inventori'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Functional Test/Login Valid Account/Page_Stok Inventori  Melaka/div_Total produk0Total stok keseluruhan0Pro_50f292'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Functional Test/Login Valid Account/Page_Stok Inventori  Melaka/div_Belum ada data stok produkTambah master_68cafc'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Functional Test/Login Valid Account/Page_Stok Inventori  Melaka/button_Tambah Produk'))

WebUI.click(findTestObject('Object Repository/Functional Test/Login Valid Account/Page_Virtual Bundling  Melaka/span_Virtual Bundling'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Functional Test/Login Valid Account/Page_Virtual Bundling  Melaka/div_Virtual BundlingTambahVirtual Bundling'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Functional Test/Login Valid Account/Page_Virtual Bundling  Melaka/div_Belum ada data virtual BundlingTambah v_3705c1'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Functional Test/Login Valid Account/Page_Virtual Bundling  Melaka/button_TambahVirtual Bundling'))

WebUI.click(findTestObject('Object Repository/Functional Test/Login Valid Account/Page_Virtual Bundling  Melaka/span_Koleksi ProdukBaru'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Functional Test/Login Valid Account/Page_Koleksi Produk  Melaka/div_Koleksi ProdukKoleksi Produk untuk dita_566581'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Functional Test/Login Valid Account/Page_Koleksi Produk  Melaka/button_TambahKoleksi Produk'))

WebUI.click(findTestObject('Object Repository/Functional Test/Login Valid Account/Page_Koleksi Produk  Melaka/svg_Produk  Stok_text-le transition rotate-180'))

WebUI.click(findTestObject('Object Repository/Functional Test/Login Valid Account/Page_Koleksi Produk  Melaka/svg_Analisis Bisnis_text-le transition rotate-0'))

WebUI.click(findTestObject('Object Repository/Functional Test/Login Valid Account/Page_Koleksi Produk  Melaka/span_Laporan Toko'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Functional Test/Login Valid Account/Page_Laporan Toko  Melaka/div_Laporan TokoLaporan mengenai bisnismu y_61db4e'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Functional Test/Login Valid Account/Page_Laporan Toko  Melaka/div_Kategori dan Jenis LaporanLihat Riwayat_954bdc'), 
    0)

WebUI.click(findTestObject('Object Repository/Functional Test/Login Valid Account/Page_Laporan Toko  Melaka/span_Analisis Pelanggan'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Functional Test/Login Valid Account/Page_Analisis Pelanggan  Melaka/h2_Analisis Pelanggan'), 
    0)

WebUI.click(findTestObject('Object Repository/Functional Test/Login Valid Account/Page_Analisis Pelanggan  Melaka/svg_Analisis Bisnis_text-le transition rotate-180'))

WebUI.click(findTestObject('Object Repository/Functional Test/Login Valid Account/Page_Analisis Pelanggan  Melaka/svg_Promosi Saya_text-le transition rotate-0'))

WebUI.click(findTestObject('Object Repository/Functional Test/Login Valid Account/Page_Poin Loyalti  Melaka/span_Poin Loyalti'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Functional Test/Login Valid Account/Page_Poin Loyalti  Melaka/div_Poin Loyalti'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Functional Test/Login Valid Account/Page_Poin Loyalti  Melaka/button_Buat Aturan Poin Loyalti'))

WebUI.click(findTestObject('Object Repository/Functional Test/Login Valid Account/Page_Promosi Melaka  Melaka/svg_Promosi Saya_text-le transition rotate-180'))

WebUI.click(findTestObject('Object Repository/Functional Test/Login Valid Account/Page_Promosi Melaka  Melaka/span_Koneksi Toko Online'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Functional Test/Login Valid Account/Page_Koneksi Toko Online  Melaka/div_Koneksi MarketplaceToko online yang tel_9dce6b'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Functional Test/Login Valid Account/Page_Koneksi Toko Online  Melaka/div_Pilih toko online yang mau Kamu koneksi_825637'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Functional Test/Login Valid Account/Page_Koneksi Toko Online  Melaka/button_Shopee'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Functional Test/Login Valid Account/Page_Koneksi Toko Online  Melaka/button_Shopee'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Functional Test/Login Valid Account/Page_Koneksi Toko Online  Melaka/button_Tiktok Shop'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Functional Test/Login Valid Account/Page_Koneksi Toko Online  Melaka/button_Tiktok Shop'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Functional Test/Login Valid Account/Page_Koneksi Toko Online  Melaka/button_Tokopedia'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Functional Test/Login Valid Account/Page_Koneksi Toko Online  Melaka/button_Tokopedia'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Functional Test/Login Valid Account/Page_Koneksi Toko Online  Melaka/button_Shopify'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Functional Test/Login Valid Account/Page_Koneksi Toko Online  Melaka/button_Shopify'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Functional Test/Login Valid Account/Page_Koneksi Toko Online  Melaka/button_Blibli'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Functional Test/Login Valid Account/Page_Koneksi Toko Online  Melaka/button_Blibli'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Functional Test/Login Valid Account/Page_Koneksi Toko Online  Melaka/button_Lazada'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Functional Test/Login Valid Account/Page_Koneksi Toko Online  Melaka/button_Lazada'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Functional Test/Login Valid Account/Page_Koneksi Toko Online  Melaka/div_Hubungi CS Melaka di 6287777760336 untu_cfb01c'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Functional Test/Login Valid Account/Page_Koneksi Toko Online  Melaka/span_Kelola Chat'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Functional Test/Login Valid Account/Page_Koneksi Toko Online  Melaka/span_Kelola Chat'))

WebUI.closeBrowser()


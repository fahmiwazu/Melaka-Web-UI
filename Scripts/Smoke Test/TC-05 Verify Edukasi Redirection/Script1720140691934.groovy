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

WebUI.click(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Daftar Sekarang  Melaka/div_Edukasi'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Daftar Sekarang  Melaka/span_Seller Academy'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Daftar Sekarang  Melaka/span_Seller Academy'), 
    'Seller Academy')

WebUI.click(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Daftar Sekarang  Melaka/span_Seller Academy'))

WebUI.navigateToUrl('https://academy.melaka.app/')

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_404 NOT_FOUND/span_404 NOT_FOUND'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_404 NOT_FOUND/span_404 NOT_FOUND'), 
    '404: NOT_FOUND')

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_404 NOT_FOUND/span_Code DEPLOYMENT_NOT_FOUND'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_404 NOT_FOUND/span_Code DEPLOYMENT_NOT_FOUND'), 
    'Code: DEPLOYMENT_NOT_FOUND')

WebUI.navigateToUrl('https://dashboard.melaka.app/register')

WebUI.click(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Daftar Sekarang  Melaka/div_Edukasi'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Daftar Sekarang  Melaka/span_Pusat Bantuan'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Daftar Sekarang  Melaka/span_Pusat Bantuan'), 
    'Pusat Bantuan')

WebUI.click(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Daftar Sekarang  Melaka/span_Pusat Bantuan'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Pusat Bantuan Melaka/div_Pusat Bantuan MelakaHalo Ada yang bisa _b5bfe3'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Pusat Bantuan Melaka/div_Pusat Bantuan Melaka'), 
    'Pusat Bantuan Melaka')

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Pusat Bantuan Melaka/div_Halo Ada yang bisa kami bantu'), 
    'Halo! Ada yang bisa kami bantu?')

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Pusat Bantuan Melaka/div_FAQ'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Pusat Bantuan Melaka/div_Apa itu Melaka'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Pusat Bantuan Melaka/div_Apa itu Melaka'), 
    'Apa itu Melaka?')

WebUI.click(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Pusat Bantuan Melaka/div_Apa itu Melaka'))

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Pusat Bantuan Melaka/div_Nama kami terinspirasi dari Selat Melak_76f8cf'), 
    'Nama kami terinspirasi dari Selat Melaka, salah satu rute transportasi perdagangan terpenting di dunia. Seperti halnya Selat Melaka yang telah membuka begitu banyak kesempatan untuk berbagai pedagang, saudagar dan bisnis, Melaka hadir untuk memudahkan proses bisnis, membuka kesempatan-kesempatan baru, dan membantu memajukan bisnis anda! Melaka adalah Sistem Manajemen Promosi Toko Online, yang bisa membantu kamu untuk menjalankan aktivitas penjualan di Toko Online (Marketplaces) dengan lebih efektif.')

WebUI.click(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Pusat Bantuan Melaka/div_Apa itu Melaka'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Pusat Bantuan Melaka/div_Bagaimana Melaka bisa Membantu Toko Onl_b63f7b'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Pusat Bantuan Melaka/div_Bagaimana Melaka bisa Membantu Toko Onl_b63f7b'), 
    'Bagaimana Melaka bisa Membantu Toko Online saya?')

WebUI.click(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Pusat Bantuan Melaka/div_Bagaimana Melaka bisa Membantu Toko Onl_b63f7b'))

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Pusat Bantuan Melaka/div_Melaka dapat menghubungkan Toko Online _cb4177'), 
    'Melaka dapat menghubungkan Toko Online Anda yang sudah aktif di Shopee dan Tokopedia, kemudian Melaka dapat menyinkronkan inventaris induk produk yang berasal dari marketplace tersebut (Shopee dan Tokopedia). Melaka membantu Toko Online Anda untuk dapat membuat promosi lebih efektif, dengan mengizinkan setiap Penjual untuk memilih lebih dari 1 marketplace dalam proses pembuatan diskon/voucher secara bersamaan. Saat promosi sedang berlangsung atau selesai, Anda dapat melihat performa penjualan Anda berdasarkan nilai penjualan, jumlah pesanan, dan jumlah pelanggan sehingga Anda dapat mengukur dan menentukan promosi mana yang lebih efektif untuk dilakukan lagi di masa mendatang. Melaka juga menampilkan demografi pelanggan Toko Online Anda, sehingga Anda dapat lebih mengenal kelompok pelanggan Anda berdasarkan jenis kelamin, wilayah, dan frekuensi pembelian mereka.')

WebUI.click(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Pusat Bantuan Melaka/div_Bagaimana Melaka bisa Membantu Toko Onl_b63f7b'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Pusat Bantuan Melaka/div_Apakah Toko Online saya Aman ketika dih_c36249'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Pusat Bantuan Melaka/div_Apakah Toko Online saya Aman ketika dih_c36249'), 
    'Apakah Toko Online saya Aman ketika dihubungkan ke Melaka?')

WebUI.click(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Pusat Bantuan Melaka/div_Apakah Toko Online saya Aman ketika dih_c36249'))

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Pusat Bantuan Melaka/div_Melaka adalah layanan resmi yang terdaf_eaa13c'), 
    'Melaka adalah layanan resmi yang terdaftar di Direktorat Jenderal Perlindungan Konsumen dan Tertib Niaga Kementerian Perdagangan Republik Indonesia. Melaka berkomitmen untuk melindungi data Pengguna kami serta semua informasi akses yang tersimpan. Kami menyimpan data pribadi sesuai dengan Undang-Undang Privasi dan/atau hukum lain yang berlaku. Informasi selengkapnya bisa Anda temukan dalam Kebijakan Privasi Melaka https://melaka.app/privacy-policy')

WebUI.click(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Pusat Bantuan Melaka/div_Apakah Toko Online saya Aman ketika dih_c36249'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Pusat Bantuan Melaka/div_Apakah ada biaya yang perlu saya keluar_eb6295'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Pusat Bantuan Melaka/div_Apakah ada biaya yang perlu saya keluar_eb6295'), 
    'Apakah ada biaya yang perlu saya keluarkan untuk dapat menggunakan Melaka?')

WebUI.click(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Pusat Bantuan Melaka/div_Apakah ada biaya yang perlu saya keluar_eb6295'))

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Pusat Bantuan Melaka/div_Saat ini, kamu dapat menggunakan Melaka_af35f6'), 
    'Saat ini, kamu dapat menggunakan Melaka secara gratis dan tanpa ada biaya tersembunyi untuk menggunakannya. Ke depannya, Melaka akan menawarkan beberapa fitur tambahan yang mungkin akan membutuhkan biaya bulanan untuk menggunakannya. Tapi tenang saja, kami tidak akan menarik biaya bulanan tanpa persetujuan dari kamu ya!')

WebUI.click(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Pusat Bantuan Melaka/div_Apakah ada biaya yang perlu saya keluar_eb6295'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Pusat Bantuan Melaka/div_Apa yang perlu saya lakukan jika saya m_477eaf'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Pusat Bantuan Melaka/div_Apa yang perlu saya lakukan jika saya m_477eaf'), 
    'Apa yang perlu saya lakukan jika saya mengalami kendala dengan Melaka?')

WebUI.click(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Pusat Bantuan Melaka/div_Apa yang perlu saya lakukan jika saya m_477eaf'))

WebUI.click(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Pusat Bantuan Melaka/div_Apa yang perlu saya lakukan jika saya m_477eaf'))

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Pusat Bantuan Melaka/div_Akun Login'), 
    'Akun Login')

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Pusat Bantuan Melaka/div_Cara Login Akun'), 
    'Cara Login Akun')

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Pusat Bantuan Melaka/div_Integrasi dengan Marketplace'), 
    'Integrasi dengan Marketplace')

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Pusat Bantuan Melaka/div_Integrasi dengan Akun Shopee'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Pusat Bantuan Melaka/div_Integrasi dengan Akun TikTok'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Pusat Bantuan Melaka/div_Integrasi dengan Akun Tokopedia'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Pusat Bantuan Melaka/div_Mengelola Data Produk'), 
    'Mengelola Data Produk')

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Pusat Bantuan Melaka/div_Sinkronisasi dengan Marketplace'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Pusat Bantuan Melaka/div_Memonitor Pemetaan Produk'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Pusat Bantuan Melaka/div_Membuat Produk Baru'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Pusat Bantuan Melaka/div_Men-generate SKU Otomatis'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Pusat Bantuan Melaka/div_Mengubah Informasi Produk'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Pusat Bantuan Melaka/div_Mengelola Data Stok Inventori Produk'), 
    'Mengelola Data Stok Inventori Produk')

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Pusat Bantuan Melaka/div_Melihat Ringkasan Inventori'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Pusat Bantuan Melaka/div_Mengelola Data Stok Produk'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Pusat Bantuan Melaka/div_Memperbaiki Stok Bermasalah'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Pusat Bantuan Melaka/div_Menambahkan Stok Masuk'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Pusat Bantuan Melaka/div_Menambahkan Stok Keluar'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Pusat Bantuan Melaka/div_Mengelola Laporan Penjualan dan Pembukuan'), 
    'Mengelola Laporan Penjualan dan Pembukuan')

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Pusat Bantuan Melaka/div_Cek Catatan Keuangan'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Pusat Bantuan Melaka/div_Input Data Secara Manual'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Pusat Bantuan Melaka/div_Cek Laba Rugi Bisnis'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Pusat Bantuan Melaka/div_Mengelola Order Marketplace'), 
    'Mengelola Order Marketplace')

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Pusat Bantuan Melaka/div_Melihat Halaman Order'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Pusat Bantuan Melaka/div_Cara Memproses Orderan'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Pusat Bantuan Melaka/div_Hemat Waktu dan Tenaga dengan Fitur Pro_aff0c1'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Pusat Bantuan Melaka/div_Mengelola Promosi Katalog'), 
    'Mengelola Promosi Katalog')

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Pusat Bantuan Melaka/div_Membuat Promosi Katalog Melaka'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Pusat Bantuan Melaka/div_Membagikan Link Katalog dan Memantau Performa'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Pusat Bantuan Melaka/div_Membuat Order (Dilakukan oleh Pembeli)'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Pusat Bantuan Melaka/div_Memproses Order dari Katalog Melaka'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Pusat Bantuan Melaka/div_Mengelola Promosi Marketplace'), 
    'Mengelola Promosi Marketplace')

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Pusat Bantuan Melaka/div_Promosi Voucher Toko'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Pusat Bantuan Melaka/div_Promosi Voucher Produk Tertentu'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Pusat Bantuan Melaka/div_Promosi Diskon Produk'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Pusat Bantuan Melaka/div_Memahami Laporan Performa Campaign'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Pusat Bantuan Melaka/div_Memahami Detail Laporan Promosi'), 
    0)

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Pusat Bantuan Melaka/div_Overview Data Pelanggan'), 
    'Overview Data Pelanggan')

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Pusat Bantuan Melaka/div_Dashboard Infografis Pembeli dari Marketplace'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Pusat Bantuan Melaka/div_Cara Login Akun'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Pusat Bantuan Melaka/div_Integrasi dengan Akun Shopee'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Pusat Bantuan Melaka/div_Integrasi dengan Akun TikTok'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Pusat Bantuan Melaka/div_Integrasi dengan Akun Tokopedia'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Pusat Bantuan Melaka/div_Sinkronisasi dengan Marketplace'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Pusat Bantuan Melaka/div_Memonitor Pemetaan Produk'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Pusat Bantuan Melaka/div_Membuat Produk Baru'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Pusat Bantuan Melaka/div_Men-generate SKU Otomatis'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Pusat Bantuan Melaka/div_Mengubah Informasi Produk'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Pusat Bantuan Melaka/div_Melihat Ringkasan Inventori'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Pusat Bantuan Melaka/div_Mengelola Data Stok Produk'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Pusat Bantuan Melaka/div_Memperbaiki Stok Bermasalah'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Pusat Bantuan Melaka/div_Menambahkan Stok Masuk'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Pusat Bantuan Melaka/div_Menambahkan Stok Keluar'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Pusat Bantuan Melaka/div_Cek Catatan Keuangan'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Pusat Bantuan Melaka/div_Input Data Secara Manual'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Pusat Bantuan Melaka/div_Cek Laba Rugi Bisnis'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Pusat Bantuan Melaka/div_Melihat Halaman Order'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Pusat Bantuan Melaka/div_Cara Memproses Orderan'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Pusat Bantuan Melaka/div_Hemat Waktu dan Tenaga dengan Fitur Pro_aff0c1'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Pusat Bantuan Melaka/div_Membuat Promosi Katalog Melaka'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Pusat Bantuan Melaka/div_Membagikan Link Katalog dan Memantau Performa'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Pusat Bantuan Melaka/div_Membuat Order (Dilakukan oleh Pembeli)'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Pusat Bantuan Melaka/div_Memproses Order dari Katalog Melaka'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Pusat Bantuan Melaka/div_Promosi Voucher Toko'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Pusat Bantuan Melaka/div_Promosi Voucher Produk Tertentu'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Pusat Bantuan Melaka/div_Promosi Diskon Produk'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Pusat Bantuan Melaka/div_Memahami Laporan Performa Campaign'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Pusat Bantuan Melaka/div_Memahami Detail Laporan Promosi'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Pusat Bantuan Melaka/div_Dashboard Infografis Pembeli dari Marketplace'))

WebUI.verifyElementText(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Pusat Bantuan Melaka/div_Pertanyaanmu belum terjawab'), 
    'Pertanyaanmu belum terjawab?')

WebUI.verifyElementPresent(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Pusat Bantuan Melaka/a_Hubungi CS'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Register Dashboard Verification/Melaka Education Redirection/Page_Pusat Bantuan Melaka/a_Hubungi CS'))

WebUI.closeBrowser()


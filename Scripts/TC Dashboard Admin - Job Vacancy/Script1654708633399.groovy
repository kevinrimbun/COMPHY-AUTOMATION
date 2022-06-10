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

WebUI.navigateToUrl('https://cms-comphy.herokuapp.com/login')

WebUI.setText(findTestObject('Object Repository/Dashboard Admin - Job Vacancy (Kevin Rimbun)/Page_Admin Comphy - Login/input_Welcome Back Admin Comphy_inputEmail'), 
    GlobalVariable.Username)

WebUI.setText(findTestObject('Object Repository/Dashboard Admin - Job Vacancy (Kevin Rimbun)/Page_Admin Comphy - Login/input_Welcome Back Admin Comphy_inputPassword'), 
    GlobalVariable.Password)

WebUI.click(findTestObject('Object Repository/Dashboard Admin - Job Vacancy (Kevin Rimbun)/Page_Admin Comphy - Login/a_Login'))

WebUI.click(findTestObject('Object Repository/Dashboard Admin - Job Vacancy (Kevin Rimbun)/Page_Comphy - Admin/a_Lowongan'))

WebUI.click(findTestObject('Object Repository/Dashboard Admin - Job Vacancy (Kevin Rimbun)/Page_Comphy - Admin/a_Tambah Data'))

//WebUI.setText(findTestObject('Object Repository/Dashboard Admin - Job Vacancy (Kevin Rimbun)/Page_Comphy - Admin/input_Judul Lowongan_title'), 
//    'Videographer')
WebUI.setText(findTestObject('Object Repository/Dashboard Admin - Job Vacancy (Kevin Rimbun)/Page_Comphy - Admin/input_Judul Lowongan_title'),
	findTestData("COMPHY DATA BINDING/DATA COMPHY CMS").getValue(1,1))


//WebUI.setText(findTestObject('Object Repository/Dashboard Admin - Job Vacancy (Kevin Rimbun)/Page_Comphy - Admin/input_Nama Perusahaan_jobCompanyName'), 
//    'PT Astronacci International')
WebUI.setText(findTestObject('Object Repository/Dashboard Admin - Job Vacancy (Kevin Rimbun)/Page_Comphy - Admin/input_Nama Perusahaan_jobCompanyName'),
	findTestData("COMPHY DATA BINDING/DATA COMPHY CMS").getValue(2,1))


WebUI.setText(findTestObject('Object Repository/Dashboard Admin - Job Vacancy (Kevin Rimbun)/Page_Comphy - Admin/input_Gaji_rangeSalary'), 
    'Tidak Tersedia Untuk Saat Ini')

WebUI.click(findTestObject('Object Repository/Dashboard Admin - Job Vacancy (Kevin Rimbun)/Page_Comphy - Admin/input_Lokasi_location'))

WebUI.setText(findTestObject('Object Repository/Dashboard Admin - Job Vacancy (Kevin Rimbun)/Page_Comphy - Admin/input_Lokasi_location'), 
    'KOTA JAKARTA UTARA')

WebUI.click(findTestObject('Object Repository/Dashboard Admin - Job Vacancy (Kevin Rimbun)/Page_Comphy - Admin/input_Lokasi_isFulltime'))

WebUI.setText(findTestObject('Object Repository/Dashboard Admin - Job Vacancy (Kevin Rimbun)/Page_Comphy - Admin/input_Deskripsi_desc1'), 
    'Membuat sebuah karya visual dalam bentuk video konten yang menarik dan inspiratif dengan menggunakan teknik edit dan cutting yang kreatif dan menarik')

WebUI.click(findTestObject('Object Repository/Dashboard Admin - Job Vacancy (Kevin Rimbun)/Page_Comphy - Admin/button_Tambah Deskripsi'))

WebUI.setText(findTestObject('Object Repository/Dashboard Admin - Job Vacancy (Kevin Rimbun)/Page_Comphy - Admin/input_Deskripsi_desc2'), 
    'Membuat video untuk ikan atau promo di sosial media ')

WebUI.click(findTestObject('Object Repository/Dashboard Admin - Job Vacancy (Kevin Rimbun)/Page_Comphy - Admin/button_Tambah Deskripsi'))

WebUI.setText(findTestObject('Object Repository/Dashboard Admin - Job Vacancy (Kevin Rimbun)/Page_Comphy - Admin/input_Deskripsi_desc3'), 
    'Selalu kreatif dan memiliki wawasan baru akan perkembangan audien yang berubah sewaktu-waktu')

WebUI.click(findTestObject('Object Repository/Dashboard Admin - Job Vacancy (Kevin Rimbun)/Page_Comphy - Admin/button_Tambah Deskripsi'))

WebUI.setText(findTestObject('Object Repository/Dashboard Admin - Job Vacancy (Kevin Rimbun)/Page_Comphy - Admin/input_Deskripsi_desc4'), 
    'Menguasai program video editing (Adobe Premiere, Adobe After Effects, Adobe Photoshop)')

WebUI.click(findTestObject('Object Repository/Dashboard Admin - Job Vacancy (Kevin Rimbun)/Page_Comphy - Admin/button_Tambah Deskripsi'))

WebUI.setText(findTestObject('Object Repository/Dashboard Admin - Job Vacancy (Kevin Rimbun)/Page_Comphy - Admin/input_Deskripsi_desc5'), 
    'Terbiasa mengunakan Kamera DSLR')

WebUI.click(findTestObject('Object Repository/Dashboard Admin - Job Vacancy (Kevin Rimbun)/Page_Comphy - Admin/button_Tambah Deskripsi'))

WebUI.setText(findTestObject('Object Repository/Dashboard Admin - Job Vacancy (Kevin Rimbun)/Page_Comphy - Admin/input_Deskripsi_desc6'), 
    'Terbiasa dengan tenggat waktu dan pressure dari perusahaan')

WebUI.setText(findTestObject('Object Repository/Dashboard Admin - Job Vacancy (Kevin Rimbun)/Page_Comphy - Admin/input_Waktu Proses Lamaran_longApplicationProcess'), 
    '8 hari')

WebUI.setText(findTestObject('Object Repository/Dashboard Admin - Job Vacancy (Kevin Rimbun)/Page_Comphy - Admin/input_Tingkat Pekerjaan_jobLevel'), 
    'Pegawai (non-manajemen & non-supervisor)')

WebUI.setText(findTestObject('Object Repository/Dashboard Admin - Job Vacancy (Kevin Rimbun)/Page_Comphy - Admin/input_Industri_industry'), 
    'Konsultasi (Bisnis & Manajemen)')

WebUI.setText(findTestObject('Object Repository/Dashboard Admin - Job Vacancy (Kevin Rimbun)/Page_Comphy - Admin/input_Tunjangan dan Lain Lain_allowance'), 
    'Asuransi Kesehatan, Waktu Reguler, Formil (contoh: kemeja + dasi), Komunikasi ')

WebUI.setText(findTestObject('Object Repository/Dashboard Admin - Job Vacancy (Kevin Rimbun)/Page_Comphy - Admin/input_Kualifikasi_qualification'), 
    'SMA, SMU/SMK/STM, Sertifikat Profesional, D3 (Diploma), D4 (Diploma), Sarjana (S1)')

WebUI.setText(findTestObject('Object Repository/Dashboard Admin - Job Vacancy (Kevin Rimbun)/Page_Comphy - Admin/input_Link Lamaran Pekerjaan_jobLink'), 
    'https://www.jobstreet.co.id/id/job/videographer-3904581?jobId=jobstreet-id-job-3904581&sectionRank=1&token=0~edcc558f-152b-4952-a050-2599efcc9820&searchPath=%2Fid%2Fjob-search%2Fvideographer-jobs%2F&fr=SRP%20View%20In%20New%20Tab')

WebUI.click(findTestObject('Object Repository/Dashboard Admin - Job Vacancy (Kevin Rimbun)/Page_Comphy - Admin/button_Tambah Lowongan Lowongan'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Dashboard Admin - Job Vacancy (Kevin Rimbun)/Page_Comphy - Admin/div_Berhasil menambah Lowongan Pekerjaan'), 
    0)

WebUI.click(findTestObject('Object Repository/Dashboard Admin - Job Vacancy (Kevin Rimbun)/Page_Comphy - Admin/a_OK'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Dashboard Admin - Job Vacancy (Kevin Rimbun)/Page_Comphy - Admin/td_Videographer'), 
    0)

WebUI.click(findTestObject('Object Repository/Dashboard Admin - Job Vacancy (Kevin Rimbun)/Page_Comphy - Admin/span_Admin'))

WebUI.click(findTestObject('Object Repository/Dashboard Admin - Job Vacancy (Kevin Rimbun)/Page_Comphy - Admin/a_Logout'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Dashboard Admin - Job Vacancy (Kevin Rimbun)/Page_Comphy - Admin/div_Select Logout below if you are ready to_ea7f33'), 
    0)

WebUI.click(findTestObject('Object Repository/Dashboard Admin - Job Vacancy (Kevin Rimbun)/Page_Comphy - Admin/a_Logout_1'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Dashboard Admin - Job Vacancy (Kevin Rimbun)/Page_Admin Comphy - Login/img_Welcome Back Admin Comphy_w-50'), 
    0)

WebUI.closeBrowser()


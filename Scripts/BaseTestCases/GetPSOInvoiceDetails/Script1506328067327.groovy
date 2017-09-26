import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('OpenSession'), [('SessionID') : 'ttaad4500'], FailureHandling.STOP_ON_FAILURE)

WebUI.doubleClick(findTestObject('ttaad4500/input_ttaad4500    -0-cpac-loo'))

WebUI.setText(findTestObject('ttaad4500/input_ttaad4500    -0-cpac-loo'), 'ci')

WebUI.doubleClick(findTestObject('ttaad4500/input_ttaad4500    -0-cmod-loo'))

WebUI.setText(findTestObject('ttaad4500/input_ttaad4500    -0-cmod-loo'), 'sli')

WebUI.setText(findTestObject('ttaad4500/input_ttaad4500    -0-flno-loo'), '245')

WebUI.click(findTestObject('ttaad4500/label_OK'))

WebUI.doubleClick(findTestObject('ttaad4500/input_ttaad4500    -0-flno-loo'))

WebUI.click(findTestObject('ttaad4500/div_ttaad4500    -1-button-std'))

WebUI.doubleClick(findTestObject('ttaad4500/input_ottaad4100.dlg-2-slso.f-'))

WebUI.setText(findTestObject('ttaad4500/input_ottaad4100.dlg-2-slso.f-'), GlobalVariable.G_PSO)

WebUI.click(findTestObject('ttaad4500/label_OK (1)'))

WebUI.delay(3)

GlobalVariable.G_InvoiceNo_1 = WebUI.getAttribute(findTestObject('ttaad4500/InvoiceNo.1'), 'value')

GlobalVariable.G_InvoiceNo_2 = WebUI.getAttribute(findTestObject('ttaad4500/InvoiceNo.2'), 'value')

GlobalVariable.G_cisli245_InvoiceAmount = WebUI.getAttribute(findTestObject('ttaad4500/InvoiceAmount'), 'value')

GlobalVariable.G_cisli245_taxAmt = WebUI.getAttribute(findTestObject('ttaad4500/TaxAmount'), 'value')

println('Invoice Amt ' + GlobalVariable.G_cisli245_InvoiceAmount)

println('Tax Amt ' + GlobalVariable.G_cisli245_taxAmt)


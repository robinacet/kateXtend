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

WebUI.callTestCase(findTestCase('PSOHeader'), [('BP') : findTestData('PSODATA').getValue(2, 2)], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('BaseTestCases/PSO_AddPartLinePos1'), [('PartName') : findTestData('PSODATA').getValue(2, 
            3), ('Qty') : findTestData('PSODATA').getValue(2, 4)], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('BaseTestCases/PSO_AddPartLinePos2'), [('PartName') : 'KP4', ('Qty') : '2'], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('BaseTestCases/PSO_AddPartLinePos3'), [('PartName') : 'KP5', ('Qty') : '3'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('BaseTestCases/PickPackInvoice'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('BaseTestCases/GetMauc'), [('PartName') : 'KP3', ('Warehouse') : 'WH001'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('BaseTestCases/GetCostFromMAUC'), [('Qty') : 2], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('BaseTestCases/GetIntTransForPSO'), [('Order') : GlobalVariable.G_PSO, ('Position') : '10'], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyEqual(GlobalVariable.G_PartIssue, GlobalVariable.G_PartCost)

WebUI.verifyEqual(GlobalVariable.G_COGS, GlobalVariable.G_PartCost)

WebUI.verifyEqual(GlobalVariable.G_RevenueAnalysis, GlobalVariable.G_OrderLineAmt)

WebUI.callTestCase(findTestCase('BaseTestCases/GetPSOInvoiceDetails'), [('PSO') : GlobalVariable.G_PSO], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyEqual(GlobalVariable.G_cisli245_InvoiceAmount, 80)

WebUI.verifyEqual(GlobalVariable.G_cisli245_taxAmt, 8)

WebUI.callTestCase(findTestCase('BaseTestCases/FinalizeAndPostPSO'), [:], FailureHandling.STOP_ON_FAILURE)


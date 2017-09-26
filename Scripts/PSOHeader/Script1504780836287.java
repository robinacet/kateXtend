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

WebUI.callTestCase(findTestCase('OpenSession'), [('SessionID') : 'tdsls4500m002'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('HomePage2/Page_Infor LN UI (1)/btn_tdsls4500m001_new'))

WebUI.setText(findTestObject('tdtre4101m002/btn_tdtre4101m002_Customer'), 'M00000010')

WebUI.click(findTestObject('tdtre4101m002/btn_tdtre4101m002_save1'), FailureHandling.STOP_ON_FAILURE)

WebUI.dragAndDropByOffset(findTestObject('tdtre4101m002/scroll_tdtre4101m002'), 0, -150)

WebUI.click(findTestObject('tdtre4101m002/btn_tdtre4101s002_newpart'))

WebUI.setText(findTestObject('tdtre4101m002/Line1/input_tdtre4101s002_Partnumber', [('Position') : '1']), 'KP3')

WebUI.scrollToElement(findTestObject('tdtre4101m002/Line1/input_tdtre4101s002-Qty'), 20)

WebUI.click(findTestObject('tdtre4101m002/Line1/input_tdtre4101s002-Qty'))

WebUI.setText(findTestObject('tdtre4101m002/Line1/input_tdtre4101s002-Qty'), '3')

WebUI.click(findTestObject('tdtre4101m002/btn_tdtre4101m002_save1'))


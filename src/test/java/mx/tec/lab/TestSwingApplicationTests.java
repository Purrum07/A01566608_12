package mx.tec.lab;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestSwingApplicationTests {
	TestSwingApplication application = new TestSwingApplication();
	
	@Test
	void givenTwoIntegers_WhenSum_ThenCorrectResult() {
		// Given 5 and 7
		application.numberOneTextField.setText("5");
		application.numberTwoTextField.setText("7");
		String expectedResult = "12";
		
		// When operation is sum
		application.operationButton.doClick();
		
		// Then result is 12
		String actualResult = application.resultTextField.getText();
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	void givenTwoStrings_WhenSum_ThenInputCleared() {
		// Given "asd" and "gfd"
		application.numberOneTextField.setText("asd");
		application.numberTwoTextField.setText("gfd");
		String expectedResultTextField1 = "";
		String expectedResultTextField2 = "";
		String expectedResultTextField = "";
		// When operation is sum
		application.operationButton.doClick();
		
		// Then result is ""
		String actualResult = application.resultTextField.getText();
		assertEquals(expectedResultTextField, actualResult);
		String actualResultTextField1 = application.numberOneTextField.getText();
		assertEquals(expectedResultTextField1, actualResultTextField1);
		String actualResultTextField2 = application.numberTwoTextField.getText();
		assertEquals(expectedResultTextField2, actualResultTextField2);
	}
	
	@Test
	void givenOneIntAndOneString_WhenSum_ThenInputCleared() {
		// Given 1 and "gfd"
		application.numberOneTextField.setText("1");
		application.numberTwoTextField.setText("gfd");
		String expectedResultTextField1 = "1";
		String expectedResultTextField2 = "";
		String expectedResultTextField = "";
		// When operation is sum
		application.operationButton.doClick();
		
		// Then result is ""
		String actualResult = application.resultTextField.getText();
		assertEquals(expectedResultTextField, actualResult);
		String actualResultTextField1 = application.numberOneTextField.getText();
		assertEquals(expectedResultTextField1, actualResultTextField1);
		String actualResultTextField2 = application.numberTwoTextField.getText();
		assertEquals(expectedResultTextField2, actualResultTextField2);
	}
	
	@Test
	void givenOneStringAndOneInt_WhenSum_ThenInputCleared() {
		// Given "asd" and 2
		application.numberOneTextField.setText("asd");
		application.numberTwoTextField.setText("2");
		String expectedResultTextField1 = "";
		String expectedResultTextField2 = "2";
		String expectedResultTextField = "";
		// When operation is sum
		application.operationButton.doClick();
		
		// Then result is ""
		String actualResult = application.resultTextField.getText();
		assertEquals(expectedResultTextField, actualResult);
		String actualResultTextField1 = application.numberOneTextField.getText();
		assertEquals(expectedResultTextField1, actualResultTextField1);
		String actualResultTextField2 = application.numberTwoTextField.getText();
		assertEquals(expectedResultTextField2, actualResultTextField2);
	}
}

package application;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class MainColtroller {
	
	@FXML
	private TextField txtResult;
	boolean bool = false;
	private String s1="";
	private String s2="";
	private String operation="";
	double result;
	double first;
	double second;
	public void getNumber(Event e) {
		Button b = (Button)e.getSource();
		if(!bool) {
			s1+=b.getText();
			txtResult.setText(s1);
		}
		else{
			s2+=b.getText();
			txtResult.setText(s1+operation+s2);
		}
	}
	
	public void getOperation(Event e) {
		Button b = (Button)e.getSource();
		if(operation.equals("")) {
		first = Double.parseDouble(txtResult.getText());
		b = (Button)e.getSource();
		operation = b.getText();
		txtResult.setText(s1+operation);
		bool=true;
		}
	else if(s2.equals("")){
		s1 = Double.toString(first);
		operation = b.getText();
		txtResult.setText(s1+operation);
		bool=true;
	}
	else {
		Result();
		s1 = Double.toString(first);
		operation = b.getText();
		txtResult.setText(s1+operation);
		bool=true;
	}
	}
	
	public void Result() {
		bool=false;
		s1="";
		second = Double.parseDouble(s2);
		s2="";
		switch(operation) {
		case "+":
			txtResult.setText(Double.toString(Operations.addition(first, second)));
			first = Operations.addition(first, second);
			break;
		case "-":
			txtResult.setText(Double.toString(Operations.subtraction(first, second)));
			first = Operations.subtraction(first, second);
			break;
		case "*":
			txtResult.setText(Double.toString(Operations.multiplication(first, second)));
			first = Operations.multiplication(first, second);
			break;
		case "/":
			txtResult.setText(Double.toString(Operations.division(first, second)));
			first = Operations.division(first, second);
			break;
		}
	}
	
	public void clear() {
		s1="";
		s2="";
		txtResult.setText("");
		operation="";
		bool = false;
	}
}

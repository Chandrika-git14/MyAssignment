package week3.day2;

public class Elements extends Button {

	  public static void main(String[] args) {
	WebElement element = new WebElement();
    element.click();
    element.setText("Hello");

    TextField textField = new TextField();
    textField.setText("Username");
    textField.getText();

    Button button = new Button();
    button.click();
    button.submit();

    CheckBoxButton checkBox = new CheckBoxButton();
    checkBox.click();
    checkBox.CheckBoxButton();

    RadioButton radio = new RadioButton();
    radio.click();
    radio.selectRadioButton();

    Elements elem = new Elements();
    elem.click();
    elem.submit();
}

}

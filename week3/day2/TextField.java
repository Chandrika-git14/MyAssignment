package week3.day2;

public class TextField extends WebElement {
	
	public String getText() {
        String text = "Sample Text";
        System.out.println("Getting text: " + text);
        return text;
    }

	public static void main(String[] args) {
		TextField textFieldOptions = new TextField();
		textFieldOptions.click();
		textFieldOptions.getText();
 
	}

}

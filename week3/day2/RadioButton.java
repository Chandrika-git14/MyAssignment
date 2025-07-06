package week3.day2;

public class RadioButton extends Button {
	
	public void selectRadioButton()
	{
		System.out.println("Select Radio Button");
	}

	public static void main(String[] args) {
		RadioButton radioButtonOption = new RadioButton();
		radioButtonOption.selectRadioButton();
		radioButtonOption.submit();
	}

}

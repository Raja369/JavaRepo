
public class VechileNumberValidation {
	private String lastFourDigits = null;
	private int totalSum = 0;
	private String result = null;

	public String characterArrayeckluckyNumber(String str) {
		if ((str != null) && (!str.contentEquals("")) && (str.matches("[A-Z]{2}[0-9]{2}[A-Z]{2}[0-9]{4}"))) {
			lastFourDigits = str.substring(str.length() - 4);
			char[] characterArray = new char[lastFourDigits.length()];
			for (int i = 0; i < lastFourDigits.length(); i++) {
				characterArray[i] = lastFourDigits.charAt(i);
			}
			for (char character : characterArray) {
				int value = Integer.parseInt(String.valueOf(character));
				totalSum += value;
			}
			if (totalSum % 3 == 0) {
				result = "It's a Lucky Number";
				return result;
			} else {
				result = "It's not Lucky Number";
				return result;
			}
		}
		return "It's Invalid number";
	}
}
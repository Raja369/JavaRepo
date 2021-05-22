
public class VowelOrConstant {

	public static void main(String[] args) {
		char ch = 'i';
		int val = (int)ch;
				if(val>=48 && val<=57) {
					System.out.println("digit");
				}
				
				else if(val>=65 && val<=90) {
					System.out.println("Capital Letter");
					switch(val) {
						case 65:
						case 69:
						case 73:
						case 79:
						case 85:
							System.out.println("Vowel");
							break;
						default :
							System.out.println("Consonant");
							break;
					}
				}
				
				else if(val>=97 && val<=122) {
					System.out.println("lowercase Letter");
					switch(val) {
						case 97:
						case 101:
						case 105:
						case 111:
						case 117:
							System.out.println("Vowel");
							break;
						default :
							System.out.println("Consonant");
							break;
					}
				}
				else {
					System.out.println("special character");
				}
			}
	}



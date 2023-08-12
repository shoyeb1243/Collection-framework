package ArrayList;
//WAP to check string palindrom or not?
public class Text {

	public static void main(String[] args) {
		String string="maam";
		String string2="";
		for (int i=string.length()-1;i>=0;i--) {
			string2=string2+string.charAt(i);
		}
		if (string.equals(string2)) {
			System.out.println("Palindrom String : ");
		}
		else {
			System.out.println("Not a Palindrom String");
	}
		}	
	}

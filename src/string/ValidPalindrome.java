package string;

public class ValidPalindrome {

	public static void main(String[] args) {
		
		String s = "gygb";
		s=s.toLowerCase();
		System.out.println(isPalindrome(s));
	}

	private static boolean isPalindrome(String s) {
		
		if(s.length()==0)
			return true;
		
		int i=0, j=s.length()-1;
		while(i<j) {
			if(!isAlphaNeumeric(s.charAt(i))) {
				i++;
				continue;
			}
			if(!isAlphaNeumeric(s.charAt(j))) {
				j--;
				continue;
			}
			if(s.charAt(i)!=s.charAt(j)) 
				return false;
			i++;
			j--;
		}
		return true;
	}

	private static boolean isAlphaNeumeric(char ch) {
		
		int chIndex = (int) ch;
		
		if((chIndex>=48 && chIndex<=57) || (chIndex>=65 && chIndex<=90) || (chIndex>=97 && chIndex<=122))
			return true;
		
		return false;
	}

}

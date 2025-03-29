package stack;

import java.util.Stack;

public class BalancedParentheses {
	
	static boolean isValidParentheses(char c1, char c2){
        if((c1=='(' && c2 ==')') || (c1==')' && c2 =='(') || (c1=='}' && c2 =='{') || (c1==']' && c2 =='[') || (c1=='{' && c2 =='}') || (c1=='[' && c2 ==']'))
            return true;
        
        return false;
    }
	
	public static boolean isValid(String s) {

        Stack<Character> st = new Stack<>();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '[')
                st.push(ch);
            else{
                if(!st.isEmpty() && isValidParentheses(ch, st.peek()))
                    st.pop();
                else
                    return false;
            }
        }
        
        if(st.isEmpty())
            return true;
        else
            return false;
    }

	public static void main(String[] args) {
		
		System.out.println(isValid("()]{}"));
	}

}

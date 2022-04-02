import java.util.Stack;

public class BalancedBrackets {
	
	public static boolean checkBalancedBrackets(String s) {
		boolean check=true;
		
		if(s.length()%2!=0)
			return false;
		
		if(s.charAt(0)==')'||s.charAt(0)=='}'||s.charAt(0)==']')
			return false;
		
		Stack stack=new Stack();
		
		
		
		for(int i=0;i<s.length();i++) {
			char a=s.charAt(i);
			if(a=='('||a=='{'||a=='[')
				stack.push(a);
			else if(a==')') {
				if('('!=(char)stack.pop()) {
					check=false;
					break;
				}
			}else if(a=='}') {
				if('{'!=(char)stack.pop()) {
					check=false;
					break;
				}
			}else if(a==']') {
				if('['!=(char)stack.pop()) {
					check=false;
					break;
				}
			}
		}
		//System.out.println(check);
		if(check) {
			if(stack.isEmpty())
				return true;
			else
				return false;
		}else		
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(checkBalancedBrackets("{}[]({[]})"));
		System.out.println(checkBalancedBrackets("{}[]({[]})["));
		System.out.println(checkBalancedBrackets(")}][{("));

	}

}

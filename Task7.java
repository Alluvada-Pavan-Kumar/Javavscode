public class Task7 {
    	public String getReverseOrder(String st) {
		  String result=""; 
		  for(int i=0;i<st.length();i++) {
			  char ch=st.charAt(i);
			  if("aeiouAEIOU".indexOf(ch)!=-1) {
				  result+=ch;
			  }
		  }
			  System.out.println(result);
			  System.out.println("----------------------------------------");
			  String rev="";
			  for(int i=result.length()-1;i>=0;i--) {
				    rev+=result.charAt(i);
			  }  
			   return rev;  
		
	}

	public static void main(String[] args) {
       System.out.println(new Task7().getReverseOrder("hello world"));
	}
}

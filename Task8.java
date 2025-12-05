public class Task8 {
    public String getVowels(String st) {
		String result="";
		for(int i=0;i<st.length();i++) {
			 char  ch=st.charAt(i);
			 if("aeiouAEIOU".indexOf(ch)!=-1) {
				
				 if(result.indexOf(ch)==-1) {
					 result+=ch;
			 }
			 }	 
		}
		String rev="";
		for(int i=result.length()-1;i>=0;i--) {
			rev+=result.charAt(i);
		}
		return rev;
	}
	public static void main(String[] args) {
       System.out.println(new Task8().getVowels("hello world"));
	}
}

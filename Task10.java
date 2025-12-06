public class Task10 {
     public String convert(String  st){
        String result="";
        for(int i=0;i<st.length();i++){
            char ch=st.charAt(i);
            if(ch>='A' && ch<='Z'){
                result+= (char)(ch+32);
            }
            else if(ch>='a'&& ch<='z'){
                result+=(char)(ch-32);
            }
            else{
                result+=ch;
            }
        }
     
     return result;
}
public static void main(String[]args){
    Task10 t=new Task10();
    System.out.println(t.convert("pavaN"));

}
}

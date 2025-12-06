public class Task9 {
    public String  removeDuplicates(String st){
        String result="";
       for(int i=0;i<st.length();i++){
          char ch=st.charAt(i);
          int count=0;
          for(int j=0;j<st.length();j++){
            if(st.charAt(j)==ch){
                count++;
            }
          }
        
       if(count==1){
        result+=ch;
       }
    }
       return  result;
    }
    public static void main(String[] args){
        Task9 t=new Task9();
        System.out.println(t.removeDuplicates("madam"));
    }
}

public class HarshadNumber {
    public String harshad(int num){
        int temp=num;
        int sum=0;
        while(num!=0){
            sum=sum+num%10;
            num/=10;
        }
     return temp%sum==0 ? "Harshad Number":"Not Harshad Number";
    }
    public static void main(String []args){
        System.out.println(new HarshadNumber().harshad(30));
    }
    
}

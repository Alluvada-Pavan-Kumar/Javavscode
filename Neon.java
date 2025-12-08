public class Neon {
    public boolean find(int num){
        int temp=num;
        int sq=num*num;
        int sum=0;
        while(sq>0){
            sum+=sq%10;
            sq/=10;
        }
        return temp==sum;
    }
    public static void main(String[]args){
        System.out.println(new Neon().find(9)?"neon number":"not a neon numner");
    }
}

public class task5 {
   
    public boolean isResult(int num){
        int last=num%10;
        int first=num;
        while(first>9){
            first/=10;
        }
        int temp=num/10;
        int middleSum=0;
        while(temp>9){
            middleSum+=temp%10;
            temp/=10;
        }
        return first+last==middleSum ;
    }
	public static void main(String[] args) {
	    task5 m=new task5();
		System.out.println(m.isResult(75547) ? "equal": "not equal");
	}
}


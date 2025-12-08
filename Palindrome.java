public class Palindrome {
   public void result() {
		int num=121;
		int temp=num;
		int rev=0;
		for(;num>0;num/=10){
			int r=num%10;
			rev=rev*10+r;
		}
		if(temp==rev) {
			System.out.println("pallindrome");
		}
		else {
			System.out.println("not a pallindrome");
		}
	}

	public static void main(String[] args) {
            Palindrome p=new Palindrome();
            p.result();
	}

}
 


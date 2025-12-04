public class Task6 {
 

    public boolean check(int num) {
        int last = num % 10;
        int first = num;
        while (first >= 10) {
            first /= 10;
        }
        int temp = num / 10;   
        while (temp >= 10) {
            int digit = temp % 10;
            if (digit >= first || digit >= last) {
                return false;
            }
            temp /= 10;
        }
        return true;
    }
    public static void main(String[] args) {
        Task6 t = new Task6();

        System.out.println(t.check(1672));
        System.out.println(t.check(84719));
    }
} 


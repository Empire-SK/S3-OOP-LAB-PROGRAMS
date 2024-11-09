
import java.util.Scanner;

public class FrequencyOfString {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.nextLine();
        System.out.println("Enter the Letter that to be Checked");
        char c=sc.next().charAt(0);
        int count=0;
        for(int i=0;i<=str.length()-1;i++){
            if (str.charAt(i)==c) {
                count++;
            }
        }
        System.out.println("The Frequncy of the String is :"+count);
    }
}

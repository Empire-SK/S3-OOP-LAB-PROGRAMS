public class PalindromOfString {
    public static void main(String[] args){
        int len=args[0].length();
        int flag=0;
        System.out.println(len);
        for(int i=0;i<=len/2;i++){
            if(args[0].charAt(i)!=args[0].charAt(len-1-i)){
                flag=1;
                break;
            }
        }
        if (flag==0) {
            System.out.println("The Given String is Palindrome");
        }else{
            System.out.println("The given String is not a palindrome");
        }
    }    
}

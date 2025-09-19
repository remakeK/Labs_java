public class Palindrome {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String s = args[i];
            System.out.println(isPalindrome(s));
        }
    }

    public static String reverseString(String s) {
        char[] list = new char[s.length()];

        for (int i = s.length()-1; i >= 0; i--) {
            list[s.length()-i-1] = s.charAt(i);
        }
        return new String(list);
    }
    public static boolean isPalindrome(String s){
        if(s.equals(reverseString(s))){
            return true;
        }
        else{
            return false;
        }
    }
}
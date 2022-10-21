public class Problem5Palindrome{
    private static boolean palindrome(String value){
        String rev = "";
        boolean ans = false;

        for (int i = value.length() - 1; i >= 0; i--) {
            rev = rev + value.charAt(i);
        }

        if (value.equals(rev)) {
            ans = true;
        }
        return ans;
    }

    public static void main(String[] args){
        System.out.println(palindrome("civic")); //true
        System.out.println(palindrome("katak")); //true
        System.out.println(palindrome("kasur rusak")); //true
        System.out.println(palindrome("kupu-kupu")); //false
        System.out.println(palindrome("lion")); //false
    }
}

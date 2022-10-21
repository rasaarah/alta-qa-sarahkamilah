public class Problem4BilanganPrima{
    private static boolean primeNumber(int number){
        int i, count=0;
        boolean ans = true;

        for(i = 2; i < number; i++){
            if(number % i == 0){
                count++;
                ans = false;
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args){
        System.out.println(primeNumber(11)); // true
        System.out.println(primeNumber(13)); // true
        System.out.println(primeNumber(17)); // true
        System.out.println(primeNumber(20)); // false
        System.out.println(primeNumber(35)); // false
    }
}

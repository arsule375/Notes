public class Solution {
    public static boolean isPalindrone(int x){

        String num = "" + x;
        String sum = "";
        for(int i = num.length() - 1; i >= 0; i--){

            sum = sum + num.charAt(i);
        }

        if(sum.equals(num)){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPalindrone(121));
        System.out.println(isPalindrone(-121));
        System.out.println(isPalindrone(10));
    }


}

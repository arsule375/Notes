// first of my leetcode series.
public class TwoSum {

    public static int[] sumArr(int[] arr, int target){
        int[] arrS = new int[2];
        for(int i = 0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; j++){
                if (arr[i] + arr[j] == target) {
                    arrS[0] = i;
                    arrS[1] = j;
                    return arrS;
                }
            }
        }
        return null;

    }

    public static void main(String[] args) {
        // a few test casese
        int[] arrN = {2, 7, 11, 15};
        int[] nArr =  sumArr(arrN, 9);
        System.out.println(nArr[0]+  ", "+ nArr[1]);

        int[] mArr = sumArr(arrN, 18);
        System.out.println(mArr[0]+  ", "+ mArr[1]);

        int[] arrY = {3, 2, 4};
        int[] jArr = sumArr(arrY,6);
        System.out.println(jArr[0] + ", " + jArr[1]);

        int[] arrB = {3, 3};
        int[] Barr = sumArr(arrB, 6);
        System.out.println(Barr[0] + ", " + Barr[1]);
    }
}

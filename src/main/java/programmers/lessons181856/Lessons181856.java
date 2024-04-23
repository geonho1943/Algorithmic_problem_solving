package programmers.lessons181856;

public class Lessons181856 {
    public static void main(String[] args) {
        int[] arr1 = {100, 17, 84, 1};
        int[] arr2 = {55, 12, 65, 36};
        System.out.println(solution(arr1,arr2));
    }
    public static int solution(int[] arr1, int[] arr2) {
        if (arr1.length < arr2.length) return -1;
        else if (arr1.length > arr2.length) return 1;
        else {
            int arr1Sum=0;
            int arr2Sum=0;
            for (int i = 0; i < arr1.length; i++) arr1Sum+=arr1[i];
            for (int i = 0; i < arr2.length; i++) arr2Sum+=arr2[i];
            if (arr1Sum < arr2Sum) return -1;
            else if (arr1Sum > arr2Sum) return 1;
            else return 0;
        }
    }
}

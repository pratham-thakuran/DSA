public class searchforanumber {
    static boolean linearly(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6};
        int target = 5;
        System.out.println(linearly(arr, target));
    }
}

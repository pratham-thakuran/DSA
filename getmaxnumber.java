public class getmaxnumber {
    static int maxnumber(int[] arr){
        int maxi= arr[0];
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>maxi){
                maxi=arr[i];
            }
        }
        return maxi;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,99};
        System.out.println(maxnumber(arr));
    }

}

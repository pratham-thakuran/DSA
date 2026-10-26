// package patterns;

// public class pattern21 {
//     public static void main(String[] args) {
//         int n =4;
//         for(int i =0;i<2*n-1;i++){
//             for(int j =0;j<2*n-1;j++){
//                 // if(i==0||i==2*n-2||j==0||j==2*n-2){
//                 //     System.out.print("*");
//                 // }
//                 // else if(i==1&&j==){
//                 //     System.out.print(" ");
//                 // }
//                 int top=i;
//                 int left =j;
//                 int right =(2*n-2)-j;
//                 int down = (2*n-2)-i;
//                 System.out.print(n-Math.min(Math.min(top,down),Math.min(left,right)));
//             }
//             System.out.println();

//         }
//     }
// }

package patterns;

public class pattern21 {
    public static void main(String[] args) {
        int n = 4;

        for (int i = 0; i < 2 * n - 1; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {

                int num = n;

                for (int k = 0; k < n; k++) {
                    if (i >= k && i < 2 * n - 1 - k &&
                        j >= k && j < 2 * n - 1 - k) {
                        num = n - k;
                    }
                }

                System.out.print(num);
            }
            System.out.println();
        }
    }
}

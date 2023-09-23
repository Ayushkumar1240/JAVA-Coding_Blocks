// //   07-07-2023



// //     Leetcode 54   SPIRAL MATRIX
// //-----------------------------------------------------------------------------------
// //     (valid for only square matrix)

// import java.util.*;

// // public class DayThirteen {

// //     public static List<Integer> spiralOrder(int[][] matrix) {
// //         ArrayList<Integer> list = new ArrayList<>();
// //         int rmin = 0;
// //         int cmin = 0;
// //         int rmax = matrix.length - 1;
// //         int cmax = matrix[0].length - 1;
// //         while (rmin <= rmax && cmin <= cmax) {
// //             for (int i = cmin; i <= cmax; i++) {
// //                 list.add(matrix[rmin][i]);
// //             }
// //             rmin++;
// //             for (int i = rmin; i <= rmax; i++) {
// //                 list.add(matrix[i][cmax]);
// //             }
// //             cmax--;
// //             for (int i = cmax; i >= cmin; i--) {
// //                 list.add(matrix[rmax][i]);
// //             }
// //             rmax--;
// //             for (int i = rmax; i >= rmin; i--) {
// //                 list.add(matrix[i][cmin]);
// //             }
// //             cmin++;
// //         }
// //         return list;
// //     }

// //     public static void main(String[] args) {
// //         int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
// //         System.out.println(spiralOrder(arr));

// //     }
// // }













// //    (valid for all)


// public class DayThirteen {

//     public static List<Integer> spiralOrder(int[][] matrix) {
//         ArrayList<Integer> list = new ArrayList<>();
//         int rmin = 0;
//         int cmin = 0;
//         int rmax = matrix.length - 1;
//         int cmax = matrix[0].length - 1;
//         int count = 0;
//         int total = matrix.length * matrix[0].length;
//         while (count < total) {
//             for (int i = cmin; i <= cmax && count < total; i++) {
//                 list.add(matrix[rmin][i]);
//                 count++;
//             }
//             rmin++;
//             for (int i = rmin; i <= rmax && count < total; i++) {
//                 list.add(matrix[i][cmax]);
//                 count++;
//             }
//             cmax--;
//             for (int i = cmax; i >= cmin && count < total; i--) {
//                 list.add(matrix[rmax][i]);
//                 count++;
//             }
//             rmax--;
//             for (int i = rmax; i >= rmin && count < total; i--) {
//                 list.add(matrix[i][cmin]);
//                 count++;
//             }
//             cmin++;
//         }
//         return list;
//     }

//     public static void main(String[] args) {
//         int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
//         System.out.println(spiralOrder(arr));

//     }
// }



// class DayThirteen
// {
//     public static void main(String[] args) {
//         int arr[]={1,2,3,-4,-1,4};
//         int count=0;
//         for(int i=0;i<arr.length;i++)
//         {
//             if(arr[i]<0)
//             {
//                 count++;
//             }
//         }
//         int positive[]=new int[arr.length-count];
//         int negative[]=new int[count];
//         int pcount=0;
//         int ncount=0;
//         for(int i=0;i<arr.length;i++)
//         {
//             if(arr[i]>0)
//             {
//                 positive[pcount]=arr[i];
//                 pcount++;
//             }
//             else
//             {
//                 negative[ncount]=arr[i];
//                 ncount++;
//             }
//         }
//         // for(int i=0;i<arr.length-count;i++)
//         // {
//         //     System.out.println(positive[i]+" ");
//         // }
//         // for(int i=0;i<count;i++)
//         // {
//         //     System.out.println(negative[i]+" ");
//         // }



// //         int result[]=new int[arr.length];
// //         pcount=0;
// //         ncount=0;        
// //         int n=count;
// //         int total=0;
// //         int left=arr.length-count;
// //         int p=arr.length-count;
// //         for(int i=0;i<arr.length;i++)
// //         {
// //             if(i%2==0 && n>0)
// //             {
// //                 result[i]=negative[ncount];
// //                 ncount++;
// //                 n--;
// //                 total++;
// //             }
// //             if(i%2!=0 && n>0)
// //             {
// //                 result[i]=positive[pcount];
// //                 pcount++;
// //                 n--;
// //                 total++;
// //             }
// //         }
// //         while(total!=arr.length)
// //         {
// //             result[i]=positive[pcount];
// //             pcount++;
// //         }
// //         for(int i=0;i<arr.length;i++)
// //         {
// //             System.out.println(result[i]+" ");
// //         }
// //     }
// // }
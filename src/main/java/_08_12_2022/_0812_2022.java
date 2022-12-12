package _08_12_2022;

public class _0812_2022 {
    public static int[] merge ( int arr1[], int arr2[]){
        int result[] = new int[arr1.length + arr2.length];

//        if (arr1[0]<=arr2[0]){
//            result[0]=arr1[0];
//        if (arr1[1]<= arr2[0]) {
//            result[1] = arr1[1];
//        }else result[1]= arr2[0];}
//        else {result[0]=arr2[0]};
//
//    }

    int n = 0;

    for (int i=0, j =0; i<arr1.length && j<arr2.length){
        if  (arr1[i]<=arr2[j]){
            result[n]=arr1[0];
            i++;  n++;
            if (arr1[i]<= arr2[j]) {
                result[n] = arr1[i];
                i++; n++;
            }else result[i]= arr2[j];
                j++; n++}
        else {result[n]=arr2[j]
            j++ && n++};
    }

    //надо добавить остаток кода, после окончания перебора меньшего из массивов


        static int getMaxElement(int arr[], int index)
        {
            int max;
            int length = arr.length;

            index = arr.length/2;
            int arr1[arr.length/2];
            int arr2[arr.length/2];
            int c=0;

            if (arr1[0]>=arr2[0]){
                index = arr1[0];
                c++;
            } else {

            }

            //
        }
        int arr[] = {70, 250, 50, 300, 1};
        System.out.println(getMaxElement(arr, 0));

}

/**
 *

 // how to combine two sorted arrays

 // input - arr1 - sorted, arr2 - sorted
 // output -  arr - sorted and has element from arr1 and arr2

 // arr1.length = n
 // arr2.length = m
 // output.length = n + m

 // arr1 = [4,6,8,11], arr2 = [5,9,10,13]
 // result = []

 // if arr1[0] < arr2[0] (4 < 5) then arr1[0] is less than every element in arr2
 // and at the same time is less than every element in arr1 (because  arr1 sorted)
 // result = [ arr1[0] ] ( result = [4])

 // if arr1[1] < arr2[0] (6 < 5) - false else then arr2[0] is less than every element in arr2
 // and is less than every element in arr1 (except for arr1[0])
 // result = [ arr1[0], arr2[0] ] (result = [4,5])

 // if arr1[1] < arr[1] (6 < 9)
 // result = [ arr1[0], arr2[0], arr1[1] ] (result = [4,5,6])

 //  so on

 // (result = [4,5,6,8,9,10,11])
 // copy the rest of arr2

 // arr1 = [4,6], arr2 = [5,9,10,13,17,21,24,56,99]
 // result = []

 // result  = [4]
 // result = [
 // result  = [4]
 // result = [4,5]
 // result = [4,5,6] // no more elements in arr1
 // result = [4,5,6] + [9,10,13,17,21,24,56,99] =[4,5,6,9,10,13,17,21,24,56,99]

 // take minimum from each array and compare them
 // добавить в результат меньший из двух элементов
 // continue from left to right
 // if we moved all elements from one array to result then copy the rest of other array to result
 public static int[] merge(int[] arr1, int[] arr2) {
 return  null;
 }
 Konstantin Bezgatsev Кому Все
 10:16:21
 KB
 ?
 GIORGI BAKRADZE Кому Все
 10:16:29
 GB
 ?
 Oksana Molchanova Кому Все
 10:16:35
 OM
 +
 Alexander Rusakov Кому Все
 10:16:38
 AR
 +
 Uliana Shevchuk Кому Все
 10:16:41
 US
 ?
 Starta University Кому Все
 10:21:52
 SU
 for (int i = 0, j = 0; i < arr1.length && j < arr2.length;) {

 }
 int[] result = new int[arr1.length + arr2.length];
 Кому:

 */
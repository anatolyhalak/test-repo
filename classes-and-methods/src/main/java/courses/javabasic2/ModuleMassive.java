package courses.javabasic2;

import java.util.Arrays;

public class ModuleMassive {
    public static void main(String[] args) {
        int[] arr = {1,2,-3,4, 0,-2,2,-5};
        for ( int i = 0; i < arr.length; i++) {
           System.out.print(arr[i] + " ");
        }
        System.out.println();
        int[] arr2 = deleteNegative(arr);
        for ( int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        System.out.print(arr[0] + " ");
        //int[] arr2 = reverseBack(arr);
        //    System.out.println("");
        //for ( int i = 0; i < arr2.length; i++) {
        //    System.out.print(arr2[i] + " ");
        //}
        //System.out.println(deleteNegative(arr));
        //deleteNegative(arr);
    }
    //Массивы#12
    public static int[] add(int[] arr, int[] ins, int pos) {
        int[] arrRes = new int[arr.length + ins.length];
        boolean flag = true;
        for (int i = 0; i < arrRes.length; i++) {
            if (flag == true) {
                if (i != pos) {
                    arrRes[i] = arr[i];
                } else {
                    for (int j = 0; j < ins.length; j++) {
                        arrRes[pos + j] = ins[j];
                    }
                    flag = false;
                    i += ins.length - 1;
                }
            } else {
                arrRes[i] = arr[i - ins.length];
            }
        }
        return arrRes;
    }
    //Массивы#11
    public static int[] add(int[] arr, int x, int pos){
        int[] arrRes = new int[arr.length + 1];
        boolean flag = true;
        for( int i = 0; i < arrRes.length; i++){
            if ( flag == true){
                if( i != pos){
                    arrRes[i] = arr[i];
                }
                else {
                    arrRes[i] = x;
                    flag = false;
                }
            }
            else{
                arrRes[i] = arr[i - 1];
            }
        }
        return arrRes;
    }
    //Массивы#10
    public static int[] deleteNegative(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                count++;
            }
        }
        int[] arrRes = new int[count];
        int index = 0;
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                arrRes[index] = arr[i];
                index++;
            }
        }
        return arrRes;
    }
    //Массивы#9
    public static int[] findAll(int[] arr, int x){
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }
        int[] arrRes = new int[count];
        int index = 0;
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                arrRes[index] = i;
                index++;
            }
        }
        return arrRes;
    }
    //Массивы#8
    public static int[] concat(int[] arr1, int[] arr2) {
        int[] arrConsat = new int[arr1.length+arr2.length];
        for(int i = 0; i < arr1.length; i++){
            arrConsat[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++){
            arrConsat[arr1.length + i] = arr2[i];
        }
        return arrConsat;
    }
    //Массивы#7
    public static int[] reverseBack(int[] arr) {
        int[] arrBack = new int[arr.length];
        for ( int i = 0; i < arr.length; i++) {
            arrBack[i] = arr[arr.length - 1 - i];
        }
        return arrBack;
    }
    //Массивы#6
    public static void reverse(int[] arr) {
        for ( int i = 0; i < arr.length / 2; i++) {
            int temp;
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }
    //Массивы#5
    public static boolean palindrom(int[] arr) {
        for ( int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
    //Массивы#4
    public static int countPositive(int[] arr) {
        int count = 0;
        for ( int i = 0; i < arr.length; i++ ) {
            if ( arr[i] > 0) {
                count++;
            }
        }
        return count;
    }
    //Массивы#3
    public static int maxAbs(int[] arr) {
        int max = 0;
        int maxmodule = 0;
        for ( int i = 0; i < arr.length; i++) {
            int abs = arr[i];
            if ( abs < 0) {
                abs *= -1;
            }
            if ( maxmodule <= abs) {
                maxmodule = abs;
                max = arr[i];
            }
        }
        return max;
    }
    //Массивы#2
    public static int findFirsts(int[] arr, int x) {
        for ( int i = arr.length -1; i >= 0; i--) {
            if ( arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
    //Массивы#1
    public static int findFirst(int[] arr, int x){
        for ( int i = 0; i < arr.length; i++) {
            if ( arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
}

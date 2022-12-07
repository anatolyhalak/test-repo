package courses.javabasic2;

import java.util.Arrays;

public class ModuleMassive {
    public static void main(String[] args) {
        int[] arr = {12,-4,-7,4,5,-7,-2,1};
        for ( int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        int[] arr2 = reverseBack(arr);
            System.out.println("");
        for ( int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
    //Массивы#8
    public static int[] concat(int[] arr1, int[] arr2) {

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

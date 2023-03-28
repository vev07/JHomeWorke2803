package ArrRandom;

import java.util.Arrays;

public class TestArr {
    public static void main(String[] args) {
        int[] arr = new int [20];
        fullRandomNumbers(arr);
        System.out.println(Arrays.toString(arr));
        sortBubble(arr);
        System.out.println(Arrays.toString(arr));
        reversSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(delElement(arr, 2)));



    }
    public static int[] fullRandomNumbers(int[] arr) {
        int min = 8;
        int max = 120;
        int i;

        for (i = 0; i < arr.length; i++) {
            arr[i] = randomInt(min, max);
        }

        return arr;
    }
    public static int randomInt(int min, int max) {
    return (int)(Math.random() * ((max - min) + 1) + min);
    }
    public static int[] sortBubble(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }



        }
        return arr;
    }
    public static int[] reversSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }



        }
        return arr;

    }
    public static int[] delElement(int[] arr, int key) {
        int[] newArr = new int[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i++) {
           if(i == key) {
               continue;
           }
           newArr[j++] = arr[i];
        }

        return newArr;
    }
}

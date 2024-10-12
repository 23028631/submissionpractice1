/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arr;

import java.util.Arrays;

/**
 *
 * @author Laptop acer
 */
public class Arr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int arr[]= {1,2,9,10,5};
     for(int i=0;i<arr.length;i++){
         System.out.print(arr[i]);
    }
     Arrays.sort(arr);
     System.out.println();
     for(int i=0;i<arr.length;i++){
         System.out.println(arr[i]);
     }
     int indexValue=search(arr,2);
     System.out.println(indexValue);
}

    public static int search(int[] arr, int key) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key)
                return i;
        }
        return 0;
    
    }
    }

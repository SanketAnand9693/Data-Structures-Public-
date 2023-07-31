package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;

public class _28PrintingSequencesQues{
    public static void sequences(int arr[],int index,ArrayList<Integer> temp){
        //Base case for printing the values
        if(arr.length==index){
            if(temp.size()>0){
                System.out.println(temp);
            }
            return;
        }
        
        //including value to temp array.
        sequences(arr,index+1, temp);
        //Adding element present in array on that index to temp array.
        temp.add(arr[index]);
        //Not including the value to temp array.
        sequences(arr, index+1, temp);
        //Removing last element present in temp array
        temp.remove(temp.size()-1);
    }
    public static void main(String[] args) {
        int array[]={1,2};
        System.out.println("Your given array: "+Arrays.toString(array));
        sequences(array, 0, new ArrayList<>());
    }
}
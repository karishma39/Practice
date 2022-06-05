package slidingWindow;

//Find first negative no in a subarray

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

public class FirstNegativeIntegerSubArray {
    public static void main(String args[]) {
        int windowSize = 3;
        int arr[] = new int[]{3, -5, -2, 6, 1,-4, 2, 6, 2,-9,4,-9,7, 6,9};
        ArrayList list = new ArrayList();
        int i=0;
        //Via ArrayList

        for(int j=0;j<arr.length;j++){
            if(arr[j]<0){
                list.add(arr[j]);
            }
            if(j-i+1 == windowSize){
                if(list.isEmpty()){
                    System.out.println(0);
                }
                else {
                    System.out.println(list.get(0));
                    if ((Integer) list.get(0) == arr[i]) {
                        list.remove(0);
                    }
                }

                i++;
            }
        }

        // Via Queue


       /*
        Queue queue = new PriorityQueue();
        for(int j=0;j<arr.length;j++){
            if(arr[j]<0){
                queue.add(arr[j]);
            }
            if(j-i+1 == windowSize){
                if(queue.isEmpty()){
                    System.out.println(0);
                }
                else {
                    System.out.println(queue.peek());
                    if ((Integer)queue.peek() == arr[i]) {
                        queue.poll();
                    }
                }

                i++;
            }
        }
        */
    }
}

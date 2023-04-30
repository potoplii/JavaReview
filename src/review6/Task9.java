package review6;

import java.util.Arrays;

public class Task9 {
    public static void main (String[]args){
            int[] num = {100, 100, -20, 30, 40, 44, 40, 11, 22, 33, 44};
            Arrays.sort(num);
            System.out.print("Second largest number in the array is " + num[num.length - 2]);
        }
    }


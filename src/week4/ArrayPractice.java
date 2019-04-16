package week4;

import java.util.ArrayList;

public class ArrayPractice {

    public static void main(String[] args) {

        int [] number = new int[5];
        number[0]= 20;
        number[1]= 30;
        number[2]= 40;
        number[3]= 50;
        number[4]= 60;
        int len = number.length;
        System.out.println("Array size = " + len);
        int sum = number [0]+ number[1] + number[2] + number[3]+number[4];
        System.out.println(sum);
        System.out.println("======================");


        String [] store = new String[6];
        store [0]= "Riad ,";
        store [1]= "Menad, ";
        store[2]= "akil ,";
        store[3]= "sonia , And ";
        store[4]= "kabir.";
        int r = store.length;
        System.out.println(r + " = is the size of my array");
        String s = store[0]+  store[1] + store[2] + store[3] + store[4] + store[5];
        System.out.println(s);




    }

}

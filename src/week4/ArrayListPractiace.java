package week4;

import java.util.ArrayList;

public class ArrayListPractiace {


    public static void main(String[] args) {
        ArrayList<Integer> mylist = new ArrayList<Integer>();
        mylist.add(1);
        mylist.add(5);
        mylist.add(3);
        mylist.add(25);
        mylist.add(93);

        for (Integer x : mylist)
            System.out.println(x);
        System.out.println("The size of my Arraylist is =" + mylist.size());

        System.out.println("-------------------------------");

  ArrayList<String> fruits = new ArrayList<String>();
  fruits.add("orange");
  fruits.add("apple");
  fruits.add("pineapple");
  fruits.add("grape");
  fruits.remove("grape");
  fruits.add("banana");
  fruits.contains("orange");
  fruits.set(2,"PINEAPPLE");





  for (String s : fruits)
        System.out.println(s);

        System.out.println("The size of my Array is = "+fruits.size());
        System.out.println("=======================");
    }
}



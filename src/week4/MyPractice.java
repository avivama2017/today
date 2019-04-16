package week4;

import java.util.LinkedList;

public class MyPractice {

    public static void main(String[] args) {

LinkedList<String> name = new LinkedList<String>();
name.add("Riad");
name.add("Menad");
name.add("Akil");
name.add("Kabir");
name.add("Jeff");
name.addFirst("Jack");
name.addLast("Hasina");
name.removeLast();
name.removeFirst();
name.remove(1);
name.set(1,"MENAD");



        System.out.println("The size of my linkedlist is = "+name.size () + "  , And they are as follows : ");


for ( String y : name)
    System.out.println(y);
    }
}

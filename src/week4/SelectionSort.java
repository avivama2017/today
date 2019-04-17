package week4;

public class SelectionSort {

    public void selectionshort(int[]array){
        for(int i=0; i <array.length;i++){

            int min_idx=i;
            for (int j = i; j<array.length; j ++){
                if(array[j]< array[min_idx]);
                min_idx=j;


                }

              int temp = array[min_idx];
            array[min_idx]= array[i];
            array[i]= temp;
            }

        }
///Users/mdriad/IdeaProjects/homework2/src/week4

    }
}

package week4;

public class BubbleSortPractice1 {


    public static void main(String[] args) {

        int ArrayNumber []= {0,12,34,11,55,90,-1};
        BubbleSortPractice1 bubbleSortPractice1 = new BubbleSortPractice1();
        bubbleSortPractice1.bubbleSortMethod(ArrayNumber);
        System.out.println("sorted Array : ");
        for (int a = 0; a <ArrayNumber.length; a++) {

            System.out.print(ArrayNumber[a] + " ");
        }
        }

        public void bubbleSortMethod(int array[]){

        int n = array.length;
        for (int i = 0; i <n; i++){
            for ( int j = 0; j<n-1; j++){
                if (array[j]> array[j +1]){
                    //swap array[j+1] with array [j]
                    int temp = array[j];
                    array[j]=array[j+1];
                    array[j+1]= temp;
                }
            }
        }


    }
}

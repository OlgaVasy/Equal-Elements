import java.util.Scanner;

/** Task #2: EqualElements.java */

public class EqualElements {

   public static int equalElements(int[] array) {

      int max = 1; // the maximum length of a sequence of consecutive elements
      int count = 1; // the length of every next sequence of consecutive elements

      for (int i=0; i<array.length; i++){
         if (array[i] < 0)
            throw new IllegalArgumentException("All elements in the array must be >= 0");
      }
      for (int i = 1; i < array.length; i++) {
         if (array[i] == array[i - 1]) {
            count++;
         } else {
            if (count > max)
               max = count;
               count = 1;}
         }
         if (count > max)
            max = count;
      return max;   }


   public static void printArray(int [] array){

      if( array.length == 0)
         System.out.println("The array is empty ");
      else{
      for (int i=0; i<array.length; i++){
         System.out.print(array[i]+" ");}
         System.out.println("\nThe maximum length of a sequence of consecutive equal elements is " + equalElements(array));;
        }}


   public static void main(String[] args) {

      int array1[] = {12, 54, 54, 16, 18};
      int array2[] = {12, 12,12, 54, 54, 54, 18};
      int array3[] = {12,12,12,12, 54, 54, 16, 16, 16, 16, 16, 18};

      printArray(array1);
      printArray(array2);
      printArray(array3);

      Scanner input=new Scanner(System.in);

      System.out.println("Do you wish to check another array? Please enter Y for yes or any another key to quit: ");
      char response = input.next().charAt(0);
      while (response == 'Y' || response == 'y'){
         System.out.println("How many elements in your array? ");
         int arrayLength = input.nextInt();
         while (arrayLength <= 0){
            System.out.println("Please enter a number greater than 0:  ");
            arrayLength = input.nextInt();
         }
      int arrayNew[] = new int[arrayLength];

      for(int i=0; i< arrayNew.length; i++){
      System.out.println("Please enter the array to find the maximum length of a sequence of consecutive equal elements: ");
      arrayNew[i]=input.nextInt();
      if (arrayNew[i]< 0){
         System.out.println("Please enter the positive number: ");
         arrayNew[i]=input.nextInt();}
   }
      printArray(arrayNew);
      System.out.println("Do you wish to check another array? (Y/N)");
      response = input.next().charAt(0);
}}
}

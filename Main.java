import java.lang.*;
import java.util.Random;

class Main {
  public static void main(String[] args) { 
    // findmax(10,3,1); 
    // findmax1(10,3,1);
    // System.out.println(findMinArray());
    System.out.println(findMin2DArray());
   
    // System.out.println( findmax2(10,3,4));
  }
  static void findmax(int number1, int number2, int number3) {
    if (number1 > number2) {
      if (number1 >number3) {
        System.out.println(number1);
      }
      else {
        System.out.println(number3);
      }
      
    }
    else {
      if(number2 > number3) {
        System.out.println(number2);
      }
      else {
        System.out.println(number3);
      }
     
    }
  }
  static void findmax1(int number1, int number2, int number3) {
    int max_value = Math.max(number1, number2);
    System.out.println(Math.max(max_value, number3));


  }
  static int findmax2(int number1, int number2, int number3) {
    int max_value = Math.max(number1, number2);
    max_value = Math.max(max_value, number3);
    return max_value;

  }

  static int findMinArray() {
    Random r = new Random();//generate a number
    int nums[] = new int[7];
    for(int i =0; i<nums.length;i++) {
      nums[i] = r.nextInt(101);
      System.out.println(nums[i]);

    }
    int Min_Value = Integer.MAX_VALUE;
    for(int i=0; i<nums.length; i++) {
      if (nums[i] < Min_Value) {
        Min_Value = nums[i];
      }
    
    }
    return Min_Value;
    

    
  }
  static int findMin2DArray() {
    Random r = new Random();//generate a number
    int nums[][] = new int[3][7];

    for (int i = 0; i <nums.length;i++) {
      for (int j = 0; j <nums[0].length;j++) {
        nums[i][j] = r.nextInt(101);
         System.out.print(nums[i][j]+"\t");
      }
      System.out.println();

    }
    int Min_Value = Integer.MAX_VALUE;
     for (int i = 0; i <nums.length;i++) {
      for (int j = 0; j <nums[0].length;j++) {
        if (nums[i][j] < Min_Value){
          Min_Value = nums[i][j];
        }
      }
    }


    // for(int i =0; i<nums.length;i++) {
    //   nums[i] = r.nextInt(101);
    //   System.out.println(nums[i]);

    //int Min_Value = Integer.MAX_VALUE;
    // for(int i=0; i<nums.length; i++) {
    //   if (nums[i] < Min_Value) {
    //     Min_Value = nums[i];
    //   }
    
    

    
    // }
    return Min_Value;


  }  
}
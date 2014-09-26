import java.util.Set;

public class Test {

  public static void main(String[] args){

    Test test = new Test();
    System.out.println("checkForDuplicates({1,2,3,4,1}) should be true, result: " + test.checkForDuplicates(new int[] {1, 2, 3, 4, 1}));
    System.out.println("checkForDuplicates({1,2,3,4,5}) should be false, result: " + test.checkForDuplicates(new int[] {1, 2, 3, 4, 5}));
    System.out.println("isEven(2) should be true, result: " + test.isEven(2));
    System.out.println("isEven(1) should be false, result: " + test.isEven(1));
    System.out.println("isOdd(9) should be true, result: " + test.isOdd(9));
    System.out.println("isOdd(10) should be false, result: " + test.isOdd(10));
    System.out.println("isSubString(Hello World, Hello) should be true, result: " + test.isSubString("Hello World", "Hello"));
    System.out.println("isSubString(Hello World, Yo) should be false, result: " + test.isSubString("Hello World", "Yo"));
  }


  public boolean checkForDuplicates(int[] myArray){

    boolean duplicate = false;

    for(int i=0; i< myArray.length; i++){

      for(int j=i; j < myArray.length; j++){
        if(myArray[i] == myArray[j]){
          duplicate = true;

        }
      }
    }
    return duplicate;
  }

  public boolean checkForDuplicatesV2(int[] myArray){

    boolean duplicate = false;

    for(int i=0; i< myArray.length; i++){

      for(int j=0; j < myArray.length; j++){

        if(i!=j){
          if(myArray[i] == myArray[j]){
            duplicate = true;
          }
        }
      }
    }
    return duplicate;
  }

  public boolean isSubString(String input1, String input2){

    return input1.contains(input2);
  }

  public boolean isEven(int i){

    boolean even = false;

    if(i % 2 == 0){
      even = true;
    }
    return even;
  }
  public boolean isOdd(int i){

    boolean odd = false;

    if(i % 2 == 1){
      odd = true;
    }
    return odd;
  }

}

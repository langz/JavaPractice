public class Test {

  public static void main(String[] args){

    Test test = new Test();
    System.Out.println(test.checkForDuplicates(new int[] {1, 2, 3, 4, 1}));

  }


  public boolean checkForDuplicates(int[] myArray){

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
}

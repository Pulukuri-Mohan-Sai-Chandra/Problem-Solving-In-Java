// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import  LinkedList.*;
public class Main {

    public static void main(String[] args){
      LinkedList test = new LinkedList();
      for(int index = 0;index <=5;index++){
          test.insertRight(index);
      }
      test.printList();
    }
}
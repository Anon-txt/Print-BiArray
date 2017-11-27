public class PrintBiArray {

  public static void printArray(int[][] Array) {

    System.out.println();
      for(int line = 0;line < Array.length; line++) {
        for(int column = 0; column < Array[line].length; column++) {
          System.out.print("\t" + Array[line][column]);
        }
        System.out.println();
      }
    System.out.println();
  }

}

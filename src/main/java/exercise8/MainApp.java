package exercise8;

import exercise8.utility.ArrayInterleaver;
import java.util.Arrays;

public class MainApp {

  public static void main(String[] args) {
    int[] input1 = new int[]{1, 7, 9};
    int[] input2 = new int[]{2, 6, 0};

    int[] result = ArrayInterleaver.interleave(input1, input2);

    System.out.println(Arrays.toString(result));
  }
}

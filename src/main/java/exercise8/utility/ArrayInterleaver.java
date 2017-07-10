package exercise8.utility;


public class ArrayInterleaver {

  //  This function takes two arrays and mixes them like this:
  //  [1, 2, 3] and [6, 7, 8] becomes [1, 6, 2, 7, 3, 8]
  public static int[] interleave(int[] numbers1, int[] numbers2) {
    int shorterInputLength =
        (numbers1.length < numbers2.length) ? numbers1.length : numbers2.length;
    int resultLength = 2 * shorterInputLength;
    int[] result = new int[resultLength];

    for (int i = 0; i < shorterInputLength; i++) {
      result[2 * i] = numbers1[i];
      result[2 * i + 1] = numbers2[i];
    }

    return result;
  }
}

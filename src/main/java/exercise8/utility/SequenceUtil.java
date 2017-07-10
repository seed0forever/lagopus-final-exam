package exercise8.utility;


public class SequenceUtil {

  //  This function takes two arrays and mixes them like this:
  //  [1, 2, 3] and [6, 7, 8] becomes [1, 6, 2, 7, 3, 8]
  public static int[] interleave(int[] sequence1, int[] sequence2) {

    int shorterInputLength =
        (sequence1.length < sequence2.length) ? sequence1.length : sequence2.length;
    int resultLength = 2 * shorterInputLength;
    int[] result = new int[resultLength];

    for (int i = 0; i < shorterInputLength; i++) {
      result[2 * i] = sequence1[i];
      result[2 * i + 1] = sequence2[i];
    }

    return result;
  }
}

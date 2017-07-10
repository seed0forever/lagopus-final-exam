package exercise8.utility;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class ArrayInterleaverTest {

  public static final int[] INPUT_1 = new int[]{1, 7, 9, -5};
  public static final int[] INPUT_2 = new int[]{2, 6, 0, -12};
  public static final int[] INPUT_3 = new int[]{2, 10, 100};

  public static final int[] INPUT_EMPTY = new int[]{};

  public static final int[] RESULT_OF_1_AND_2 = new int[]{1, 2, 7, 6, 9, 0, -5, -12};
  public static final int[] RESULT_OF_1_AND_3 = new int[]{1, 2, 7, 10, 9, 100};

  @Test
  public void interleave_withEqualLengthInputs() throws Exception {
    assertArrayEquals(RESULT_OF_1_AND_2, ArrayInterleaver.interleave(INPUT_1, INPUT_2));
  }

  @Test
  public void interleave_withDifferentLengthInputs() throws Exception {
    assertArrayEquals(RESULT_OF_1_AND_3, ArrayInterleaver.interleave(INPUT_1, INPUT_3));
  }

  @Test
  public void interleave_withEmptyInputs() throws Exception {
    assertArrayEquals(INPUT_EMPTY, ArrayInterleaver.interleave(INPUT_EMPTY, INPUT_EMPTY));
  }
}

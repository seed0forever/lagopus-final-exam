package exercise8.utility;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class ArrayInterleaverTest {

  public static final int[] INPUT_1 = new int[]{1, 7, 9, -5};
  public static final int[] INPUT_2 = new int[]{2, 6, 0, -12};

  public static final int[] RESULT = new int[]{1, 2, 7, 6, 9, 0, -5, -12};

  @Test
  public void interleave() throws Exception {
    assertArrayEquals(RESULT, ArrayInterleaver.interleave(INPUT_1, INPUT_2));
  }
}

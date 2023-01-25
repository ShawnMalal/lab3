import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
@Test
 public void testReverseInPlace() {
   int[] input1 = { 1,2,3 };
   ArrayExamples.reverseInPlace(input1);
   assertArrayEquals(new int[]{ 3,2,1 }, input1);
 }



  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }


@Test
 public void testAverageWithoutLowest() {
   double [] input1 = { 2.0,2.0,5.0 };
   double doubleAvg = 4.5;
   assertEquals(doubleAvg, ArrayExamples.averageWithoutLowest(input1), 0.0001);
 }
}










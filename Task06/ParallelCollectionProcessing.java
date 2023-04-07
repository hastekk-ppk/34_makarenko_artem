package task06;

import java.util.Arrays;
import java.util.List;

public class ParallelCollectionProcessing {
   public static void main(String[] args) {
      List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

      int min = numbers.parallelStream().min(Integer::compare).get();
      int max = numbers.parallelStream().max(Integer::compare).get();
      double avg = numbers.parallelStream().mapToInt(Integer::intValue).average().getAsDouble();

      System.out.println("Minimum value: " + min);
      System.out.println("Maximum value: " + max);
      System.out.println("Average value: " + avg);
   }
}

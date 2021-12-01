package io.github.pulsebeat02.adventofcode.day1;

import io.github.pulsebeat02.adventofcode.Constants;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public final class SonarSweepPartTwo {

  public static void main(final String[] args) throws IOException {

    final Scanner scanner =
        new Scanner(Files.newInputStream(Constants.USER_DIR.resolve("sonarsweep.txt")));
    final List<Integer> nums = new ArrayList<>();
    while (scanner.hasNext()) {
      nums.add(scanner.nextInt());
    }

    int count = 0;
    for (int i = 3; i < nums.size(); i++) {
      final int previous = nums.get(i - 3) + nums.get(i - 2) + nums.get(i - 1);
      final int next = nums.get(i) + nums.get(i - 2) + nums.get(i - 1);
      if (previous < next) {
        count++;
      }
    }

    System.out.println(count);
  }
}

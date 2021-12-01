package io.github.pulsebeat02.adventofcode.day1;

import io.github.pulsebeat02.adventofcode.Constants;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;

public final class SonarSweepPartOne {

  public static void main(final String[] args) throws IOException {

    final Scanner scanner =
        new Scanner(Files.newInputStream(Constants.USER_DIR.resolve("sonarsweep.txt")));

    int before = scanner.nextInt();
    int count = 0;
    while (scanner.hasNext()) {
      final int next = scanner.nextInt();
      if (next > before) {
        count++;
      }
      before = next;
    }

    System.out.println(count);
  }
}

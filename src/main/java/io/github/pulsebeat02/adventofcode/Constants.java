package io.github.pulsebeat02.adventofcode;

import java.nio.file.Path;

public final class Constants {

  public static final Path USER_DIR;

  static {
    USER_DIR = Path.of(System.getProperty("user.dir"));
  }
}

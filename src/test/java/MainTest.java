/*
 * This Java source file was generated by the Gradle 'init' task.
 */

import org.junit.Test;
import practice.Main;

import static org.junit.Assert.*;

public class MainTest {

  @Test
  public void testMainHasAGreeting() {
    Main classUnderTest = new Main();
    assertNotNull("app should have a greeting", classUnderTest);
    Main.main(null);
  }
}

package main.java;

import java.util.*;

class Main {
  public static void main(String[] args) {
    Togel togel = new Togel(5);

    System.out.println(togel.getGuess());
    Scanner sc = new Scanner(System.in);
    List<Integer> attempt = new ArrayList<Integer>();
    int attemptNum = 5;
    for (int x = 0; x < attemptNum; x++) {
      for (int i = 0; i < togel.guess.size(); i++) {
        attempt.add(sc.nextInt());
      }
      String result = togel.checker(attempt);
      System.out.println(result);
      if (result.equals("Congratulations! You guessed the number!")) {
        break;
      }
      attempt = new ArrayList<>();
    }
    sc.close();
  }
}

// @Test
// void addition() {
// assertEquals(2, 1 + 1);
//

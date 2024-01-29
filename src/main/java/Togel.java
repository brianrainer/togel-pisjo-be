package main.java;

import java.util.*;

public class Togel {

  public List<Integer> guess;

  public Togel(int guessLength) {
    Random rand = new Random();
    this.guess = new ArrayList<Integer>();

    for (int i = 0; i < guessLength; i++) {
      int random = rand.nextInt(10);
      this.guess.add(random);
    }
  }

  public List<Integer> getGuess() {
    return this.guess;
  }

  public String checker(List<Integer> attempt) {
    String result = "";
    int flag = 0;

    for (int i = 0; i < attempt.size(); i++) {
      if (attempt.get(i) == this.guess.get(i)) {
        result += ("Number " + attempt.get(i) + " in position " + (i + 1) + " is correct" + "\n");
        flag++;
      } else if (this.guess.contains(attempt.get(i))) {
        result += ("Number " + attempt.get(i) + " exist but not in position " + (i + 1) + "\n");
      } else {
        result += ("Number " + attempt.get(i) + " does not exist" + "\n");
      }
    }

    if (flag == this.guess.size()) {
      return "Congratulations! You guessed the number!";
    }
    return result;
  }

}

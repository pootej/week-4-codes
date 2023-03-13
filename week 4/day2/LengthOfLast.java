// length of last
class LengthOfLast {
  public static void main(String[] args) {
    String input = "YOU KNOW YOU HAVE TO STRUGGLE";

    String[] words = input.split(" ");

    int lastWordLength = 0;

    if (words.length > 0) {
      String lastWord = words[words.length - 1];
      lastWordLength = lastWord.length();
    }
    System.out.println("Length of the last word: " + lastWordLength);
  }
}
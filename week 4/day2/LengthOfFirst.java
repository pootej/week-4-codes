//length of first
class LengthOfFirst {
  public static void main(String[] args) {
    String input = "YOU KNOW YOU HAVE TO STRUGGLE";

    String[] words = input.split(" ");

    String firstword = words[0];
    System.out.print(firstword.length());
  }
}
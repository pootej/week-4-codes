// frequency of each letter
class Frequency {
  public static void main(String[] args) {
    String input = "YOU KNOW YOU HAVE TO STRUGGLE";
    for (char c = 'A'; c <= 'Z'; c++) {
      int count = 0;
      for (int i = 0; i < input.length(); i++) {
        if (c == input.charAt(i))
          count++;
      }
      if (count != 0) {
        System.out.println(c + " " + count);
      }
    }
  }
}
//reverse java
class Revers
  public static void main(String[] args) {
    String input = "YOU KNOW YOU HAVE TO STRUGGLE";
    String output = "";

    for (int i = input.length() - 1; i >= 0; i--) {
      output = output + input.charAt(i);
    }
    System.out.print(output);
  }
}

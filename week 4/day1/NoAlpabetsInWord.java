//code to print number of letter in each word of given sentence
class NoAlpabetsInWords {
  public static void main(String args[]) {
    String str = "Welcome to my world";
    String word[] = str.split(" ");
    for (String x : word) {
      System.out.println(x.length());
    }
  }
}
// how last for loop works
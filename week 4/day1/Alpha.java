//code to print only alphabets in given string

class Alpha {
  public static void main(String args[]) {
    String str = "Hi Welcome To My world";
    for (int i = 0; i < str.length(); i++) {
      if ((str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') || (str.charAt(i) >= 'a' && str.charAt(i) <= 'z'))
        System.out.print(str.charAt(i));
    }
  }
}
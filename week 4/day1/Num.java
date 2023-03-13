//code to print nly numbers in given string
class Num {
  public static void main(String args[]) {
    String str = "Hi Welcome To My world 909080";
    for (int i = 0; i < str.length(); i++)
      if (str.charAt(i) >= '0' && str.charAt(i) <= '9')
        System.out.print(str.charAt(i));
  }
}
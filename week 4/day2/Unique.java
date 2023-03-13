class Unique {
  public static void main(String args[]) {
    String str = "hi hello welcome to bitLabs";
    char ch[] = new char[str.length()];
    ch = str.toCharArray();
    int count = 1;
    for (int i = 0; i < ch.length; i++) {
      for (int j = i + 1; j < ch.length; j++)
        if (ch[i] == ch[j]) {
          count++;
          ch[i] = ' ';
        }

      if (ch[i] != ' ') {
        System.out.print(ch[i]);
      }
    }
  }
}
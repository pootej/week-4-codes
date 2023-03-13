class FiveInOne {
public static void main(String args[]) {
    String str="hiABHU&9";
  int Capcount=0;
  int Lowcount=0;
  int Numcount=0;
  int Specialcount=0;
    for(int i=0;i<str.length();i++){
      if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
        Capcount++;
      }
     else if(str.charAt(i)>='a' && str.charAt(i)<='z'){
        Lowcount++;
      }
      else if(str.charAt(i)>='0' && str.charAt(i)<='9'){
        Numcount++;
      }
      else if((str.charAt(i)!='0' && str.charAt(i)!='9') ||(str.charAt(i)!='A' && str.charAt(i)!='Z')||(str.charAt(i)!='a' && str.charAt(i)!='z')){
        Specialcount++;
      }
      }
    System.out.println("number of capital letters: "+Capcount);
    System.out.println("number of small letters: "+Lowcount);
    System.out.println("numbers: "+Numcount);
    System.out.println("number of special charater: "+Specialcount);
    }
}

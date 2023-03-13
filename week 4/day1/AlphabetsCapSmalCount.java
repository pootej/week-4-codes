class AlphabetsCapSmallCount {
public static void main(String args[]) {
    String str="hiABHU";
  int Capcount=0;
  int Lowcap=0;
    for(int i=0;i<str.length();i++){
      if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
        Capcount++;
      }
      else{
        Lowcap++;
          }
    }
  System.out.println("No Captial letters is  "+Capcount);
   System.out.println("No of small letters is  "+Lowcap);
  }
}
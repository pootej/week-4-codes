class PaliSec {
  public static void main(String[] args) {
    String input = "hi madam uk malayalam";
    String word[] = input.split(" ");// hi madam
     String str=" ";
    int count=0;

    for (int i = 0; i < word.length; i++) { // hi//madam

       str= word[i]; //hi//madam
      for(int j=0;j<str.length()/2;j++){  // h//ma
      for(int k=str.length()/2;k>0;k--){ //i //
       if (str.charAt(i)==str.charAt(k)){ //h==i
       count=count+1;   //0//
      }
    }

     }
    if(count!=0){
      for(int j=0;j<count;j++){
     System.out.println(str);
      }
  }

}

 }

 }

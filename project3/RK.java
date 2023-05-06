package project3;

public class RK {
  
  public int match(String T, String P) {
    /** Your code goes here */
    int lenT = T.length() , lenP = P.length();
    double hash_T = 0 ,hash_P=0;
    int i = 0,j=0;
    for(i=0;i<lenP;i++){
      // System.out.print((int)P.charAt(i));
      hash_P+=((int)P.charAt(i))*(Math.pow(a,lenP-i-1));
    }
    // System.out.println(hash_P);
    i = 0;
    while(j<lenT){
      char c = T.charAt(j);
      if(j-i+1<=lenP){
        int len = j-i+1;
        // System.out.print(hash_T+"   ");
        hash_T+=((int)c)*(Math.pow(a,lenP-len));
      }else{
        // System.out.println("hash "+ hash_T);
        if(hash_P==hash_T) return i;
        else{
          hash_T=(hash_T-((int)T.charAt(i))*Math.pow(a,lenP-1))*a+(int)c;
          i++;
        }
      }
      j++;
    }
    return -1;
  }

}
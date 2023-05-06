package project3;


public class Bitap {
  
  public int match(String T, String P) {
    /** Your code goes here */
    final int d = 256;

    int m = P.length();
    int[] c = new int[d];
    for (int i = 0; i < d; i++) {
        c[i] = 0;
    }
    for (int i = 0; i < m; i++) {
        c[P.charAt(i)] |= (1 << i);
        // System.out.println(c[i]);
    }

    int state = 0;
    for (int i = 0; i < T.length(); i++) {
        state = ((state << 1) | 1) & c[T.charAt(i)];
        // System.out.println(state);
        if ((state & (1 << (m - 1))) != 0) {
            return i - m + 1;
        }
    }

    return -1;
  }

}

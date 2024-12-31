package leetcode;

public class P3304 {
  public char kthCharacter(int k) {
    StringBuilder sb = new StringBuilder("a");
    StringBuilder generated = new StringBuilder();
    while (sb.length() < k) {
      if (generated.isEmpty()) {
        generated.append("b");
      } else {
        StringBuilder perf = new StringBuilder();
        for (int i = 0; i < generated.length() ; i++) {
          char tmp = generated.charAt(i);
          tmp = tmp == 'z' ? 'a' : (char) (tmp + 1);
          perf.append(tmp);
        }
        generated.append(perf);
      }
      sb.append(generated);
    }
    return sb.charAt(k - 1);
  }  
}

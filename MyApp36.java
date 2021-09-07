public class MyApp36 {

  public static void main(String[] args) {
    String s = "abcdef";
    System.out.println(s.length()); // 6
    System.out.println(s.substring(2, 5)); // cde
    System.out.println(s.replaceAll("ab", "AB"));

    String s1 = "ab";
    String s2 = "ab";

    if (s1.equals(s2)) {
      System.out.println("same!");
    }

    if (s1 == s2) {
      System.out.println("same!same!");
    }

    String ss1 = new String("ab");
    String ss2 = new String("ab");

    if (ss1 == ss2) {
      System.out.println("same!same!same!");
    }
  }

}
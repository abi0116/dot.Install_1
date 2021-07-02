public class MyApp11 {

  public static void main(String[] args) {
    // for
    // 0 - 9
    // break //breakとcontinueはwhileでも使える
    // continue
    for (int i = 0; i < 10; i++) {
      if (i == 5) {
        // break; //0~5まで表示する
        continue; //5以外の数字を通常通り表示してくれる
      }
      System.out.println(i);
    }
  }

}
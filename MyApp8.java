public class MyApp8 {

  public static void main(String[] args) {
    // if
    // > >= < <= == !=
    // && || !
    int score = 95;
    // if (score > 80) {
    //   System.out.println("Great!");
    // } else if (score > 60) {
    //   System.out.println("Good!");
    // } else {
    //   System.out.println("so so ... !");
    // }
    String msg = score > 80 ? "Great!" : "so so ... !"; //条件演算子を使ったifの書き方
    System.out.println(msg); //Great
    //返り値 = 条件 ? 条件が真だったときの値 : 条件が偽だったときの値 ←今回の条件演算子
    //返り値 = 条件1 ? 条件1が真だったときの値 : (条件2 ? 条件2が真だったときの値 : 条件2が偽だったときの値) ←三つ以上に分岐する条件演算子(見にくいので、普通にif elseで書いていくのが良い)
  }

}
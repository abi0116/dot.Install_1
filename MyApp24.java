// クラスは本来パッケージで管理されるべきだが、簡単に見るために一つのソースファイルで記述している
class User { //publicなクラスは一つのソースファイルに一つまで(今回はmainで用いている)
  private String name; //フィールドは基本的にprivate ゲッターとセッターで調整する
  private int score;

  public User(String name, int score) {
    this.name = name;
    this.score = score;
  }

  public int getScore() { // getter(ゲッター)
    return this.score;
  }

  public void setScore(int score) { // setter(セッター)
    if (score > 0) { // マイナスのscoreをはじくようにif文をつけた
      this.score = score;
    }
  }

}

public class MyApp24 {

  public static void main(String[] args) {
    User tom = new User("tom", 65); // nameをtom,scoreを65とする
    tom.setScore(85); // セッターによってScoreが85に更新される
    tom.setScore(-22); // if文にはじかれて処理されない
    System.out.println(tom.getScore()); // 85 ゲッターによって出力される
  }

}
// 抽象クラス -> 具象クラス(抽象クラスを継承するクラスのこと)
//抽象クラスは他のクラスに継承してもらうことが前提のクラス(自信をインスタンス化出来ない)

//今回はこのUserクラスを抽象クラスにして、JapanユーザークラスとAmericanユーザークラスを作る
abstract class User { //今回はフィールドは無し
  public abstract void sayHi(); // 抽象メソッド(具象クラスに実装を任せるメソッドのこと)
 // こっちにもabstractを付けると、具象クラスで実装されなかった時にエラーにしてくれる
}//働きとしては、関連する部分の切り出しを担っている

class JapaneseUser extends User {
  @Override
  public void sayHi() { //抽象メソッドをオーバーライド(しないとコンパイルエラーになる)
    System.out.println("こんにちは！");
  }
}

class AmericanUser extends User {
  @Override
  public void sayHi() { //抽象メソッドをオーバーライド(しないとコンパイルエラーになる)
    System.out.println("Hi!");
  }
}

public class MyApp {

  public static void main(String[] args) {
    AmericanUser tom = new AmericanUser();
    JapaneseUser aki = new JapaneseUser();
    tom.sayHi();
    aki.sayHi();
  }

}

//実行結果　$ javac Myapp.java  $ java Myapp
//Hi!
//こんにちは！
class User {
  String name;

  // constructor 引数を用いたコンストラクタ インスタンス作成時に自動的に呼び出される
  User(String name) { //クラスと同じ名前(今回はUser)を使う 今回はString型で引数が渡されるのでString型の変数で受けてあげる
    this.name = name; //thisはこのクラスのフィールドにアクセスするためにthisを用いる(this自体はこのクラスのコンストラクタという意味)
  }

  // this()をもちいた引数のないコンストラクタバージョン
  User() {
    // this.name = "Me!";
    this("Me!"); // 上の文の書き換え thisはUser(今回はTom)なので、うえのコンストラクタを強制的に呼んでくれる(普通のメソッドの呼び出しと同じ) こうすることでnameが引数として渡されていないから、こちらで決めてしまっている
  }

  void sayHi() {
    System.out.println("hi! " + this.name);
  }
}

public class MyApp {

  public static void main(String[] args) {
    User tom;
    tom = new User("Tom"); // 引数のあるインスタンスの作成 コンストラクタが呼び出される
    //tom = new User(); // 引数無しバージョン
    System.out.println(tom.name); // Tom
    tom.sayHi(); // hi! Tom  ここはUser.sayHi()ではなくtom.sayHi()であることに注意!!
  }

}
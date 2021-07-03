class User {
  String name;

  User(String name) {
    this.name = name;
  }

  void sayHi() {
    System.out.println("hi! " + this.name);
  }
}
 // 継承 こちらはサブクラス(子クラス)
class AdminUser extends User { // Userクラスのフィールドやメソッドを使えるようになる

  AdminUser(String name) {
    super(name); // 親クラスのコンストラクタを使う(引く数がない場合は省略してもよい)
  }

  void sayHello() { // 子クラスであるAdminUser独自のメソッド
    System.out.println("hello! " + this.name);
  }

  // override 親クラスのメソッドの上書き
  @Override // アノテーション 何の処理が行われているかを明示している メソッド名が間違えていたり、引数間違えていたりといったエラーが生じた際にも便利
  void sayHi() {
    System.out.println("[admin] hi! " + this.name);
  }
}

public class MyApp {

  public static void main(String[] args) {
    User tom = new User("tom"); // クラスの宣言とインスタンス化はこのように一行でできる
    System.out.println(tom.name); // Tom
    tom.sayHi(); // hi! Tom

    AdminUser bob = new AdminUser("bob"); // AdminUserクラスを使いたいので、UserとしていたところをAdminUserにしてあげる
    System.out.println(bob.name); // bob
    bob.sayHi(); // [admin] hi!bob 子クラスであるAdminUserでオーバーライドしたsayHiなのでUserクラスのsayHiとは別物
    bob.sayHello(); // hello! bob
  }

}
// final修飾子 クラス メソッド フィールドにも使うことができる変更ができなくなる修飾子

final class User { // クラスにfinalをつけるとこのクラスを継承できなくなる(今回はAdminUserクラスで継承できなくなりエラーが生じる)
  protected String name; // AdminUserメソッドでもnameフィールドを使っているのでprotectedになっていることにも注意(super(name);)
  private static final double VERSION = 1.1; // フィールドにつけるときはstaticと一緒に用いて(値が変更できない→staticをつけて一つだけのクラス変数にしてしまえば良いということ)、値が変更できない変数(つまり定数)を作れる(今回はコンストラクタで変更ができなくてエラーが生じる)。定数なので初期値をつけることと、慣習的に定数は全て大文字である点に注意する

  public User(String name) {
    this.name = name;
    User.VERSION = 1.2;
  }

  public final void sayHi() { // メソッドにfinalをつけるとこのメソッドをオーバーライドできなくなる(今回はAdminUserクラスでオーバーライドができなくてエラーが生じる)
    System.out.println("hi! " + this.name);
  }
}

class AdminUser extends User { // 今回の話しは継承にも関係するのでAdminUserが戻っている

  public AdminUser(String name) {
    super(name);
  }

  @Override // sayHiメソッドをオーバーライドしている状態(今回は継承にも関係しているから戻している)
  public void sayHi() {
    System.out.println("[admin] hi! " + this.name);
  }

}

public class MyApp27 {

  public static void main(String[] args) {
    User tom = new User("tom");
  }

}
class User { //User型に関するデータ型を作れば、Uer tomということができるようになる
  String name = "Me!"; // クラスの属する変数をフィールドと呼ぶ

  void sayHi() { //Userクラスのメソッド
    System.out.println("hi!");
  }
}

public class MyApp18 {

  public static void main(String[] args) {
    // int x;
    // String s;

    // Class
    User tom; // これだけだと参照型なのでメモリ領域にデータが作られていない
    tom = new User(); // メモリ領域にデータを置く(このようにnewを用いて行うことをインスタンス化するという(今回はtomをUserクラスのインスタンスにしている))
    System.out.println(tom.name); // Me!
    tom.sayHi(); // hi!
  }

}
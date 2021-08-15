// interface クラスの機能拡張する機能

interface Printable { //今回はprintableというインターフェイスを作って、どのクラスにも印刷機能を提供する
  // 定数
  double VERSION = 1.2; //public,static,finalは省略できるので省略している(バージョン管理)

  // 抽象メソッド
  void print(); //public,abstractは省略できるので省略している(後で実装)

  // defaultメソッド
  public default void getInfo() { //抽象メソッドとは異なり、defaultメソッドはここで実装できる
    System.out.println("I/F ver. " + Printable.VERSION); //インターフェイスのバージョンを表示
  }
  // staticメソッド(defaultメソッドが複雑になった時に、処理をまとめるヘルパー)
  //インターフェイスには、定数、抽象メソッド、defaultメソッド、staticメソッドが書ける
}

class User implements Printable { //Userクラスでインターフェイスを使う時は、implements インターフェイス名と後ろに書く
  @Override //Printableインターフェイスの定数やメソッドが使えるようになっている→オーバーライドができる
  public void print() { //抽象メソッドのオーバーライド
    System.out.println("Now printing user profile...");
  }
}

public class MyApp {

  public static void main(String[] args) {
    User tom = new User();
    tom.print(); //抽象メソッドをオーバーライドしたので使える
    tom.getInfo(); //defaultメソッドなので普通に使える
  }

}

//実行結果
//Now printing user profile...
//I/F ver. 1.2

//インターフェイスはクラスの継承とは違ってクラスにいくらでも適用できるので、クラスの拡張が柔軟にできる
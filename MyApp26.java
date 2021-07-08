// static

class User {
  private String name;
  private static int count; // クラス変数 初期値をstaticイニシャライザで書いていることに注意

  static { // staticイニシャライザ インスタンににおけるコンストラクタのように、クラスを使う前に何らかの初期化処理をしたいときに用いる。
    User.count = 0;
    System.out.println("Static initializer");
  } // ↑クラスが初期化される際に行われる処理を書いてあげている(主な使い方: クラス変数の初期化(配列も持ってくるなど複雑な処理を行う時に便利))

  { // インスタンスイニシャライザ //インスタンスイニシャライザはインスタンス化される前に動く(コンストラクタとのタイミングに注意)
    System.out.println("Instance initializer");
  }// ↑インスタンスが初期化される際に行われる処理を書いてあげている(主な使い方:
   // コンストラクタがオーバーロードされていて複数あった場合、共通処理をこっちに書いておいて先に実行しておくことができる)

  public User(String name) { // コンストラクタはインスタンス化された後に動く
    this.name = name;
    User.count++;
    System.out.println("Constructor");
  }

  public static void getInfo() { // クラスメソッド
    System.out.println("# of instances: " + User.count);
  }

}

public class MyApp {

  public static void main(String[] args) {
    User.getInfo(); // 0
    User tom = new User("tom");
    User.getInfo(); // 1
    User bob = new User("bob");
    User.getInfo(); // 2
  }

}

// Static initializer // Static initializerは最初に一回だけ実行される
// # of instances: 0
// Instance initializer //インスタンス化される前の処理
// Constructor //インスタンス化された後の処理
// # of instances: 1
// Instance initializer
// Constructor
// # of instances: 2
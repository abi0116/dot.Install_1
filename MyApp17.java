public class MyApp17 {

  public static void sayHi(String name) { //引数を持たせたsayHi
    // int x = 10; //この変数はこのメソッド内でしか使えないことに注意
    System.out.println("Hi! " + name);
  }

  // メソッドのoverload　引数の型や個数が違えば同じ名前のメソッドが作れる

  public static void sayHi() {  //引数を持たせないsayHi
    System.out.println("Hi! Nobody!");
  }

  public static void main(String[] args) {
    sayHi();// 引数がないsayHiが呼ばれる(オーバーロードが適用されている)
    sayHi("Steve"); // 引数がString型のsayHiが呼ばれる(オーバーロードが適用されている)
  }

}
// generics 汎用化されたデータ型でクラスやインターフェースを作ることができる

// class MyInteger { int型にしか対応していないメソッドなので使いにくい
//   public void getThree(int x) {
//     System.out.println(x);
//     System.out.println(x);
//     System.out.println(x);
//   }
// }

class MyData<T> { //どのデータ型にも対応したクラスを作る。<>内には汎用化する型をどう表現するか決める。
  public void getThree(T x) { //intをTにするだけよい。後は実行時に具体的なデータ型にするだけ
    System.out.println(x);
    System.out.println(x);
    System.out.println(x);
  }
}

public class MyApp33 {

  public static void main(String[] args) {
    // MyInteger mi = new MyInteger();
    // mi.getThree(55);
    MyData<Integer> i = new MyData<>(); //実行時に<参照型>で型を指定する必要がある
    i.getThree(32);
    MyData<String> s = new MyData<>(); //今度はInteger型じゃなくて、String型で実行できるか見てみる
    s.getThree("hello");
  }

}
//型を汎用化させることでスッキリとコードを書くことができるので、ジェネリクスの書き方にも慣れておく

//出力結果
/*
 32
 32
 32
 hello
 hello
 hello
*/
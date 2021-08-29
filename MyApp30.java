// 列挙型 定数をまとめたものが自分で作れる

enum Result { // {}の中に列挙型が用いる定数を入れてあげる(定数なので大文字)
  SUCCESS, // 0
  ERROR, // 1 最後の,はいらないけど追加したときにエラーにならないようにつけておく
}

public class MyApp30 {

  public static void main(String[] args) {
    Result res; //Result型の変数resを作った。この中にはSUCCESSかERRORしか入らない

    res = Result.ERROR; //変数resにResultのERRORを入れてあげるという意味

    switch (res) {
      case SUCCESS: //Result.SUCCESSとしなくていいことに注意
        System.out.println("OK!");
        System.out.println(res.ordinal()); // 出力 0  ordinal()は列挙型を定義すると自動で作られる
        break;
      case ERROR:
        System.out.println("NG!");
        System.out.println(res.ordinal()); // 1 ordinalには0から始まる連番がセットされる
        break;
    }

  }

}

//出力結果
//NG!
//1

//※列挙型は特殊なクラスとして扱われるので、今回のもの以外にもフィールドやメソッドも定義できる
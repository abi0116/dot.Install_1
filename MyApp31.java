// 例外

class MyException extends Exception { //独自の例外を設定したいときは、標準のExceptionクラスを継承してあげる
  public MyException(String s) { //コンストラクタでエラーメッセージを受け取ってあげる
    super(s); //親のコンストラクタの呼び出し
  }
}

public class MyApp31 {

  public static void div(int a, int b) {
    try { //例外が発生しそうな箇所をtryで囲う(今回はa/bで例外がでそうだからここ)
      if (b < 0) { //ｂが-だったらMyExceptionの例外を投げる(throw)
        throw new MyException("not minus!"); //インスタンスを作って、()内に独自のエラーメッセージを入れる
      }
      System.out.println(a / b);
    } catch (ArithmeticException e) { //例外をcatchしてあげる。それをeで受け取る。
      System.err.println(e.getMessage()); //エラーなので標準出力ではなく、エラー出力(System.err.println)
    } catch (MyException e) { //MyExceptionもcatchしてあげる。それをeで受け取る。
      System.err.println(e.getMessage());
    } finally { //例外の発生有無に関わらず、最後に何らかの処理がしたい場合は、finallyを使う
      System.out.println(" -- end -- ");
    }
  }

  public static void main(String[] args) {
    div(3, 0);
    div(5, -2);
  }

}

//例外処理無しのdivメソッドで0除算するとエラーが生じる
//エラーメッセージ
/*
 Exception in thread "main" java.lang.ArithmeticException: / by zero
          at MyApp31.div(MyApp.java:6)
          at MyApp31.main(MyApp.java:10)
*/
//このエラーメッセージから、ArithmeticExceptionを持ってくる

//出力結果
/*
 /by zero
  -- end --
 not minus!
  --end--
*/
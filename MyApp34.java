// Thread　
//コンピュータの処理単位のことで、これを複数立ち上げれば複数の処理を同時に実行させることができる。


class MyRunnable implements Runnable {
  @Override
  public void run() {
    for (int i = 0; i < 500; i++) {
      System.out.print('*');
    }
  }
}

public class MyApp34 {

  public static void main(String[] args) {
    MyRunnable r = new MyRunnable(); //MyRunnableのインスタンスを作る。
    Thread t = new Thread(r); //MyRunnable rのrをThreadに渡してあげる
    t.start();
    /*別のThreadの実装方法
    ①Thread処理を実行するために、Threadクラスのインスタンスを作ってあげて
     そちらのstartメソッドを呼んであげる。18,19行目。
    ②処理内容を書くために、Runnableというインターフェイスを実装したクラスを書いて
     new Thread();に対して渡してあげればよい。5~12行目、18行目。
    ③②を行うためのクラスを作る。
     MyRunnableクラスという名前でRunnableインターフェイスを実装する。
     Runnableの抽象メソッドはrun()なので、@overrideしてあげればいい。
     なので処理をpublic void run(){...}内に記載してあげる。7~11行目。
    ④MyRunnableのインスタンスを作ってあげる。
     その後、MyRunnable rのrをnew Thread();に渡してあげればよい。
    */

    for (int i = 0; i < 500; i++) { //これはmain()の方のThreadでの処理
      System.out.print('.');
    }
  }

}
//mainの処理もThread上で実行しているので、今回はもう一つThreadを作ってあげてる
//出力結果で.と*が同時に処理が走っていることがわかる。
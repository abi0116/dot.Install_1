public class MyApp15 {

  public static void main(String[] args) {
    // int x = 10;
    // int y = x;
    // y = 5;
    // System.out.println(x); //10
    // System.out.println(y); //5  基本データ型なのでデータの保存領域が扱いやすい

    // int[] a = {3, 5, 7};
    // int[] b = a; //注意　参照型はメモリ領域の番地が入る！！
    // b[1] = 8; //メモリ領域の番地が入っているので、bを変えるとaも変わってしまう(aとbは同じものを参照(共有)している))
    // System.out.println(a[1]); //8  基本データ型なら5が表示されていたが、配列は参照型なので8が表示されている
    // System.out.println(b[1]); //8

    String s = "hello";
    String t = s; //文字列Stringも参照型だが、基本データ型に近い扱いができるように調整が加えられている
    t = "world";
    System.out.println(s); //hello
    System.out.println(t); //world 文字列は変更が加えられないように調整されているので、基本データ型のような出力結果となる
  }

}
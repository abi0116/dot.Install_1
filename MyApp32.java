/*基本データ型にはそれに対応した参照型のクラスがある
Wrapper Class　こういうのをラッパークラスという　
int -> Integer  javaのクラスによっては参照型の引数しか受け付けないものがあるので変換できるようにしておく
double -> Double
*/

public class MyApp32 {

  public static void main(String[] args) { //基本データ型を代用するラッパークラスに変える
    // Integer i = new Integer(32); intのラッパークラスであるIntegerでiを宣言。32という基本データ型をラッパークラスにする。Integerクラスのインスタンスを作って基本データ型を渡してあげればよい
    // int n = i.intValue(); 逆にラッパークラスの値を基本データ型として取り出すには、int で受けてあげたいので「int n」としつつ、「i.intValue();」としてあげる。

    Integer i = 32; // auto boxing 上の一文目と同じことをやっている
    i = null; //どの場所も指し示さない状態にした。
    int n = i; // auto unboxing 下の一文目と同じことをやっている。ここで例外が生じる(上でnullにしたから)nullはアンボクシングができない
    //参照型のデータには値そのものではなくて、値が入っているメモリ領域の場所が入る、と説明してきましたが、どの場所も指し示していない状態にしたい場合には「null」という特殊な値を代入してあげます。
  }

}
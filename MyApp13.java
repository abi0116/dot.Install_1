public class MyApp13 {

  public static void main(String[] args) {
    // 配列
    // sales.length
    int[] sales = {700, 400, 500};

    // for (int i = 0; i < 3; i++) {
    // for (int i = 0; i < sales.length; i++) { //上の書き方より.lengthを使うことにより拡張性が増している
    //   System.out.println(sales[i]);
    // }

    for (int sale : sales) { //配列salesの要素を一つずつ取り出して、int型のsaleの代入してもらう(拡張for文)
      System.out.println(sale);
    }
    //配列ではなくリストに拡張for文を用いているものは39のArrayListを参照
  }

}
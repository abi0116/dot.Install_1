public class MyApp12 {

  public static void main(String[] args) {
    // 配列
    // sales1, sales2, ...
    // sales

    //配列の作り方1つめ
    // int[] sales;  //空の配列を用意
    // sales = new int[3];  //int型の物が三つ入るようにする
    // sales[0] = 100; //それぞれの場所に代入する
    // sales[1] = 200;
    // sales[2] = 300;

    //配列の作り方2つめ
    // int[] sales;  //上と同じように空の配列を用意
    // sales = new int[] {100, 200, 300};  //上の二行目以降をまとめた(要素が3つであることはわかりきっているので、この書き方ではint[3]とはしない)

    //配列の作り方3つめ
    int[] sales = {100, 200, 300};

    System.out.println(sales[1]); // 200
    sales[1] = 1000;
    System.out.println(sales[1]); // 1000
  }

}
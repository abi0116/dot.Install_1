public class MyApp7 {

  public static void main(String[] args) {
    // キャスト
    // double d = 52343.231;
    // int i = (int)d;  //(変換先のデータ型)とすることで変換が行える(キャストという)、今回の場合(int)がないと小数点以下が失われるけど大丈夫かというメッセージが出てしまう
    // System.out.println(i); //52343.231

    int i = 10;
    double d = (double)i / 4; //(double)がないと、int型を割っているので2.5ではなく2.0となってしまう
    System.out.println(d); //2.5
  }

}
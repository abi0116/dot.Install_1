public class MyApp10 {

  public static void main(String[] args) {
    // while
    // 0 - 9
    int i = 0;
    // while (i < 10) {
    //   System.out.println(i);  //0から9が順番に表示される
    //   i++; //++や--は単項演算子とも呼ばれている
    // }
    do {
      System.out.println(i);
      i++;
    } while (i < 10);  //doを用いたこっちの処理は先に処理をしてから判定を行うため、どんなに条件に沿っていなくても一回は処理がかかる
  }

}
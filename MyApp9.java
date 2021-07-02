public class MyApp9 {

  public static void main(String[] args) {
    // switch
    String signal = "green";
    switch (signal) {
      case "red":
        System.out.println("stop!");
        break;
      case "blue":
      case "green": //caseを二つ書くことで、blueとgreenの両方の条件で処理を行ってくれる(どちらかが該当していればtrueになる)
        System.out.println("go!");
        break;
      case "yellow":
        System.out.println("caution!");
        break;
      default:
        System.out.println("wrong signal!");
        break;
    }
  }
}
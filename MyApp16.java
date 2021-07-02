public class MyApp {

  // method

  // public static void sayHi() {
  // public static void sayHi(String name) {
  public static String sayHi(String name) { //returnなので返したい値に合わせてvoidをStringにする
    // System.out.println("Hi!");
    // System.out.println("Hi! " + name);
    return "Hi! " + name;
  }

  public static void main(String[] args) {
    // sayHi();
    // sayHi("Tom");
    // sayHi("Bob");
    String msg = sayHi("Steve"); //あたらいい変数に入れるワンクッション
    System.out.println(msg);
  }

}
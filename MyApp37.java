public class MyApp37 {

  public static void main(String[] args) {

    int score = 50;
    double height = 165.8;
    String name = "taguchi";

    System.out.printf("name: %s, score: %d, height: %f\n", name, score, height);
    System.out.printf("name: %-10s, score: %10d, height: %5.2f\n", name, score, height);

    String s = String.format("name: %10s, score: %-10d, height: %5.2f\n", name, score, height);
    System.out.println(s);
  }

}
// static修飾子 クラスをインスタンス化しなくても使えるようにしてくれる(クラスから直接使えるフィールドやメソッドを定義することができる)

class User {
  private String name;
  private static int count = 0; // staticなフィールドにすることで個々に値を持つのではなく、クラスに紐づいて値をもつ。staticを用いてクラスに属しているという意味でクラス変数という(インスタンス化してないcountがクラスから直接使える)

  public User(String name) {
    this.name = name;
    User.count++; // staticなフィールドに対してアクセスしている。カウントを増やしている
  }

  public static void getInfo() { // staticを付けたメソッドはクラスに属しているという意味で、クラスメソッドという
    System.out.println("# of instances: " + User.count);
  }

}

public class MyApp25 {

  public static void main(String[] args) {
    User.getInfo(); // # of instances: 0
    User tom = new User("tom"); // インスタンスを作成(一つめ)
    User.getInfo(); // # of instances: 1
    User bob = new User("bob"); // インスタンスを作成(二つめ)
    User.getInfo(); // # of instances: 2
  }

}
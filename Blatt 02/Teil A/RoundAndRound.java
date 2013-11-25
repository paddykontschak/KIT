public class RoundAndRound {
  public static void main(String[] args) {
    Circle circle1 = new Circle(5.1);
    Circle circle2 = new Circle(20.1);
    Circle circle3 = new Circle(7.9);

    Cone cone1 = new Cone(5.1, 10.3);
    Cone cone2 = new Cone(circle2, 7.9);

    System.out.println("-- Circle1 --\n" + circle1 + "\n");
    System.out.println("-- Circle2 --\n" + circle2 + "\n");
    System.out.println("-- Circle3 --\n" + circle3 + "\n");

    System.out.println("-- Cone1 --\n" + cone1 + "\n");
    System.out.println("-- Cone2 --\n" + cone2);
  }
}
public class RoundAndRound2 {
  public static void main(String[] args) {
    Circle2 circle1 = new Circle2(5.1);
    Circle2 circle2 = new Circle2(20.1);
    Circle2 circle3 = new Circle2(7.9);

    Cone2 cone1 = new Cone2(5.1, 10.3);
    Cone2 cone2 = new Cone2(circle2, 7.9);

    System.out.println("-- Circle1 --\n" + circle1 + "\n");
    System.out.println("-- Circle2 --\n" + circle2 + "\n");
    System.out.println("-- Circle3 --\n" + circle3 + "\n");

    System.out.println("-- Cone1 --\n" + cone1 + "\n");
    System.out.println("-- Cone2 --\n" + cone2);
  }
}
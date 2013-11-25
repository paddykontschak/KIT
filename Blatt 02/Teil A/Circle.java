public class Circle {
  double radius;
  double diameter;
  double circumference;
  double area;

  public Circle(double r) {
    setRadius(r);
    setDiameter(r);
    this.circumference = 2 * Math.PI * radius;
    this.area = Math.PI * Math.pow(radius, radius);
  }

  public void setRadius(double r) {
    this.radius = r;
  }

  public void setDiameter(double r) {
    this.diameter = r * 2;
  }

  public String toString() {
    return    "Radius: " + radius
        + "\nDiameter: " + diameter
   + "\nCircumference: " + circumference
            + "\nArea: " + area;
  }
}
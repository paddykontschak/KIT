public class Circle2 {
  double radius;
  double diameter;
  double circumference;
  double area;

  public Circle2(double r) {
    setRadius(r);
  }

  public void setRadius(double r) {
    this.radius = r;
  }

  public double getDiameter() {
    return radius * 2;
  }
  
  public double getCircumference() {
    return 2 * Math.PI * radius;
  }
  
  public double getArea() {
    return Math.PI * Math.pow(radius, radius);
  }

  public String toString() {
    return "Radius: " + radius + "\nDiameter: " + diameter + "\nCircumference: " + circumference + "\nArea: " + area;
  }
}
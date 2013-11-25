class Cone {
  Circle base;
  double radius;
  double height;
  double volume;
  double surface;

  public Cone(double r, double h) {
    base = new Circle(r);
    setRadius(r);
    setHeight(h);
    this.volume = (base.area * height) / 3;
    this.surface = base.area + Math.PI * radius * Math.sqrt(Math.pow(radius, radius));
  }

  public Cone(Circle b, double h) {
    base = b;
    setRadius(b.radius);
    setHeight(h);
    this.volume = (base.area * height) / 3;
    this.surface = base.area + Math.PI * radius * Math.sqrt(Math.pow(radius, radius));
  }

  public void setRadius(double r) {
    this.radius = r;
  }

  public void setHeight(double h) {
    this.height = h;
  }

  public String toString() {
    return "Base: {\n" + base
      + " }\nRadius: " + radius
        + "\nHeight: " + height
        + "\nVolume: " + volume
  + "\nSurface Area: " + surface;
  }
}
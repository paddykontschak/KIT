class Cone2 {
  Circle2 base;
  double radius;
  double height;
  double volume;
  double surface;

  public Cone2(double r, double h) {
    base = new Circle2(r);
    setRadius(r);
    setHeight(h);
    setVolume(h);
    setSurface(r);
  }

  public Cone2(Circle2 b, double h) {
    base = b;
    setRadius(b.radius);
    setHeight(h);
    setVolume(h);
    setSurface(b.radius);
  }

  public void setRadius(double r) {
    this.radius = r;
  }

  public void setHeight(double h) {
    this.height = h;
  }
  
  public void setVolume(double h) {
    this.volume = (base.area * height) / 3;
  }
  
  public void setSurface(double r) {
    this.surface = base.area + Math.PI * radius * Math.sqrt(Math.pow(radius, radius));
  }
  
  public double getRadius() {
    return radius;
  }
  
  public double getHeight() {
    return height;
  }
  
  public double getVolume() {
    return volume;
  }
  
  public double getSurface() {
    return surface;
  }

  public String toString() {
    return "Base: {\n" + base
      + " }\nRadius: " + radius
        + "\nHeight: " + height
        + "\nVolume: " + volume
  + "\nSurface Area: " + surface;
  }
}
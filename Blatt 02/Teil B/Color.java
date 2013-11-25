public enum Color {
  GREEN(1), BLUE(2), RED(3);

  Color(int color) {
    this.color = color;
  }

  private int color;

  public int getColor() {
      return color;
  }
}
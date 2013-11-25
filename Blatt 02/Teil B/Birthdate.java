public class Birthdate {
  int day;
  int month;
  int year;
  
  public Birthdate(int d, int m, int y) {
    this.day = d;
    this.month = m;
    this.year = y;
  }
  
  public String toString() {
    return day + "." + month + "." + year;
  }
}
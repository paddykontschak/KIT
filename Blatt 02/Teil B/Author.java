public class Author {
  String name;
  Birthdate birthdate;
  Gender gender;
  AuthorPreferences preferences;
  
  public Author(String n, int d, int m, int y, Gender g, Color c, String a, String b, String f, String s) {
    /**
      a = animal
      b = book
      c = color
      d = day
      f = movie/film
      g = gender
      m = month
      n = name
      s = song
      y = year
    **/
    this.name = n;
    this.birthdate = new Birthdate(d, m, y);
    this.gender = g;
    this.preferences = new AuthorPreferences(c, a, b, f, s);
  }
  
  public String toString() {
    return name + ", " + birthdate + ", " + gender + "\n  " + preferences;
  }
}
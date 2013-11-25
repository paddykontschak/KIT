public class FriendbookEntry {
  Author author;
  String wishes;
  boolean empty;
  
  public FriendbookEntry() {
    this.empty = true;
  }
  
  public FriendbookEntry(String n, String w, int d, int m, int y, Gender g, Color c, String a, String b, String f, String s) {
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
      w = wish
      y = year
    **/
    this.author = new Author(n, d, m, y, g, c, a, b, f, s);
    this.wishes = w;
  }
  
  public String toString() {
    if (empty) {
      return "Empty entry. Write something...";
    }
    return wishes + "\"\n- " + author;
  }
}
public class AuthorPreferences {
  Color color;
  String animal;
  String book;
  String movie;
  String song;
  
  public AuthorPreferences(Color c, String a, String b, String f, String s) {
    this.color = c;
    this.animal = a;
    this.book = b;
    this.movie = f;
    this.song = s;
  }
  
  public String toString() {
    return "Favorite...\n"
            + "   color: " + color + "\n"
           + "   animal: " + animal + "\n"
             + "   book: " + book + "\n"
            + "   movie: " + movie + "\n"
             + "   song: " + song;
  }
}
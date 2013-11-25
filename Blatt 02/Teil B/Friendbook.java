public class Friendbook {
  String owner;
  
  public Friendbook(String o) {
    this.owner = o;
  }
  
  public String toString() {
    return owner;
  }
  
  public static void main(String[] args) {
    Friendbook friendbook = new Friendbook("Patrick Kontschak");
    FriendbookEntry entry1 = new FriendbookEntry("Patrick", "Something something dark side",
                                                  15, 03, 1989, Gender.MALE, Color.GREEN,
                                                  "cats", "One Piece Mangas",
                                                  "Tenacious D - Pick Of Destiny",
                                                  "Flogging Molly - Devil's Dance Floor");
    FriendbookEntry entry2 = new FriendbookEntry();
    FriendbookEntry entry3 = new FriendbookEntry();
    FriendbookEntry entry4 = new FriendbookEntry();
    FriendbookEntry entry5 = new FriendbookEntry();
    System.out.println("This friendbook belongs to: " + friendbook + "\n\n\"" + entry1
                                                                     + "\n\n" + entry2
                                                                     + "\n\n" + entry3
                                                                     + "\n\n" + entry4
                                                                     + "\n\n" + entry5);
  }
}
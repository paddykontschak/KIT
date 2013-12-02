class FriendbookEntry {
    Author author;
    String bestWishes;

    public FriendbookEntry(Author author) {
    	this(author, "");
    }

    public FriendbookEntry(Author author, String bestWishes) {
    	this.author = author;
    	this.bestWishes = bestWishes;
    }
}

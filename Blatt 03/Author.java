class Author {
    String name;
    Sex sex;
    Birthdate birthdate;
    AuthorPreferences preferences;

    public Author(String name, Sex sex, Birthdate birthdate) {
    	this(name, sex, birthdate, new AuthorPreferences(Color.BLUE, "", "", "", ""));
    }

    public Author(String name, Sex sex, Birthdate birthdate, AuthorPreferences preferences) {
    	this.name = name;
    	this.sex = sex;
    	this.birthdate = birthdate;
    	this.preferences = preferences;
    }

}

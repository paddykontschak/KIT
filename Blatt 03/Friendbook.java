class Friendbook {
    String owner;

    FriendbookEntry entry1 = null;
    FriendbookEntry entry2 = null;
    FriendbookEntry entry3 = null;
    FriendbookEntry entry4 = null;
    FriendbookEntry entry5 = null;

    public Friendbook(String owner) {
    	this.owner = owner;
    }

    public Color getFavoriteColor() {
    	ColorCounter counter = new ColorCounter();

    	if (entry1 != null) {
    		counter.add(entry1.author.preferences.favColor);
    	}
    	if (entry2 != null) {
    		counter.add(entry2.author.preferences.favColor);
    	}
    	if (entry3 != null) {
    		counter.add(entry3.author.preferences.favColor);
    	}
    	if (entry4 != null) {
    		counter.add(entry4.author.preferences.favColor);
    	}
    	if (entry5 != null) {
    		counter.add(entry5.author.preferences.favColor);
    	}

    	return counter.getFavoriteColor();
    }

    public double getWomensQuota() {
        int sum = 0;
        int total = 5;
        if (entry1 == null) {
			total--;
		} else if (entry1.author.sex == Sex.FEMALE) {
			sum++;
		}
        if (entry2 == null) {
			total--;
		} else if (entry2.author.sex == Sex.FEMALE) {
			sum++;
		}
        if (entry3 == null) {
			total--;
		} else if (entry3.author.sex == Sex.FEMALE) {
			sum++;
		}
        if (entry4 == null) {
			total--;
		} else if (entry4.author.sex == Sex.FEMALE) {
			sum++;
		}
        if (entry5 == null) {
			total--;
		} else if (entry5.author.sex == Sex.FEMALE) {
			sum++;
		}
		if (total > 0) {
			return (100.0 * sum) / total;
		} else {
			return 100.0;
		}
    }
}

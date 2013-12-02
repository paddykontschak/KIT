class Birthdate {
    int day;
    int month;
    int year;

    public Birthdate(int day, int month, int year) {
    	this.day = day;
    	this.month = month;
    	this.year = year;
    }

    Weekday getWeekday() {
        int y = year - (14 - month) / 12;
        int x = y + y / 4 - y / 100 + y / 400;
        int m = month + 12 * ((14 - month) / 12) - 2;
        int d = (day + x + (31 * m) / 12) % 7;

        switch (d) {
        case 0: return Weekday.SUNDAY;
        case 1: return Weekday.MONDAY;
        case 2: return Weekday.TUESDAY;
        case 3: return Weekday.WEDNESDAY;
        case 4: return Weekday.THURSDAY;
        case 5: return Weekday.FRIDAY;
        case 6: return Weekday.SATURDAY;
        default: return null; // should never be hit
        }
    }
}

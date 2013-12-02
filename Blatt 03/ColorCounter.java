
public class ColorCounter {
	int redCount = 0;
	int greenCount = 0;
	int blueCount = 0;
	
	public ColorCounter() {	}

	public void add(Color color) {
		switch (color) {
        case RED:
            redCount++;
            break;
        case GREEN:
            greenCount++;
            break;
        case BLUE:
            blueCount++;
            break;
        default:
            // should never be reached
		}
	}

	public Color getFavoriteColor() {
        Color mostFavouriteColor = null;

    	if (redCount > greenCount) {
            if (blueCount > redCount) {
                mostFavouriteColor = Color.BLUE;
            } else {
                mostFavouriteColor = Color.RED;
            }
        } else {
            if (blueCount > greenCount) {
                mostFavouriteColor = Color.BLUE;
            } else {
                mostFavouriteColor = Color.GREEN;
            }
        }

        return mostFavouriteColor;
	}
}

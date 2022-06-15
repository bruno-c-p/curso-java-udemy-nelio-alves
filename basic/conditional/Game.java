package basic.conditional;

import utils.Messages;

public class Game {

    /*
     * Read the start time and end time of a game. 
     * Then calculate the duration of the game,
     * knowing that it can start on one day and finish on another, 
     * with a minimum duration of 1 hour and a maximum of 24 hours.
     */

    public static void main(String[] args) {

        int initialHour = Messages.readInt("Initial Hour: ");
        int endHour = Messages.readInt("End Hour: ");

        int gameTime = 0;

		if (initialHour < endHour) {

			gameTime = endHour - initialHour;

		} else {

			gameTime = 24 - initialHour + endHour; 
		}

        Messages.showMSG(" " + gameTime);
    }
}

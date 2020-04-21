/** @author Amanuel
*/

public class Rewards {

    public int points;

    /**
     * @param points int to record current point level
     */
    public Rewards(int points) {
        //TODO: constructor definition
        this.points = points;


    }

    /**
     * @return String of possible choices
     */
    public String showRewards() {
        //TODO: showRewards definition
        String option = "";
        if (points < 100 && points >= 50) {
            option = "1) free coffee - 50 pts.";

        } else if (points < 200) {
            option = "1) free coffee - 50 pts. \n 2) free baked goods - 100 pts.";
        } else if (points < 5000) {
            option = "1) free coffee - 50 pts. \n 2) free baked goods - 100 pts. \n 3) free specialty coffee - 200 pts.";
        } else if (points >= 5000) {
            option = "1) free coffee - 50 pts. \n 2) free baked goods - 100 pts. \n 3) free specialty coffee - 200. \n 4)1% store ownership. - 5000 pts.";
        }
        return option;

    }

    /**
     * @param choice int to
     * @return String reward chosen
     */
    public String getReward(int choice) {
        //TODO: getReward definition
        if (choice == 1) {
            if (points >= 50) {
                points -= 50;
                return "you have selected a free coffee.";
            }
        } else if (choice == 2) {
            if (points >= 100) {
                points -= 100;
                return "you have selcted a free baked goods.";
            }

        } else if (choice == 3) {
            if (points >= 200) {
                points -= 200;
                return "you have selected a free specialty coffee.";
            }
        } else if (choice == 4) {
            if (points >= 5000) {
                points -= 5000;
                return "you have selected a 1% store ownership.";

            }
        }
            return "You do not have enough points for that reward.";

    }

}

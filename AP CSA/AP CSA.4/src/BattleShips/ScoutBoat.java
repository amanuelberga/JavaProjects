package BattleShips;
import java.util.Random;
public abstract class ScoutBoat extends Boat{
    public ScoutBoat(int team, Coordinates location, int direction, int health, int vision) {
        super(team, location, direction, health, 1, vision);
    }

//    @Override
//    public String getID() {
//        return null;
//    }
//
//    @Override
//    public String act(int[] array, World world) {
//        return null;
//    }
//
//    @Override
//    public String getActions() {
//        return null;
//    }
    public String takeHit(int a){
        double b = Math.random();
        if(b==0.25){
            return super.toString()+" takes " + a + "damage.";
        }
        return super.toString() + " has avoided the attack!";
    }
}

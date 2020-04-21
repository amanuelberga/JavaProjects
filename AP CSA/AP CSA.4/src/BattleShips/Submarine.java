package BattleShips;

public class Submarine extends ScoutBoat implements Attacker {
    private int numOfTorpedoes;
    public Submarine(int team, Coordinates location, int direction) {
        super(team, location, direction, 3, 2);

    }

    //@Override
    public String attack(World w) {
        if(numOfTorpedoes>0){
            return "Fire torpedoes!";
        }else if(numOfTorpedoes<=0){
            return "S1 has no torpedoes remaining.";
        }
        return "There are no boats in range currently.";
    }

    //@Override
    public String getID() {
        return "S"+getTeam();
    }

   // @Override
    public String act(int[] array, World world) {
        for(int i=0; i<array.length; i++){
            if(array[i]==1){
                move(world);
                move(world);
                return "move";
            }else if(array[i]==2){
                turn(-1);
                return "turn left";
            }else if(array[i]==3){
                turn(1);
                return "turn right";
            }else if(array[i]==4){
                submerge(world);
                return "submerge";
            }else if(array[i]==5){
                attack(world);
                return "Fire torpedoes";
            }
        }
        return "";
    }

    public String submerge(World w){
        Coordinates a = getLocation();
        move(w);
        move(w);
        return getID() + " moves from " + a + " to " + getLocation();
    }

   /// @Override
    public String getActions() {
        return "Choose any of the following actions for the Cruiser:\n 1. Move\n 2. Turn left\n 3. Turn right\n 4. Submerge\n 5. Fire torpedoes";
    }
}

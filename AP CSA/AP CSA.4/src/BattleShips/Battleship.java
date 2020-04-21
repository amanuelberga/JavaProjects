package BattleShips;

public class Battleship extends Boat implements Attacker {
    public Battleship(int team, Coordinates location, int direction) {
        super(team, location, direction, 4, 3, 1);
    }

    //@Override
    public String attack(World w) {
        return null;
    }

    //@Override
    public String getID() {
        return "B"+getTeam();
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
                attack(world);
                return "Attack";
            }
        }
        return "";
    }

   // @Override
    public String getActions() {
        return "Choose any of the following actions for the Battleship:\n 1. Move\n 2. Turn left\n 3. Turn right\n 4. Attack";

    }
}

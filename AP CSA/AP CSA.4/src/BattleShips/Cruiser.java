package BattleShips;

public class Cruiser extends ScoutBoat{
    public Cruiser(int team, Coordinates location, int direction) {
        super(team, location, direction, 3, 3);

    }


    public String getID() {
        return "C";
    }


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
            }
        }
        return "";
    }


    public String getActions() {
        return "Choose any of the following actions for the Cruiser:\n 1. Move\n 2. Turn left\n 3. Turn right";
    }
}

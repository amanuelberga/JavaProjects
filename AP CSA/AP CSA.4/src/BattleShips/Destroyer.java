package BattleShips;

public class Destroyer extends Boat implements Attacker{
    public Destroyer(int team, Coordinates location, int direction) {
        super(team, location, direction, 2, 2, 1);
    }

    //@Override
    public String attack(World w) {
        return takeHit(getVision());
    }

    //@Override
    public String getID() {
        return "D" + getTeam();
    }

    //@Override
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

    //@Override
    public String getActions() {
        return "Choose any of the following actions for the Destroyer:\n 1. Move\n 2. Turn left\n 3. Turn right\n 4. Attack";
    }

   // @Override
    public String takeHit(int c) {
        return super.takeHit(c);
    }
}

package BattleShips;

public class AircraftCarrier extends Boat implements Attacker{
    private boolean hasPlanes;

    public AircraftCarrier(int team, Coordinates location, int direction) {
        super(team, location, direction, 5,1,1);
        hasPlanes=true;
    }

    //@Override

    //@Override
    public String getID() {
        return "A" + getTeam();
    }

   // @Override
    public String act(int[] choices, World w) {
        String results = "";
        for(int i=0; i<choices.length; i++){
            if(choices[i]==1){
                results+=move(w)+"\n";
            }else if(choices[i]==2){
                results += turn(-1) +"\n";
            }else if(choices[i]==3){
                results += turn(1) + "\n";
            }else{
                results += attack(w) + "\n";
            }
        }
        return results;
    }

    //@Override
    public String getActions() {
        return "Choose any of the following actions for the Cruiser:\n 1. Move\n 2. Turn left\n 3. Turn right\n 4. Launchplanes";
    }
    public String attack(World w) {
        return null;
    }

}

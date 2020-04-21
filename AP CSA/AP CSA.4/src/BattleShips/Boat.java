package BattleShips;

public abstract class Boat {
    private int team;
    private Coordinates location;
    private int direction;
    private int health;
    private int strength;
    private int vision;

    public Boat(int team, Coordinates location, int direction, int health, int strength, int vision){
        this.team = team;
        this.location = location;
        this.direction = direction;
        this.health = health;
        this.strength = strength;
        this.vision = vision;
    }
    public abstract String getID();
    public abstract String act(int [] array, World world);
    public abstract String getActions();


    public int getDirection() {
        int v=0;
        if(World.NORTH==direction){
            v = 8593;
            return v;
        }
        else if(World.SOUTH==direction){
            v = 8595;
            return v;
        }
        else if(World.EAST==direction){
            v = 8594;
            return v;
        }
        else if(World.WEST==direction){
            v = 8592;
            return v;
        }
        else if(World.NORTHWEST==direction){
            v = 8598;
            return v;
        }
        else if(World.NORTHEAST==direction){
            v = 8599;
            return v;
        }
        else if(World.SOUTHEAST==direction){
            v = 8600;
            return v;
        }
        else if(World.SOUTHWEST==direction){
            v = 8601;
            return v;
        }
        return v;

    }

    public Coordinates getLocation() {
        return location;
    }

    public int getHealth() {
        return health;
    }

    public int getTeam() {
        return team;
    }

    public int getVision() {
        return vision;
    }

    public int getStrength() {
        return strength;
    }

    public String move(World w){
            Coordinates des = w.getAdjacentLocation(location,direction);
            if(des!=null){
                if(!w.isLocationOccupied(des)) {
                    w.setOccupant(w.getOccupant(location), des);
                    w.setOccupant(null, location);
                    Coordinates a = location;
                    this.setLocation(des);
                    //location.setCoordinates();
                    return getID() + " moves from " + a.toString() + " to " + des.toString() + ".";
                }if (w.isLocationOccupied(des)){
                    return  getID()+" cannot move to "+des.toString()+ " as it is occupied.";
                }
            }
            return getID() + " cannot move off the map.";
    }

    public String turn(int rep){
        if(rep==1){
            if(direction==7)
                direction=0;
            else
            direction+=1;

            return team +" turned right, now facing " + getDirection();

        }
        if(rep==-1) {
            if(direction==0)
                direction=7;
            else
            direction-=1;

            return team + " turned left, now facing " + getDirection();
        }
        return "";
    }
    public String takeHit(int c){
        if(c>health){
            health=0;
            return getID() + " has been sunk!";
        }else{
            health-=c;
            return getID() + " takes " + c+ "damage.";
        }
    }

    public void setLocation(Coordinates location) {
        this.location = location;
    }

    ///@Override
    public String toString() {
        return getID() + team;
    }
}


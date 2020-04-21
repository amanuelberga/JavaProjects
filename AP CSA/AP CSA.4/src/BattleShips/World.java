package BattleShips;

public class World {
    public static final int NORTH = 0;
    public static final int NORTHEAST = 1;
    public static final int EAST = 2;
    public static final int SOUTHEAST = 3;
    public static final int SOUTH = 4;
    public static final int SOUTHWEST = 5;
    public static final int WEST = 6;
    public static final int NORTHWEST = 7;
    private Boat [][] map;

    public World(int width, int height) {
        if(width<4){
            width=4;
        }else if(width>10){
            width=10;
        }
        if(height<4){
            height=4;
        }else if(height>10){
            height=10;
        }
        map = new Boat[width][height];
        for (int i = 0; i < map.length; i++) {
           // map[i] = null;
            for (int j = 0; j < map[i].length; j++) {
                map[i][j] = null;
            }
        }
    }

    public int getWidth() {
        return map[0].length;
    }

    public int getHeight() {
        return map.length;
    }
    public Boat getOccupant(Coordinates aman) {
        for (int i = 0; i < map.length; i++) {
            if(i==aman.getY()) {
                for (int j = 0; j < map[i].length; j++) {
                    if (map[i][j] != null) {
                        if (j == aman.getX()) {
                            return map[i][j];
                        }
                    }
                }
            }
        }
        return null;
    }

    public boolean isLocationValid(Coordinates aman) {
        if(aman.getX()<getWidth()&&aman.getY()<getHeight()){
            return true;
        }
        return false;
    }

    public boolean isLocationOccupied(Coordinates L) {
        if (map[L.getX()][L.getY()] != null) {
            return true;
        }
        return false;
    }


    public boolean setOccupant(Boat a, Coordinates aman) {
        if ( isLocationValid(aman)&& !isLocationOccupied(aman)) {
            map[aman.getX()][aman.getY()]=a;
            //map[aman.getX()][aman.getY()] = a;
            return true;
        }else{
            return false;
        }

    }

    public Coordinates getAdjacentLocation(Coordinates aman, int a) {
        Coordinates b = new Coordinates();
        if(isLocationValid(aman)) {
            if (a == NORTH) {
                b.setCoordinates(aman.getX() - 1, aman.getY());
                if(isLocationValid(b)) {
                    return b;
                }


            } else if (a == NORTHEAST) {
                b.setCoordinates(aman.getX() - 1, aman.getY() + 1);
                if(isLocationValid(b)) {
                    return b;
                }

            } else if (a == EAST) {
                b.setCoordinates(aman.getX(), aman.getY() + 1);
                if(isLocationValid(b)) {
                    return b;
                }
            } else if (a == SOUTHEAST) {
                b.setCoordinates(aman.getX() + 1, aman.getY() + 1);
                if(isLocationValid(b)) {
                    return b;
                }
            } else if (a == SOUTH) {
                b.setCoordinates(aman.getX() + 1, aman.getY());
                if(isLocationValid(b)) {
                    return b;
                }
            } else if (a == SOUTHWEST) {
                b.setCoordinates(aman.getX() + 1, aman.getY() - 1);
                if(isLocationValid(b)) {
                    return b;
                }
            } else if (a == WEST) {
                b.setCoordinates(aman.getX(), aman.getY() - 1);
                if(isLocationValid(b)) {
                    return b;
                }
            } else if (a == NORTHWEST) {
                b.setCoordinates(aman.getX() - 1, aman.getY() - 1);
                if(isLocationValid(b)) {
                    return b;
                }
            }
            return null;
        }
            return null;
    }
    public String drawTeamMap(Boat[] teamBoats, int view)
    {
       String [][] drawMap = new String[map.length][map[0].length];
       int i,j,k;
       for( i=0; i<drawMap.length; i++){
           for(j=0; j<drawMap[0].length; j++){
               drawMap[i][j] = "###";
           }
       }
       if(view==2 || view==3){
           for(i=0; i< teamBoats.length; i++){

               int y= teamBoats[i].getLocation().getY();
               int x = teamBoats[i].getLocation().getX();
               int vis = teamBoats[i].getVision();
               for(k=y; k<=vis+y;k++){
                   for(j=x; j<=vis+x; j++){
                       Coordinates c = new Coordinates(j,k);
                       if(isLocationValid(c)){
                           if(!isLocationOccupied(c)){
                               drawMap [k] [j] = "~~~";
                           }else if(view ==2){
                               Boat b = getOccupant(c);

                               drawMap[k][j] = (char)b.getDirection()+ b.toString();
                           }else if(view==3){
                               Boat b = getOccupant(c);
                               drawMap[k][j] = b.getHealth() + b.toString();
                           }
                       }
                   }
               }
           }
       }String str = "";
        for (int y = -1; y < this.getHeight(); y++)
        {

            str += (char)(y + 65) + " ";
            int x;
            for (x = 0; x < this.getWidth(); x++)
            {
                if (y == -1)
                {
                    str += " " + x + " ";
                }
                else
                {
                    str += drawMap[y][x];
                }
            }


            str += "\n";
        }

        return str;
    }


}



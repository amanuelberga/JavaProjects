package BattleShips;

public class Coordinates {
    private int x;
    private int y;
    public Coordinates(){
        x=0;
        y=0;
    }

    public Coordinates(int x, int y){
        setCoordinates(x,y);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setCoordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //@Override
    public String toString() {
        char a='A';
        char [] alpha = {'A','B', 'C', 'D','E','F','G','H','I','J','K','L','M', 'N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        for(int i =0; i<alpha.length; i++){
            if(i==x){
                a=alpha[i];
            }
        }
        return a+""+y;
    }
}

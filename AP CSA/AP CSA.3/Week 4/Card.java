public class Card implements Comparable<Card>{

    private String name;
    private String nationality;
    private int  yearBorn;
    private int yearDied;

    Card(String name, String nationality, int yearBorn, int yearDied){
        this.name = name;
        this.nationality = nationality;
        this.yearBorn = yearBorn;
        this.yearDied = yearDied;
    }

    public int compareTo(Card e){
        if(this.name.charAt(0)>e.name.charAt(0)){return 1;}
        else if(this.name.charAt(0)<e.name.charAt(0)){return -1;}
        return 0;
    }

    public String toString(){
        return name + " (" + yearBorn +"-"+yearDied+") - " + nationality;
    }
}

package FocusAman;


public class Hacker {
    private String name;
    private int age;
    private String pc;
    public Hacker(String name, int age, String pc){
        this.name = name;
        this.age = age;
        this.pc = pc;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPc() {
        return pc;
    }
    public void checkifHacker(){

    }
//make sure hacker has a windows pc
    public String toString() {
        return name + " is a now a " + age + " Hacker with a " + pc +"!!!!";
    }
}

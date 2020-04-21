package Phone;

public class Phone {
    private int areaCode;
    private int prefix;
    private int lineNumber;
    public Phone(int ac, int p, int ln) {
        areaCode = ((ac > 0 && ac < 1000) ? ac : 555);
        prefix = ((p > 0 && p < 1000) ? p : 555);
        lineNumber = ((ln > 0 && ln < 10000) ? ln : 5555);
    }
    public String makeCall(Phone p) {
        return "Dialing " + p.toString();
    }
    public String toString() {
        return "" + areaCode + "-" + prefix + "-" + lineNumber;
    }

    public static void main(String [] args){
        Phone p = new Phone(765,999,1234);
        CellPhone cp = new CellPhone(858,346,6430, 40.427437, -86.916979);
        //PayPhone pp = new PayPhone(212,840,9623,0.5);
        System.out.println(p);
        System.out.println(p.makeCall(cp));
        System.out.println(cp.makeCall(p));
        System.out.println(cp.getLatitude());
        p = cp;
        System.out.println(p);
    }
}



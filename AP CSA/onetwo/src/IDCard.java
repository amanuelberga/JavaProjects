class IDCard {
    private String mName;
    private int mID;
     
    public IDCard() {
        mName = "";
        mID = -1;
    }
    public IDCard(String name, int ID) {
        mName = name;
        mID = ID;
    }
    public String getName() {
        return mName;
    }
    public void setName(String name) {
        mName = name;
    }

    public static void main (String[] args) {
        IDCard test = new IDCard();
    }
}
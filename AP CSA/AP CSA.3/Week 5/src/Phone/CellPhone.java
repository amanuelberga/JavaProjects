package Phone;

public class CellPhone extends Phone {
    private double longitude;
    private double latitude;
    public CellPhone(int ac, int p, int ln, double lat, double lng) {
        super(ac, p, ln);
        latitude = lat;
        longitude = lng;
    }
    public void updateLocation() {
        // uses GPS to get the updated values for longitude and latitude
    }
    public double getLongitude() {
        return longitude;
    }
    public double getLatitude() {
        return latitude;
    }
    public String toString() {
        String s = super.toString();
        return s + "; (" + longitude + ", " + latitude + ")";
    }
}

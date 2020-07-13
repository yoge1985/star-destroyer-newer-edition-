package Supporting;

public class Location {

    //position of star destroyer
    private static int x;
    private static int y;
    private static int z;

    public Location(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static int getX() {
        return x;
    }

    public static int getY() {
        return y;
    }

    public static int getZ() {
        return z;
    }

    public static void setX(int x) {
        Location.x = x;
    }

    public static void setY(int y) {
        Location.y = y;
    }

    public static void setZ(int z) {
        Location.z = z;
    }
}

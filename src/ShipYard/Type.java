package ShipYard;

import Supporting.Location;

public class Type {

    public IType type;
    private Location location;

    public Type(IType type, Location location) {
        this.type = type;
        this.location = location;
    }
}

package PlanetsAndMoons;

public abstract class OrbitalObject {
    private String name;
    private Object inOrbitOf;
    private double Distance;
    private String type;

    public OrbitalObject (String name){
        this.name = name;
    }
    public OrbitalObject(String name, Object inOrbitOf, double distance, String type) {
        this.name = name;
        this.inOrbitOf = inOrbitOf;
        Distance = distance;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getInOrbitOf() {
        return inOrbitOf;
    }

    public void setInOrbitOf(String inOrbitOf) {
        this.inOrbitOf = inOrbitOf;
    }

    public double getDistance() {
        return Distance;
    }

    public void setDistance(double distance) {
        Distance = distance;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
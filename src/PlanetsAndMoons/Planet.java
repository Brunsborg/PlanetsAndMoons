package PlanetsAndMoons;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Planet extends OrbitalObject{
    ArrayList<Moon> moons = new ArrayList<>();

    public Planet(String name, OrbitalObject inOrbitOf, double distance, String type) {
        super(name, inOrbitOf, distance, type);
    }

    public int numberOfMoons(){
        return moons.size();
    }

    public double distanceBetweenPlanets(Planet planet){
        double point1 = this.getDistance();
        double point2 = planet.getDistance();
        double distance;
        if (point1 > point2){
            distance = (point1 - point2);
        }
        else if(point1 < point2){
            distance = point2 - point1;
        }
        else{
            distance = 0;
            System.out.println("Failure");
        }
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println(df.format(distance));
        return distance;
    }

}
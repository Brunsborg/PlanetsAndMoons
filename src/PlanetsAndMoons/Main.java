package PlanetsAndMoons;

public class Main {

    public static void main(String[] args) {
	OrbitalObject sun = new Star("sun");
	Planet earth = new Planet("Earth", sun, 93.5, "Terrestrial");
	Planet mars = new Planet("Mars", sun, 149.6, "Terrestrial");
	Moon moon = new Moon("Moon", earth, 0.3844, "Terrestrial");
	earth.moons.add(moon);
	System.out.println(earth.numberOfMoons());
	earth.distanceBetweenPlanets(mars);
    }
}

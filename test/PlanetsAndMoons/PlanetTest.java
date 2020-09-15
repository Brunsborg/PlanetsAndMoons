package PlanetsAndMoons;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlanetTest {

    @Test
    void planetTest(){
        Star sun = new Star("Sun");
        Planet earth = new Planet("Earth", sun, 93.4, "Terrestrial");
        assertEquals(earth.getName(), "Earth");
        assertEquals(earth.getInOrbitOf(), sun);
        assertEquals(earth.getDistance(), 93.4);
        assertEquals(earth.getType(), "Terrestrial");
    }

    @Test
    void distanceBetweenPlanetsTest(){
        Star sun = new Star("Sun");
        Planet earth = new Planet("Earth", sun, 93.5, "Terrestrial");
        Planet mars = new Planet("Mars", sun, 149.6, "Terrestrial");
        double point1 = earth.getDistance();
        double point2 = mars.getDistance();
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
        assertEquals(distance, 56.1, 0.001);
    }

}
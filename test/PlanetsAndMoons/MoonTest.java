package PlanetsAndMoons;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MoonTest {

    @Test
    void testMoon(){
        Star sun = new Star("Sun");
        Planet earth = new Planet("Earth", sun, 93.4, "Terrestrial");
        Moon moon = new Moon("Moon", earth, 384.4, "Terrestrial");
        earth.moons.add(moon);
        assertEquals(moon.getName(), "Moon");
        assertEquals(moon.getInOrbitOf(), earth);
        assertEquals(moon.getDistance(), 384.4);
        assertEquals(moon.getType(), "Terrestrial");
        System.out.println(earth.moons.size());
    }
}

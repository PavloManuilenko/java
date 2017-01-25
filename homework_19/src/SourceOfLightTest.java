import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SourceOfLightTest {

    @Test public void isShiningForSunWhenItsNight() {
        //given
        Sun sun = new Sun(false);

        //when
        String expected = "Night time.";
        String actual = sun.isShining();

        //than
        assertEquals(expected, actual);
    }

    @Test public void isShiningForSunWhenItsDay() {
        //given
        Sun sun = new Sun(true);

        //when
        String expected = "The Sun shine!";
        String actual = sun.isShining();

        //than
        assertEquals(expected, actual);
    }

    @Test public void isShiningForFireWhenItsBurning() {
        //given
        Fire fire = new Fire(true);

        //when
        String expected = "Burning!";
        String actual = fire.isBurning();

        //than
        assertEquals(expected, actual);
    }

    @Test public void isShiningForFireWhenItsGone() {
        //given
        Fire fire = new Fire(false);

        //when
        String expected = "Fire doesn't burn.";
        String actual = fire.isBurning();

        //than
        assertEquals(expected, actual);
    }

    @Test public void isShiningForFlashlightWhenItsOn() {
        //given
        Flashlight flashlight = new Flashlight(true);

        //when
        String expected = "Shining!";
        String actual = flashlight.isShining();

        //than
        assertEquals(expected, actual);
    }

    @Test public void isShiningForFlashlightWhenItsOff() {
        //given
        Flashlight flashlight = new Flashlight(false);

        //when
        String expected = "Darkness.";
        String actual = flashlight.isShining();

        //than
        assertEquals(expected, actual);
    }

    @Test public void isShiningForTableLampWhenItsOn() {
        //given
        TableLamp tableLamp = new TableLamp(true);

        //when
        String expected = "Shining!";
        String actual = tableLamp.isShining();

        //than
        assertEquals(expected, actual);
    }

    @Test public void isShiningForTableLampWhenItsOff() {
        //given
        TableLamp tableLamp = new TableLamp(false);

        //when
        String expected = "Darkness.";
        String actual = tableLamp.isShining();

        //than
        assertEquals(expected, actual);
    }

    @Test public void verifyingSourceNameForTableLamp() {
        //given
        TableLamp tableLamp = new TableLamp(true);

        //when
        String expected = "TableLamp";
        String actual = tableLamp.getSourceName();

        //than
        assertEquals(expected, actual);
    }

    @Test public void verifyingSourceNameForSun() {
        //given
        Sun sun = new Sun(false);

        //when
        String expected = "Sun";
        String actual = sun.getSourceName();

        //than
        assertEquals(expected, actual);
    }

    @Test public void flashlightIsTurningOn() {
        //given
        Flashlight flashlight = new Flashlight(false);

        //when
        flashlight.turnOn();
        String expected = "Shining!";
        String actual = flashlight.isShining();

        //than
        assertEquals(expected, actual);
    }

    @Test public void flashlightIsTurningOff() {
        //given
        Flashlight flashlight = new Flashlight(true);

        //when
        flashlight.turnOff();
        String expected = "Darkness.";
        String actual = flashlight.isShining();

        //than
        assertEquals(expected, actual);
    }

    @Test public void shouldSunrise() {
        //given
        Sun sun = new Sun(false);

        //when
        sun.sunrise();
        String expected = "The Sun shine!";
        String actual = sun.isShining();

        //than
        assertEquals(expected, actual);
    }

    @Test public void shouldSunset() {
        //given
        Sun sun = new Sun(true);

        //when
        sun.sunset();
        String expected = "Night time.";
        String actual = sun.isShining();

        //than
        assertEquals(expected, actual);
    }

    @Test public void shouldBurnDown() {
        //given
        Fire fire = new Fire(true);

        //when
        fire.burnDown();
        String expected = "Fire doesn't burn.";
        String actual = fire.isBurning();

        //than
        assertEquals(expected, actual);
    }

    @Test public void shouldBurnUp() {
        //given
        Fire fire = new Fire(false);

        //when
        fire.burnUp();
        String actual = fire.isBurning();
        String expected = "Burning!";

        //than
        assertEquals(expected, actual);
    }

    @Test public void shouldIncreaseLampQuantity() {
        //given
        TableLamp tableLamp = new TableLamp(true);
        Flashlight flashlight = new Flashlight(false);
        TableLamp tableLamp2 = new TableLamp(false);

        //when
        int expected = 3;
        int actual = Lamp.getQuantity();

        //than
        assertEquals(expected, actual);
    }

}
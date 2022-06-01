package com.academiaDigital.softwareArchitecture.practice5.products;

import com.academiaDigital.softwareArchitecture.practice5.parts.ControlPanel;
import com.academiaDigital.softwareArchitecture.practice5.parts.Engine;
import org.junit.Test;

import static org.junit.Assert.*;

public class RocketTest {
    //Arrange
    public Engine engine = new Engine(10,"Hydrogen");
    public Rocket rocket = new Rocket(10, engine);

    @Test
    public void getNumberOfEngines_should_return_number_of_Engines() {
        //Act
        int numberOfEngines = rocket.getNumberOfEngines();
        // Assert
        assertEquals(10,numberOfEngines);
    }

    @Test
    public void getEngine_should_return_Engine() {
        //Act
        Engine engineTest = rocket.getEngine();
        // Assert
        assertEquals(engineTest, engine);
    }

    @Test
    public void getControlPanel_should_return_rocket_control_panel() {
        //Act
        ControlPanel controlPanelTest = rocket.getControlPanel();
        // Assert
        assertEquals(controlPanelTest,ControlPanel.ROCKET);
    }
}
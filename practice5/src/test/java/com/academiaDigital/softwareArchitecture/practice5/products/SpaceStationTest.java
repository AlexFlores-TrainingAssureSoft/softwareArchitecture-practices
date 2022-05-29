package com.academiaDigital.softwareArchitecture.practice5.products;

import com.academiaDigital.softwareArchitecture.practice5.parts.ControlPanel;
import com.academiaDigital.softwareArchitecture.practice5.parts.Engine;
import org.junit.Test;

import static org.junit.Assert.*;

public class SpaceStationTest {
    //Arrange
    public Engine engine = new Engine(10,"Keroseno");
    public SpaceStation spaceStation = new SpaceStation(10,engine,50,2);

    @Test
    public void getNumberOfEngines_should_return_number_of_Engines() {
        //Act
        int numberOfEnginesTest = spaceStation.getNumberOfEngines();
        //Assert
        assertEquals(10,numberOfEnginesTest);
    }

    @Test
    public void getControlPanel_should_return_space_station_controlPanel() {
        //Act
        ControlPanel controlPanelTest = spaceStation.getControlPanel();
        //Assert
        assertEquals(controlPanelTest,ControlPanel.SPACE_STATION);
    }

    @Test
    public void getEngine_should_return_Engine() {
        //Act
        Engine engineTest = spaceStation.getEngine();
        //Assert
        assertEquals(engineTest,engine);
    }

    @Test
    public void getRooms_should_return_number_of_rooms() {
        //Act
        int roomsTest = spaceStation.getRooms();
        //Assert
        assertEquals(50,roomsTest);
    }

    @Test
    public void getGates_should_return_number_of_gates() {
        //Act
        int gatesTest = spaceStation.getGates();
        //Assert
        assertEquals(2,gatesTest);
    }
}
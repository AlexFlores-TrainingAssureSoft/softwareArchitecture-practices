package com.academiaDigital.softwareArchitecture.practice5.products;

import com.academiaDigital.softwareArchitecture.practice5.parts.ControlPanel;
import com.academiaDigital.softwareArchitecture.practice5.parts.Engine;

public class SpaceStation {
    private int numberOfEngines;
    private ControlPanel controlPanel;
    private Engine engine;
    private int rooms;
    private int gates;

    public SpaceStation(int numberOfEngines, Engine engine, int rooms, int gates) {
        this.numberOfEngines = numberOfEngines;
        this.controlPanel = ControlPanel.SPACE_STATION;
        this.engine = engine;
        this.rooms = rooms;
        this.gates = gates;
    }

    public int getNumberOfEngines() {
        return numberOfEngines;
    }

    public void setNumberOfEngines(int numberOfEngines) {
        this.numberOfEngines = numberOfEngines;
    }

    public ControlPanel getControlPanel() {
        return controlPanel;
    }

    public void setControlPanel(ControlPanel controlPanel) {
        this.controlPanel = controlPanel;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public int getGates() {
        return gates;
    }

    public void setGates(int gates) {
        this.gates = gates;
    }
}

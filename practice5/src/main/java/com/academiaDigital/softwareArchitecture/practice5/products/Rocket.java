package com.academiaDigital.softwareArchitecture.practice5.products;

import com.academiaDigital.softwareArchitecture.practice5.parts.ControlPanel;
import com.academiaDigital.softwareArchitecture.practice5.parts.Engine;

public class Rocket {
    private int numberOfEngines;
    private Engine engine;
    private ControlPanel controlPanel;

    public Rocket(int numberOfEngines, Engine engine) {
        this.numberOfEngines = numberOfEngines;
        this.engine = engine;
        this.controlPanel = ControlPanel.ROCKET;
    }

    public int getNumberOfEngines() {
        return numberOfEngines;
    }

    public void setNumberOfEngines(int numberOfEngines) {
        this.numberOfEngines = numberOfEngines;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public ControlPanel getControlPanel() {
        return controlPanel;
    }

    public void setControlPanel(ControlPanel controlPanel) {
        this.controlPanel = controlPanel;
    }

}

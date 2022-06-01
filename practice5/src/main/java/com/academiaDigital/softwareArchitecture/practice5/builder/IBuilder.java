package com.academiaDigital.softwareArchitecture.practice5.builder;

import com.academiaDigital.softwareArchitecture.practice5.parts.Engine;

public interface IBuilder {
    void setNumberOfEngines(int setNumberOfEngines);
    void setEngine(Engine setEngine);
}

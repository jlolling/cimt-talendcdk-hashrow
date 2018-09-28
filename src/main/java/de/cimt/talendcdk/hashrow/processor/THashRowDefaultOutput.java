package de.cimt.talendcdk.hashrow.processor;

import java.io.Serializable;

import javax.json.JsonObject;

// this is the pojo which will be used to represent your data
public class THashRowDefaultOutput implements Serializable {
    public JsonObject row;
}
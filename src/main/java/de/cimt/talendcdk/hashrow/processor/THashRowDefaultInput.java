package de.cimt.talendcdk.hashrow.processor;

import java.io.Serializable;

import javax.json.JsonObject;

// this is the pojo which will be used to represent your data
public class THashRowDefaultInput implements Serializable {
	
    public JsonObject row;

	public JsonObject getRow() {
		return row;
	}

	public void setRow(JsonObject row) {
		this.row = row;
	}
}
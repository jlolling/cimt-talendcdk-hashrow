package de.cimt.talendcdk.hashrow.processor;

import java.io.Serializable;

import org.talend.sdk.component.api.record.Record;

// this is the pojo which will be used to represent your data
public class THashRowDefaultInput implements Serializable {
    public Record row;
}
package de.cimt.talendcdk.hashrow.processor;

import java.io.Serializable;
import java.util.List;
import org.talend.sdk.component.api.configuration.Option;

import org.talend.sdk.component.api.configuration.ui.layout.GridLayout;
import org.talend.sdk.component.api.configuration.ui.widget.Structure;
import org.talend.sdk.component.api.meta.Documentation;

@GridLayout({
    @GridLayout.Row({"config"})
        
    
})
@Documentation("TODO fill the documentation for this configuration")
public class THashRowProcessorConfiguration implements Serializable {
    @Option
    @Structure
    @Documentation("Uiuiui")
    private List<String> config;

    public List<String> getConfig() {
        return config;
    }

    public void setConfig(List<String> config) {
        this.config = config;
    }
    
    @Option
    @Documentation("TODO fill the documentation for this parameter")
    public String stuff;

    
}
package com.amazonaws.ses.configurationseteventdestination;

import java.io.InputStream;
import org.json.JSONObject;
import org.json.JSONTokener;

class Configuration extends BaseConfiguration {

    public Configuration() {
        super("aws-ses-configurationseteventdestination.json");
    }

    public JSONObject resourceSchemaJSONObject() {
        return new JSONObject(new JSONTokener(this.getClass().getClassLoader().getResourceAsStream(schemaFilename)));
    }

}
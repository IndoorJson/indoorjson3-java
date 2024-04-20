package ai.flexgalaxy.indoorjson3;

import org.locationtech.jts.geom.Envelope;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class Feature {
    String id;
    String name;
    String desc;
    String ext_ref;
    Envelope envelope;
    ObjectNode properties;
}

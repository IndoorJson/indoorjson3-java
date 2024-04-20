package ai.flexgalaxy.indoorjson3;

import org.locationtech.jts.geom.LineString;

public class Connection extends Feature {
    Cell fr;
    Cell to;
    LineString bound;
    LineString edge;
}

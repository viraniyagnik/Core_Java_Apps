package ca.jrvs.apps.twitter.model.v2;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.Arrays;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties({
    "properties"
})
public class Geo {

  private String type;
  private double[] bbox;

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public double[] getBbox() {
    return bbox;
  }

  public void setBbox(double[] bbox) {
    this.bbox = bbox;
  }

  @Override
  public String toString() {
    return "Geo{"
        + "type='" + type + '\''
        + ", bbox=" + Arrays.toString(bbox)
        + '}';
  }
}

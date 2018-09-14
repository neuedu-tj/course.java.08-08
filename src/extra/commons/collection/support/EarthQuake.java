package extra.commons.collection.support;



import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
public class EarthQuake {
	
	private String location;
	private float intensity;
	private float depth;
	private Date time;

}

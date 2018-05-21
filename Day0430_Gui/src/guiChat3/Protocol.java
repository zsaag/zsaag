package guiChat3;

import java.io.Serializable;
import java.util.Map;

public class Protocol implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4407107472171537199L;
	private String type;
	private Map<String, Object>data;
	public String getType() {
		return type;
	}
	public Map<String, Object> getData() {
		return data;
	}
	public void setData(Map<String, Object> data) {
		this.data = data;
	}
	public void setType(String type) {
		this.type = type;
	}
}

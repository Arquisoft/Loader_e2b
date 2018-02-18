package model;

import java.io.Serializable;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

import model.types.Location;

@Entity
@Table(name = "Entity")
@DiscriminatorValue("Entity")
public class Sensor extends Usuario implements Serializable {
    private static final long serialVersionUID = 1L;
    private Location location;

    Sensor(){}

    public Sensor(String name, Location location, String email, String code){
        setNombre(name);
        setLocation(location);
        setEmail(email);
        setCodigo(code);
    }

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}
    
    
}
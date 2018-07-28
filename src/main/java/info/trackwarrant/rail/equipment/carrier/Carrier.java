
package info.trackwarrant.rail.equipment.carrier;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import lombok.Data;
//import lombok.Value;

@Entity
@Data
//@Value
public class Carrier
{
    @Id
    private final String scac;
    private final String name;

    @Override
    public String toString()
    {
        return String.format(
                "Carrier[scac=%s, roadName='%s']",
                scac, name );
    }
}




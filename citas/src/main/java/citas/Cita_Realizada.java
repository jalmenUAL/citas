/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Daniel Landa
 * License Type: Purchased
 */
package citas;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@org.hibernate.annotations.Proxy(lazy = false)
@Table(name = "Cita_Realizada")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorValue("Cita_Realizada")
@PrimaryKeyJoinColumn(name = "CitaID", referencedColumnName = "ID")
public class Cita_Realizada extends citas.Cita implements Serializable {
	public Cita_Realizada() {
	}

	public String toString() {
		return super.toString();
	}

}

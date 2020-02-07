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
@Table(name = "Asunto")
public class Asunto implements Serializable {
	public Asunto() {
	}

	private java.util.Set this_getSet(int key) {
		if (key == citas.ORMConstants.KEY_ASUNTO_DE_LA_CITA) {
			return ORM_de_la_cita;
		}

		return null;
	}

	@Transient
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}

	};

	@Column(name = "ID", nullable = false)
	@Id
	@GeneratedValue(generator = "CITAS_ASUNTO_ID_GENERATOR")
	@org.hibernate.annotations.GenericGenerator(name = "CITAS_ASUNTO_ID_GENERATOR", strategy = "native")
	private int ID;

	@Column(name = "Nombre", nullable = true, length = 255)
	private String nombre;

	@OneToMany(mappedBy = "es_para", targetEntity = citas.Cita.class)
	@org.hibernate.annotations.Cascade({ org.hibernate.annotations.CascadeType.SAVE_UPDATE,
			org.hibernate.annotations.CascadeType.LOCK })
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)
	private java.util.Set ORM_de_la_cita = new java.util.HashSet();

	private void setID(int value) {
		this.ID = value;
	}

	public int getID() {
		return ID;
	}

	public int getORMID() {
		return getID();
	}

	public void setNombre(String value) {
		this.nombre = value;
	}

	public String getNombre() {
		return nombre;
	}

	private void setORM_De_la_cita(java.util.Set value) {
		this.ORM_de_la_cita = value;
	}

	private java.util.Set getORM_De_la_cita() {
		return ORM_de_la_cita;
	}

	@Transient
	public final citas.CitaSetCollection de_la_cita = new citas.CitaSetCollection(this, _ormAdapter,
			citas.ORMConstants.KEY_ASUNTO_DE_LA_CITA, citas.ORMConstants.KEY_CITA_ES_PARA,
			citas.ORMConstants.KEY_MUL_ONE_TO_MANY);

	public String toString() {
		return String.valueOf(getID());
	}

}

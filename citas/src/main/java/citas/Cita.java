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
@Table(name = "Cita")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorValue("Cita")
public class Cita implements Serializable {
	public Cita() {
	}

	private void this_setOwner(Object owner, int key) {
		if (key == citas.ORMConstants.KEY_CITA_FECHA) {
			this.fecha = (citas.Fecha) owner;
		}

		else if (key == citas.ORMConstants.KEY_CITA_ES_PARA) {
			this.es_para = (citas.Asunto) owner;
		}
	}

	@Transient
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}

	};

	@Column(name = "ID", nullable = false)
	@Id
	@GeneratedValue(generator = "CITAS_CITA_ID_GENERATOR")
	@org.hibernate.annotations.GenericGenerator(name = "CITAS_CITA_ID_GENERATOR", strategy = "native")
	private int ID;

	@ManyToOne(targetEntity = citas.Asunto.class, fetch = FetchType.LAZY)
	@org.hibernate.annotations.Cascade({ org.hibernate.annotations.CascadeType.LOCK })
	@JoinColumns({ @JoinColumn(name = "AsuntoID", referencedColumnName = "ID", nullable = false) })
	@org.hibernate.annotations.LazyToOne(value = org.hibernate.annotations.LazyToOneOption.NO_PROXY)
	private citas.Asunto es_para;

	@OneToOne(mappedBy = "cita", targetEntity = citas.Fecha.class)
	@org.hibernate.annotations.Cascade({ org.hibernate.annotations.CascadeType.SAVE_UPDATE,
			org.hibernate.annotations.CascadeType.LOCK })
	private citas.Fecha fecha;

	private void setID(int value) {
		this.ID = value;
	}

	public int getID() {
		return ID;
	}

	public int getORMID() {
		return getID();
	}

	public citas.Cliente getCliente() {
		if (fecha != null) {
			return fecha.getCliente();
		} else {
			return null;
		}
	}

	public void removeCliente() {
		if (fecha != null) {
			fecha.setCliente(null);
			this.setFecha(null);
		}
	}

	public void addCliente(citas.Fecha aFecha, citas.Cliente aCliente) {
		this.setFecha(aFecha);
		aFecha.setCliente(aCliente);
	}

	public void setFecha(citas.Fecha value) {
		if (this.fecha != value) {
			citas.Fecha lfecha = this.fecha;
			this.fecha = value;
			if (value != null) {
				fecha.setCita(this);
			} else {
				lfecha.setCita(null);
			}
		}
	}

	public citas.Fecha getFecha() {
		return fecha;
	}

	public void setEs_para(citas.Asunto value) {
		if (es_para != null) {
			es_para.de_la_cita.remove(this);
		}
		if (value != null) {
			value.de_la_cita.add(this);
		}
	}

	public citas.Asunto getEs_para() {
		return es_para;
	}

	/**
	 * This method is for internal use only.
	 */
	public void setORM_Es_para(citas.Asunto value) {
		this.es_para = value;
	}

	private citas.Asunto getORM_Es_para() {
		return es_para;
	}

	public String toString() {
		return String.valueOf(getID());
	}

}

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
@Table(name = "Fecha")
public class Fecha implements Serializable {
	public Fecha() {
	}

	private void this_setOwner(Object owner, int key) {
		if (key == citas.ORMConstants.KEY_FECHA_CITA) {
			this.cita = (citas.Cita) owner;
		}

		else if (key == citas.ORMConstants.KEY_FECHA_CLIENTE) {
			this.cliente = (citas.Cliente) owner;
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
	@GeneratedValue(generator = "CITAS_FECHA_ID_GENERATOR")
	@org.hibernate.annotations.GenericGenerator(name = "CITAS_FECHA_ID_GENERATOR", strategy = "native")
	private int ID;

	@Column(name = "Dia", nullable = false, length = 11)
	private int dia;

	@Column(name = "Mes", nullable = false, length = 11)
	private int mes;

	@Column(name = "Anyo", nullable = false, length = 11)
	private int anyo;

	@OneToOne(targetEntity = citas.Cita.class)
	@org.hibernate.annotations.Cascade({ org.hibernate.annotations.CascadeType.SAVE_UPDATE,
			org.hibernate.annotations.CascadeType.LOCK })
	@JoinColumns({ @JoinColumn(name = "CitaID", nullable = false) })
	private citas.Cita cita;

	@ManyToOne(targetEntity = citas.Cliente.class)
	@org.hibernate.annotations.Cascade({ org.hibernate.annotations.CascadeType.LOCK })
	@JoinColumns({ @JoinColumn(name = "ClienteID", referencedColumnName = "ID", nullable = false) })
	private citas.Cliente cliente;

	private void setID(int value) {
		this.ID = value;
	}

	public int getID() {
		return ID;
	}

	public int getORMID() {
		return getID();
	}

	public void setDia(int value) {
		this.dia = value;
	}

	public int getDia() {
		return dia;
	}

	public void setMes(int value) {
		this.mes = value;
	}

	public int getMes() {
		return mes;
	}

	public void setAnyo(int value) {
		this.anyo = value;
	}

	public int getAnyo() {
		return anyo;
	}

	public void setCita(citas.Cita value) {
		if (this.cita != value) {
			citas.Cita lcita = this.cita;
			this.cita = value;
			if (value != null) {
				cita.setFecha(this);
			} else {
				lcita.setFecha(null);
			}
		}
	}

	public citas.Cita getCita() {
		return cita;
	}

	public void setCliente(citas.Cliente value) {
		if (cliente != null) {
			cliente.fechas.remove(this);
		}
		if (value != null) {
			value.fechas.add(this);
		}
	}

	public citas.Cliente getCliente() {
		return cliente;
	}

	/**
	 * This method is for internal use only.
	 */
	public void setORM_Cliente(citas.Cliente value) {
		this.cliente = value;
	}

	private citas.Cliente getORM_Cliente() {
		return cliente;
	}

	public String toString() {
		return String.valueOf(getID());
	}

}

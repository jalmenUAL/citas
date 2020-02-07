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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class ClienteCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression nombre;
	public final StringExpression direccion;
	public final StringExpression telefono;

	public ClienteCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		nombre = new StringExpression("nombre", this);
		direccion = new StringExpression("direccion", this);
		telefono = new StringExpression("telefono", this);
	}

	public ClienteCriteria(PersistentSession session) {
		this(session.createCriteria(Cliente.class));
	}

	public ClienteCriteria() throws PersistentException {
		this(citas.GestiondeCitasPersistentManager.instance().getSession());
	}

	public FechaCriteria createFechasCriteria() {
		return new FechaCriteria(createCriteria("ORM_fechas"));
	}

	public Cliente uniqueCliente() {
		return (Cliente) super.uniqueResult();
	}

	public Cliente[] listCliente() {
		java.util.List list = super.list();
		return (Cliente[]) list.toArray(new Cliente[list.size()]);
	}
}

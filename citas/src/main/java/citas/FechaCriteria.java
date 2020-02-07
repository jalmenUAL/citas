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

public class FechaCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression dia;
	public final IntegerExpression mes;
	public final IntegerExpression anyo;

	public FechaCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		dia = new IntegerExpression("dia", this);
		mes = new IntegerExpression("mes", this);
		anyo = new IntegerExpression("anyo", this);
	}

	public FechaCriteria(PersistentSession session) {
		this(session.createCriteria(Fecha.class));
	}

	public FechaCriteria() throws PersistentException {
		this(citas.GestiondeCitasPersistentManager.instance().getSession());
	}

	public CitaCriteria createCitaCriteria() {
		return new CitaCriteria(createCriteria("cita"));
	}

	public ClienteCriteria createClienteCriteria() {
		return new ClienteCriteria(createCriteria("ORM_Cliente"));
	}

	public Fecha uniqueFecha() {
		return (Fecha) super.uniqueResult();
	}

	public Fecha[] listFecha() {
		java.util.List list = super.list();
		return (Fecha[]) list.toArray(new Fecha[list.size()]);
	}
}

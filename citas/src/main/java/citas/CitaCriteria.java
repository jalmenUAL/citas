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

public class CitaCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;

	public CitaCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
	}

	public CitaCriteria(PersistentSession session) {
		this(session.createCriteria(Cita.class));
	}

	public CitaCriteria() throws PersistentException {
		this(citas.GestiondeCitasPersistentManager.instance().getSession());
	}

	public AsuntoCriteria createEs_paraCriteria() {
		return new AsuntoCriteria(createCriteria("es_para"));
	}

	public FechaCriteria createFechaCriteria() {
		return new FechaCriteria(createCriteria("fecha"));
	}

	public Cita uniqueCita() {
		return (Cita) super.uniqueResult();
	}

	public Cita[] listCita() {
		java.util.List list = super.list();
		return (Cita[]) list.toArray(new Cita[list.size()]);
	}
}

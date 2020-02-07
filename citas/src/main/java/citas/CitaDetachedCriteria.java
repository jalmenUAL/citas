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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class CitaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;

	public CitaDetachedCriteria() {
		super(citas.Cita.class, citas.CitaCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
	}

	public CitaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, citas.CitaCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
	}

	public AsuntoDetachedCriteria createEs_paraCriteria() {
		return new AsuntoDetachedCriteria(createCriteria("es_para"));
	}

	public FechaDetachedCriteria createFechaCriteria() {
		return new FechaDetachedCriteria(createCriteria("fecha"));
	}

	public Cita uniqueCita(PersistentSession session) {
		return (Cita) super.createExecutableCriteria(session).uniqueResult();
	}

	public Cita[] listCita(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Cita[]) list.toArray(new Cita[list.size()]);
	}
}

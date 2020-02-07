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

public class Cita_RealizadaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;

	public Cita_RealizadaDetachedCriteria() {
		super(citas.Cita_Realizada.class, citas.Cita_RealizadaCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
	}

	public Cita_RealizadaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, citas.Cita_RealizadaCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
	}

	public AsuntoDetachedCriteria createEs_paraCriteria() {
		return new AsuntoDetachedCriteria(createCriteria("es_para"));
	}

	public FechaDetachedCriteria createFechaCriteria() {
		return new FechaDetachedCriteria(createCriteria("fecha"));
	}

	public Cita_Realizada uniqueCita_Realizada(PersistentSession session) {
		return (Cita_Realizada) super.createExecutableCriteria(session).uniqueResult();
	}

	public Cita_Realizada[] listCita_Realizada(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Cita_Realizada[]) list.toArray(new Cita_Realizada[list.size()]);
	}
}

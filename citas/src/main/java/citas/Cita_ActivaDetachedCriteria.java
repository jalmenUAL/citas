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

public class Cita_ActivaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;

	public Cita_ActivaDetachedCriteria() {
		super(citas.Cita_Activa.class, citas.Cita_ActivaCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
	}

	public Cita_ActivaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, citas.Cita_ActivaCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
	}

	public AsuntoDetachedCriteria createEs_paraCriteria() {
		return new AsuntoDetachedCriteria(createCriteria("es_para"));
	}

	public FechaDetachedCriteria createFechaCriteria() {
		return new FechaDetachedCriteria(createCriteria("fecha"));
	}

	public Cita_Activa uniqueCita_Activa(PersistentSession session) {
		return (Cita_Activa) super.createExecutableCriteria(session).uniqueResult();
	}

	public Cita_Activa[] listCita_Activa(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Cita_Activa[]) list.toArray(new Cita_Activa[list.size()]);
	}
}

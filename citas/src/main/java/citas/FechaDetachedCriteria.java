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

public class FechaDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression dia;
	public final IntegerExpression mes;
	public final IntegerExpression anyo;

	public FechaDetachedCriteria() {
		super(citas.Fecha.class, citas.FechaCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		dia = new IntegerExpression("dia", this.getDetachedCriteria());
		mes = new IntegerExpression("mes", this.getDetachedCriteria());
		anyo = new IntegerExpression("anyo", this.getDetachedCriteria());
	}

	public FechaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, citas.FechaCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		dia = new IntegerExpression("dia", this.getDetachedCriteria());
		mes = new IntegerExpression("mes", this.getDetachedCriteria());
		anyo = new IntegerExpression("anyo", this.getDetachedCriteria());
	}

	public CitaDetachedCriteria createCitaCriteria() {
		return new CitaDetachedCriteria(createCriteria("cita"));
	}

	public ClienteDetachedCriteria createClienteCriteria() {
		return new ClienteDetachedCriteria(createCriteria("cliente"));
	}

	public Fecha uniqueFecha(PersistentSession session) {
		return (Fecha) super.createExecutableCriteria(session).uniqueResult();
	}

	public Fecha[] listFecha(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Fecha[]) list.toArray(new Fecha[list.size()]);
	}
}

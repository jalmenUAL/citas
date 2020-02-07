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

public class AsuntoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression nombre;

	public AsuntoDetachedCriteria() {
		super(citas.Asunto.class, citas.AsuntoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
	}

	public AsuntoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, citas.AsuntoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
	}

	public CitaDetachedCriteria createDe_la_citaCriteria() {
		return new CitaDetachedCriteria(createCriteria("ORM_de_la_cita"));
	}

	public Asunto uniqueAsunto(PersistentSession session) {
		return (Asunto) super.createExecutableCriteria(session).uniqueResult();
	}

	public Asunto[] listAsunto(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Asunto[]) list.toArray(new Asunto[list.size()]);
	}
}

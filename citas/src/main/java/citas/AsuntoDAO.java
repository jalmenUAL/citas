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

import org.orm.*;
import org.hibernate.Query;
import java.util.List;

public class AsuntoDAO {
	public static Asunto loadAsuntoByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = citas.GestiondeCitasPersistentManager.instance().getSession();
			return loadAsuntoByORMID(session, ID);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static Asunto getAsuntoByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = citas.GestiondeCitasPersistentManager.instance().getSession();
			return getAsuntoByORMID(session, ID);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static Asunto loadAsuntoByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = citas.GestiondeCitasPersistentManager.instance().getSession();
			return loadAsuntoByORMID(session, ID, lockMode);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static Asunto getAsuntoByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = citas.GestiondeCitasPersistentManager.instance().getSession();
			return getAsuntoByORMID(session, ID, lockMode);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static Asunto loadAsuntoByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Asunto) session.load(citas.Asunto.class, new Integer(ID));
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static Asunto getAsuntoByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Asunto) session.get(citas.Asunto.class, new Integer(ID));
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static Asunto loadAsuntoByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)
			throws PersistentException {
		try {
			return (Asunto) session.load(citas.Asunto.class, new Integer(ID), lockMode);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static Asunto getAsuntoByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)
			throws PersistentException {
		try {
			return (Asunto) session.get(citas.Asunto.class, new Integer(ID), lockMode);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static List queryAsunto(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = citas.GestiondeCitasPersistentManager.instance().getSession();
			return queryAsunto(session, condition, orderBy);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static List queryAsunto(String condition, String orderBy, org.hibernate.LockMode lockMode)
			throws PersistentException {
		try {
			PersistentSession session = citas.GestiondeCitasPersistentManager.instance().getSession();
			return queryAsunto(session, condition, orderBy, lockMode);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static Asunto[] listAsuntoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = citas.GestiondeCitasPersistentManager.instance().getSession();
			return listAsuntoByQuery(session, condition, orderBy);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static Asunto[] listAsuntoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode)
			throws PersistentException {
		try {
			PersistentSession session = citas.GestiondeCitasPersistentManager.instance().getSession();
			return listAsuntoByQuery(session, condition, orderBy, lockMode);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static List queryAsunto(PersistentSession session, String condition, String orderBy)
			throws PersistentException {
		StringBuffer sb = new StringBuffer("From citas.Asunto as Asunto");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static List queryAsunto(PersistentSession session, String condition, String orderBy,
			org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From citas.Asunto as Asunto");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			return query.list();
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static Asunto[] listAsuntoByQuery(PersistentSession session, String condition, String orderBy)
			throws PersistentException {
		try {
			List list = queryAsunto(session, condition, orderBy);
			return (Asunto[]) list.toArray(new Asunto[list.size()]);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static Asunto[] listAsuntoByQuery(PersistentSession session, String condition, String orderBy,
			org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryAsunto(session, condition, orderBy, lockMode);
			return (Asunto[]) list.toArray(new Asunto[list.size()]);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static Asunto loadAsuntoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = citas.GestiondeCitasPersistentManager.instance().getSession();
			return loadAsuntoByQuery(session, condition, orderBy);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static Asunto loadAsuntoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode)
			throws PersistentException {
		try {
			PersistentSession session = citas.GestiondeCitasPersistentManager.instance().getSession();
			return loadAsuntoByQuery(session, condition, orderBy, lockMode);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static Asunto loadAsuntoByQuery(PersistentSession session, String condition, String orderBy)
			throws PersistentException {
		Asunto[] asuntos = listAsuntoByQuery(session, condition, orderBy);
		if (asuntos != null && asuntos.length > 0)
			return asuntos[0];
		else
			return null;
	}

	public static Asunto loadAsuntoByQuery(PersistentSession session, String condition, String orderBy,
			org.hibernate.LockMode lockMode) throws PersistentException {
		Asunto[] asuntos = listAsuntoByQuery(session, condition, orderBy, lockMode);
		if (asuntos != null && asuntos.length > 0)
			return asuntos[0];
		else
			return null;
	}

	public static java.util.Iterator iterateAsuntoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = citas.GestiondeCitasPersistentManager.instance().getSession();
			return iterateAsuntoByQuery(session, condition, orderBy);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static java.util.Iterator iterateAsuntoByQuery(String condition, String orderBy,
			org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = citas.GestiondeCitasPersistentManager.instance().getSession();
			return iterateAsuntoByQuery(session, condition, orderBy, lockMode);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static java.util.Iterator iterateAsuntoByQuery(PersistentSession session, String condition, String orderBy)
			throws PersistentException {
		StringBuffer sb = new StringBuffer("From citas.Asunto as Asunto");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static java.util.Iterator iterateAsuntoByQuery(PersistentSession session, String condition, String orderBy,
			org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From citas.Asunto as Asunto");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			return query.iterate();
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static Asunto createAsunto() {
		return new citas.Asunto();
	}

	public static boolean save(citas.Asunto asunto) throws PersistentException {
		try {
			citas.GestiondeCitasPersistentManager.instance().saveObject(asunto);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static boolean delete(citas.Asunto asunto) throws PersistentException {
		try {
			citas.GestiondeCitasPersistentManager.instance().deleteObject(asunto);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static boolean deleteAndDissociate(citas.Asunto asunto) throws PersistentException {
		try {
			citas.Cita[] lDe_la_citas = asunto.de_la_cita.toArray();
			for (int i = 0; i < lDe_la_citas.length; i++) {
				lDe_la_citas[i].setEs_para(null);
			}
			return delete(asunto);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static boolean deleteAndDissociate(citas.Asunto asunto, org.orm.PersistentSession session)
			throws PersistentException {
		try {
			citas.Cita[] lDe_la_citas = asunto.de_la_cita.toArray();
			for (int i = 0; i < lDe_la_citas.length; i++) {
				lDe_la_citas[i].setEs_para(null);
			}
			try {
				session.delete(asunto);
				return true;
			} catch (Exception e) {
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static boolean refresh(citas.Asunto asunto) throws PersistentException {
		try {
			citas.GestiondeCitasPersistentManager.instance().getSession().refresh(asunto);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static boolean evict(citas.Asunto asunto) throws PersistentException {
		try {
			citas.GestiondeCitasPersistentManager.instance().getSession().evict(asunto);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static Asunto loadAsuntoByCriteria(AsuntoCriteria asuntoCriteria) {
		Asunto[] asuntos = listAsuntoByCriteria(asuntoCriteria);
		if (asuntos == null || asuntos.length == 0) {
			return null;
		}
		return asuntos[0];
	}

	public static Asunto[] listAsuntoByCriteria(AsuntoCriteria asuntoCriteria) {
		return asuntoCriteria.listAsunto();
	}
}

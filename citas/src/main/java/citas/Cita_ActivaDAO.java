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

public class Cita_ActivaDAO {
	public static Cita_Activa loadCita_ActivaByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = citas.GestiondeCitasPersistentManager.instance().getSession();
			return loadCita_ActivaByORMID(session, ID);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static Cita_Activa getCita_ActivaByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = citas.GestiondeCitasPersistentManager.instance().getSession();
			return getCita_ActivaByORMID(session, ID);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static Cita_Activa loadCita_ActivaByORMID(int ID, org.hibernate.LockMode lockMode)
			throws PersistentException {
		try {
			PersistentSession session = citas.GestiondeCitasPersistentManager.instance().getSession();
			return loadCita_ActivaByORMID(session, ID, lockMode);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static Cita_Activa getCita_ActivaByORMID(int ID, org.hibernate.LockMode lockMode)
			throws PersistentException {
		try {
			PersistentSession session = citas.GestiondeCitasPersistentManager.instance().getSession();
			return getCita_ActivaByORMID(session, ID, lockMode);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static Cita_Activa loadCita_ActivaByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Cita_Activa) session.load(citas.Cita_Activa.class, new Integer(ID));
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static Cita_Activa getCita_ActivaByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Cita_Activa) session.get(citas.Cita_Activa.class, new Integer(ID));
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static Cita_Activa loadCita_ActivaByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)
			throws PersistentException {
		try {
			return (Cita_Activa) session.load(citas.Cita_Activa.class, new Integer(ID), lockMode);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static Cita_Activa getCita_ActivaByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)
			throws PersistentException {
		try {
			return (Cita_Activa) session.get(citas.Cita_Activa.class, new Integer(ID), lockMode);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static List queryCita_Activa(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = citas.GestiondeCitasPersistentManager.instance().getSession();
			return queryCita_Activa(session, condition, orderBy);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static List queryCita_Activa(String condition, String orderBy, org.hibernate.LockMode lockMode)
			throws PersistentException {
		try {
			PersistentSession session = citas.GestiondeCitasPersistentManager.instance().getSession();
			return queryCita_Activa(session, condition, orderBy, lockMode);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static Cita_Activa[] listCita_ActivaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = citas.GestiondeCitasPersistentManager.instance().getSession();
			return listCita_ActivaByQuery(session, condition, orderBy);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static Cita_Activa[] listCita_ActivaByQuery(String condition, String orderBy,
			org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = citas.GestiondeCitasPersistentManager.instance().getSession();
			return listCita_ActivaByQuery(session, condition, orderBy, lockMode);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static List queryCita_Activa(PersistentSession session, String condition, String orderBy)
			throws PersistentException {
		StringBuffer sb = new StringBuffer("From citas.Cita_Activa as Cita_Activa");
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

	public static List queryCita_Activa(PersistentSession session, String condition, String orderBy,
			org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From citas.Cita_Activa as Cita_Activa");
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

	public static Cita_Activa[] listCita_ActivaByQuery(PersistentSession session, String condition, String orderBy)
			throws PersistentException {
		try {
			List list = queryCita_Activa(session, condition, orderBy);
			return (Cita_Activa[]) list.toArray(new Cita_Activa[list.size()]);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static Cita_Activa[] listCita_ActivaByQuery(PersistentSession session, String condition, String orderBy,
			org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryCita_Activa(session, condition, orderBy, lockMode);
			return (Cita_Activa[]) list.toArray(new Cita_Activa[list.size()]);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static Cita_Activa loadCita_ActivaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = citas.GestiondeCitasPersistentManager.instance().getSession();
			return loadCita_ActivaByQuery(session, condition, orderBy);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static Cita_Activa loadCita_ActivaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode)
			throws PersistentException {
		try {
			PersistentSession session = citas.GestiondeCitasPersistentManager.instance().getSession();
			return loadCita_ActivaByQuery(session, condition, orderBy, lockMode);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static Cita_Activa loadCita_ActivaByQuery(PersistentSession session, String condition, String orderBy)
			throws PersistentException {
		Cita_Activa[] cita_Activas = listCita_ActivaByQuery(session, condition, orderBy);
		if (cita_Activas != null && cita_Activas.length > 0)
			return cita_Activas[0];
		else
			return null;
	}

	public static Cita_Activa loadCita_ActivaByQuery(PersistentSession session, String condition, String orderBy,
			org.hibernate.LockMode lockMode) throws PersistentException {
		Cita_Activa[] cita_Activas = listCita_ActivaByQuery(session, condition, orderBy, lockMode);
		if (cita_Activas != null && cita_Activas.length > 0)
			return cita_Activas[0];
		else
			return null;
	}

	public static java.util.Iterator iterateCita_ActivaByQuery(String condition, String orderBy)
			throws PersistentException {
		try {
			PersistentSession session = citas.GestiondeCitasPersistentManager.instance().getSession();
			return iterateCita_ActivaByQuery(session, condition, orderBy);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static java.util.Iterator iterateCita_ActivaByQuery(String condition, String orderBy,
			org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = citas.GestiondeCitasPersistentManager.instance().getSession();
			return iterateCita_ActivaByQuery(session, condition, orderBy, lockMode);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static java.util.Iterator iterateCita_ActivaByQuery(PersistentSession session, String condition,
			String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From citas.Cita_Activa as Cita_Activa");
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

	public static java.util.Iterator iterateCita_ActivaByQuery(PersistentSession session, String condition,
			String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From citas.Cita_Activa as Cita_Activa");
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

	public static Cita_Activa createCita_Activa() {
		return new citas.Cita_Activa();
	}

	public static boolean save(citas.Cita_Activa cita_Activa) throws PersistentException {
		try {
			citas.GestiondeCitasPersistentManager.instance().saveObject(cita_Activa);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static boolean delete(citas.Cita_Activa cita_Activa) throws PersistentException {
		try {
			citas.GestiondeCitasPersistentManager.instance().deleteObject(cita_Activa);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static boolean deleteAndDissociate(citas.Cita_Activa cita_Activa) throws PersistentException {
		try {
			if (cita_Activa.getEs_para() != null) {
				cita_Activa.getEs_para().de_la_cita.remove(cita_Activa);
			}

			if (cita_Activa.getFecha() != null) {
				cita_Activa.getFecha().setCita(null);
			}

			return delete(cita_Activa);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static boolean deleteAndDissociate(citas.Cita_Activa cita_Activa, org.orm.PersistentSession session)
			throws PersistentException {
		try {
			if (cita_Activa.getEs_para() != null) {
				cita_Activa.getEs_para().de_la_cita.remove(cita_Activa);
			}

			if (cita_Activa.getFecha() != null) {
				cita_Activa.getFecha().setCita(null);
			}

			try {
				session.delete(cita_Activa);
				return true;
			} catch (Exception e) {
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static boolean refresh(citas.Cita_Activa cita_Activa) throws PersistentException {
		try {
			citas.GestiondeCitasPersistentManager.instance().getSession().refresh(cita_Activa);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static boolean evict(citas.Cita_Activa cita_Activa) throws PersistentException {
		try {
			citas.GestiondeCitasPersistentManager.instance().getSession().evict(cita_Activa);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static Cita_Activa loadCita_ActivaByCriteria(Cita_ActivaCriteria cita_ActivaCriteria) {
		Cita_Activa[] cita_Activas = listCita_ActivaByCriteria(cita_ActivaCriteria);
		if (cita_Activas == null || cita_Activas.length == 0) {
			return null;
		}
		return cita_Activas[0];
	}

	public static Cita_Activa[] listCita_ActivaByCriteria(Cita_ActivaCriteria cita_ActivaCriteria) {
		return cita_ActivaCriteria.listCita_Activa();
	}
}

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

public class Cita_RealizadaDAO {
	public static Cita_Realizada loadCita_RealizadaByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = citas.GestiondeCitasPersistentManager.instance().getSession();
			return loadCita_RealizadaByORMID(session, ID);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static Cita_Realizada getCita_RealizadaByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = citas.GestiondeCitasPersistentManager.instance().getSession();
			return getCita_RealizadaByORMID(session, ID);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static Cita_Realizada loadCita_RealizadaByORMID(int ID, org.hibernate.LockMode lockMode)
			throws PersistentException {
		try {
			PersistentSession session = citas.GestiondeCitasPersistentManager.instance().getSession();
			return loadCita_RealizadaByORMID(session, ID, lockMode);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static Cita_Realizada getCita_RealizadaByORMID(int ID, org.hibernate.LockMode lockMode)
			throws PersistentException {
		try {
			PersistentSession session = citas.GestiondeCitasPersistentManager.instance().getSession();
			return getCita_RealizadaByORMID(session, ID, lockMode);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static Cita_Realizada loadCita_RealizadaByORMID(PersistentSession session, int ID)
			throws PersistentException {
		try {
			return (Cita_Realizada) session.load(citas.Cita_Realizada.class, new Integer(ID));
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static Cita_Realizada getCita_RealizadaByORMID(PersistentSession session, int ID)
			throws PersistentException {
		try {
			return (Cita_Realizada) session.get(citas.Cita_Realizada.class, new Integer(ID));
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static Cita_Realizada loadCita_RealizadaByORMID(PersistentSession session, int ID,
			org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Cita_Realizada) session.load(citas.Cita_Realizada.class, new Integer(ID), lockMode);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static Cita_Realizada getCita_RealizadaByORMID(PersistentSession session, int ID,
			org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Cita_Realizada) session.get(citas.Cita_Realizada.class, new Integer(ID), lockMode);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static List queryCita_Realizada(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = citas.GestiondeCitasPersistentManager.instance().getSession();
			return queryCita_Realizada(session, condition, orderBy);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static List queryCita_Realizada(String condition, String orderBy, org.hibernate.LockMode lockMode)
			throws PersistentException {
		try {
			PersistentSession session = citas.GestiondeCitasPersistentManager.instance().getSession();
			return queryCita_Realizada(session, condition, orderBy, lockMode);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static Cita_Realizada[] listCita_RealizadaByQuery(String condition, String orderBy)
			throws PersistentException {
		try {
			PersistentSession session = citas.GestiondeCitasPersistentManager.instance().getSession();
			return listCita_RealizadaByQuery(session, condition, orderBy);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static Cita_Realizada[] listCita_RealizadaByQuery(String condition, String orderBy,
			org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = citas.GestiondeCitasPersistentManager.instance().getSession();
			return listCita_RealizadaByQuery(session, condition, orderBy, lockMode);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static List queryCita_Realizada(PersistentSession session, String condition, String orderBy)
			throws PersistentException {
		StringBuffer sb = new StringBuffer("From citas.Cita_Realizada as Cita_Realizada");
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

	public static List queryCita_Realizada(PersistentSession session, String condition, String orderBy,
			org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From citas.Cita_Realizada as Cita_Realizada");
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

	public static Cita_Realizada[] listCita_RealizadaByQuery(PersistentSession session, String condition,
			String orderBy) throws PersistentException {
		try {
			List list = queryCita_Realizada(session, condition, orderBy);
			return (Cita_Realizada[]) list.toArray(new Cita_Realizada[list.size()]);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static Cita_Realizada[] listCita_RealizadaByQuery(PersistentSession session, String condition,
			String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryCita_Realizada(session, condition, orderBy, lockMode);
			return (Cita_Realizada[]) list.toArray(new Cita_Realizada[list.size()]);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static Cita_Realizada loadCita_RealizadaByQuery(String condition, String orderBy)
			throws PersistentException {
		try {
			PersistentSession session = citas.GestiondeCitasPersistentManager.instance().getSession();
			return loadCita_RealizadaByQuery(session, condition, orderBy);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static Cita_Realizada loadCita_RealizadaByQuery(String condition, String orderBy,
			org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = citas.GestiondeCitasPersistentManager.instance().getSession();
			return loadCita_RealizadaByQuery(session, condition, orderBy, lockMode);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static Cita_Realizada loadCita_RealizadaByQuery(PersistentSession session, String condition, String orderBy)
			throws PersistentException {
		Cita_Realizada[] cita_Realizadas = listCita_RealizadaByQuery(session, condition, orderBy);
		if (cita_Realizadas != null && cita_Realizadas.length > 0)
			return cita_Realizadas[0];
		else
			return null;
	}

	public static Cita_Realizada loadCita_RealizadaByQuery(PersistentSession session, String condition, String orderBy,
			org.hibernate.LockMode lockMode) throws PersistentException {
		Cita_Realizada[] cita_Realizadas = listCita_RealizadaByQuery(session, condition, orderBy, lockMode);
		if (cita_Realizadas != null && cita_Realizadas.length > 0)
			return cita_Realizadas[0];
		else
			return null;
	}

	public static java.util.Iterator iterateCita_RealizadaByQuery(String condition, String orderBy)
			throws PersistentException {
		try {
			PersistentSession session = citas.GestiondeCitasPersistentManager.instance().getSession();
			return iterateCita_RealizadaByQuery(session, condition, orderBy);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static java.util.Iterator iterateCita_RealizadaByQuery(String condition, String orderBy,
			org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = citas.GestiondeCitasPersistentManager.instance().getSession();
			return iterateCita_RealizadaByQuery(session, condition, orderBy, lockMode);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static java.util.Iterator iterateCita_RealizadaByQuery(PersistentSession session, String condition,
			String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From citas.Cita_Realizada as Cita_Realizada");
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

	public static java.util.Iterator iterateCita_RealizadaByQuery(PersistentSession session, String condition,
			String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From citas.Cita_Realizada as Cita_Realizada");
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

	public static Cita_Realizada createCita_Realizada() {
		return new citas.Cita_Realizada();
	}

	public static boolean save(citas.Cita_Realizada cita_Realizada) throws PersistentException {
		try {
			citas.GestiondeCitasPersistentManager.instance().saveObject(cita_Realizada);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static boolean delete(citas.Cita_Realizada cita_Realizada) throws PersistentException {
		try {
			citas.GestiondeCitasPersistentManager.instance().deleteObject(cita_Realizada);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static boolean deleteAndDissociate(citas.Cita_Realizada cita_Realizada) throws PersistentException {
		try {
			if (cita_Realizada.getEs_para() != null) {
				cita_Realizada.getEs_para().de_la_cita.remove(cita_Realizada);
			}

			if (cita_Realizada.getFecha() != null) {
				cita_Realizada.getFecha().setCita(null);
			}

			return delete(cita_Realizada);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static boolean deleteAndDissociate(citas.Cita_Realizada cita_Realizada, org.orm.PersistentSession session)
			throws PersistentException {
		try {
			if (cita_Realizada.getEs_para() != null) {
				cita_Realizada.getEs_para().de_la_cita.remove(cita_Realizada);
			}

			if (cita_Realizada.getFecha() != null) {
				cita_Realizada.getFecha().setCita(null);
			}

			try {
				session.delete(cita_Realizada);
				return true;
			} catch (Exception e) {
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static boolean refresh(citas.Cita_Realizada cita_Realizada) throws PersistentException {
		try {
			citas.GestiondeCitasPersistentManager.instance().getSession().refresh(cita_Realizada);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static boolean evict(citas.Cita_Realizada cita_Realizada) throws PersistentException {
		try {
			citas.GestiondeCitasPersistentManager.instance().getSession().evict(cita_Realizada);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static Cita_Realizada loadCita_RealizadaByCriteria(Cita_RealizadaCriteria cita_RealizadaCriteria) {
		Cita_Realizada[] cita_Realizadas = listCita_RealizadaByCriteria(cita_RealizadaCriteria);
		if (cita_Realizadas == null || cita_Realizadas.length == 0) {
			return null;
		}
		return cita_Realizadas[0];
	}

	public static Cita_Realizada[] listCita_RealizadaByCriteria(Cita_RealizadaCriteria cita_RealizadaCriteria) {
		return cita_RealizadaCriteria.listCita_Realizada();
	}
}

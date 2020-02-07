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

public class ClienteDAO {
	public static Cliente loadClienteByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = citas.GestiondeCitasPersistentManager.instance().getSession();
			return loadClienteByORMID(session, ID);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static Cliente getClienteByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = citas.GestiondeCitasPersistentManager.instance().getSession();
			return getClienteByORMID(session, ID);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static Cliente loadClienteByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = citas.GestiondeCitasPersistentManager.instance().getSession();
			return loadClienteByORMID(session, ID, lockMode);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static Cliente getClienteByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = citas.GestiondeCitasPersistentManager.instance().getSession();
			return getClienteByORMID(session, ID, lockMode);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static Cliente loadClienteByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Cliente) session.load(citas.Cliente.class, new Integer(ID));
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static Cliente getClienteByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Cliente) session.get(citas.Cliente.class, new Integer(ID));
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static Cliente loadClienteByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)
			throws PersistentException {
		try {
			return (Cliente) session.load(citas.Cliente.class, new Integer(ID), lockMode);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static Cliente getClienteByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode)
			throws PersistentException {
		try {
			return (Cliente) session.get(citas.Cliente.class, new Integer(ID), lockMode);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static List queryCliente(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = citas.GestiondeCitasPersistentManager.instance().getSession();
			return queryCliente(session, condition, orderBy);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static List queryCliente(String condition, String orderBy, org.hibernate.LockMode lockMode)
			throws PersistentException {
		try {
			PersistentSession session = citas.GestiondeCitasPersistentManager.instance().getSession();
			return queryCliente(session, condition, orderBy, lockMode);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static Cliente[] listClienteByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = citas.GestiondeCitasPersistentManager.instance().getSession();
			return listClienteByQuery(session, condition, orderBy);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static Cliente[] listClienteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode)
			throws PersistentException {
		try {
			PersistentSession session = citas.GestiondeCitasPersistentManager.instance().getSession();
			return listClienteByQuery(session, condition, orderBy, lockMode);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static List queryCliente(PersistentSession session, String condition, String orderBy)
			throws PersistentException {
		StringBuffer sb = new StringBuffer("From citas.Cliente as Cliente");
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

	public static List queryCliente(PersistentSession session, String condition, String orderBy,
			org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From citas.Cliente as Cliente");
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

	public static Cliente[] listClienteByQuery(PersistentSession session, String condition, String orderBy)
			throws PersistentException {
		try {
			List list = queryCliente(session, condition, orderBy);
			return (Cliente[]) list.toArray(new Cliente[list.size()]);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static Cliente[] listClienteByQuery(PersistentSession session, String condition, String orderBy,
			org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryCliente(session, condition, orderBy, lockMode);
			return (Cliente[]) list.toArray(new Cliente[list.size()]);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static Cliente loadClienteByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = citas.GestiondeCitasPersistentManager.instance().getSession();
			return loadClienteByQuery(session, condition, orderBy);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static Cliente loadClienteByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode)
			throws PersistentException {
		try {
			PersistentSession session = citas.GestiondeCitasPersistentManager.instance().getSession();
			return loadClienteByQuery(session, condition, orderBy, lockMode);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static Cliente loadClienteByQuery(PersistentSession session, String condition, String orderBy)
			throws PersistentException {
		Cliente[] clientes = listClienteByQuery(session, condition, orderBy);
		if (clientes != null && clientes.length > 0)
			return clientes[0];
		else
			return null;
	}

	public static Cliente loadClienteByQuery(PersistentSession session, String condition, String orderBy,
			org.hibernate.LockMode lockMode) throws PersistentException {
		Cliente[] clientes = listClienteByQuery(session, condition, orderBy, lockMode);
		if (clientes != null && clientes.length > 0)
			return clientes[0];
		else
			return null;
	}

	public static java.util.Iterator iterateClienteByQuery(String condition, String orderBy)
			throws PersistentException {
		try {
			PersistentSession session = citas.GestiondeCitasPersistentManager.instance().getSession();
			return iterateClienteByQuery(session, condition, orderBy);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static java.util.Iterator iterateClienteByQuery(String condition, String orderBy,
			org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = citas.GestiondeCitasPersistentManager.instance().getSession();
			return iterateClienteByQuery(session, condition, orderBy, lockMode);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static java.util.Iterator iterateClienteByQuery(PersistentSession session, String condition, String orderBy)
			throws PersistentException {
		StringBuffer sb = new StringBuffer("From citas.Cliente as Cliente");
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

	public static java.util.Iterator iterateClienteByQuery(PersistentSession session, String condition, String orderBy,
			org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From citas.Cliente as Cliente");
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

	public static Cliente createCliente() {
		return new citas.Cliente();
	}

	public static boolean save(citas.Cliente cliente) throws PersistentException {
		try {
			citas.GestiondeCitasPersistentManager.instance().saveObject(cliente);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static boolean delete(citas.Cliente cliente) throws PersistentException {
		try {
			citas.GestiondeCitasPersistentManager.instance().deleteObject(cliente);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static boolean deleteAndDissociate(citas.Cliente cliente) throws PersistentException {
		try {
			citas.Fecha[] lFechass = cliente.fechas.toArray();
			for (int i = 0; i < lFechass.length; i++) {
				lFechass[i].setCliente(null);
			}
			return delete(cliente);
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static boolean deleteAndDissociate(citas.Cliente cliente, org.orm.PersistentSession session)
			throws PersistentException {
		try {
			citas.Fecha[] lFechass = cliente.fechas.toArray();
			for (int i = 0; i < lFechass.length; i++) {
				lFechass[i].setCliente(null);
			}
			try {
				session.delete(cliente);
				return true;
			} catch (Exception e) {
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static boolean refresh(citas.Cliente cliente) throws PersistentException {
		try {
			citas.GestiondeCitasPersistentManager.instance().getSession().refresh(cliente);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static boolean evict(citas.Cliente cliente) throws PersistentException {
		try {
			citas.GestiondeCitasPersistentManager.instance().getSession().evict(cliente);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static Cliente loadClienteByCriteria(ClienteCriteria clienteCriteria) {
		Cliente[] clientes = listClienteByCriteria(clienteCriteria);
		if (clientes == null || clientes.length == 0) {
			return null;
		}
		return clientes[0];
	}

	public static Cliente[] listClienteByCriteria(ClienteCriteria clienteCriteria) {
		return clienteCriteria.listCliente();
	}
}

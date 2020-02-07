package citas;

import java.util.List;
import java.io.Serializable;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

public class Bd_Clientes implements Serializable {

	public Cliente Cargar_Informacion_Cliente(int Cita) throws PersistentException {
		Cliente cl = null;
		PersistentTransaction t = citas.GestiondeCitasPersistentManager.instance().getSession().beginTransaction();
		try {

			citas.Cita c = citas.CitaDAO.getCitaByORMID(Cita);
			cl = citas.ClienteDAO.getClienteByORMID(c.getCliente().getID());

			t.commit();
		} catch (Exception e) {
			t.rollback();
		}

		return cl;

	}

	public int Nuevo_Cliente(String Nombre, String Direccion, String Telefono) throws PersistentException {
		int id_cliente = -1;
		PersistentTransaction t = citas.GestiondeCitasPersistentManager.instance().getSession().beginTransaction();
		try {

			Cliente cl = citas.ClienteDAO.createCliente();
			cl.setNombre(Nombre);
			cl.setDireccion(Direccion);
			cl.setTelefono(Telefono);
			citas.ClienteDAO.save(cl);
			id_cliente = cl.getORMID();
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}

		return id_cliente;
	}

	public List Cargar_Clientes() throws PersistentException {
		List clientes = null;
		PersistentTransaction t = citas.GestiondeCitasPersistentManager.instance().getSession().beginTransaction();
		try {
			clientes = citas.ClienteDAO.queryCliente(null, null);

		} catch (Exception e) {
			t.rollback();
		}

		return clientes;
	}
}

package citas;

import java.util.Calendar;
import java.util.List;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;
import java.io.Serializable;

public class Bd_Asuntos implements Serializable {

	public int Crear_Asunto(String Asunto) throws PersistentException {
		int id_asunto = -1;
		PersistentTransaction t = GestiondeCitasPersistentManager.instance().getSession().beginTransaction();
		try {

			Asunto as = citas.AsuntoDAO.createAsunto();
			as.setNombre(Asunto);
			citas.AsuntoDAO.save(as);
			id_asunto = as.getORMID();
			t.commit();
		} catch (Exception e) {
			t.rollback();
		}

		return id_asunto;
	};

	public List Cargar_Asuntos() throws PersistentException {
		List asuntos = null;
		PersistentTransaction t = GestiondeCitasPersistentManager.instance().getSession().beginTransaction();
		try {
			asuntos = citas.AsuntoDAO.queryAsunto(null, null);

		} catch (Exception e) {
			t.rollback();
		}

		return asuntos;
	}

}

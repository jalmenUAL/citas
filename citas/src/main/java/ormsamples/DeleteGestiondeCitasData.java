/**
 * Licensee: Daniel Landa
 * License Type: Purchased
 */
package ormsamples;

import org.orm.*;
public class DeleteGestiondeCitasData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = citas.GestiondeCitasPersistentManager.instance().getSession().beginTransaction();
		try {
			citas.Cita lcitasCita = citas.CitaDAO.loadCitaByQuery(null, null);
			// Delete the persistent object
			citas.CitaDAO.delete(lcitasCita);
			citas.Cita_Activa lcitasCita_Activa = citas.Cita_ActivaDAO.loadCita_ActivaByQuery(null, null);
			// Delete the persistent object
			citas.Cita_ActivaDAO.delete(lcitasCita_Activa);
			citas.Cita_Realizada lcitasCita_Realizada = citas.Cita_RealizadaDAO.loadCita_RealizadaByQuery(null, null);
			// Delete the persistent object
			citas.Cita_RealizadaDAO.delete(lcitasCita_Realizada);
			citas.Asunto lcitasAsunto = citas.AsuntoDAO.loadAsuntoByQuery(null, null);
			// Delete the persistent object
			citas.AsuntoDAO.delete(lcitasAsunto);
			citas.Cliente lcitasCliente = citas.ClienteDAO.loadClienteByQuery(null, null);
			// Delete the persistent object
			citas.ClienteDAO.delete(lcitasCliente);
			citas.Fecha lcitasFecha = citas.FechaDAO.loadFechaByQuery(null, null);
			// Delete the persistent object
			citas.FechaDAO.delete(lcitasFecha);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteGestiondeCitasData deleteGestiondeCitasData = new DeleteGestiondeCitasData();
			try {
				deleteGestiondeCitasData.deleteTestData();
			}
			finally {
				citas.GestiondeCitasPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}

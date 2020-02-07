/**
 * Licensee: Daniel Landa
 * License Type: Purchased
 */
package ormsamples;

import org.orm.*;
public class CreateGestiondeCitasData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = citas.GestiondeCitasPersistentManager.instance().getSession().beginTransaction();
		try {
			citas.Cita lcitasCita = citas.CitaDAO.createCita();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : fecha, es_para
			citas.CitaDAO.save(lcitasCita);
			citas.Cita_Activa lcitasCita_Activa = citas.Cita_ActivaDAO.createCita_Activa();
			// Initialize the properties of the persistent object here
			citas.Cita_ActivaDAO.save(lcitasCita_Activa);
			citas.Cita_Realizada lcitasCita_Realizada = citas.Cita_RealizadaDAO.createCita_Realizada();
			// Initialize the properties of the persistent object here
			citas.Cita_RealizadaDAO.save(lcitasCita_Realizada);
			citas.Asunto lcitasAsunto = citas.AsuntoDAO.createAsunto();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : de_la_cita
			citas.AsuntoDAO.save(lcitasAsunto);
			citas.Cliente lcitasCliente = citas.ClienteDAO.createCliente();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : fechas
			citas.ClienteDAO.save(lcitasCliente);
			citas.Fecha lcitasFecha = citas.FechaDAO.createFecha();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : cliente, cita, anyo, mes, dia
			citas.FechaDAO.save(lcitasFecha);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateGestiondeCitasData createGestiondeCitasData = new CreateGestiondeCitasData();
			try {
				createGestiondeCitasData.createTestData();
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

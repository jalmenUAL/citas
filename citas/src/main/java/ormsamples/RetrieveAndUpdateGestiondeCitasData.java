/**
 * Licensee: Daniel Landa
 * License Type: Purchased
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateGestiondeCitasData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = citas.GestiondeCitasPersistentManager.instance().getSession().beginTransaction();
		try {
			citas.Cita lcitasCita = citas.CitaDAO.loadCitaByQuery(null, null);
			// Update the properties of the persistent object
			citas.CitaDAO.save(lcitasCita);
			citas.Cita_Activa lcitasCita_Activa = citas.Cita_ActivaDAO.loadCita_ActivaByQuery(null, null);
			// Update the properties of the persistent object
			citas.Cita_ActivaDAO.save(lcitasCita_Activa);
			citas.Cita_Realizada lcitasCita_Realizada = citas.Cita_RealizadaDAO.loadCita_RealizadaByQuery(null, null);
			// Update the properties of the persistent object
			citas.Cita_RealizadaDAO.save(lcitasCita_Realizada);
			citas.Asunto lcitasAsunto = citas.AsuntoDAO.loadAsuntoByQuery(null, null);
			// Update the properties of the persistent object
			citas.AsuntoDAO.save(lcitasAsunto);
			citas.Cliente lcitasCliente = citas.ClienteDAO.loadClienteByQuery(null, null);
			// Update the properties of the persistent object
			citas.ClienteDAO.save(lcitasCliente);
			citas.Fecha lcitasFecha = citas.FechaDAO.loadFechaByQuery(null, null);
			// Update the properties of the persistent object
			citas.FechaDAO.save(lcitasFecha);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Cita by CitaCriteria");
		citas.CitaCriteria lcitasCitaCriteria = new citas.CitaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lcitasCitaCriteria.ID.eq();
		System.out.println(lcitasCitaCriteria.uniqueCita());
		
		System.out.println("Retrieving Cita_Activa by Cita_ActivaCriteria");
		citas.Cita_ActivaCriteria lcitasCita_ActivaCriteria = new citas.Cita_ActivaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lcitasCita_ActivaCriteria.ID.eq();
		System.out.println(lcitasCita_ActivaCriteria.uniqueCita_Activa());
		
		System.out.println("Retrieving Cita_Realizada by Cita_RealizadaCriteria");
		citas.Cita_RealizadaCriteria lcitasCita_RealizadaCriteria = new citas.Cita_RealizadaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lcitasCita_RealizadaCriteria.ID.eq();
		System.out.println(lcitasCita_RealizadaCriteria.uniqueCita_Realizada());
		
		System.out.println("Retrieving Asunto by AsuntoCriteria");
		citas.AsuntoCriteria lcitasAsuntoCriteria = new citas.AsuntoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lcitasAsuntoCriteria.ID.eq();
		System.out.println(lcitasAsuntoCriteria.uniqueAsunto());
		
		System.out.println("Retrieving Cliente by ClienteCriteria");
		citas.ClienteCriteria lcitasClienteCriteria = new citas.ClienteCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lcitasClienteCriteria.ID.eq();
		System.out.println(lcitasClienteCriteria.uniqueCliente());
		
		System.out.println("Retrieving Fecha by FechaCriteria");
		citas.FechaCriteria lcitasFechaCriteria = new citas.FechaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lcitasFechaCriteria.ID.eq();
		System.out.println(lcitasFechaCriteria.uniqueFecha());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateGestiondeCitasData retrieveAndUpdateGestiondeCitasData = new RetrieveAndUpdateGestiondeCitasData();
			try {
				retrieveAndUpdateGestiondeCitasData.retrieveAndUpdateTestData();
				//retrieveAndUpdateGestiondeCitasData.retrieveByCriteria();
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

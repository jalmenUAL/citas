/**
 * Licensee: Daniel Landa
 * License Type: Purchased
 */
package ormsamples;

import org.orm.*;
public class ListGestiondeCitasData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Cita...");
		citas.Cita[] citasCitas = citas.CitaDAO.listCitaByQuery(null, null);
		int length = Math.min(citasCitas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(citasCitas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Cita_Activa...");
		citas.Cita_Activa[] citasCita_Activas = citas.Cita_ActivaDAO.listCita_ActivaByQuery(null, null);
		length = Math.min(citasCita_Activas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(citasCita_Activas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Cita_Realizada...");
		citas.Cita_Realizada[] citasCita_Realizadas = citas.Cita_RealizadaDAO.listCita_RealizadaByQuery(null, null);
		length = Math.min(citasCita_Realizadas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(citasCita_Realizadas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Asunto...");
		citas.Asunto[] citasAsuntos = citas.AsuntoDAO.listAsuntoByQuery(null, null);
		length = Math.min(citasAsuntos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(citasAsuntos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Cliente...");
		citas.Cliente[] citasClientes = citas.ClienteDAO.listClienteByQuery(null, null);
		length = Math.min(citasClientes.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(citasClientes[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Fecha...");
		citas.Fecha[] citasFechas = citas.FechaDAO.listFechaByQuery(null, null);
		length = Math.min(citasFechas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(citasFechas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException  {
		System.out.println("Listing Cita by Criteria...");
		citas.CitaCriteria lcitasCitaCriteria = new citas.CitaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lcitasCitaCriteria.ID.eq();
		lcitasCitaCriteria.setMaxResults(ROW_COUNT);
		citas.Cita[] citasCitas = lcitasCitaCriteria.listCita();
		int length =citasCitas== null ? 0 : Math.min(citasCitas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(citasCitas[i]);
		}
		System.out.println(length + " Cita record(s) retrieved."); 
		
		System.out.println("Listing Cita_Activa by Criteria...");
		citas.Cita_ActivaCriteria lcitasCita_ActivaCriteria = new citas.Cita_ActivaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lcitasCita_ActivaCriteria.ID.eq();
		lcitasCita_ActivaCriteria.setMaxResults(ROW_COUNT);
		citas.Cita_Activa[] citasCita_Activas = lcitasCita_ActivaCriteria.listCita_Activa();
		length =citasCita_Activas== null ? 0 : Math.min(citasCita_Activas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(citasCita_Activas[i]);
		}
		System.out.println(length + " Cita_Activa record(s) retrieved."); 
		
		System.out.println("Listing Cita_Realizada by Criteria...");
		citas.Cita_RealizadaCriteria lcitasCita_RealizadaCriteria = new citas.Cita_RealizadaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lcitasCita_RealizadaCriteria.ID.eq();
		lcitasCita_RealizadaCriteria.setMaxResults(ROW_COUNT);
		citas.Cita_Realizada[] citasCita_Realizadas = lcitasCita_RealizadaCriteria.listCita_Realizada();
		length =citasCita_Realizadas== null ? 0 : Math.min(citasCita_Realizadas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(citasCita_Realizadas[i]);
		}
		System.out.println(length + " Cita_Realizada record(s) retrieved."); 
		
		System.out.println("Listing Asunto by Criteria...");
		citas.AsuntoCriteria lcitasAsuntoCriteria = new citas.AsuntoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lcitasAsuntoCriteria.ID.eq();
		lcitasAsuntoCriteria.setMaxResults(ROW_COUNT);
		citas.Asunto[] citasAsuntos = lcitasAsuntoCriteria.listAsunto();
		length =citasAsuntos== null ? 0 : Math.min(citasAsuntos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(citasAsuntos[i]);
		}
		System.out.println(length + " Asunto record(s) retrieved."); 
		
		System.out.println("Listing Cliente by Criteria...");
		citas.ClienteCriteria lcitasClienteCriteria = new citas.ClienteCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lcitasClienteCriteria.ID.eq();
		lcitasClienteCriteria.setMaxResults(ROW_COUNT);
		citas.Cliente[] citasClientes = lcitasClienteCriteria.listCliente();
		length =citasClientes== null ? 0 : Math.min(citasClientes.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(citasClientes[i]);
		}
		System.out.println(length + " Cliente record(s) retrieved."); 
		
		System.out.println("Listing Fecha by Criteria...");
		citas.FechaCriteria lcitasFechaCriteria = new citas.FechaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lcitasFechaCriteria.ID.eq();
		lcitasFechaCriteria.setMaxResults(ROW_COUNT);
		citas.Fecha[] citasFechas = lcitasFechaCriteria.listFecha();
		length =citasFechas== null ? 0 : Math.min(citasFechas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(citasFechas[i]);
		}
		System.out.println(length + " Fecha record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListGestiondeCitasData listGestiondeCitasData = new ListGestiondeCitasData();
			try {
				listGestiondeCitasData.listTestData();
				//listGestiondeCitasData.listByCriteria();
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

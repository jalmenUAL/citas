package citas;

import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;

public class Dar_de_Alta_Cita extends Dar_de_Alta_Cita_Ventana {

	iAdministrador adm = new Bd_Principal();
	Poner_Cliente pcl = new Poner_Cliente();
	Poner_Asunto pas = new Poner_Asunto();
	Poner_Fecha pf = new Poner_Fecha();

	
	public Dar_de_Alta_Cita() {

		Inicializar();
		
        
		/*darDeAltaCita.addClickListener(new Button.ClickListener() {
		     

			@Override
			public void buttonClick(ClickEvent event) {
				darDeAltaCita();
				 
				pcl.setData(pcl.adm.Cargar_Clientes());
				pas.setData(pcl.adm.Cargar_Asuntos());
				
			}

		});*/

	};

	void darDeAltaCita() {
		if (pcl.cliente) {
			if (pas.asunto) {

				adm.Crear_Cita_Asunto_Cliente_Nuevos(pf.selectorFecha.getValue(), pas.nuevoNombreAsunto.getValue(),
						pcl.nuevoNombreCliente.getValue(), pcl.nuevaDireccionCliente.getValue(),
						pcl.nuevoTelefonoCliente.getValue());
				pas.nuevoAsuntoLayout.setVisible(false);
				pas.asunto = false;
				pcl.nombreLayout.setVisible(false);
				pcl.telefonoLayout.setVisible(false);
				pcl.direccionLayout.setVisible(false);
				pcl.cliente = false;

			} else {
				Asunto asunto = pas.getComboAsunto().getValue();
				 
				 
				adm.Crear_Cita_Nuevo_Cliente(pf.selectorFecha.getValue(), pcl.nuevoNombreCliente.getValue(),
						pcl.nuevaDireccionCliente.getValue(), pcl.nuevoTelefonoCliente.getValue(), asunto.getORMID());

				pcl.nombreLayout.setVisible(false);
				pcl.telefonoLayout.setVisible(false);
				pcl.direccionLayout.setVisible(false);
				pcl.cliente = false;
			}
		} else {
			if (pas.asunto) {

				Cliente cliente = pcl.getComboCliente().getValue();
				 
				 
				adm.Crear_Cita_Nuevo_Asunto(pf.selectorFecha.getValue(), pas.nuevoNombreAsunto.getValue(),
						cliente.getORMID());
				pas.asunto = false;
			} else {
				 
				 
				Asunto asunto = pas.getComboAsunto().getValue();
				Cliente cliente = pcl.getComboCliente().getValue();
				 
				 
				 
				adm.Crear_Cita(pf.selectorFecha.getValue(), cliente.getORMID(), 
						asunto.getORMID());

			}
		}

	}
	
	void Inicializar(){
		ponerClienteLayout.addComponent(pcl);
		ponerAsuntoLayout.addComponent(pas);
		ponerFechaLayout.addComponent(pf);
	}

	public Button getDardeAltaCita() {
		return this.darDeAltaCita;
	};
}

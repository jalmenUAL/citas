package citas;

import java.util.List;
import java.util.Optional;

import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Grid.SelectionMode;
import com.vaadin.ui.Notification;

public class Ver_Citas extends Ver_Citas_Ventana {

	iAdministrador adm = new Bd_Principal();
	Ver_Informacion_de_Cliente_Ventana vinfo = new Ver_Informacion_de_Cliente();

	public Ver_Citas() {

		Inicializar();
		citas.addComponent(vinfo);
		vinfo.setVisible(false);
		//tablaDeCitasPendientes.setSelectionMode(SelectionMode.SINGLE);
		/*tablaDeCitasPendientes.addColumn("Id");
		tablaDeCitasPendientes.addColumn("cliente");
		tablaDeCitasPendientes.addColumn("asunto");
		tablaDeCitasPendientes.addColumn("Día");
		tablaDeCitasPendientes.addColumn("Mes");
		tablaDeCitasPendientes.addColumn("Año");
		tablaDeCitasRealizadas.setSelectionMode(SelectionMode.SINGLE);
		tablaDeCitasRealizadas.addColumn("Id");
		tablaDeCitasRealizadas.addColumn("cliente");
		tablaDeCitasRealizadas.addColumn("asunto");
		tablaDeCitasRealizadas.addColumn("Día");
		tablaDeCitasRealizadas.addColumn("Mes");
		tablaDeCitasRealizadas.addColumn("Año");*/

		Cargar_Citas();

		/*verInformacionDeCliente.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {

				verInformacionDeCliente();
			}
		});*/
	}
	
	void Inicializar(){
		
		actualizarcitas.setVisible(false);
		dardebajacitas.setVisible(false);
		
	}

	void verInformacionDeCliente() {
		if (tablaDeCitasPendientes.getSelectedItems().size() > 0)

		{
			vinfo.setVisible(true);
			Optional<CitaActiva> item = tablaDeCitasPendientes.getSelectionModel().getFirstSelectedItem();
			
			item.ifPresent(cita -> {
				
				Integer id = cita.getCitaid();
				
				Cliente cli = adm.Cargar_Informacion_Cliente(id);
				vinfo.verNombre.setValue(cli.getNombre());
				vinfo.verDireccion.setValue(cli.getDireccion());
				vinfo.verTelefono.setValue(cli.getTelefono());
				tablaDeCitasPendientes.getSelectionModel().deselectAll();
			
			});

			

		} else if (tablaDeCitasRealizadas.getSelectedItems().size() > 0)

		{
			vinfo.setVisible(true);
			Optional<CitaActiva> item = tablaDeCitasPendientes.getSelectionModel().getFirstSelectedItem();
			
			item.ifPresent(cita -> {
				Integer id;
				id = cita.getCitaid();
				
				Cliente cli = adm.Cargar_Informacion_Cliente(id);
				vinfo.verNombre.setValue(cli.getNombre());
				vinfo.verDireccion.setValue(cli.getDireccion());
				vinfo.verTelefono.setValue(cli.getTelefono());
				tablaDeCitasRealizadas.getSelectionModel().deselectAll();
			});

			

		} else {
			Notification.show("Seleccione una cita",

					Notification.Type.WARNING_MESSAGE);
		}

	}

	public void Cargar_Citas() {
		
		List<Cita_Activa> ca = adm.Cargar_Citas_Pendientes();

		tablaDeCitasPendientes.setData(ca);

		/*for (Cita_Activa l : ca) {
			tablaDeCitasPendientes.addRow(Integer.toString(l.getORMID()), l.getCliente().getNombre(), l.getEs_para().getNombre(),
					Integer.toString(l.getFecha().getDia()), Integer.toString(l.getFecha().getMes() + 1),
					Integer.toString(l.getFecha().getAnyo()));
		}*/
		
		List<Cita_Realizada> cr = adm.Cargar_Citas_Realizadas();

		tablaDeCitasRealizadas.setData(ca);

	    /*	for (Cita_Realizada l : cr) {
			tablaDeCitasRealizadas.addRow(Integer.toString(l.getORMID()), l.getCliente().getNombre(),
					l.getEs_para().getNombre(), Integer.toString(l.getFecha().getDia()),
					Integer.toString(l.getFecha().getMes()), Integer.toString(l.getFecha().getAnyo()));
		}*/
	}
}

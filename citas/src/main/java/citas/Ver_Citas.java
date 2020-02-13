package citas;

import java.util.List;
import java.util.Optional;

import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Grid;
import com.vaadin.ui.Notification;

public class Ver_Citas extends Ver_Citas_Ventana {

	iAdministrador adm = new Bd_Principal();
	Ver_Informacion_de_Cliente_Ventana vinfo = new Ver_Informacion_de_Cliente();

	public Ver_Citas() {

		Inicializar();
		citas.addComponent(vinfo);
		vinfo.setVisible(false);
		Cargar_Citas();
		verInformacionDeCliente.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				verInformacionDeCliente();
			}
		});
	}

	void Inicializar() {

		actualizarcitas.setVisible(false);
		dardebajacitas.setVisible(false);

	}

	void verInformacionDeCliente() {
		if (tablaDeCitasPendientes.getSelectedItems().size() > 0)

		{
			vinfo.setVisible(true);
			Optional<Cita_Activa> item = tablaDeCitasPendientes.getSelectionModel().getFirstSelectedItem();
			item.ifPresent(cita -> {
				Integer id = cita.getID();
				Cliente cli = adm.Cargar_Informacion_Cliente(id);
				vinfo.verNombre.setValue(cli.getNombre());
				vinfo.verDireccion.setValue(cli.getDireccion());
				vinfo.verTelefono.setValue(cli.getTelefono());
				tablaDeCitasPendientes.getSelectionModel().deselectAll();
			});

		} else if (tablaDeCitasRealizadas.getSelectedItems().size() > 0)

		{
			vinfo.setVisible(true);
			Optional<Cita_Activa> item = tablaDeCitasPendientes.getSelectionModel().getFirstSelectedItem();

			item.ifPresent(cita -> {
				Integer id;
				id = cita.getID();

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

	public Grid<Cita_Activa> getCitasPendientes() {
		return tablaDeCitasPendientes;
	}

	public Grid<Cita_Realizada> getCitasRealizadas() {
		return tablaDeCitasRealizadas;
	}

	public void Cargar_Citas() {

		List<Cita_Activa> ca = adm.Cargar_Citas_Pendientes();
		getCitasPendientes().removeAllColumns();
		getCitasPendientes().setItems(ca);
		getCitasPendientes().addColumn(Cita_Activa -> Cita_Activa.getCliente().getNombre()).setCaption("Ciente");
		getCitasPendientes().addColumn(Cita_Activa -> Cita_Activa.getFecha().getDia()).setCaption("Día");
		;
		getCitasPendientes().addColumn(Cita_Activa -> Cita_Activa.getFecha().getMes()).setCaption("Mes");
		;
		getCitasPendientes().addColumn(Cita_Activa -> Cita_Activa.getFecha().getAnyo()).setCaption("Año");
		;
		getCitasPendientes().addColumn(Cita_Activa -> Cita_Activa.getEs_para().getNombre()).setCaption("Asunto");
		;

		List<Cita_Realizada> cr = adm.Cargar_Citas_Realizadas();
		getCitasRealizadas().removeAllColumns();
		getCitasRealizadas().setItems(cr);
		getCitasRealizadas().addColumn(Cita_Realizada -> Cita_Realizada.getCliente().getNombre()).setCaption("Cliente");
		;
		getCitasRealizadas().addColumn(Cita_Realizada -> Cita_Realizada.getFecha().getDia()).setCaption("Día");
		;
		getCitasRealizadas().addColumn(Cita_Realizada -> Cita_Realizada.getFecha().getMes()).setCaption("Mes");
		;
		getCitasRealizadas().addColumn(Cita_Realizada -> Cita_Realizada.getFecha().getAnyo()).setCaption("Añoo");
		;
		getCitasRealizadas().addColumn(Cita_Realizada -> Cita_Realizada.getEs_para().getNombre()).setCaption("Asunto");
		;
	}
}

package citas;

import java.util.List;
import java.util.Optional;

import com.vaadin.ui.Button;
import com.vaadin.ui.Notification;
import com.vaadin.ui.Button.ClickEvent;

public class Actualizar_Citas extends Ver_Citas {

	iUsuario usu = new Bd_Principal();

	 
    
	public Actualizar_Citas() {

		super();
		setCaption("Actualizar Citas");
		Inicializar();

		RealizarCita.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				RealizarCita();
			}
		});

		PosponerCita.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				PosponerCita();
			}
		});
		cambiarFecha.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				cambiarFecha();
			}
		});
	}

	void Inicializar(){
		dardebajacitas.setVisible(false);
		actualizarcitas.setVisible(true);
		fechaPospuesta.setVisible(false);
		cambiarFecha.setVisible(false);
	}
	
	 
	
	void RealizarCita() {
		
		if (tablaDeCitasPendientes.getSelectedItems().size() > 0) {
        Optional<CitaActiva> item = 
        	tablaDeCitasPendientes.getSelectionModel().getFirstSelectedItem();
			
			item.ifPresent(cita -> {
				Integer id;
				id = cita.getCitaid();
			usu.Cita_Realizada(id);
			Cargar_Citas();
			});
		} else {
			Notification.show("Seleccione una cita",Notification.Type.WARNING_MESSAGE);
		}
	};
	
	void PosponerCita() {
		if (tablaDeCitasPendientes.getSelectedItems().size() > 0) {
			cambiarFecha.setVisible(true);
			fechaPospuesta.setVisible(true);
		} else {
			Notification.show("Seleccione una cita",

					Notification.Type.WARNING_MESSAGE);
		}
	}

	
	void cambiarFecha() {
		 
	        Optional<CitaActiva> item = 
	        	tablaDeCitasPendientes.getSelectionModel().getFirstSelectedItem();
				
				item.ifPresent(cita -> {
					Integer id;
					id = cita.getCitaid();
		            usu.Cita_Pospuesta(id,fechaPospuesta.getValue());
		            Cargar_Citas();
		            fechaPospuesta.setVisible(false);
		            cambiarFecha.setVisible(false);
				});
	}

}
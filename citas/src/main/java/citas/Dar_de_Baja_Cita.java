package citas;

import java.util.List;
import java.util.Optional;

import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Notification;
 

public class Dar_de_Baja_Cita extends Ver_Citas {

	

	iAdministrador adm = new Bd_Principal();

	public Dar_de_Baja_Cita() {

		super();
		setCaption("Dar de Baja a Cita");
		Inicializar();
		darDeBajaCita.addClickListener(new Button.ClickListener() {
		     

			 

			@Override
			public void buttonClick(ClickEvent event) {
				// TODO Auto-generated method stub
				darDeBajaCita();
			}
		});
	}

	void Inicializar(){
		dardebajacitas.setVisible(true);
	    actualizarcitas.setVisible(false);
	}
	void darDeBajaCita() {
		if (tablaDeCitasPendientes.getSelectedItems().size() > 0) {

			Optional<Cita_Activa> item = tablaDeCitasPendientes.asSingleSelect().getSelectedItem();
			item.ifPresent(cita -> {
			Integer id = cita.getID();

			adm.Baja_Cita_Activa(id);
			});

		} else {
			Notification.show("Seleccione una cita",

					Notification.Type.WARNING_MESSAGE);
		}
	}

	public Button getDardeBajaCita() {
		return this.darDeBajaCita;
	};

}

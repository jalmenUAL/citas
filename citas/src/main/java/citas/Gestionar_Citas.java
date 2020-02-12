package citas;

import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;

public class Gestionar_Citas extends Gestionar_Citas_Ventana {

	Button darDeAltaCitas;
	Button darDeBajaCitas;
	Ver_Citas vc = new Ver_Citas();
	Dar_de_Alta_Cita da = new Dar_de_Alta_Cita();
	Dar_de_Baja_Cita db = new Dar_de_Baja_Cita();

	public Gestionar_Citas() {

		Inicializar();

		darDeAltaCitas.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {

				darDeAltaCitas();

			}
		});
		darDeBajaCitas.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {

				darDeBajaCitas();
			}
		});

	}

	void Inicializar(){
		addComponent(vc);
		addComponent(da);
		addComponent(db);
		darDeAltaCitas = da.getDardeAltaCita();
		darDeBajaCitas = db.getDardeBajaCita();
	}
	void darDeAltaCitas() {
		vc.Cargar_Citas();
		db.Cargar_Citas();
	}

	void darDeBajaCitas() {
		vc.Cargar_Citas();
		db.Cargar_Citas();
	}

}

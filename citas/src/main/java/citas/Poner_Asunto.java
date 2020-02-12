package citas;

import java.util.List;

import com.vaadin.ui.Button;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.Button.ClickEvent;

public class Poner_Asunto extends Poner_Asunto_Ventana {

	Boolean asunto = false;

	iAdministrador adm = new Bd_Principal();
	List<Asunto> as = adm.Cargar_Asuntos();
	 
	public Poner_Asunto() {

		Inicializar();
		nuevoAsunto.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				nuevoAsunto();
			}
		});
	}
	
	void Inicializar(){
		ComboBox<Asunto> combo = getComboAsunto();
		nuevoNombreAsunto.setVisible(false);
		combo.setItemCaptionGenerator(Asunto::getNombre);
		combo.setItems(as);
		
		 
	}

	void nuevoAsunto() {
		nuevoNombreAsunto.setVisible(true);
		asunto = true;
	}

	ComboBox<Asunto> getComboAsunto() {
		return comboAsunto;
	};
}

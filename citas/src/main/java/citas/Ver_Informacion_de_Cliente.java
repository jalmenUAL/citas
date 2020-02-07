package citas;

import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Notification;

public class Ver_Informacion_de_Cliente extends Ver_Informacion_de_Cliente_Ventana {

	public Ver_Informacion_de_Cliente() {
		Inicializar();
		/*cerrar.addClickListener(new Button.ClickListener() {
		     

			 

			@Override
			public void buttonClick(ClickEvent event) {
				cerrar();
			}

		});*/
	}
	void Inicializar(){
		setVisible(false);
	}
	void cerrar(){
		setVisible(false);
	}
}

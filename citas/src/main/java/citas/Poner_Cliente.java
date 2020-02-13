package citas;

import java.util.List;

import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.ComboBox;

public class Poner_Cliente extends Poner_Cliente_Ventana {
	Boolean cliente = false;
	iAdministrador adm = new Bd_Principal();
	List<Cliente> cl = adm.Cargar_Clientes();

	public Poner_Cliente() {

		Inicializar();
		nuevoCliente.addClickListener(new Button.ClickListener() {
			public void buttonClick(ClickEvent event) {
				nuevoCliente();
			}
		});

	}

	void Inicializar() {
		ComboBox<Cliente> combo = getComboCliente();
		nuevoClienteLayout.setVisible(false);
		combo.setItemCaptionGenerator(Cliente::getNombre);
		combo.setItems(cl);

	}

	void nuevoCliente() {
		nuevoClienteLayout.setVisible(true);
		cliente = true;
	}

	ComboBox<Cliente> getComboCliente() {
		return comboCliente;
	};
}

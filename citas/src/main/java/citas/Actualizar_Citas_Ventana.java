package citas;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.Button;
import com.vaadin.ui.InlineDateField;
import com.vaadin.ui.Panel;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.declarative.Design;

/** 
 * !! DO NOT EDIT THIS FILE !!
 * 
 * This class is generated by Vaadin Designer and will be overwritten.
 * 
 * Please make a subclass with logic and additional interfaces as needed,
 * e.g class LoginView extends LoginDesign implements View { }
 */
@DesignRoot
@AutoGenerated
@SuppressWarnings("serial")
public class Actualizar_Citas_Ventana extends Panel {
	protected VerticalLayout verticalLayout;
	protected Button RealizarCita;
	protected Button PosponerCita;
	protected InlineDateField fechaPospuesta;
	protected Button cambiarFecha;

	public Actualizar_Citas_Ventana() {
		Design.read(this);
	}
}
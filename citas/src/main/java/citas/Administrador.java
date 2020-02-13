package citas;

import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.VerticalLayout;

/**
 * This UI is the application entry point. A UI may either represent a browser
 * window (or tab) or some part of a html page where a Vaadin application is
 * embedded.
 * <p>
 * The UI is initialized using {@link #init(VaadinRequest)}. This method is
 * intended to be overridden to add component to the user interface and
 * initialize non-component functionality.
 */


public class Administrador extends VerticalLayout {


	public Administrador() {
		 

		 
		addComponent(new Gestionar_Citas());
		 
	}

	 
}

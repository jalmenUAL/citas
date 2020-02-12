package citas;

 
 

public class Ver_Informacion_de_Cliente extends Ver_Informacion_de_Cliente_Ventana {

	public Ver_Informacion_de_Cliente() {
		Inicializar();
		
        cerrar2.addClickListener(event -> cerrar());

         

		 
	}
	void Inicializar(){
		setVisible(false);
	}
	void cerrar(){
		setVisible(false);
	}
}

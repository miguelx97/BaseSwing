package vista;

import javax.swing.JPanel;

import controlador.Controlador;

public interface IVentana {
	public void inicializar();
	public void hacerVisible();
	public void setControlador(Controlador c);
	public void definirPanel(JPanel panel);
}

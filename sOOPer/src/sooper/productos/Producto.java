package sooper.productos;

import sooper.IContenedor;
import sooper.IProducto;
import sooper.contenedores.Contenedor;

public abstract class Producto implements IProducto {
	private String referencia;
	private int peso;
	private int volumen;
	private  IContenedor contenedor;
	
	public Producto(String referencia,int peso, int volumen) {
		this.referencia= referencia;
		this.peso=peso;
		this.volumen= volumen;	
	}

	@Override
	public String getReferencia() {
		return referencia;
	}

	@Override
	public int getPeso() {
		return peso;
	}

	@Override
	public int getVolumen() {
		return volumen;
	}

	@Override
	public boolean tengoEspacio(IContenedor contenedor) {
		return contenedor.volumenDisponible()>volumen;
	}
	@Override
	public void meter(Contenedor contenedor) {
		this.contenedor=contenedor;
		
	}

}

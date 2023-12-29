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
		// TODO Auto-generated method stub
		return referencia;
	}

	@Override
	public int getPeso() {
		// TODO Auto-generated method stub
		return peso;
	}

	@Override
	public int getVolumen() {
		// TODO Auto-generated method stub
		return volumen;
	}

	@Override
	public boolean tengoEspacio(IContenedor contenedor) {
		// TODO Auto-generated method stub
		return contenedor.volumenDisponible()>volumen;
	}
	@Override
	public void meter(Contenedor contenedor) {
		this.contenedor=contenedor;
		
	}

}

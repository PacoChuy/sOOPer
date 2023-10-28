package sooper.contenedores;

import java.util.Set;

import sooper.IContenedor;
import sooper.IProducto;


public abstract class Contenedor implements IContenedor {
	private String referencia;
	private int alto;

	public Contenedor(String referencia, int alto) {
		this.referencia=referencia;
		this.alto=alto;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getReferencia() {
	
		return referencia;
	}

	@Override
	public int getVolumen() {
		return alto * getSuperficie();
	
	}

	@Override
	public int volumenDisponible() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getResistencia() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Set<IProducto> getProductos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTipo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean meter(IProducto producto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean resiste(IProducto producto) {
		// TODO Auto-generated method stub
		return false;
	}

}

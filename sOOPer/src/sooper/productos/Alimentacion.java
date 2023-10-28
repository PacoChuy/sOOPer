package sooper.productos;

import sooper.IProducto;

public class Alimentacion extends Producto {

	public Alimentacion(String referencia, int peso, int volumen) {
		super(referencia, peso, volumen);
	}

	@Override
	public String getCategoria() {
		
		return "Alimentacion";
	}

	@Override
	public boolean esCompatible(IProducto p) {
		// TODO Auto-generated method stub
		return false;
	}

}

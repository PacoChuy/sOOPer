package sooper.productos;

import sooper.IProducto;
import sooper.enums.Categoria;

public class Congelado extends Producto {

	public Congelado(String referencia, int peso, int volumen) {
		super(referencia, peso, volumen);
	}

	@Override
	public Categoria getCategoria() {
		return Categoria.ALIMENTACION;
	}

	@Override
	public boolean esCompatible(IProducto p) {
		return false;
	}

}

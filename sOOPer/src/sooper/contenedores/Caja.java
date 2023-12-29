package sooper.contenedores;

import sooper.IProducto;
import sooper.enums.TipoContenedor;

public class Caja extends Contenedor {
	
	
	private int ancho;
	private int largo;
	
	public Caja(String referencia, int alto ,int ancho, int largo) 
	{
		super(referencia,alto);
		this.ancho = ancho;
		this.largo = largo;
		
		
	}

	@Override
	public int getSuperficie() {
		// TODO Auto-generated method stub
		return ancho * largo;
	}

	@Override
	public TipoContenedor getTipo() {
		// TODO Auto-generated method stub
		return TipoContenedor.CAJA;
	}
	
	@Override
	public boolean resiste(IProducto producto) {
		// TODO Auto-generated method stub
		return true;
	}
	
	
}

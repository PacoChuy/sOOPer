package sooper.contenedores;

import java.util.Set;
import java.util.HashSet;

import sooper.IContenedor;
import sooper.IProducto;


public abstract class Contenedor implements IContenedor {
	private String referencia;
	private int alto;
	private Set <IProducto> productos;
	private int resistencia;

	public Contenedor(String referencia, int alto) {
		this.referencia=referencia;
		this.alto=alto;
		productos = new HashSet<IProducto>();
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
	return getVolumen() - VolumenOcupado(); 
	}
	
	private int VolumenOcupado(){
		int res=0;
		for(IProducto p : productos) 
		{
			res +=p.getVolumen();
		}
		return res;
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
	public boolean meter(IProducto producto) {
		boolean resistenciaOk = resiste(producto);
		boolean volumenOk= producto.tengoEspacio(this);
		boolean compatibilidadOk= true;
		
		for (IProducto p: productos) {
			boolean compatibleOK = producto.esCompatible(p);
			
			compatibilidadOk &= compatibleOK;
			
		}
		
		boolean acepta= resistenciaOk && volumenOk && compatibilidadOk;
		
		if(acepta)
		{
			productos.add(producto);
			producto.meter(this);
		}
		return acepta;
	}

	@Override
	public boolean resiste(IProducto producto) {
				return resistencia > producto.getPeso();
	}

	@Override
	public String toString() {
		
		StringBuilder sb= new StringBuilder("Contenedor " + referencia + "[" + getTipo() +"] (sup "+ getSuperficie()+"cm2 - vol "+getVolumen() + " cm3 - resistencia"+getResistencia()+"g");

		
		if(productos.isEmpty()){
			sb.append("\t\tvacio\n");	
		}
		for(IProducto p : productos) {
		 sb.append("\t\t"+p+"\n");	
		}
		sb.append("\t\t>> Disponible vol" + volumenDisponible()+ "cm3");
		
		return sb.toString();
		
	}
	
	
	

}

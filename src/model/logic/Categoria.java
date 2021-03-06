package model.logic;

public class Categoria {
	private int id;
	private String nombre;
	public Categoria(int id, String nm) {
		this.id = id;
		nombre = nm;
	}
	
	public String darNombre(){
		return nombre;
	}
	
	public int darId(){
		return id;
	}
}

package projetoCarreto;

public class Modelos {
	private int id;
	private String modelo;
	private double comprimento;
	private double largura;
	private double peso;
	
	//Método construtor
	public Modelos(int id, String modelo, double comprimento, double largura, double peso) {
		super();
		this.id = id;
		this.modelo = modelo;
		this.comprimento = comprimento;
		this.largura = largura;
		this.peso = peso;
	}

	//Getters e setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
}

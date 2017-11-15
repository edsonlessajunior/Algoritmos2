package br.unisul.aula.recursivo;

public class Fatorial {

	public static void main(String[] args) {
		Fatorial novo = new Fatorial();
		System.out.println("aqui:"+novo.calcular(5));
	}
	
	public int calcular(int fatorial){
		if (fatorial>1)
		return fatorial*this.calcular(fatorial-1);
		else return 1;
	}
}

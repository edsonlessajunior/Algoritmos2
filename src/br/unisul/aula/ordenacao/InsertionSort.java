package br.unisul.aula.ordenacao;

public class InsertionSort {
	public static void main(String[] args) {
		int vetor[] = new int[10];
		int j=10;
		for (int i=0;i<vetor.length;i++){
			vetor[i]= (int) (Math.random() * 1000);
			System.out.println(i+": "+vetor[i]);
		}
		
		int aux;
		System.out.println("\nParcial:\n");
		for(int i=1;i<vetor.length;i++){
			aux = vetor[i];
			System.out.println("\n");
			for(j=i-1;(j>=0)&&(vetor[j]>aux);j--){
				System.out.println(j+": "+vetor[j]);
				vetor[j+1]=vetor[j];
			}
	
			vetor[j+1]=aux;
		}
		System.out.println("\nResultado:\n");
		for (int i=0;i<vetor.length;i++){
			System.out.println(i+": "+vetor[i]);
		}
	}
}

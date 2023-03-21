package controller;

import ewelin.quicksort.QuickSort;

public class OrdenaVetor {
	
	public OrdenaVetor() {
		super();
	}

	public void ordenacoes (int[] vetor, int inicio, int fim) {
		QuickSort quick = new QuickSort();
		vetor = quick.quickSort(vetor, inicio, fim);
		for (int i=0; i <vetor.length-1; i++) {
			System.out.print(vetor[i]+ " ");
		}
	}
}
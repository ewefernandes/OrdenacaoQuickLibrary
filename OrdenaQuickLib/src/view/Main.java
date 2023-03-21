package view;

import controller.OrdenaVetor;

public class Main {

	public static void main(String[] args) {
		int[] vetor = {69, 68, 32, 36, 91, 19, 28, 44, 88, 73, 37, 99, 1};
		OrdenaVetor ordenaV = new OrdenaVetor();
		ordenaV.ordenacoes(vetor, 0, vetor.length-1);
	}

}

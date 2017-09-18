package br.com.db1.colecoes;

public class ExemploArray {

	public String[] getNomes() {
		String[] alunosTurmaDb1Start = new String[4];
		alunosTurmaDb1Start[0] = "alexander";
		alunosTurmaDb1Start[1] = "silas";
		alunosTurmaDb1Start[2] = "elielson";
		alunosTurmaDb1Start[3] = "mayza";
		return null;
	}

	public Integer[] ordenaNumeros(Integer[] numeros) {
		for (Integer x = 0; x< numeros.length - 1; x++) {
			for (Integer y = x+1; y < numeros.length; y++) {
				if (numeros[x] > numeros[y]) {
					Integer tmp = numeros[x];
					numeros[x] = numeros[y];
					numeros[y] = tmp;
				}
			}
		}
		return numeros;
	}

}

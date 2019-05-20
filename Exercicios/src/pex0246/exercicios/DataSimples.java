package pex0246.exercicios;

import exercicios.caelum.Data;

public class DataSimples {
	byte dia, mes;
	short ano;
	
	void  inicializaDataSimples(byte dia, byte mes, short ano) {
		if(dataEValida(dia, mes, ano)) {
			dia = dia;
			mes = mes;
			ano = ano;
		}else {
			dia = 0;
			mes = 0;
			ano = 0;
		}
	}
	
	boolean dataEValida(byte d, byte m, short a) {
		if((d >= 1 && d <= 31) && (m >= 1 && m <= 12))
			return true;
		else
			return false;
	}
	boolean eIgual(DataSimples outraDataSimples) {
		if((dia == outraDataSimples.dia) && (mes == outraDataSimples.mes) && (ano == outraDataSimples.ano))
			return true;
		else
			return false;
	}
	void mostraDataSimples() {
		System.out.print(dia);
		System.out.print("/");
		System.out.print(mes);
		System.out.print("/");
		System.out.print(ano);
	}
	/*
	 * Exercício 2.38:
Escreva, na classe Data, um método duplicaData que receba como argumento
uma outra instância da classe Data, e duplique os valores dos campos da
instância passada como argumento para os campos encapsulados.*/
	public void duplicaData(DataSimples ds) {
		DataSimples dt = ds;
		System.out.println();
		dt.mostraDataSimples();
	}
	
	/* Escreva um método vemAntes na classe Data (figura 2.7) que receba como argumento
	outra instância da classe Data e implemente o algoritmo acima, retornando true se a data
	encapsulada vier antes da passada como argumento e false caso contrário. Se as datas
	forem exatamente iguais, o método deve retornar true*/
	public boolean vemAntes(DataSimples ds, DataSimples dt) {
		if(dt.ano == ds.ano && dt.mes == ds.mes && dt.dia < ds.dia) {
			return true;
		}
		else if(dt.ano == ds.ano && dt.mes == ds.mes && dt.dia > ds.dia) {
			return false;
		}else if(dt.ano == ds.ano && dt.mes < ds.mes) {
			return true;
		}else if(dt.ano == ds.ano && dt.mes < ds.mes) {
			return false;
		}else if(dt.ano < ds.ano) {
			return true;
		}else if(dt.ano > ds.ano) {
			return false;
		}else {
			return true;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataSimples ds = new DataSimples();
		DataSimples dt = new DataSimples();
		
		ds.dia = 15;
		ds.mes = 05;
		ds.ano = 2019;
		
		dt.dia = 03;
		dt.mes = 04;
		dt.ano = 2020;
		
		ds.mostraDataSimples();
		//ds.duplicaData(ds);
		System.out.println();
		boolean ts = ds.vemAntes(ds, dt);
		System.out.print(ts);

	}

}

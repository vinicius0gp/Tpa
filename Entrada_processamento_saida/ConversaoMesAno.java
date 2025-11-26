package prjAula01;

public class ConversaoMesAno {
	public static void main(String[] args) {
		
		int dias, mes, ano;
		
		// valor atribuido
		dias = 30;
		
		mes = dias/30;
		ano = mes/12;
		ano = dias/365;
		
		System.out.println(mes,ano,ano);
	}
}

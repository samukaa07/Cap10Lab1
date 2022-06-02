package Laboratorio1;

public class Cap10_Lab1 {

	public static void main(String[] args) {
		// declarando e estanciando os objetos do tipo imprimivel, atribuindo a cada referencia no caso Relatório e Grafico
		
		Imprimivel graphic = new Grafico();
		Imprimivel reports = new Relatorio();
		
		graphic.imprimir();
		reports.imprimir();
	}

}

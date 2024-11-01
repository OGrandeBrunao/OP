package aula07.metodoconstrutor;

public class CarroTeste {

	public static void main(String[] args) {

		// instanciação de objetos da classe Carro
		Carro carro1 = new Carro("458 Italia", "Ferrari", 2015, "ABC-1234", "Vermelho");
		Carro carro2 = new Carro("Civic", "Honda", 2018);
		Carro carro3 = new Carro("Porsche");

		// obtenção dos valores dos atributos de cada objeto
		System.out.println(carro1);
		System.out.println(carro2);
		System.out.println(carro3);
	}
}

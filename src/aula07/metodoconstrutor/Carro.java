package aula07.metodoconstrutor;

public class Carro {

	// atributos da classe Carro
	String modelo;
	String marca;
	int ano;
	String placa;
	String cor;
	int velocidade;
	boolean ligado;

	// método construtor da classe Carro
	public Carro(String marca) {

		this("Modelo indefinido", marca, 0, "AAA-0000", "Preto");
	}

	public Carro(String modelo, String marca, int ano) {

		this(modelo, marca, ano, "AAA-0000", "Preto");
	}

	public Carro(String modelo, String marca, int ano, String placa, String cor) {

		this.modelo = modelo;
		this.marca = marca;
		this.ano = ano;
		this.placa = placa;
		this.cor = cor;
		this.velocidade = 0;
		this.ligado = false;
	}

	// métodos da classe Carro
	public void ligar() {

		if (!this.ligado) {

			this.ligado = true;
			System.out.println(this.marca + " " + this.modelo + " está ligando.");

		} else {

			System.out.println(this.marca + " " + this.modelo + " já está ligado.");
		}
	}

	public void desligar() {

		if (this.ligado) {

			if (this.velocidade == 0) {

				this.ligado = false;
				System.out.println(this.marca + " " + this.modelo + " está desligando.");

			} else {

				System.out.println(this.marca + " " + this.modelo + " deve estar parado para ser desligado.");
			}

		} else {

			System.out.println(this.marca + " " + this.modelo + " já está desligado.");
		}
	}

	public void acelerar(int valor) {

		if (this.ligado) {

			this.velocidade += valor;

			if (this.velocidade > 200) {

				this.velocidade = 200;
			}

			System.out.println(this.marca + " " + this.modelo + " está acelerando.");

		} else {

			System.out.println(this.marca + " " + this.modelo + " está desligado.");
		}
	}

	public void frear(int valor) {

		if (this.ligado) {

			this.velocidade -= valor;

			if (this.velocidade < 0) {

				this.velocidade = 0;
			}

			System.out.println(this.marca + " " + this.modelo + " está freando.");

		} else {

			System.out.println(this.marca + " " + this.modelo + " está desligado.");
		}
	}

	@Override
	public String toString() {
		return "Carro [modelo=" + this.modelo + ", marca=" + this.marca + ", ano=" + this.ano + ", placa=" + this.placa
				+ ", cor=" + this.cor + "]";
	}
}

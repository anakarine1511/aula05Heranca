package entidade;

public class ContaCorrente extends Conta {
	
	public double limite;

	public ContaCorrente(String nome, int numero, double saldo, double limite) {
		super(nome, numero, saldo);
		this.limite = limite;
		
	}

	@Override
	public String toString() {
		return "ContaCorrente" + mostrar() + "limite=" + limite + " ";
	}
	

		

	}


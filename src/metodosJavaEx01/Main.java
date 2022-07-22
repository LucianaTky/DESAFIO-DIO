package metodosJavaEx01;

public class Main {

	public static void main(String[] args) {
			
	//Calculadora
		System.out.println("Exercício calculadora");
		Calculadora.soma(3, 6);
		Calculadora.subtracao(9, 1.8);
		Calculadora.multiplicacao(7,8);
		Calculadora.divisao(5, 2.5);
		
	//Mensagem
		System.out.println("Exercício mensagem");
		Mensagem.exibicaoMensagem(9);
		Mensagem.exibicaoMensagem(14);
		Mensagem.exibicaoMensagem(1);
			
	//Emprestimo
		
		System.out.println("Exercício emprestimo");
		Emprestimo.calculo(1000, Emprestimo.getDuasParcelas());
		Emprestimo.calculo(1000, Emprestimo.getTresParcelas());
		Emprestimo.calculo(1000, 5);
	
		
	}

}

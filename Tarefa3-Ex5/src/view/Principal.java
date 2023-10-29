package view;

import controller.ModificacaoCadastroController;

public class Principal {

	public static void main(String[] args) {
		ModificacaoCadastroController cadastro = new ModificacaoCadastroController();

		try {
			cadastro.novoCadastro(41, 61, (double) 8000);
			cadastro.novoCadastro(31, 40, (double) 5000);
			cadastro.novoCadastro(21, 30, (double) 3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

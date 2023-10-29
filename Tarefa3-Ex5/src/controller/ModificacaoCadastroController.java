package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import model.ListaEncadeadaSimples_TipoGenerico;
import model_main.Cliente;

public class ModificacaoCadastroController {

	public ModificacaoCadastroController() {
		super();
	}

	@SuppressWarnings("unused")
	private void novoArquivo(ListaEncadeadaSimples_TipoGenerico<Cliente> L, String nomeArquivo) throws Exception {

		File file = new File("C:\\TEMP", nomeArquivo + ".csv");
		int ctd;
		StringBuffer buffer = new StringBuffer();

		for (ctd = 0; ctd < L.size(); ctd++) {
//			System.out.println(L.getValue(ctd));
			buffer.append(L.getValue(ctd) + "\n");
		}

		FileWriter fileWriter = new FileWriter(file);
		PrintWriter print = new PrintWriter(fileWriter);
		print.write(buffer.toString());
		print.flush();
		print.close();
		fileWriter.close();

	}

	public void novoCadastro(int idadeMin, int idadeMax, Double limiteCredito) throws Exception {
		ListaEncadeadaSimples_TipoGenerico<Cliente> listClientes = new ListaEncadeadaSimples_TipoGenerico<>();
		File file = new File("C:\\TEMP", "cadastro.csv");

		FileInputStream fluxo = new FileInputStream(file);
		InputStreamReader fluxoString = new InputStreamReader(fluxo);
		BufferedReader buffer = new BufferedReader(fluxoString);
		String linha = buffer.readLine();

		while (linha != null) {
			String[] dadosClientes = linha.split(";");
			System.out.println(dadosClientes[0] + " " + dadosClientes[1] + " " + dadosClientes[2] + " " + dadosClientes[3]);
			Cliente clientes = new Cliente(dadosClientes[0], dadosClientes[1], dadosClientes[2], dadosClientes[3].replace(",", "."));

			if ((clientes.Idade >= idadeMin && clientes.Idade <= idadeMax) && clientes.LimiteCredito > limiteCredito) {
				listClientes.addLast(clientes);
			}
			linha = buffer.readLine();
		} // fim dos dados do arquivo
		novoArquivo(listClientes, "Idade " + idadeMin + " a " + idadeMax + "Limite " + limiteCredito);
		buffer.close();
		fluxoString.close();
		fluxo.close();
	}

}

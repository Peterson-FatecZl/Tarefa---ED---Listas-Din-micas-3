package view;

import model.ListaEncadeadaSimples_TipoGenerico;

public class Principal {

	public static void main(String[] args) {
		ListaEncadeadaSimples_TipoGenerico<Integer> l = new ListaEncadeadaSimples_TipoGenerico<>();
		int[] v = { 3, 5, 8, 12, 9, 7, 6, 2, 3, 7, 16 };
		int segundoMaior = Integer.MIN_VALUE, maior = Integer.MIN_VALUE;
		
		
		for (int i = 0; i < v.length; i++) {
			try {
				l.addLast(v[i]);
			
			}catch(Exception e){ e.printStackTrace(); }
		}
		
		for(int ctd = 0; ctd < l.size(); ctd++) {
			try {
				if(l.getValue(ctd) > maior) {
					maior = l.getValue(ctd);
				}
				
			}catch(Exception e){ e.printStackTrace(); }
		}

		for(int ctd = 0; ctd < l.size(); ctd++) {
			try {
				if(l.getValue(ctd) < maior && l.getValue(ctd) > segundoMaior) {
					segundoMaior = l.getValue(ctd);
				}
				
			}catch(Exception e){ e.printStackTrace(); }
		}
		
		System.out.println("Maior Valor: "+maior);
		System.out.println("Segund Maior Valor: "+ segundoMaior);
		
	}

}

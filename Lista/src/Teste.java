
public class Teste {

	public static void main(String[] args) {
		
		Lista<String> listinha = new Lista<String>();
		listinha.inserir("Fl�vio");
		listinha.inserir("Sandra");
		listinha.inserir("Surian");
		
		listinha.remover("Sandra");
		listinha.remover("Fl�vio");
		listinha.remover("Surian");
		System.out.println(listinha.pesquisar("Sandra"));
		System.out.println(listinha.pesquisar("Fl�vio"));
		System.out.println(listinha.pesquisar("Surian"));
	}

}

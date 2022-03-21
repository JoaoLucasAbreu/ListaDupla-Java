
public class Teste {

	public static void main(String[] args) {
		
		Lista<String> listinha = new Lista<String>();
		listinha.inserir("Flávio");
		listinha.inserir("Sandra");
		listinha.inserir("Surian");
		
		listinha.remover("Sandra");
		listinha.remover("Flávio");
		listinha.remover("Surian");
		System.out.println(listinha.pesquisar("Sandra"));
		System.out.println(listinha.pesquisar("Flávio"));
		System.out.println(listinha.pesquisar("Surian"));
	}

}

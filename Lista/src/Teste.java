
public class Teste {

	public static void main(String[] args) {
		
		Lista<Aluno> lista = new Lista<Aluno>();
		lista.inserir(new Aluno(100000, "João"));
		lista.inserir(new Aluno(40000, "Michael"));
		lista.inserir(new Aluno(14400, "Keanu"));
		
		System.out.println(lista.pesquisar(new Aluno(14400, "Keanu")));
	}

}


public class Aluno {
	String nome;
	int ra;
	
	public Aluno(int ra, String nome) {
		this.nome = nome;
		this.ra = ra;
	}
	
	@Override
	public boolean equals(Object obj) {
		Aluno aux = (Aluno) obj;
		
		if (aux.ra == ra && aux.nome.equals(nome)) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		
		String aux = "";
		aux += "RA: " + ra + "\n";
		aux += "Nome: " + nome + "\n";
		return aux;
	}


}

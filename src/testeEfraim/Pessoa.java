package testeEfraim;

public class Pessoa {

	   String nome;
	   int idade;
	   String sexo;
	   
	   public Pessoa(String nome, int idade, String sexo) {
	       super();
	       this.nome = nome;
	       this.idade = idade;
	       this.sexo = sexo;
	   }
	   
	   
	   @Override
	   public String toString() {
	       return "pessoa [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + "]";
	   }


	   public String getNome() {
	       return nome;
	   }
	   public void setNome(String nome) {
	       this.nome = nome;
	   }
	   public int getIdade() {
	       return idade;
	   }
	   public void setIdade(int idade) {
	       this.idade = idade;
	   }
	   public String getSexo() {
	       return sexo;
	   }
	   public void setSexo(String sexo) {
	       this.sexo = sexo;
	   }
	   
	   
	   
	   
	}
public class Aluno {
    
    private String nome;
    private int idade;

    Aluno(String nome){
        this.nome = nome;
    }
  
    void setIdade(int idade){
        if (this.idade < idade){
            this.idade = idade;
        }
    }

    int getIdade(){
        return this.idade;
    }

    String getNome(){
        return this.nome;
    }
}

public class Aula{
     
    public static void main(String[] args) {
        
    //    Aluno eu = new Aluno("Pablo");

    //    eu.setIdade(20);

    //    System.out.println(eu.getNome());
    //    System.out.println(eu.getIdade());

    //    eu.setIdade(21);

    //    System.out.println(eu.getNome());
    //    System.out.println(eu.getIdade());        

    Maquina meu = new Maquina();

    meu.setCodigo("STS");

    meu.abastecer(50, 10);

    System.out.println(meu.getMedia());

    meu.setCodigo("STS");

    meu.abastecer(50, 9);

    System.out.println(meu.getMedia());

    }
}
public class AtividadeP2 {

    public static void main(String[] args) {
        
        Geladeira eletrodomestico = new Geladeira();

        System.out.println(eletrodomestico.marca);
        System.out.println(eletrodomestico.motor);
        System.out.println(eletrodomestico.portas);
        System.out.println(eletrodomestico.quantidadePortas);
        System.out.println(eletrodomestico.frezzer);
        System.out.println(eletrodomestico.tomada);
        System.out.println(eletrodomestico.tensao);
        System.out.println(eletrodomestico.lampada);
        System.out.println(eletrodomestico.fazGelo);
        System.out.println(eletrodomestico.classeEconomica);
        System.out.println("------------------------------");
        System.out.println(eletrodomestico.proprietario.nome);
        System.out.println(eletrodomestico.proprietario.idade);
        System.out.println(eletrodomestico.proprietario.dataNasc);
        System.out.println(eletrodomestico.proprietario.cpf);
        System.out.println(eletrodomestico.proprietario.cidade);
        System.out.println(eletrodomestico.proprietario.estado);
        System.out.println(eletrodomestico.proprietario.cep);
        System.out.println(eletrodomestico.proprietario.logradouro);
        System.out.println("--------------------------------");
        //Atribuição de Valores

        eletrodomestico.marca = "Eletrolux";
        eletrodomestico.motor = true;
        eletrodomestico.portas = true;
        eletrodomestico.quantidadePortas = 2;
        eletrodomestico.frezzer = true;
        eletrodomestico.tomada = true;
        eletrodomestico.tensao = "Bivolt 110/220V";
        eletrodomestico.lampada = true;
        eletrodomestico.fazGelo = true;
        eletrodomestico.classeEconomica = "A";

        eletrodomestico.proprietario.nome = "Pablo Rafael Chavoni Ely";
        eletrodomestico.proprietario.idade = 20;
        eletrodomestico.proprietario.dataNasc = "17/03/2022";
        eletrodomestico.proprietario.cpf = "065.681.841-79";
        eletrodomestico.proprietario.cidade = "Santa Carmem";
        eletrodomestico.proprietario.estado = "Mato Grosso";
        eletrodomestico.proprietario.cep = 78545000;
        eletrodomestico.proprietario.logradouro = "Avenida Independencia";

        System.out.println(eletrodomestico.marca);
        System.out.println(eletrodomestico.motor);
        System.out.println(eletrodomestico.portas);
        System.out.println(eletrodomestico.quantidadePortas);
        System.out.println(eletrodomestico.frezzer);
        System.out.println(eletrodomestico.tomada);
        System.out.println(eletrodomestico.tensao);
        System.out.println(eletrodomestico.lampada);
        System.out.println(eletrodomestico.fazGelo);
        System.out.println(eletrodomestico.classeEconomica);
        System.out.println("------------------------------");
        System.out.println(eletrodomestico.proprietario.nome);
        System.out.println(eletrodomestico.proprietario.idade);
        System.out.println(eletrodomestico.proprietario.dataNasc);
        System.out.println(eletrodomestico.proprietario.cpf);
        System.out.println(eletrodomestico.proprietario.cidade);
        System.out.println(eletrodomestico.proprietario.estado);
        System.out.println(eletrodomestico.proprietario.cep);
        System.out.println(eletrodomestico.proprietario.logradouro);
    }
}
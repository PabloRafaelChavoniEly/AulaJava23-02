public class Atividaden1 {

    public static void main(String[] args) {
        
        Notebook note = new Notebook();

        System.out.println(note.tela);
        System.out.println(note.bateria);
        System.out.println(note.carregador);
        System.out.println(note.placaMae);
        System.out.println(note.processador);
        System.out.println(note.memoria);
        System.out.println(note.quantidadeMemoria);
        System.out.println(note.tipoMemoria);
        System.out.println(note.hd);
        System.out.println(note.tamanhoHd);
        System.out.println(note.ssd);
        System.out.println(note.tamanhoSsd);
        System.out.println(note.placaDeVideo);
        System.out.println(note.modeloPlacaVideo);
        System.out.println("------------------------------------------------");
        System.out.println(note.periferico.teclado);
        System.out.println(note.periferico.marcaTeclado);
        System.out.println(note.periferico.mouse);
        System.out.println(note.periferico.marcaMouse);
        System.out.println(note.periferico.headset);
        System.out.println(note.periferico.marcaHeadset);
        System.out.println(note.periferico.microfone);
        System.out.println(note.periferico.baseCooler);
        System.out.println("------------------------------------------------");
        System.out.println(note.periferico.proprietario.nome);
        System.out.println(note.periferico.proprietario.idade);
        System.out.println(note.periferico.proprietario.dataNasc);
        System.out.println(note.periferico.proprietario.cpf);
        System.out.println(note.periferico.proprietario.cep);
        System.out.println(note.periferico.proprietario.cidade);
        System.out.println(note.periferico.proprietario.estado);
        System.out.println(note.periferico.proprietario.logradouro);

        System.out.println("-----_-_-_------");

        // Atribuição de Valores

        note.tela = true;
        note.bateria = true;
        note.carregador = true;
        note.placaMae = "Gigabyte Aorus B450";
        note.processador = "I5 10400F";
        note.memoria = true;
        note.tipoMemoria = "DDR4 8GB";
        note.quantidadeMemoria = 2;
        note.hd = true;
        note.tamanhoHd = "1 TB";
        note.ssd = true;
        note.tamanhoSsd = "528 GB";
        note.placaDeVideo = true;
        note.modeloPlacaVideo = "RTX 3080";
        
        note.periferico.teclado = true;
        note.periferico.marcaTeclado = "Redragon Kagura";
        note.periferico.mouse = true;
        note.periferico.marcaMouse = "Redragon Storm Elite";
        note.periferico.headset = true;
        note.periferico.marcaHeadset = "Redragon Zeus";
        note.periferico.microfone = true;
        note.periferico.baseCooler = true;

        note.periferico.proprietario.nome = "Pablo Rafael Chavoni Ely";
        note.periferico.proprietario.idade = 20;
        note.periferico.proprietario.dataNasc = "17/03/2022";
        note.periferico.proprietario.cpf = "065.681.841-79";
        note.periferico.proprietario.cep = 78545000;
        note.periferico.proprietario.cidade = "Santa Carmem";
        note.periferico.proprietario.estado = "Mato Grosso";
        note.periferico.proprietario.logradouro = "Avenida Independencia";

        // Print com os Valores Atribuidos

        System.out.println(note.tela);
        System.out.println(note.bateria);
        System.out.println(note.carregador);
        System.out.println(note.placaMae);
        System.out.println(note.processador);
        System.out.println(note.memoria);
        System.out.println(note.quantidadeMemoria);
        System.out.println(note.tipoMemoria);
        System.out.println(note.hd);
        System.out.println(note.tamanhoHd);
        System.out.println(note.ssd);
        System.out.println(note.tamanhoSsd);
        System.out.println(note.placaDeVideo);
        System.out.println(note.modeloPlacaVideo);
        System.out.println("------------------------------------------------");
        System.out.println(note.periferico.teclado);
        System.out.println(note.periferico.marcaTeclado);
        System.out.println(note.periferico.mouse);
        System.out.println(note.periferico.marcaMouse);
        System.out.println(note.periferico.headset);
        System.out.println(note.periferico.marcaHeadset);
        System.out.println(note.periferico.microfone);
        System.out.println(note.periferico.baseCooler);
        System.out.println("------------------------------------------------");
        System.out.println(note.periferico.proprietario.nome);
        System.out.println(note.periferico.proprietario.idade);
        System.out.println(note.periferico.proprietario.dataNasc);
        System.out.println(note.periferico.proprietario.cpf);
        System.out.println(note.periferico.proprietario.cep);
        System.out.println(note.periferico.proprietario.cidade);
        System.out.println(note.periferico.proprietario.estado);
        System.out.println(note.periferico.proprietario.logradouro);
    }
}
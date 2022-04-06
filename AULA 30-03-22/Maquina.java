public class Maquina {
    
    private String codigo;
    private int horimetro;
    private float media;

    String getCodigo(){
        return this.codigo;
    }

    void setCodigo(String codigo){
        this.codigo = codigo;
    }

    int getHorimetro(){
        return this.horimetro;
    }

    float getMedia(){
        return this.media;
    }

    void abastecer(float litros, int horimetro){
        this.media = (horimetro - this.horimetro) / litros;
        this.horimetro = horimetro;
    }
    
    //Controle
    //bool ligado;
    //private void ligar(){}
    //private void ligar(){}

}

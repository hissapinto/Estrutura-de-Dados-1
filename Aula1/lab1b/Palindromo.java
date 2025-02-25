package lab1b;

class Palindromo{
    private String texto;
    public Palindromo(){
        this.texto = "";
    }
    public Palindromo(String frase){
        this.texto = frase;
    }
    public getTexto(){
        return texto;
    }
    public void setTexto(String texto){
        if(texto == null){
            throw new IllegalArgumentException("A frase não pode ser vazia.");
        }
        this.texto=frase;
    }
    public boolean verificar(String texto){
        int qtdLetras = texto.length;
        palindromoCorreto = false;
        for (int i=0;i<(qtdLetras/2);i++){
            if()
        }

    }
}
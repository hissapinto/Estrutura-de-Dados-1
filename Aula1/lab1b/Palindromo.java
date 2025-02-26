package lab1b;
//tem que botar isso pra linkar os códigos dessa pasta

//Criando a classe palindromo
class Palindromo{
    private String texto;
    //Atributo privado da classe, o texto só pode ser alterado pelos métodos da classe

    //Construtor padrão
    public Palindromo(){
        this.texto = "";
    }
    //Toda vez que um novo obj da classe for criado e não for expecificado nada pra ele
    //ele vai ter essas características, no caso uma string vazia.

    //Construtor com argumentos
    public Palindromo(String frase){
        this.setTexto(frase);
    }
    //Recebe uma string(frase) e chama o metodo setTexto pra setar o texto com a frase

    //Getter
    public String getTexto(){
        return texto;
    }
    //Retorna a frase armazenada no obj palindromo

    //Setter
    public void setTexto(String frase){
        if(frase == null || frase.isEmpty()){
            throw new IllegalArgumentException("A frase não pode ser nula ou vazia.");
        }
        this.texto=frase;
    }
    //Verifica se a frase é nula, se for valida ela armazena a frase no texto

    //Método pra verificar se o texto é palindromo
    public boolean verificar(){
        String textoFormatado = this.texto.replaceAll(" ","").toLowerCase();
        //Tira os espaços e deixa tudo minúsculo
        int qtdLetras = textoFormatado.length();
        //Pega a qtd de letras

        //Comparação letras opostas
        for (int i=0;i<(qtdLetras/2);i++){
            char letraA = textoFormatado.charAt(i);
            char letraZ = textoFormatado.charAt(qtdLetras-i-1);
            if(letraA != letraZ){
                return false;
                //Já retorna falso se achar alguma diferente
            }
        }
        return true;
        //Retorna true se não achar nada
    }
}
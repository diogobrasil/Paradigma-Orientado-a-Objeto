/**Criando a classe livro.
@author Diogo Brasil Da Silva*/
public abstract class Livro implements Produto {
    //Atributos:
    private String nome;//O atributo private só pode ser manipulado pela classe.
    private String descricao;
    private String isbn;
    private double valor;
    private Autor autor;
    //Construtores
    public Livro(){}//Default (sem parâmetros/construtor padrão)
    public Livro(Autor autor){this.autor = autor;}//Construtor com parametro.
    //Método para mostrar os dados do livro:
    public abstract void MostrarDados();
    /*Métodos Get e Set para acessar os atributos em private.
    Esses metodos nos permite manipular os atributos private da classe Livro dentro de outras classes.
     */
    public void setNome (String nome){//Método SET manipula o conteúdo dentro do atributo.
         this.nome = nome;
    }
    public String getNome (){//Método GET exibe o atributo.
        return nome;
    }
    public void setDescricao (String descricao){
        this.descricao = descricao;
    }
    public String getDescricao (){
        return descricao;
    }
    public void setIsbn (String isbn){
        this.isbn = isbn;
    }
    public String getIsbn (){
        return isbn;
    }
    public void setValor (double valor){
        this.valor = valor;
    }
    public double getValor (){
        return valor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Autor getAutor() {
        return autor;
    }
}
public class LivroFisico extends Livro implements Promocao {
    private double taxadeimpressao;

    public LivroFisico (){}
    public LivroFisico (Autor autor){super(autor);}
    public LivroFisico (double taxa){taxadeimpressao = taxa;}

    public boolean Desconto (double porcentagem){
        if (porcentagem > 20){
            return false;
        }
        setValor(getValor() - (getValor() * porcentagem)/100);
        return true;
    }
    @Override
    public void MostrarDados(){
        //Comandos:
        System.out.println("Nome: " + getNome());
        System.out.println("Descrição: " + getDescricao());
        System.out.println("ISBN: " + getIsbn());
        System.out.println("Valor: " + getValor());
        System.out.println("-----------------------------");
        System.out.println("Dados do autor:");
        System.out.println("Nome: " + getAutor().getNome());
        System.out.println("CPF: " + getAutor().getCpf());
        System.out.println("E-Mail: " + getAutor().getEmail());
        System.out.println("-----------------------------");
    }
}

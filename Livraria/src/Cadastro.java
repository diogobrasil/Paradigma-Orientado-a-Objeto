import java.util.Locale; //Permite importa as informações de uma região especifica.
import java.util.Scanner; //importação do pacote  que vai nos permitir criar um objeto com métodos de leitura via teclado.
//Criando a classe de cadastro do livro.
public class Cadastro {
    //Metodo 'main' para execução de comandos
    public static void main (String args[]){
        //Obtendo informações dos padrões americanos de numerção:
        Locale.setDefault(Locale.ENGLISH);
        //Objeto para recebimento dos dados via teclado (ele será usado apartir da linha 55):
        Scanner recebe = new Scanner(System.in);

        //Crinado objeto autor.
        Autor autor01 = new Autor();
        //Instanciando a classe:
        autor01.setNome("Raphael D'Avila");
        autor01.setCpf("123.456.789-00");
        autor01.setEmail("davilaraphael@outlook.com");

        //Novos objetos:
        Autor autor02 = new Autor();
        //Objeto ebook:
        Ebook ebook001 = new Ebook(1);
        ebook001.setNome("Python para leigos.");
        ebook001.setAutor(autor01);
        ebook001.MostrarDados();

        //Objeto Livro Fisico:
        LivroFisico fisico001 = new LivroFisico(autor02);
        fisico001.setAutor(autor02);
        fisico001.getAutor().setNome("Matheus Costa Alves");
        fisico001.getAutor().setEmail("costamath@gmail.com");
        fisico001.getAutor().setCpf("098.765.432.11");
        fisico001.setNome("Livro de programação");
        fisico001.MostrarDados();

        //Autor 3:
        Autor autor03 = new Autor();
        //Objeto livro físico 2:
        LivroFisico fisico002 = new LivroFisico(autor03);
        fisico002.setAutor(autor03);
        System.out.println("Digite o nome do autor:");
        fisico002.getAutor().setNome(recebe.nextLine());
        System.out.println("Digite o email do autor: ");
        fisico002.getAutor().setEmail(recebe.nextLine());
        System.out.println("Digite o Cpf do autor: ");
        fisico002.getAutor().setCpf(recebe.nextLine());
        System.out.println("Digite o nome do livro: ");
        fisico002.setNome(recebe.nextLine());
        System.out.println("Digite a descrição do livro: ");
        fisico002.setDescricao(recebe.nextLine());
        System.out.println("Digite o ISBN do livro: ");
        fisico002.setIsbn(recebe.nextLine());
        System.out.println("Digite o valor do livro: ");
        fisico002.setValor(recebe.nextDouble());
        //Mostrar na tela:
        fisico002.MostrarDados();
        //Aplicar desconto:
        fisico002.Desconto(10);
        System.out.println("Valor após o desconto: " + fisico002.getValor());

        recebe.close();
    }
}

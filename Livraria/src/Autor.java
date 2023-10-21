//criando a classe autor
public class Autor {
    //Para manipular os atributos é necessário criar métodos dentro da propria classe.
    private String nome;
    private String cpf;
    private String email;
    //Construtores
    public Autor (){}//Sem parâmetro (default).
    public Autor (String nome){this.nome = nome;}//Com parâmetro.
    //sequência de métodos set & get de atributos
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
}

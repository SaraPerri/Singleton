public class User {
    private String nome;
    private int age;

    public User(String nome, int età) {
        this.nome = nome;
        this.age = età;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEtà() {
        return age;
    }

    public void setEtà(int age) {
        this.age = age;
    }

    public void stampaInformazioni() {
        System.out.println("Nome: " + nome + ", Età: " + age);
    }
}

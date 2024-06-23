package Model;

// Definição da classe Mago dentro do pacote Model
public class Mago {

    // Declaração dos atributos privados da classe Mago
    private int id;         // Identificador único do mago
    private String nome;    // Nome do mago
    private int vidas;      // Quantidade de vidas do mago

    // Construtor da classe Mago, recebe id, nome e vidas como parâmetros
    public Mago(int id, String nome, int vidas) {
        this.id = id;       // Inicializa o atributo id com o valor recebido
        this.nome = nome;   // Inicializa o atributo nome com o valor recebido
        this.vidas = vidas; // Inicializa o atributo vidas com o valor recebido
    }

    // Método getter para obter o id do mago
    public int getId() {
        return id;  // Retorna o valor do atributo id
    }

    // Método getter para obter o nome do mago
    public String getNome() {
        return nome;  // Retorna o valor do atributo nome
    }

    // Método getter para obter a quantidade de vidas do mago
    public int getVidas() {
        return vidas;  // Retorna o valor do atributo vidas
    }

    // Método setter para definir a quantidade de vidas do mago
    public void setVidas(int vidas) {
        this.vidas = vidas;  // Define o valor do atributo vidas com o valor recebido
    }
}

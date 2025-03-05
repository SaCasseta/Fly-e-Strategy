class Letra {
    private char simbolo; // Atributo que armazena o símbolo da letra

    public Letra(char simbolo) {
        this.simbolo = simbolo; // Inicializa o símbolo da letra
    }

    public void exibir() {
        System.out.println("Letra: " + simbolo); // Exibe a letra
    }
}

class LetraFactory {
    private static final Map<Character, Letra> cache = new HashMap<>(); // Cache para armazenar letras únicas

    public static Letra getLetra(char simbolo) {
        return cache.computeIfAbsent(simbolo, Letra::new); // Retorna a letra do cache ou cria nova
    }
}

public class Fly {
    public static void main(String[] args) {
        Letra a1 = LetraFactory.getLetra('A'); // Obtém ou cria a letra 'A'
        Letra a2 = LetraFactory.getLetra('A'); // Obtém ou cria a letra 'A' (mesma referência de a1)
        Letra b1 = LetraFactory.getLetra('B'); // Obtém ou cria a letra 'B'

        a1.exibir(); // Exibe letra 'A'
        a2.exibir(); // Exibe letra 'A'
        b1.exibir(); // Exibe letra 'B'

        System.out.println(a1 == a2); // Verifica se a1 e a2 são o mesmo objeto (deve ser true)
    }
}

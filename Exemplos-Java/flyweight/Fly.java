import java.util.*;


class Letra {
    private char simbolo;
    public Letra(char simbolo) { this.simbolo = simbolo; }
    public void exibir() { System.out.println("Letra: " + simbolo); }
}

class LetraFactory {
    private static final Map<Character, Letra> cache = new HashMap<>();
    public static Letra getLetra(char simbolo) {
        return cache.computeIfAbsent(simbolo, Letra::new);
    }
}


public class Fly {
    public static void main(String[] args) {
        Letra a1 = LetraFactory.getLetra('A');
        Letra a2 = LetraFactory.getLetra('A');
        Letra b1 = LetraFactory.getLetra('B');

        a1.exibir();
        a2.exibir();
        b1.exibir();

        System.out.println(a1 == a2);
    }
}

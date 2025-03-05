// Interface Navegacao define o método para calcular o caminho entre origem e destino
interface Navegacao {
    void calcularCaminho(String origem, String destino);
}

// Implementação de Navegacao para calcular o caminho mais rápido
class CaminhoRapido implements Navegacao {
    public void calcularCaminho(String origem, String destino) {
        System.out.println("Calculando o caminho mais rápido de " + origem + " para " + destino);
    }
}

// Implementação de Navegacao para calcular o caminho mais curto
class CaminhoCurto implements Navegacao {
    public void calcularCaminho(String origem, String destino) {
        System.out.println("Calculando o caminho mais curto de " + origem + " para " + destino);
    }
}

// Implementação de Navegacao para calcular o caminho sem pedágios
class EvitarPedagios implements Navegacao {
    public void calcularCaminho(String origem, String destino) {
        System.out.println("Calculando o caminho sem pedágios de " + origem + " para " + destino);
    }
}

// Classe GPS que usa o método de Navegacao para calcular a rota
class GPS {
    private Navegacao navegacao; // Atributo que armazena a estratégia de navegação

    // Método para definir a estratégia de navegação
    public void setNavegacao(Navegacao navegacao) {
        this.navegacao = navegacao;
    }

    // Método para calcular a rota de acordo com a estratégia definida
    public void calcularRota(String origem, String destino) {
        navegacao.calcularCaminho(origem, destino);
    }
}

// Classe principal que demonstra o uso das diferentes estratégias de navegação
public class Stra {
    public static void main(String[] args) {
        GPS gps = new GPS(); // Criação do objeto GPS

        // Usando a estratégia de caminho rápido
        gps.setNavegacao(new CaminhoRapido());
        gps.calcularRota("Sao Paulo", "Rio de Janeiro");

        // Usando a estratégia de caminho curto
        gps.setNavegacao(new CaminhoCurto());
        gps.calcularRota("Sao Paulo", "Rio de Janeiro");

        // Usando a estratégia de evitar pedágios
        gps.setNavegacao(new EvitarPedagios());
        gps.calcularRota("Sao Paulo", "Rio de Janeiro");
    }
}

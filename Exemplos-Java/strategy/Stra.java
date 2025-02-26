
interface Navegacao {
    void calcularCaminho(String origem, String destino);
}


class CaminhoRapido implements Navegacao {
    public void calcularCaminho(String origem, String destino) {
        System.out.println("Calculando o caminho mais rápido de " + origem + " para " + destino);
    }
}


class CaminhoCurto implements Navegacao {
    public void calcularCaminho(String origem, String destino) {
        System.out.println("Calculando o caminho mais curto de " + origem + " para " + destino);
    }
}


class EvitarPedagios implements Navegacao {
    public void calcularCaminho(String origem, String destino) {
        System.out.println("Calculando o caminho sem pedágios de " + origem + " para " + destino);
    }
}


class GPS {
    private Navegacao navegacao;

    public void setNavegacao(Navegacao navegacao) {
        this.navegacao = navegacao;
    }

    public void calcularRota(String origem, String destino) {
        navegacao.calcularCaminho(origem, destino);
    }
}


public class Stra {
    public static void main(String[] args) {
        GPS gps = new GPS();

        
        gps.setNavegacao(new CaminhoRapido());
        gps.calcularRota("Sao Paulo", "Rio de Janeiro");

        
        gps.setNavegacao(new CaminhoCurto());
        gps.calcularRota("Sao Paulo", "Rio de Janeiro");

        
        gps.setNavegacao(new EvitarPedagios());
        gps.calcularRota("Sao Paulo", "Rio de Janeiro");
    }
}

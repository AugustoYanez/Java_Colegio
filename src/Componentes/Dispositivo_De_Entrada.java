package Componentes;

public class Dispositivo_De_Entrada extends Periferico{

    String tipoConcetor;

    String puertoValido;

    public Dispositivo_De_Entrada() {
        super();
        tipoConcetor = " tipo default";
        puertoValido = " puerto default";
    }

    public Dispositivo_De_Entrada(int idPeriferico, String tipoConcetor, String puertoValido) {
        super(idPeriferico);
        this.tipoConcetor = tipoConcetor;
        this.puertoValido = puertoValido;
    }

    public String getTipoConcetor() {
        return tipoConcetor;
    }

    public String getPuertoValido() {
        return puertoValido;
    }
}

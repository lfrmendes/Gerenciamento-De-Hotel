package trabalho;

public class Reserva {

    private String nomeHospede;
    private String dataCheckIn;
    private String dataCheckOut;
    private String tipoDeQuarto;
    private int numeroDoQuartoReservado;

    public Reserva(String nomeHospede, String dataCheckIn, String dataCheckOut, String tipoDeQuarto, int numeroDoQuartoReservado) {
        this.nomeHospede = nomeHospede;
        this.dataCheckIn = dataCheckIn;
        this.dataCheckOut = dataCheckOut;
        this.tipoDeQuarto = tipoDeQuarto;
        this.numeroDoQuartoReservado = numeroDoQuartoReservado;
    }

    public String getNomeHospede() {
        return nomeHospede;
    }

    public String getDataCheckIn() {
        return dataCheckIn;
    }

    public String getDataCheckOut() {
        return dataCheckOut;
    }

    public String getTipoDeQuarto() {
        return tipoDeQuarto;
    }

    public int getNumeroDoQuartoReservado() {
        return numeroDoQuartoReservado;
    }

    public void exibirDetalhesReserva() {
        System.out.println("Hóspede: " + nomeHospede + ", Quarto Número: " + numeroDoQuartoReservado + ", Check-in: " + dataCheckIn + ", Check-out: " + dataCheckOut);
    }
}

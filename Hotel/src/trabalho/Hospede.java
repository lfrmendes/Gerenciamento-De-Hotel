package trabalho;

import java.util.ArrayList;
import java.util.List;

public class Hospede {

    public String nome;
    public List<Reserva> listaDeReservas = new ArrayList<>();

    public Hospede(String nome) {
        this.nome = nome;
    }

    public void adicionarReserva(Reserva reserva) 
    {
        listaDeReservas.add(reserva);
    }

    public void mostrarHistorico() 
    {
        System.out.println("Histórico de reservas para: " + nome);
        for (Reserva reserva : listaDeReservas) {
            reserva.exibirDetalhesReserva();
        }
    }
}

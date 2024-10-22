package trabalho;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

	
	 List<Quarto> quartos = new ArrayList<>();
	 List<Reserva> reservas = new ArrayList<>();
	 List<Hospede> hospedes = new ArrayList<>();
	 
	 public void cadastrarQuarto(Quarto quarto) 
	 {
		 quartos.add(quarto);
	 }
	 
	 public void cadastrarHospede(Hospede hospede) 
	 {
		 hospedes.add(hospede);
	 }
	
	 public void fazerReserva (Hospede hospede,Reserva reserva) 
	 {
		 reservas.add(reserva);
		 hospede.adicionarReserva(reserva);
		 
		 	for (Quarto quarto : quartos) 
		 	{
				if(quarto.getNumero() == reserva.getNumeroDoQuartoReservado()) 
				{
					quarto.alterarDisponibilidade(false);
				}
			}
	 }
	 
 	 public void registrarCheckOut(int NumeroDoQuartoReservado) 
 	 {
         for (Quarto quarto : quartos) 
         {
             if (quarto.getNumero() == NumeroDoQuartoReservado) 
             {
                 quarto.alterarDisponibilidade(true);
             }
         }
 	 }
 
 	 public void mostrarQuartosOcupados() 
 	 {
 		 System.out.println("Quartos ocupados no momento:");
 		 
 		 for (Quarto quarto : quartos) {
 			 
 			 if(!quarto.isDisponiblidade()) 
 			 {
 				 quarto.exibirDetalhes();
 			 }
 			 
 			 
		}
 	 }
 	 
     public void mostrarHistoricoReservas() 
     {
         System.out.println("Histórico de Reservas:");
         for (Reserva reserva : reservas) {
             reserva.exibirDetalhesReserva();
         }
     }
 	 
}

package trabalho;

import java.util.Scanner;

public class SistemaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Hotel hotel = new Hotel();
        Scanner scan = new Scanner(System.in);
        int opcao= 0;
        
        while(opcao !=6) 
        {
        	
        	  System.out.println("1 - Cadastrar Quarto");
              System.out.println("2 - Cadastrar Reserva");
              System.out.println("3 - Check-out");
              System.out.println("4 - Mostrar Quartos Ocupados");
              System.out.println("5 - Mostrar Histórico De Reservas");
              System.out.println("6 - Sair");	
              opcao = scan.nextInt();
              scan.nextLine();
        	
        	switch (opcao) 
        	{
        		case 1:
        		{
        			System.out.println("Digite o numero do quarto:");
        			int numero = scan.nextInt();
        			scan.nextLine();
        			
        			System.out.println("Escolha o tipo do quarto (solteiro, casal, suite)");
        			String tipoQuarto = scan.next();
        			
        			System.out.println("Coloque o valor da diaria");
        			double valorQuarto = scan.nextDouble();
        			
        			System.out.print("Está disponível? (true/false): ");
                    boolean disponivel = scan.nextBoolean();
                    scan.nextLine(); 
                    
                    Quarto quarto = new Quarto(numero, tipoQuarto, valorQuarto, disponivel);
                    hotel.cadastrarQuarto(quarto);
                    
                    System.out.println("O quarto foi cadastrado");
                    
                    break;
        		}
        		
        		case 2: {
        		    System.out.println("Digite o nome do Hospede:");
        		    String nomeDoHospede = scan.nextLine();

        		    Hospede hospede = new Hospede(nomeDoHospede);
        		    hotel.cadastrarHospede(hospede);

        		    System.out.print("Coloque a data de check-in: ");
        		    String dataCheckIn = scan.nextLine();

        		    System.out.print("Coloque a data de check-out: ");
        		    String dataCheckOut = scan.nextLine();

        		    System.out.print("Coloque o número do quarto reservado: ");
        		    int numeroQuarto = scan.nextInt();
        		    scan.nextLine();

        		    System.out.println("Escolha o tipo de quarto:");
        		    String tipoDeQuarto = scan.nextLine();

        		    Reserva reserva = new Reserva(nomeDoHospede, dataCheckIn, dataCheckOut, tipoDeQuarto, numeroQuarto);
        		    hotel.fazerReserva(hospede, reserva);

        		    System.out.println("A reserva foi feita");
        		    break;
        		}
        		
        		case 3:
        		{
                    System.out.println("Digite o número do quarto para check-out:");
                    int numeroQuarto = scan.nextInt();
                    hotel.registrarCheckOut(numeroQuarto);
                    System.out.println("Check-out realizado com sucesso!");
                    break;
        			
        		}
        		
        		case 4:
        		{
        			hotel.mostrarQuartosOcupados();
        			break;
        		}
        		
        		case 5:
        		{
        			hotel.mostrarHistoricoReservas();
        			break;
        		}
        		
        		case 6:
        		{
        			System.out.println("Sistema finalizado");
        			break;
        		}
        		
        	}
        	
        	
        	
        	
        }
        
        
        
        
        
        
        
		
	}

}

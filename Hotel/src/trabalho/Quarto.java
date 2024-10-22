package trabalho;

public class Quarto {

	private int numero;
	private String tipoQuarto;
	private double valorQuarto;
	private boolean disponiblidade;
	
	
	public Quarto() 
	{
		
	}
	
	
	public Quarto (int numero, String tipoQuarto, double valorQuarto, boolean disponiblidade) {
		
		this.numero = numero;
		this.tipoQuarto = tipoQuarto;
		this.valorQuarto = valorQuarto;
		this.disponiblidade = disponiblidade;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTipoQuarto() {
		return tipoQuarto;
	}

	public void setTipoQuarto(String tipoQuarto) {
		this.tipoQuarto = tipoQuarto;
	}

	public double getValorQuarto() {
		return valorQuarto;
	}

	public void setValorQuarto(double valorQuarto) {
		this.valorQuarto = valorQuarto;
	}

	public boolean isDisponiblidade() {
		return disponiblidade;
	}

	public void setDisponiblidade(boolean disponiblidade) {
		this.disponiblidade = disponiblidade;
	}
	
	public void alterarDisponibilidade(boolean disponibilidade) 
	{
		this.disponiblidade = disponibilidade;
	}

    public void exibirDetalhes() 
    {
        System.out.println("Numero do quarto: " + numero + ", Tipo: " + tipoQuarto + ", Preço por dia: " + valorQuarto + ", Disponível: " + (disponiblidade ? "Sim" : "Não"));  
    }
	
	
}

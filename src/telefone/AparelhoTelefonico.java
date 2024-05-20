package telefone;

public interface AparelhoTelefonico {
	String versao = "v1.0";
	
	public void ligar(String numero);
	public void atender();
	public void iniciarCorreioVoz();
}

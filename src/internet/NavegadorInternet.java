package internet;

public interface NavegadorInternet {
	String versao = "v1.0";
	
	public void exibirPagina(String url);
	public void adicionarNovaAba();
	public void atualizarPagina();
}

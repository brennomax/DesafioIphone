package musica;

public interface ReprodutorMusical {
	String versao = "v1.0";
	
	public void tocar();
	public void pausar();
	public void selecionarMusica(String musica);
}

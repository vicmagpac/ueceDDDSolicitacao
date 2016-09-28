package status;

public interface Status {
	public void solicitar();
	public void aprovar();
	public void recusar();
	public void retornar(String observacao);
}

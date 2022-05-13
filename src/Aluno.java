public class Aluno extends Pessoa {

  private boolean isEstagiando;
  private String habilidades;

  public Aluno(int id, String nome, String email, String habilidades) {
    super(id, nome, email);
    this.isEstagiando = false;
    this.habilidades = habilidades;
  }

  public boolean isEstagiando() {
    return isEstagiando;
  }

  public void setEstagiando(boolean estagiando) {
    this.isEstagiando = estagiando;
  }

	public String getHabilidades() {
		return habilidades;
	}

	public void setHabilidades(String habilidades) {
		this.habilidades = habilidades;
	}
  
}

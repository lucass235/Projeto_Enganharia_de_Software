class Aluno extends Pessoa {

  private boolean isEstagiando;

  public Aluno(int id, String nome, String email) {
    super(id, nome, email);
  }

  public boolean isEstagiando() {
    return isEstagiando;
  }

  public void setEstagiando(boolean estagiando) {
    this.isEstagiando = estagiando;
  }

}

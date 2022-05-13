public class Empresa {
  
  private boolean isRecrutando;
  private String nome;
  private String descricao;

  public Empresa(boolean isRecrutando, String nome, String descricao) {
    this.isRecrutando = isRecrutando;
    this.nome = nome;
    this.descricao = descricao;
  }

  public boolean isRecrutando() {
    return isRecrutando;
  }

  public void setRecrutando(boolean isRecrutando) {
    this.isRecrutando = isRecrutando;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
}

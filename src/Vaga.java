public class Vaga {
  
  private String requisito;
  private String descricao;

  public Vaga(String requisito, String descricao) {
    this.requisito = requisito;
    this.descricao = descricao;
  }

  public String getRequisito() {
    return requisito;
  }

  public void setRequisito(String requisito) {
    this.requisito = requisito;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
}

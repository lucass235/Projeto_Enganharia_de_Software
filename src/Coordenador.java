public class Coordenador extends Pessoa {

  private String area;

  public Coordenador(int id, String nome, String email) {
    super(id, nome, email);
  }

  public String getArea() {
    return area;
  }

  public void setArea(String area) {
    this.area = area;
  }
  
  
}

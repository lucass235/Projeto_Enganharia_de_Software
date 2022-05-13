import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Aluno aluno0 = new Aluno(0, "Marcos", "mail0@mail.com", "Fullstack");
        Aluno aluno1 = new Aluno(1, "Lucas", "mail1@mail.com", "Front-end");
        Aluno aluno2 = new Aluno(2, "Wesllen", "mail2@mail.com", "Back-end");
        Aluno aluno3 = new Aluno(3, "João", "mail3@mail.com", "Back-end");
        atualizarEstagio(aluno0);
        atualizarEstagio(aluno1);
        atualizarEstagio(aluno2);
        atualizarEstagio(aluno3);
    }

    public static void atualizarEstagio(Aluno aluno){ //Inverte o boolean de estágio do aluno
        if(!aluno.isEstagiando()){
            aluno.setEstagiando(true);
            System.out.println("Aluno " + aluno.getNome() + " está estagiando.");
        } else {
            aluno.setEstagiando(false);
            System.out.println("Aluno " + aluno.getNome() + " não está estagiando.");
        }
    }

    public static void getListaNaoEstagiando(List<Aluno> alunos) {
        for(int i = 0; i < alunos.size(); i++) {
            if(!alunos.get(i).isEstagiando()) {
                System.out.println(alunos.get(i).getNome() +
                " — Habilidades: " + alunos.get(i).getHabilidades());
            }
        }
    }
}

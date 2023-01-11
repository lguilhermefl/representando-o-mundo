public class App {
    public static void main(String[] args) throws Exception {

        User user = new User();
        user.name = "Luiz";
        user.setEmail("meuemail@email.com");
        user.college = "Não faço faculdade";

        System.out.println("Dados do usuário:");
        System.out.println("Nome: " + user.name + "\nE-mail: " + user.getEmail() + "\nFaculdade: " + user.college);

        Discipline discipline = new Discipline();
        discipline.content = "Cálculo";
        discipline.name = "Cálculo I";
        discipline.college = "UFJF";
        discipline.topic = "Lógica";
        discipline.theory = "Faaaaaala aí, pequeno gafanhoto! Vamos começar a ver a Lógica Matemática! ...";
        discipline.exercise = "Atribua valores verdades as seguintes proposições lógicas: ...";

        System.out.println("Está acompanhando o seguinte conteúdo:");
        System.out.println("Material: " + discipline.content + "\nDisciplina: " + discipline.name + "\nFaculdade: " + discipline.college + "\nTópico: " + discipline.topic + "\nTeoria: " + discipline.theory + "\nExercício: " + discipline.exercise);
    }
}

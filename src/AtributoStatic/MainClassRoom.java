package AtributoStatic;

public class MainClassRoom {
    static void main(String[] args) {
        ClassRoom student1 = new ClassRoom("Maria");
        ClassRoom student2 = new ClassRoom("Juan");

        student1.showInfo();
        student2.showInfo();

        ClassRoom.setSchoolName("Escuela Tecnica N-2");

        student1.showInfo();
        student2.showInfo();

    }
}

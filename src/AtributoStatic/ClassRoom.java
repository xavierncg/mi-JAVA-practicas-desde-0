package AtributoStatic;

public class ClassRoom {
    private String estudentName;
    private static String schoolName = "Escuela Tecnica N-1";

    public ClassRoom(String estudentName) {
        this.estudentName = estudentName;
    }

    public String getEstudentName() {
        return estudentName;

    }

    public void setEstudentName(String estudentName) {
        this.estudentName = estudentName;

    }

    public static String getSchoolName() {                   //Importante colocarle el static y luego en el scoope llamar la clase.atributo
        return ClassRoom.schoolName;

    }

    public static void setSchoolName(String schoolName){    //Importante colocarle el static y luego en el scoope llamar la clase.atributo
        ClassRoom.schoolName = schoolName;
    }


    public void showInfo(){
        System.out.println("Alumno: " + estudentName + " Escuela " + schoolName );
    }
}

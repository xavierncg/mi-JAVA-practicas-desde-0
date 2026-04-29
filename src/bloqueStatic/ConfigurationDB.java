package bloqueStatic;

public class ConfigurationDB {

    static final String URL;
    static final String USER;

    static{
        URL = "jdbc:mysql://localhost:3306/";
        USER = "admin";
        System.out.println("Configuracion cargada...");
    }

    static void main(String[] args) {
        System.out.println(URL);
        System.out.println(USER);
    }

}

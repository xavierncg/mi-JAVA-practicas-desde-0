package ProyectoFinal;
//Creamos una clase Login para validar el login de el usuario al cajero
public class Login {
    private String rut;
    private String rutConfirm;
    private String password;
    private String passwordConfirm;
    //Realizamos el Constructor de la Clase para inicializarla
    public Login(String rut, String rutConfirm, String password, String passwordConfirm){
        this.rut = rut;
        this.rutConfirm = rutConfirm;
        this.password = password;
        this.passwordConfirm = passwordConfirm;
    }
//Creamos los metodos getter y setter

    //Metodo Getter
    public String getRut(){
        return rut;
    }

    public String getRutConfirm(){
        return rutConfirm;
    }

    public String getPassword(){
        return password;
    }

    public String getPasswordConfirm(){
        return passwordConfirm;
    }
    //Metodo Setter
    public void setRut(String rut){
        this.rut = rut;
    }

    public void setRutConfirm(String rutConfirm){
        this.rutConfirm = rutConfirm;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public void setPasswordConfirm(String passwordConfirm){
        this.passwordConfirm = passwordConfirm;
    }

    //Aca construiremos los Metodos de la Clase.

    public void iniciarLogin(){
        boolean loginValido = rut.equals(rutConfirm) && password.equals(passwordConfirm);
        if (!loginValido){
            System.out.println("Rut o Password Incorrecto");
        }
        else
        {
            System.out.println("Login Iniciado");
        }

    }
    //Queda pendiente Metodo para esconder password
    //Dejo en Obsidiant idea para hacerlo

}

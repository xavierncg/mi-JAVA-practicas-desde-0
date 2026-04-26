package PracticaEjercicios.proyectos;

public class User {
    private String nameUser;
    private String passwordHash;
    private String email;

    public User(String nameUser, String passwordHash, String email) {
        this.nameUser = nameUser;
        this.passwordHash = passwordHash;
        this.email = email;
    }

    //Creamos los methodos getter a usar:

    public String getNameUser(){
        return nameUser;
    }

    public String password(){
        return passwordHash;
    }

    public String email(){
        return email;
    }

    //Creamos los methodos setter a usar en la clase:

    public void setNameUser(String nameUser){
        this.nameUser = nameUser;
    }

    public void setPasswordHash(String passwordHash){
        this.passwordHash = passwordHash;
    }

    public void setEmail(String email){
        this.email = email;
    }

    //Metodo de clase o funciones que realizara

    public void mostrarInformacion(){
        System.out.println("Nombre: "+ nameUser);
        System.out.println("Password: "+ passwordHash);
        System.out.println("Email: "+email);
    }

	String verificationUser(){
		if(nameUser.equals(passwordHash) && email.equals(email)){
			return "OK";
		}else {
			return "ERROR";
		}
	}
}


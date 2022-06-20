package poo.composition_exercise.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    String name;
    String email;
    Date birthDate;

    public Client() {
    }

    public Client(String name, String email, Date birthDate) {
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Client: " + this.getName());
        sb.append(" (" + sdf.format(this.getBirthDate()) + ") - ");
        sb.append(this.getEmail());
        
        return sb.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}

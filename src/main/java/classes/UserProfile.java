package classes;

public class UserProfile {
    public static void main(String[] args) {
        AddUser newUser = new AddUser();
        newUser.setName("Rafał");
        String name = newUser.getName();
        newUser.setSurName("Sarnecki");
        String surName = newUser.getSurName();
        newUser.setEmail("rafal.sarnecki@gum.gov.pl");
        String email= newUser.getEmail();
        System.out.println(name+" "+" "+surName+ " "+email);
    }
}

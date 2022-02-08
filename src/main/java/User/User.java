/*
 * Author Name: Chittra Kumari
 * IDE : Intellej Idea Ultimate Edition
 * Date : 08-02-2022
 */
package User;

import java.util.Objects;

public class User {
    private String firstName;
    private String lastName;
    private String emailAddress;
    private int ID;

    public User(String firstName,String lastName,String emailAddress,int ID){
        this.firstName=firstName;
        this.emailAddress=emailAddress;
        this.ID=ID;
        this.lastName=lastName;
    }

    public void setFirstName(String firstName ){
        this.firstName=firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return ID == user.ID && firstName.equals(user.firstName) && lastName.equals(user.lastName) && emailAddress.equals(user.emailAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, emailAddress, ID);
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", ID=" + ID +
                '}';
    }
}

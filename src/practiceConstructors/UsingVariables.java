package practiceConstructors;

import javax.naming.Name;

public class UsingVariables {
    public static void main(String[] args) {

        Variables vr = new Variables();

        vr.setName("Neha");
        vr.setLocation("Tampa");
        vr.setIdNumber(27609);


        //without private variables and get methods
        /*System.out.println(vr.name+" is freaking amazing!!!");
        System.out.println("I'm currently staying at "+vr.location);
        System.out.println("My apt number is "+vr.idNumber);*/

        //with private variables and get methods  ( This is Encapsulation)
        System.out.println(vr.getName()+" is amazing!!!");
        System.out.println("I'm currently staying in "+vr.getLocation());
        System.out.println("My apt number is "+ vr.getIdNumber());

    }
}

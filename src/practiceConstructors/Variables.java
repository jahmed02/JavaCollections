package practiceConstructors;

public class Variables {

    //initialize variables to get and set the values

    
    private String name;
    private String location;
    private int idNumber;

    public void setName(String newName) {
        name = newName;
    }

    public void setLocation(String newLocation) {
        location = newLocation;
    }
    public void setIdNumber(int newIdNumber){
        idNumber = newIdNumber;
    }

    public String getName(){return name;}
    public String getLocation(){return location;}
    public int getIdNumber(){return idNumber;}
}

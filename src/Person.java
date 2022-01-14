import java.util.ArrayList;

// OBJECT PRACTICE:
// Create the person class with properties of your choice. Create the appropriate accessors and mutators.
// One of the properties on the Person class must be an array of Dogs called pet.
// Must have default constructor and parameterized override constructor.
// Once the Person class is complete, create a person object in SymClient with at least one dog object in the 

public class Person {
    private int age;
    private String name;
    private int creditCardNumber;
    private int socialSecurityNumber;
    private double allowence; 
    private boolean WinnieHutJunior;
    private boolean partCow;
    private ArrayList <Dog> dogs; 
    


    public Person(int age, String name, int creditCardNumber, int socialSecurityNumber, boolean partcow, boolean WinnieHutJunior, ArrayList<Dog> dogs, double allowence){
        this.age = 0;
        this.name = " ";
        this.creditCardNumber = 0;
        this.socialSecurityNumber = 0;
        this.partCow = false;
        this.WinnieHutJunior = false;
        this.dogs = new ArrayList<Dog>();
        this.allowence = 0;
    }


    //accessors
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public int whatCreditCardNumber(){
        return creditCardNumber;
    }
    public int whatSocialSecurityNumber(){
        return socialSecurityNumber;
    }
    public boolean getTruth(){
        return WinnieHutJunior;
    }
    public boolean isPartCow(){
        return partCow;
    }
    public ArrayList<Dog> getDogs(){
        return dogs;
    }
    public double GetAllowenceMon(){
        return allowence;
    }
//modifiers
    public void newAge (int age){
        this.age = age;
    }
    public void newName (String name){
        this.name = name;
    }
    public void newCreditNum (int creditCardNum){
        this.creditCardNumber = creditCardNum;

    }
    public void newSocialNum(int socialnums){
        this.socialSecurityNumber = socialnums;
    }
    public void newTruth(boolean truth){
        this.WinnieHutJunior = truth;
    }
    public void newCow (boolean cow){
        this.partCow = cow;
    }
    public void newAllownece (double allowence){
        this.allowence = allowence;
    }
    
    












}

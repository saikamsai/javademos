public class ClsandObjDemo08 
{  
    String name; 
    String place; 
    int age; 
    String dept; 
    public ClsandObjDemo08(String name, String breed, int age, String color, String hyd, String CSE) 
    { 
        this.name = name; 
        this.place = hyd; 
        this.age = age; 
        this.dept = CSE; 
    } 
    public String getName() 
    { 
        return name; 
    } 
    public String getplace() 
    { 
        return place; 
    } 
    public int getAge() 
    { 
        return age; 
    } 
    public String getdept() 
    { 
        return dept; 
    } 
    @Override
    public String toString() 
    { 
        return("Hi my name is "+ this.getName()+ ".\nMy place,age and dept are " + this.getplace()+", " + this.getAge()+ ", and "+ this.getdept() + "."); 
    } 
    public static void main(String[] args) 
    { 
        ClsandObjDemo08 o = new ClsandObjDemo08("sai"," ", 21, " ", "hyd", "ece"); 
        System.out.println(o.toString()); 
    } 
}

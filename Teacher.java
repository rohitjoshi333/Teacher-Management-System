// Creating a class called teacher 
public class Teacher{
    //Creating instance variables
    private int teacher_Id;
    private String teacher_Name;
    private String address;
    private String working_Type;
    private String employment_Status;
    private int working_Hours;
    
    // Creating a constructor which accepts five parameters 
    public Teacher(int teacher_Id, String teacher_Name, String address, String working_Type, String employment_Status){
        //Initalizing instance variables using this keyword
        this.teacher_Id = teacher_Id;
        this.teacher_Name = teacher_Name;
        this.address = address;
        this.working_Type = working_Type;
        this.employment_Status = employment_Status;
        this.working_Hours=0;
    }
    
    //Getter method
    public int getTeacherId()
    {  // using getter method to retrive the value of teacher_Id whose access is private 
        return this.teacher_Id;
    }
    public String getTeacher_Name()
    {  // using getter method to retrive the value of teacher_Name whose access is private 
        return this.teacher_Name;
    }
    public String getAddress()
    {  // using getter method to retrive the value of address whose access is private 
        return this.address;
    }
    public String getWorking_Type()
    {  // using getter method to retrive the value of working_Type whose access is private 
        return this.working_Type;
    }
     public String getEmployment_Status()
     {  // using getter method to retrive the value of employment_Status whose access is private 
        return this.employment_Status;
    }
    public int getWorking_Hours()
    {  // using getter method to retrive the value of working_Hours whose access is private 
        return this.working_Hours;
    }
    // Setter method
    public void setWorking_Hours(int newWorking_Hours)
    { // using setter to assign new parameters to instance variable
        this.working_Hours = newWorking_Hours;
    }
    //display method 
    public void Displayinformation()
    { // This allows help to display information about the objects
        System.out.println("Teacher Id:" +getTeacherId());
        System.out.println("Teacher Name:" +getTeacher_Name());
        System.out.println("Address:" +getAddress());
        System.out.println("Working Type:"+getWorking_Type());
        System.out.println("Employment Status:" +getEmployment_Status());
        // Using if condition to check if working hours is assigned or not
        if( getWorking_Hours() != 0 ){ // if working hour is not 0 then print the information related to working hour
            System.out.println("Working Hours:" + getWorking_Hours());
        }else{ // if working hour not assigned then print Working hours has not been provided
            System.out.println("Working hours has not been provided");
        }
    }
}


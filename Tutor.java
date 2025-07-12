// Extends key word is used to inherit the property of Teacher class to sub class Tutor
public class Tutor extends Teacher
{
//Creating instance variables
   private double salary;
   private String specialization;
   private String academic_Qualifications;
   private int performance_Index;
   private boolean is_Certified;
   // Creating a constructor that accepts ten parameters
   public Tutor(int teacher_Id, String teacher_Name, String address, String working_Type, String employment_Status, int working_Hours, double salary, 
   String specialization, String academic_Qualifications, int performance_Index)
   {
       super(teacher_Id, teacher_Name, address, working_Type, employment_Status); // Calling the variable of super class teacher to sub class tutor using super key
       //Initalizing instance variables using this keyword            if (newperformance_Index>=10 )
       setWorking_Hours(working_Hours);
       this.salary = salary; 
       this.specialization = specialization; 
       this.academic_Qualifications = academic_Qualifications; 
       this.performance_Index = performance_Index; 
       this.is_Certified = false; // assigning its boolean value as false
   }
   /* creating accessor method
    * Creating a getter method that can take the value of instance variable whose access is prvate*/
   public double getSalary()
   { 
       return this.salary;
   }
   public String getSpecialization()
   { 
       return this.specialization;
   }
   public String getAcademic_Qualifications()
   { 
       return this.academic_Qualifications;
   }
   public int getPerformance_Index()
   { 
       return this.performance_Index; 
   }
   public boolean  getIs_Certified()
   { 
       return  this.is_Certified;
   }
   public void setSalary(double newsalary, int newperformance_Index)
       { // creating a setter method that updates the salary and performance index 
       //Using nested if condition because nested if condition helps us in situation where execution of one condition depeds on other condition 
       if(!is_Certified)
       { // condition to check if the tutor is certified  or not 
           // condition to calculate appraisalPercentage
           if( newperformance_Index >= 5 && getWorking_Hours() > 20){ // if performance index is greater than equals to 5 and working hour is greater then 20 the appraisal percentage becomes 0.0
                 double appraisalPercentage;
                if( newperformance_Index <= 7){ // if performance index is greater than equals to 5 and working hour is less then equals to 7 the appraisal percentage becomes 0.05
                    appraisalPercentage=5;
                }
                else if(newperformance_Index >= 8 && newperformance_Index <= 9){ // if performance index is greater than equals to 8 and working hour is less then equals to 9 the appraisal percentage becomes 0.10
                    appraisalPercentage=10;
                }
                else { // if performance index is greater than equals to 10 and working hour is less then equals to 20 the appraisal percentage becomes 0.20
                    appraisalPercentage=20;
                    }
            
            double appraisal = (appraisalPercentage / 100) * newsalary;
            this.salary += appraisal;
            is_Certified = true;
            System.out.println("Salary: " + this.getSalary());
            
        
       }
       else{
           System.out.println("Salary of tutor has already been garnted therefore, salary cannot be approved again");
       }
   }
}  
   public void RemoveTutor() // this method is responsible for 
   {
       if(!is_Certified){
           this.salary = 0;
           this.specialization = "";
           this.academic_Qualifications = "";
           this.performance_Index = 0;
           this.is_Certified = false;
       }
       else{
           System.out.println("Tutor is certified therefore, removal cannot be approved ");
       }
   }
   public void Displayinformation()
   {
       super.Displayinformation();
       if(!is_Certified){
           System.out.println("Salary:" + this.salary);
           System.out.println("Specialization:" + this.specialization);
           System.out.println("Academic Qualification:" + this.academic_Qualifications);
           System.out.println("Performance index:" + this.performance_Index);
       }
       else{
           System.out.println("Certification has not been performed yet");
       }
}
}


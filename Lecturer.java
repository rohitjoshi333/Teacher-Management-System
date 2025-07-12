// Extends key word is used to inherit the property of Teacher class to sub class Lecture
public  class Lecturer extends Teacher{
    //Creating instance variables
    private String department;
    private int year_Of_Experience;
    private int grade_Score;
    private boolean has_Graded;
    // Creating a constructor that accepts eight parameters
    public Lecturer (int teacher_Id, String teacher_Name, String address, String working_Type, String employment_Status, String department, int year_Of_Experience, int working_Hours){
        super(teacher_Id, teacher_Name, address, working_Type, employment_Status); 
        /* Calling the variable of super class Teacher through subclass Lecturer using Super keyword
         * because name of variable in both super class and sub class is same 
        */
       //Initalizing instance variables using this keyword
        this.department = department; 
        this.year_Of_Experience = year_Of_Experience; 
        this.grade_Score = 0; // assigning its value as 0
        this.has_Graded = false; // assigning its boolean value as false
    }
    public String getDepartment()
    { //using getter method to retrive the value of department whose access is private
        return this.department;
    }
    public int getYear_Of_Experience()
    { //using getter method to retrive the value of year_Of_Experience whose access is private
        return this.year_Of_Experience;
    }
    public int getGrade_Score()
    { //using getter method to retrive the value of grade_Score whose access is private
        return this.grade_Score;
    }
    public void setGrade_score(int grade_Score)
    { // using setter to assign new parameters to instance variable
        this.grade_Score = grade_Score;
    }
    public void grade_Assignment(int grade_Score, String department )// Creating a method name Gradeassigment who accepts following parameters 
    { 
        if(year_Of_Experience >= 5 && this.department.equals(department)){ // this condition checks experience of lecturer and if the lecturer belongs to same department or not
            if(grade_Score >= 70){ // if gradescore is morethen or equals to 70 print A
                System.out.println("A");
            }
            else if (grade_Score >= 60){ // if gradescore is morethen or equals to 60 print B
                System.out.println("B");
            }
            else if (grade_Score >= 50){ // if gradescore is morethen or equals to 50 print C
                System.out.println("C");
            }
            else if (grade_Score >= 40){ // if gradescore is morethen or equals to 40 print D
                System.out.println("D");
            }
            else{ // Else print E 
                grade_Score=grade_Score; 
                System.out.println("E");
            }
            has_Graded = true; // Assigning true if gradescore is successfully graded 
        }
        else{
            System.out.println("Grade has not been assigned  ");
        }
    }
    public void Displayinformation()
    { // This method allows to display information about the objects    
        super.Displayinformation(); // super keyword allows us to retrieve the data of named objects from super class 
        System.out.println("Department:" + this.department);
        System.out.println("Years of experience:" + this.year_Of_Experience);
        if(has_Graded ){ // this condition checks id the grade_score has been assigned or not  
            System.out.println("Graded Score: " + grade_Score);
            System.out.println("Congratulation Grading was successful");
        }else{
            System.out.println("Grading has not been asigned");  
        }
    }
}

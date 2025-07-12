import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;



public class teacherGUI implements ActionListener {
    private JFrame teacherf;
    //Lecture
    private JTextField teacheridtxt, teachernametxt, addresstxt, workingtypetxt, employmentstatustxt,workinghourstxt,departmenttxt;
    private JTextField yearofexperiencetxt, gradedscoretxt;
    private JLabel Lecturerdet, Lecturerinfo, teacherid, teachername, address, workingtype, employmentstatus, workinghours,yearofexperience;
    private JLabel gradedscore,department;
    //tutor
    private JLabel tutordet, tutorinfo, tutteacherid,tutteachername,tutaddress,tutworkingtype,tutemploymentstatus,tutworkinghour,tutperformanceindex,tutspecialization,tutsalary,tutacadimic;
    private JTextField tutteachernametxt,tutteacheridtxt,tutaddresstxt,tutworkingtypetxt,tutemploymentstatustxt,tutworkinghourtxt,tutperformanceindextxt,tutspecializationtxt,tutsalarytxt,tutacadimictxt;
    //Grade Assighnment
    private JLabel gradedet,gradeinfo,grdteacherid,grdgradescr,grddepartment,grdyoe;
    private JTextField grdteacheridtxt,grdgradescrtxt,grddepartmenttxt,grdyoetxt;
    //Set Salary
    private JLabel Setsalarydef,setsalaryinfo,setteacherid,setperf,setnewsalary;
    private JTextField setteacheridtxt,setperftxt,setnewsalarytxt;
    //Remove Tutor
    //Display
    private JLabel dispdef,dispteachid,cleardef,clrteacherid;
    private JTextField disptxt ,clrteachidtxt;
    private JButton addlecture, addtutor, Grade,clear, display ,setsalary ,rmvbtn;

    private ArrayList<Teacher> teacherlist = new ArrayList<>();

    //fonts
    Font headfont = new Font("Inter", Font.BOLD, 28);
    Font semiheadfont = new Font ("Manrope", Font.PLAIN, 13);
    Font mainfont = new Font ("Manrope", Font.PLAIN, 16);
    Font btnfont = new Font ("Manrope" , Font.BOLD, 12);

    public teacherGUI(){
        //teacher frame 
        teacherf = new JFrame("Teacher GUI");
        teacherf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        teacherf.setSize(1620,1000);
        teacherf.getContentPane().setBackground(Color.decode("#212023"));
        
        
        //Lecturer heading 
        Lecturerdet = new JLabel("Lecturer Details");
        Lecturerdet.setBounds(50,50,244,34);
        Lecturerdet.setForeground(Color.WHITE);
        Lecturerdet.setFont(headfont);
        teacherf.add(Lecturerdet);
        
        //Lecturer info
        Lecturerinfo = new JLabel("Lecturer info");
        Lecturerinfo.setBounds(55,90,97,18);
        Lecturerinfo.setForeground(Color.WHITE);
        Lecturerinfo.setFont(semiheadfont);
        teacherf.add(Lecturerinfo);
        
        //teacher label
        teacherid = new JLabel("Teacher ID");
        teacherid.setBounds(170,134,100,22);
        teacherid.setForeground(Color.WHITE);
        teacherid.setFont(mainfont);
        teacherf.add(teacherid);
        
        // teacher id textfield
        teacheridtxt = new JTextField("   ");
        teacheridtxt.setBounds(274,127,449,36);
        teacheridtxt.setBackground(Color.decode("#262628"));
        teacheridtxt.setForeground(Color.WHITE);
        teacheridtxt.setBorder(null);
        teacheridtxt.setFont(mainfont);
        teacherf.add(teacheridtxt);
   
        teacherf.add(teacheridtxt);   

        // teacher name 
        teachername = new JLabel("Teacher Name");
        teachername.setBounds(142,180,150,22);
        teachername.setForeground(Color.WHITE);
        teachername.setFont(mainfont);
        teacherf.add(teachername);

        // teacher name textfield
        teachernametxt = new JTextField("  ");
        teachernametxt.setBounds(274,173,449,36);
        teachernametxt.setBackground(Color.decode("#262628"));
        teachernametxt.setForeground(Color.WHITE);
        teachernametxt.setBorder(null);
        teachernametxt.setFont(mainfont);
        teacherf.add(teachernametxt);

        

        //address
        address = new JLabel("Address");
        address.setBounds(188, 226, 80, 22);
        address.setForeground(Color.WHITE);
        address.setFont(mainfont);
        teacherf.add(address);

        //address textfield
        addresstxt = new JTextField("   ");
        addresstxt.setBounds(275,219,449,36);
        addresstxt.setForeground(Color.WHITE);
        addresstxt.setBackground(Color.decode("#262628"));
        addresstxt.setBorder(null);
        addresstxt.setFont(mainfont);
        teacherf.add(addresstxt);

        

        // workingtype
        workingtype = new JLabel("Working Type");
        workingtype.setBounds(145,270,120,22);
        workingtype.setForeground(Color.WHITE);
        workingtype.setFont(mainfont);
        teacherf.add(workingtype);

        // working type text field
        workingtypetxt = new JTextField("   ");
        workingtypetxt.setBounds(275, 265, 449, 36);
        workingtypetxt.setForeground(Color.WHITE);
        workingtypetxt.setBackground(Color.decode("#262628"));
        workingtypetxt.setBorder(null);
        workingtypetxt.setFont(mainfont); 
        teacherf.add(workingtypetxt);


        //Employment Status
        employmentstatus = new JLabel("Employment Status");
        employmentstatus.setBounds(100,316,190,22);
        employmentstatus.setForeground(Color.WHITE);
        employmentstatus.setFont(mainfont);
        teacherf.add(employmentstatus);

        //employmentstatus text field
        employmentstatustxt = new JTextField("   ");
        employmentstatustxt.setBounds(275, 311, 449, 36);
        employmentstatustxt.setForeground(Color.WHITE);
        employmentstatustxt.setBackground(Color.decode("#262628"));
        employmentstatustxt.setBorder(null);
        employmentstatustxt.setFont(mainfont);
        teacherf.add(employmentstatustxt);

        //workinghours
        workinghours = new JLabel("Working Hours");
        workinghours.setBounds(138,362,190,22);
        workinghours.setForeground(Color.WHITE);
        workinghours.setFont(mainfont);
        teacherf.add(workinghours);

        //workinghourstxt
        workinghourstxt = new JTextField("   ");
        workinghourstxt.setBounds(275, 357, 449, 36);
        workinghourstxt.setForeground(Color.WHITE);
        workinghourstxt.setMargin(new Insets(5,10,5,10));
        workinghourstxt.setBackground(Color.decode("#262628"));
        workinghourstxt.setBorder(null);
        workinghourstxt.setFont(mainfont);
        
                teacherf.add(workinghourstxt);

        //Year of Experience
        yearofexperience = new JLabel("Year of Experience");
        yearofexperience.setBounds(111,408,190,22);
        yearofexperience.setForeground(Color.WHITE);
        yearofexperience.setFont(mainfont);
        teacherf.add(yearofexperience);

        //Year of Experience text fieldd
        yearofexperiencetxt = new JTextField("   ");
        yearofexperiencetxt.setBounds(275, 403, 449, 36);
        yearofexperiencetxt.setForeground(Color.WHITE);
        yearofexperiencetxt.setMargin(new Insets(5,10,5,10));
        yearofexperiencetxt.setBorder(null);
        yearofexperiencetxt.setBackground(Color.decode("#262628"));
        yearofexperiencetxt.setFont(mainfont);
        
                teacherf.add(yearofexperiencetxt);


        //Year of Experience
        department = new JLabel("Department");
        department.setBounds(157,454,190,22);
        department.setForeground(Color.WHITE);
        department.setFont(mainfont);
        teacherf.add(department);

        //Year of Experience text fieldd
        departmenttxt = new JTextField("  ");
        departmenttxt.setBounds(275, 449, 449, 36);
        departmenttxt.setForeground(Color.WHITE);
        departmenttxt.setMargin(new Insets(5,10,5,10));
        departmenttxt.setBorder(null);
        departmenttxt.setBackground(Color.decode("#262628"));
        departmenttxt.setFont(mainfont);
                teacherf.add(departmenttxt);
        
                
            

        //lecture Button
        addlecture = new JButton(" Add Lecture");
        addlecture.setBounds(605,505,120,31);
        addlecture.setBackground(Color.decode("#DA2A31"));
        addlecture.setForeground(Color.WHITE);
        addlecture.setBorder(null);
        addlecture.setFont(btnfont);
        addlecture.setFocusable(false);
        teacherf.add(addlecture);
        
        addlecture.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                addlecturer();
            }
        });
        



         //Tytor heading 
         tutordet = new JLabel("Tutor Details");
         tutordet.setBounds(882,50,244,34);
         tutordet.setForeground(Color.WHITE);
         tutordet.setFont(headfont);
         teacherf.add(tutordet);
         
         //Tutor info
         tutorinfo = new JLabel("Tutor info");
         tutorinfo.setBounds(890,90,97,18);
         tutorinfo.setForeground(Color.WHITE);
         tutorinfo.setFont(semiheadfont);
         teacherf.add(tutorinfo);

          // Tutor teacher id 
          tutteacherid = new JLabel("Teacher ID");
          tutteacherid.setBounds(950,134,150,22);
          tutteacherid.setForeground(Color.WHITE);
          tutteacherid.setFont(mainfont);
        teacherf.add(tutteacherid);

        // tutor teacher textfield
        tutteacheridtxt = new JTextField("   ");
        tutteacheridtxt.setBounds(1050,127,449,36);
        tutteacheridtxt.setBackground(Color.decode("#262628"));
        tutteacheridtxt.setForeground(Color.WHITE);
        tutteacheridtxt.setBorder(null);
        tutteacheridtxt.setFont(mainfont);
        teacherf.add(tutteacheridtxt);


        // Teacher name 
        tutteachername = new JLabel("Teacher Name");
        tutteachername.setBounds(923,180,150,22);
        tutteachername.setForeground(Color.WHITE);
        tutteachername.setFont(mainfont);
        teacherf.add(tutteachername);

        // teacher name textfield
        tutteachernametxt = new JTextField("   ");
        tutteachernametxt.setBounds(1050,173,449,36);
        tutteachernametxt.setForeground(Color.WHITE);
        tutteachernametxt.setBackground(Color.decode("#262628"));
        tutteachernametxt.setBorder(null);
        tutteachernametxt.setFont(mainfont);  
        teacherf.add(tutteachernametxt);


        // Tutor Address 
        tutaddress = new JLabel("Address");
        tutaddress.setBounds(968,226,150,22);
        tutaddress.setForeground(Color.WHITE);
        tutaddress.setFont(mainfont);
        teacherf.add(tutaddress);
        
        // Tutor address  textfield
        tutaddresstxt = new JTextField("   ");
        tutaddresstxt.setBounds(1050,219,449,36);
        tutaddresstxt.setForeground(Color.WHITE);
        tutaddresstxt.setBackground(Color.decode("#262628"));
        tutaddresstxt.setFont(mainfont);     
        tutaddresstxt.setBorder(null);
        teacherf.add(tutaddresstxt);

        // Tutor Working type
        tutworkingtype = new JLabel("Working Type");
        tutworkingtype.setBounds(925,272,170,22);
        tutworkingtype.setForeground(Color.WHITE);
        tutworkingtype.setFont(mainfont);
        teacherf.add(tutworkingtype);
        
        // Tutor Working Type  textfield
        tutworkingtypetxt = new JTextField("   ");
        tutworkingtypetxt.setBounds(1050,265,449,36);
        tutworkingtypetxt.setForeground(Color.WHITE);
        tutworkingtypetxt.setBackground(Color.decode("#262628"));
        tutworkingtypetxt.setBorder(null);
        tutworkingtypetxt.setFont(mainfont);
        teacherf.add(tutworkingtypetxt);

        
        // Tutorial Employment Status status
        tutemploymentstatus = new JLabel("Employment Status");
        tutemploymentstatus.setBounds(880,318,180,22);
        tutemploymentstatus.setForeground(Color.WHITE);
        tutemploymentstatus.setFont(mainfont);
        teacherf.add(tutemploymentstatus);
        
        // Tutor Employment Status  textfield
        tutemploymentstatustxt = new JTextField("   ");
        tutemploymentstatustxt.setBounds(1050,311,449,36);
        tutemploymentstatustxt.setForeground(Color.WHITE);
        tutemploymentstatustxt.setBackground(Color.decode("#262628"));
        tutemploymentstatustxt.setBorder(null);
        tutemploymentstatustxt.setFont(mainfont);
        teacherf.add(tutemploymentstatustxt);


        // Tutorial Working Hour
        tutworkinghour = new JLabel("Working Hour");
        tutworkinghour.setBounds(925,364,180,22);
        tutworkinghour.setForeground(Color.WHITE);
        tutworkinghour.setFont(mainfont);
        teacherf.add(tutworkinghour);
        
        // Tutor Working Hour  textfield
        tutworkinghourtxt = new JTextField("  ");
        tutworkinghourtxt.setBounds(1050,357,449,36);
        tutworkinghourtxt.setForeground(Color.WHITE);
        tutworkinghourtxt.setBackground(Color.decode("#262628"));
        tutworkinghourtxt.setBorder(null);
        tutworkinghourtxt.setFont(mainfont);   
        teacherf.add(tutworkinghourtxt);

        
        // Tutorial Performance Index
        tutperformanceindex = new JLabel("Performance Index");
        tutperformanceindex.setBounds(885,410,180,22);
        tutperformanceindex.setForeground(Color.WHITE);
        tutperformanceindex.setFont(mainfont);
        teacherf.add(tutperformanceindex);
        
        // Tutor Performance Index txt
        tutperformanceindextxt = new JTextField("  ");
        tutperformanceindextxt.setBounds(1050,403,449,36);
        tutperformanceindextxt.setForeground(Color.WHITE);
        tutperformanceindextxt.setBackground(Color.decode("#262628"));
        tutperformanceindextxt.setBorder(null);
        tutperformanceindextxt.setFont(mainfont);
        teacherf.add(tutperformanceindextxt);
        
  
        
        //tutor Salary textfield
        tutsalary = new JLabel("Salary");
        tutsalary.setBounds(978,456,180,22);
        tutsalary.setForeground(Color.WHITE);
        tutsalary.setFont(mainfont);
        teacherf.add(tutsalary);
        
        // Tutor Salary  textfield
        tutsalarytxt = new JTextField("   ");
        tutsalarytxt.setBounds(1050,449,449,36);
        tutsalarytxt.setForeground(Color.WHITE);
        tutsalarytxt.setBackground(Color.decode("#262628"));
        tutsalarytxt.setBorder(null);
        tutsalarytxt.setFont(mainfont);
        
        teacherf.add(tutsalarytxt);
        



        // TutorSpecialization  textfield
        tutspecialization = new JLabel("Specialization");
        tutspecialization.setBounds(920,502,180,22);
        tutspecialization.setForeground(Color.WHITE);
        tutspecialization.setFont(mainfont);
        teacherf.add(tutspecialization);
        
        // TutorSpecialization  textfield
        tutspecializationtxt = new JTextField("   ");
        tutspecializationtxt.setBounds(1050,495,449,36);
        tutspecializationtxt.setForeground(Color.WHITE);
        tutspecializationtxt.setBackground(Color.decode("#262628"));
        tutspecializationtxt.setBorder(null);
        tutspecializationtxt.setFont(mainfont);
        teacherf.add(tutspecializationtxt);
        

         // TutorSpecialization  textfield
         tutacadimic = new JLabel("Academic Qualifications");
         tutacadimic.setBounds(840,548,200,22);
         tutacadimic.setForeground(Color.WHITE);
         tutacadimic.setFont(mainfont);
         teacherf.add(tutacadimic);
         
         // TutorSpecialization  textfield
         tutacadimictxt = new JTextField("   ");
         tutacadimictxt.setBounds(1050,541,449,36);
         tutacadimictxt.setForeground(Color.WHITE);
         tutacadimictxt.setBackground(Color.decode("#262628"));
         tutacadimictxt.setBorder(null);
         tutacadimictxt.setFont(mainfont);
         teacherf.add(tutacadimictxt);


         //add tutor button
         addtutor = new JButton(" Add Tutor");
         addtutor.setBounds(1400,597,100,31);
         addtutor.setBackground(Color.decode("#DA2A31"));
         addtutor.setForeground(Color.WHITE);
         addtutor.setBorder(null);
         addtutor.setFont(btnfont);
         addtutor.setFocusable(false);
         teacherf.add(addtutor);
         
         
          addtutor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                addtutor();
               
            }
        });

        rmvbtn = new JButton(" Remove Tutor");
        rmvbtn.setBounds(1280,597,105,31);
        rmvbtn.setBackground(Color.decode("#2A292B"));
        rmvbtn.setForeground(Color.WHITE);
        rmvbtn.setFont(btnfont);
        rmvbtn.setBorder(null);
        rmvbtn.setFocusable(false);
        rmvbtn.addActionListener(this);
        teacherf.add(rmvbtn);
        
          rmvbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                rmvtutor();
            }
        });


        


        //Grade assighnment heading 
        gradedet = new JLabel("Grade Asighnments");
        gradedet.setBounds(35,593,284,34);
        gradedet.setForeground(Color.WHITE);
        gradedet.setFont(headfont);
        teacherf.add(gradedet);
        
        //Grade Assighnments info
        gradeinfo = new JLabel("Grade Info");
        gradeinfo.setBounds(40,633,97,18);
        gradeinfo.setForeground(Color.WHITE);
        gradeinfo.setFont(semiheadfont);
        teacherf.add(gradeinfo);


        //Grade teacher id 
        grdteacherid = new JLabel("Teacher Name");
        grdteacherid.setBounds(112,675,150,22);
        grdteacherid.setForeground(Color.WHITE);
        grdteacherid.setFont(mainfont);
        teacherf.add(grdteacherid);

        // grade name textfield
        grdteacheridtxt = new JTextField("   ");
        grdteacheridtxt.setBounds(244,670,320,36);
        grdteacheridtxt.setForeground(Color.WHITE);
        grdteacheridtxt.setBackground(Color.decode("#262628"));
        grdteacheridtxt.setBorder(null);
        grdteacheridtxt.setFont(mainfont);
        teacherf.add(grdteacheridtxt);


        //Grade score teacher id 
        grdgradescr = new JLabel("Grade Score");
        grdgradescr.setBounds(127,721,150,22);
        grdgradescr.setForeground(Color.WHITE);
        grdgradescr.setFont(mainfont);
        teacherf.add(grdgradescr);
        
        // grade socre textfield
        grdgradescrtxt = new JTextField("  ");
        grdgradescrtxt.setBounds(244,716,320,36);
        grdgradescrtxt.setBackground(Color.decode("#262628"));
        grdgradescrtxt.setForeground(Color.WHITE);
        grdgradescrtxt.setBorder(null);
        grdgradescrtxt.setFont(mainfont);
        teacherf.add(grdgradescrtxt);

        
        //Grade teacher id 
        grddepartment = new JLabel("Department");
        grddepartment.setBounds(127,767,150,22);
        grddepartment.setForeground(Color.WHITE);
        grddepartment.setFont(mainfont);
        teacherf.add(grddepartment);
        
        // grade name textfield
        grddepartmenttxt = new JTextField("   ");
        grddepartmenttxt.setBounds(244,762,320,36);
        grddepartmenttxt.setBackground(Color.decode("#262628"));
        grddepartmenttxt.setForeground(Color.WHITE);
        grddepartmenttxt.setBorder(null);
        grddepartmenttxt.setFont(mainfont);
        teacherf.add(grddepartmenttxt);

        
        //Grade Year of experience
        grdyoe = new JLabel("Year of Experience");
        grdyoe.setBounds(78,813,150,22);
        grdyoe.setForeground(Color.WHITE);
        grdyoe.setFont(mainfont);
        teacherf.add(grdyoe);
        
        // grade Year of experience
        grdyoetxt = new JTextField("   ");
        grdyoetxt.setBounds(244,808,320,36);
        grdyoetxt.setForeground(Color.WHITE);
        grdyoetxt.setBorder(null);
        grdyoetxt.setBackground(Color.decode("#262628"));
        grdyoetxt.setFont(mainfont);
        teacherf.add(grdyoetxt);

         //Grade button
         Grade = new JButton(" Grade Asighnments");
         Grade.setBounds(408,864,155,31);
         Grade.setBackground(Color.decode("#DA2A31"));
         Grade.setBorder(null);
         Grade.setForeground(Color.WHITE);
         Grade.setFont(btnfont);
         Grade.setFocusable(false);
         Grade.addActionListener(this);
         teacherf.add(Grade);
        
         
             
            Grade.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                addgrade();
            }
        });
         //Setsalary heading 
    Setsalarydef = new JLabel("Set Salary");
     Setsalarydef.setBounds(620,629,284,34);
     Setsalarydef.setForeground(Color.WHITE);
     Setsalarydef.setFont(headfont);
     teacherf.add(Setsalarydef);
     
     //Setsalary info
     setsalaryinfo = new JLabel("Salary Info");
     setsalaryinfo.setBounds(625,665,97,18);
     setsalaryinfo.setForeground(Color.WHITE);
     setsalaryinfo.setFont(semiheadfont);
     teacherf.add(setsalaryinfo);
     
     //set teacher id 
     setteacherid = new JLabel("Teacher Name");
     setteacherid.setBounds(632,707,150,22);
     setteacherid.setForeground(Color.WHITE);
     setteacherid.setFont(mainfont);
     teacherf.add(setteacherid);

     // set name textfield
     setteacheridtxt = new JTextField("   ");
     setteacheridtxt.setBounds(764,702,320,36);
     setteacheridtxt.setBackground(Color.decode("#262628"));
     setteacheridtxt.setForeground(Color.WHITE);
     setteacheridtxt.setBorder(null);
     setteacheridtxt.setFont(mainfont);
     teacherf.add(setteacheridtxt);

        //set  Performance index 
        setperf = new JLabel("Performance index");
        setperf.setBounds(597,753,150,22);
        setperf.setForeground(Color.WHITE);
        setperf.setFont(mainfont);
     teacherf.add(setperf);

     // set  Performance index textfield
     setperftxt = new JTextField("   ");
     setperftxt.setBounds(764,748,320,36);
     setperftxt.setForeground(Color.WHITE);
     setperftxt.setBackground(Color.decode("#262628"));
     setperftxt.setBorder(null);
     setperftxt.setFont(mainfont);
     teacherf.add(setperftxt);
     
     //New Salary
        setnewsalary = new JLabel("New Salary");
        setnewsalary.setBounds(655,799,150,22);
        setnewsalary.setForeground(Color.WHITE);
        setnewsalary.setFont(mainfont);
        teacherf.add(setnewsalary);

     // set name textfield
     setnewsalarytxt = new JTextField("   ");
     setnewsalarytxt.setBounds(764,794,320,36);
     setnewsalarytxt.setForeground(Color.WHITE);
     setnewsalarytxt.setBackground(Color.decode("#262628"));
     setnewsalarytxt.setBorder(null);
     setnewsalarytxt.setFont(mainfont);
     teacherf.add(setnewsalarytxt);

     //setsalary button
        setsalary = new JButton(" Set Salary");
        setsalary.setBounds(980,850,105,31);
        setsalary.setBackground(Color.decode("#DA2A31"));
        setsalary.setForeground(Color.WHITE);
        setsalary.setFont(btnfont);
        setsalary.setBorder(null);
        setsalary.setFocusable(false);
        setsalary.addActionListener(this);
        teacherf.add(setsalary);
        
        setsalary.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                salary();
            }
        });

         

        //Display
        dispdef = new JLabel("Display");
        dispdef.setBounds(1120,675,284,34);
        dispdef.setForeground(Color.WHITE);
        dispdef.setFont(headfont);
        teacherf.add(dispdef);
        
        dispteachid = new JLabel("Teacher Id");
        dispteachid.setBounds(1130,721,150,22);
        dispteachid.setForeground(Color.WHITE);
        dispteachid.setFont(mainfont);
        teacherf.add(dispteachid);
        
        //  id textfield
        disptxt = new JTextField("   ");
        disptxt.setBounds(1230,716,265,36);
        disptxt.setBorder(null);
        disptxt.setBackground(Color.decode("#262628"));
        disptxt.setForeground(Color.WHITE);
        disptxt.setFont(mainfont);  
        teacherf.add(disptxt);

     display = new JButton(" Display");
     display.setBounds(1380,771,115,31);
     display.setBackground(Color.decode("#DA2A31"));
     display.setBorder(null);
     display.setForeground(Color.WHITE);
     display.setFont(btnfont);
     display.setFocusable(false);
     display.addActionListener(this);
     teacherf.add(display);

            // CLear button
            clear = new JButton("Clear");
            clear.setBounds(1180,827,275,36);
            clear.setBackground(Color.decode("#2A292B"));
            clear.setForeground(Color.WHITE);
            clear.setFont(mainfont);
            clear.setBorder(null);
            clear.setFocusable(false);
            clear.addActionListener(this);
            teacherf.add(clear);
            
            clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                clear();
            }
        });


     teacherf.setLayout(null);
        teacherf.setVisible(true);
     
    } 
    public static void main(String[] args) {
        new teacherGUI();
    }
    
        private void addlecturer() {
       
        
        try {
            // Convert text fields to integers (with proper handling)
            int teacherID;
            try {
                if (teacheridtxt.getText().trim().isEmpty() ||
                addresstxt.getText().trim().isEmpty() ||
                departmenttxt.getText().trim().isEmpty() || 
                employmentstatustxt.getText().trim().isEmpty()) {

                    JOptionPane.showMessageDialog(teacherf, "Please fill up all the fields.");
                    return;

                }
    
                teacherID = Integer.parseInt(teacheridtxt.getText().trim());

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(teacherf, "ID must be a number", "Error", JOptionPane.ERROR_MESSAGE);
                return; // Exit early on parsing error
            }
    
            // Check for unique ID (assuming isIDUnique() returns true for a unique ID)
            if (!isIDUnique(teacherID)) {
                JOptionPane.showMessageDialog(teacherf, "ID already exists", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
    
            // Extract values from text fields
            String teacher_Name = teachernametxt.getText().trim();
            String address = addresstxt.getText().trim();
            String department = departmenttxt.getText().trim();
            int year_Of_Experience = Integer.parseInt(yearofexperiencetxt.getText().trim());
            int working_Hours = Integer.parseInt(workinghourstxt.getText().trim());
            String employment_Status = employmentstatustxt.getText().trim();
            String  working_Type = workingtypetxt.getText().trim();
    
            // Create Lecturer object and add to list
            Lecturer lecturer = new Lecturer(teacherID, teacher_Name, address,  working_Type, employment_Status, department, year_Of_Experience, working_Hours);
            teacherlist.add(lecturer);
    
            JOptionPane.showMessageDialog(teacherf, "Lecturer added successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(teacherf, "Years of Experience and Working Hours must be numbers", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(teacherf, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public String getLecturerID() {
        String lecturerID = teacheridtxt.getText().trim();
        if (lecturerID.isEmpty()) {
            throw new IllegalArgumentException("ID field is empty");
        }
        return lecturerID;
    }
    private boolean isIDUnique(int teacherId) {
        for (Teacher teacher : teacherlist) {
            if (teacher.getTeacherId() == teacherId) {
                return false; // ID already exists
            }
        }
        return true; // ID is unique
    }
    

    private void addtutor() {
    try {
        int tutorTeacherID;
        try {
            // Check if any of the required fields are empty
            if (tutteachernametxt.getText().trim().isEmpty() ||
                tutaddresstxt.getText().trim().isEmpty() ||
                tutemploymentstatustxt.getText().trim().isEmpty() || 
                tutworkinghourtxt.getText().trim().isEmpty() || 
                tutsalarytxt.getText().trim().isEmpty() || 
                tutperformanceindextxt.getText().trim().isEmpty()) {

                JOptionPane.showMessageDialog(teacherf, "Please fill up all the fields.");
                return;
            }

            tutorTeacherID = Integer.parseInt(tutteacheridtxt.getText().trim());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(teacherf, "ID must be a number", "Error", JOptionPane.ERROR_MESSAGE);
            return; 
        }
        
        // Check for unique ID
        if (!isIDUnique(tutorTeacherID)) {
            JOptionPane.showMessageDialog(teacherf, "ID already exists", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Extract values from text fields
        String teacher_Name = tutteachernametxt.getText().trim();
        String address = tutaddresstxt.getText().trim();
        String working_Type = tutworkingtypetxt.getText().trim();   
        String employment_Status = tutemploymentstatustxt.getText().trim();
        String specialization = tutspecializationtxt.getText().trim();
        String academic_Qualifications = tutacadimictxt.getText().trim();
        int working_Hours = Integer.parseInt(tutworkinghourtxt.getText().trim());
        double salary = Double.parseDouble(tutsalarytxt.getText().trim());
        int performance_Index = Integer.parseInt(tutperformanceindextxt.getText().trim());
        

        Tutor tutor = new Tutor(tutorTeacherID, teacher_Name, address, working_Type, employment_Status,working_Hours, salary, specialization, academic_Qualifications, performance_Index);
        teacherlist.add(tutor);

        JOptionPane.showMessageDialog(teacherf, "Tutor added successfully", "Success", JOptionPane.INFORMATION_MESSAGE);

    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(teacherf, "Working hours, salary, and performance index must be numbers", "Error", JOptionPane.ERROR_MESSAGE);
    } catch (IllegalArgumentException ex) {
        JOptionPane.showMessageDialog(teacherf, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}     public String getTutorID() {
        String TutorID = tutteacheridtxt.getText().trim();
        if (TutorID.isEmpty()) {
            throw new IllegalArgumentException("ID field is empty");
        }
        return TutorID;
    }
    
    
    private void addgrade() {
            String department = grddepartmenttxt.getText().trim();
            String grade_Scores = grdgradescrtxt.getText().trim();
            String yearsOfExperienceStr = grdyoetxt.getText().trim();
            String gradelecturerId =  grdteacheridtxt.getText().trim(); // New line to get lecturer ID input
        
              if (department.isEmpty() || grade_Scores.isEmpty() || 
                    yearsOfExperienceStr.isEmpty() || gradelecturerId.isEmpty()) {
                JOptionPane.showMessageDialog(teacherf, "Please fill in all the fields",
                        "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        
            try {
                int grade_Score = Integer.parseInt(grade_Scores);
                int yearsOfExperience = Integer.parseInt(yearsOfExperienceStr);
                int lecturerId = Integer.parseInt(gradelecturerId); // Parse lecturer ID to integer
        
                boolean lecturerFound = false; 
        
                for (Teacher teacher : teacherlist) {
                    if (teacher instanceof Lecturer) {
                        Lecturer lecturer = (Lecturer) teacher;
                        if (lecturer.getTeacherId() == lecturerId && lecturer.getDepartment().equals(department)) {
                            if (yearsOfExperience >= 5) {
                                lecturerFound = true;
                                lecturer.grade_Assignment( grade_Score,  department );
                                JOptionPane.showMessageDialog(teacherf, "Assignment graded successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                                break;
                            } else {
                                JOptionPane.showMessageDialog(teacherf, "Lecturer does not have enough experience to grade this assignment", "Error", JOptionPane.ERROR_MESSAGE);
                                return;
                            }
                        }
                    }
                }
                
        
                if (!lecturerFound) { // If lecturer with provided ID is not found
                    JOptionPane.showMessageDialog(teacherf, "Lecturer with ID " + lecturerId + " does not exist", "Error", JOptionPane.ERROR_MESSAGE);
                }
        
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(teacherf, "Invalid number format", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }

        }
        
         private void rmvtutor()
        {
            if(tutteacheridtxt.getText().trim().isEmpty()){
                JOptionPane.showMessageDialog(teacherf, "Please enter tutor ID", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
                try {
                    int teacherID = Integer.parseInt(tutteacheridtxt.getText().trim());
                    boolean found = false;
                    
                    
                    for (Iterator<Teacher> iterator = teacherlist.iterator(); iterator.hasNext();) {
                        Teacher teacher = iterator.next();
                        if (teacher instanceof Tutor && teacher.getTeacherId() == teacherID) {
                            Tutor tutor = (Tutor) teacher;
                            tutor.RemoveTutor(); // Assuming the method name is removeTutor() instead of RemoveTutor()
                            iterator.remove(); // Remove the tutor from the list
                            JOptionPane.showMessageDialog(teacherf, "Tutor removed successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                            found = true;
                            break;
                        }
                    }

                    
                    if (!found) {
                        JOptionPane.showMessageDialog(teacherf, "Tutor not found with the given ID", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(teacherf, "Invalid teacher ID", "Error", JOptionPane.ERROR_MESSAGE);
                }
            

        }
        
        private void salary(){
            String tutorid = tutteacheridtxt.getText().trim();
            String tutorsalary = tutsalarytxt.getText().trim();
            String tutorperformanceIndex = tutperformanceindextxt.getText().trim();
        
            if (tutorid.isEmpty() || tutorsalary.isEmpty() || tutorperformanceIndex.isEmpty()) {
                JOptionPane.showMessageDialog(teacherf, "Please fill in all the fields", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        
            try {
                double newSalary = Double.parseDouble(tutorsalary);
                int newPerformanceIndex = Integer.parseInt(tutorperformanceIndex);
        
                for (Teacher teacher : teacherlist) {
                    if (teacher instanceof Tutor) {
                        Tutor tutor = (Tutor) teacher; 
                        if (newPerformanceIndex < 5 || tutor.getWorking_Hours() <= 20) {
                            JOptionPane.showMessageDialog(teacherf, "Salary not updated due to invalid performance index and working hours", "Error", JOptionPane.ERROR_MESSAGE);
                            return;
                        }
                        tutor.setSalary(newSalary, newPerformanceIndex);
                        double updatedSalary = tutor.getSalary(); 
                        JOptionPane.showMessageDialog(teacherf, "Salary updated successfully to " + updatedSalary, "Success", JOptionPane.INFORMATION_MESSAGE);
                        setnewsalarytxt.setText(String.valueOf(updatedSalary));//stores the new updated salary
                    }
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(teacherf, "Invalid number format", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

    private void clear(){
        
        // lecturer
        teacheridtxt.setText("");
        teachernametxt.setText("");
        addresstxt.setText("");
        workingtypetxt.setText("");
        employmentstatustxt.setText("");
        workinghourstxt.setText("");
        departmenttxt.setText("");
        yearofexperiencetxt.setText("");
        
        //tutor
        tutteacheridtxt.setText("");
        tutaddresstxt.setText("");
        tutworkingtypetxt.setText("");    
        tutemploymentstatustxt.setText("");
        tutworkinghourtxt.setText("");
        tutperformanceindextxt.setText("");
        tutspecializationtxt.setText("");
        tutsalarytxt.setText("");
        tutacadimictxt.setText("");
    }

        
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        
    }
}



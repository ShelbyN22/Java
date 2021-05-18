import java.io.*;

public class GPAcalcstudent {
    private String name;
    private String year;
    private double mathgrade;
    private double englishgrade;
    private double historygrade;
    private double sciencegrade;
    private double foreignlanguagegrade;
    private double fineartgrade;


    //constructors
    public GPAcalcstudent(){
        name = "guest";

    }

    public GPAcalcstudent(String name, String year, double mathgrade, double englishgrade, double historygrade, double sciencegrade, double foreignlanguagegrade, double fineartgrade){
        this.name = name;
        this.year = year;
        this.mathgrade = mathgrade;
        this.englishgrade = englishgrade;
        this.historygrade = historygrade;
        this.foreignlanguagegrade = foreignlanguagegrade;
        this.fineartgrade = fineartgrade;
    }
    //assesor methods
    public String getName(){
        return name;
    }
    public String year(){
        return year;
    }
    public double getmathgrade(){
            return mathgrade;
        }
    
    public double getenglishgrade(){
            return englishgrade;
        }
    
    public double gethistorygrade(){
            return historygrade;
        }
    
    public double getsciencegrade(){
            return sciencegrade;
        }
    
    public double getforeignlanguagegrade(){
            return foreignlanguagegrade;
        }
    
    public double getfineartgrade(){
            return fineartgrade;
        }
    //mutator methods: If you want to change variable
    public void setmathgrade(double mathgrade){
        this.mathgrade = mathgrade;
    }
    //useful methods
    public double getAverage(){
        double average = (mathgrade + englishgrade+historygrade+sciencegrade+foreignlanguagegrade+fineartgrade)/6;
        System.out.println("Your GPA is: ");
        return average;
    }
    public void generateReport() throws FileNotFoundException{
        PrintStream output = new PrintStream("/Users/noahshelby/Desktop/Java Programs/gpa.txt"+ getName() +".txt");
        output.println("Your math grade is " + getmathgrade());
        output.println("Your english grade is" + getenglishgrade());
        output.println("Your history grade is " + gethistorygrade());
        output.println("Your science grade is" + getsciencegrade());
        output.println("Your foreign language grade is " + getforeignlanguagegrade());
        output.println("Your fine art grade is" + getfineartgrade());
        // files
        }

    public void strengthweak() throws FileNotFoundException {
        PrintStream output = new PrintStream("/Users/noahshelby/Desktop/Java Programs/Strengths.txt"+ getName() +".txt");
        output.println("If your math grade is greater than 3.33 than you are strong in this subject");
        output.println("If your english grade is greater than 3.33 than you are strong in this subject");
        output.println("If your history grade is greater than 3.33 than you are strong in this subject");
        output.println("If your science grade is greater than 3.33 than you are strong in this subject");
        output.println("If your foreign language grade is greater than 3.33 than you are strong in this subject");
        output.println("If your fine art grade is greater than 3.33 than you are strong in this subject");
        output.println("--------------------------------------------------------------------------------");
        output.println("--------------------------------------------------------------------------------");
        output.println("If your math grade is greater than 2.33 but less than 3.33 than you could use improvement in this subject");
        output.println("If your english grade is greater than 2.33 but less than 3.33 than you could use improvement in this subject");
        output.println("If your history grade is greater than 2.33 but less than 3.33 than you could use improvement in this subject");
        output.println("If your science grade is greater than 2.33 but less than 3.33 than you could use improvement in this subject");
        output.println("If your foreign language grade is greater than 2.33 but less than 3.33 than you could use improvement in this subject");
        output.println("If your fine art grade is greater than 2.33 but less than 3.33 than you could use improvement in this subject");
        output.println("--------------------------------------------------------------------------------");
        output.println("--------------------------------------------------------------------------------");
        output.println("If your math grade is less than 2.33 you are weak in this subject");
        output.println("If your english grade is less than 2.33 you are weak in this subject");
        output.println("If your history grade is less than 2.33 you are weak in this subject");
        output.println("If your science grade is less than 2.33 you are weak in this subject");
        output.println("If your foreign language grade is less than 2.33 you are weak in this subject");
        output.println("If your fine art grade is less than 2.33 you are weak in this subject");
    }
    }


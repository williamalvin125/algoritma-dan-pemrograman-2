package biodata;

public class StudentRecord {
    
    private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private double average;

    private static int StudentCount;
    
    public String getName(){
        return name;
    }
    
    public double getScienceGrade() {
        return scienceGrade;
    }
    
    public double getMathGrade() {
        return mathGrade;
    }
    
    public double getEnglishGrade() {
        return englishGrade;
    }
    
    public void setName (String temp){
        name = temp;
    }
    
    public double getAverage(){
        double result = 0;
        result = (mathGrade+englishGrade+scienceGrade)/3;
        return result;
    }

    public static int getStudentCount(){
        return StudentCount;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public void setMathGrade(int mathGrade){
        this.mathGrade = mathGrade;
    }
    
    public void setScienceGrade(int scienceGrade ){
        this.scienceGrade = scienceGrade;
    }
    
    public void setEnglishGrade(int englishGrade){
        this.englishGrade = englishGrade;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    
    public void print (String temp){
        System.out.println("Name : " +name);
        System.out.println("Address : "  +address);
        System.out.println("Age : " +age);
    }
    
    public void print (double eGrade, double mGrade, double sGrade){
        System.out.println("Name : " +name);
        System.out.println("Math Grade: " +mGrade);
        System.out.println("English Grade: " +eGrade);
        System.out.println("Science Grade: " +sGrade);
    }
}

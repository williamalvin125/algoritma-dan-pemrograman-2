package studentdataexample;

public class studentdata {
   private int stuID;
   private String stuName;
   private int stuAge;
   
   studentdata(){
       stuID = 100;
       stuName = "Chai";
       stuAge = 18;  
   }
   
  studentdata(int num1, String str, int num2){
       stuID = num1;
       stuName = str;
       stuAge = num2;  
   }
  
   public int getStuID() {
       return stuID; 
   }
   public void setStuID(int stuID) {
       this.stuID = stuID;  
   }
   public String getStuName() {
       return stuName; 
   }
   
   public void setStuName(String stuName) {
       this.stuName = stuName;  
   }
   public int getStuAge() {
       return stuAge;
   }
   public void setStuAge(int stuAge) {
       this.stuAge = stuAge;
   }
   
   public static void main(String args[])  {
       studentdata myobj = new studentdata();
       System.out.println("Student Name is: "+myobj.getStuName());
       System.out.println("Student Age is: "+myobj.getStuAge());
       System.out.println("Student ID is: "+myobj.getStuID());

       System.out.println();
       
       studentdata myobj2 = new studentdata(555, "Chaitanya", 25);
       System.out.println("Student Name is: "+myobj2.getStuName());
       System.out.println("Student Age is: "+myobj2.getStuAge());
       System.out.println("Student ID is: "+myobj2.getStuID()); 
  }


   
}

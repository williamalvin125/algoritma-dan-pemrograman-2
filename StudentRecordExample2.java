package tesbiodata;

import biodata.StudentRecord;

public class StudentRecordExample2 {
    public static void main(String []args){
    StudentRecord annaRecord = new StudentRecord();
    
    annaRecord.setName("Anna");
    annaRecord.setAddress("Philippines");
    annaRecord.setAge(15);
    annaRecord.setMathGrade(80);
    annaRecord.setScienceGrade(95);
    annaRecord.setEnglishGrade(100);
    
    annaRecord.print(annaRecord.getName());
    annaRecord.print(annaRecord.getEnglishGrade(),annaRecord.getMathGrade(),annaRecord.getScienceGrade());
    }
}

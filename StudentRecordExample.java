package tesbiodata;

import biodata.StudentRecord;

public class StudentRecordExample {
    public static void main(String[] args) {
        StudentRecord annaRecord = new StudentRecord();
        StudentRecord beahRecord = new StudentRecord();
        StudentRecord chrisRecord = new StudentRecord();

        annaRecord.setName("Anna");
        beahRecord.setName("Beah");
        chrisRecord.setName("Chris");

        System.out.println(annaRecord.getName());
        System.out.println("Count = "+StudentRecord.getStudentCount());

    }
}

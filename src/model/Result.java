package model;

public class Result extends Sports {
       private int totalMarks;
       private int averageMarks;
       
       public void TotalMarks() {
    	   super.Sport();
    	   this.totalMarks = this.objectivemarks + this.subjectivemarks + this.sport;
    	   System.out.println("Total Marks: "+totalMarks);
    	   
    	   this.averageMarks = this.totalMarks/3;
    	   System.out.print("Average Marks: "+averageMarks);
       }
}

package model;

public class Marks extends Student {
		protected int objectivemarks;
		protected int subjectivemarks;
		
		public void Objective() {
			super.Objective();
			System.out.println("Enter Objective Marks: ");
			this.objectivemarks = sc.nextInt();
	
			System.out.println("Enter Subjective Marks: ");
			this.subjectivemarks = sc.nextInt();
			
			return;
		}
	
}

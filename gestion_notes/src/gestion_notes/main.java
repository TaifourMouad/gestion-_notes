package gestion_notes;

import java.util.Collections;

public class main {

	public static void main(String[] args) {

		
		Etudiant e1,e2,e3;
		e1=new Etudiant(1,"hamid");
		e2=new Etudiant(2,"driss");
		e3=new Etudiant(1,"youssef");
		e1.setNote(15);
		e2.setNote(12);
		e3.setNote(16);
				
		ListEtudiant mesEtudiants = new ListEtudiant();
		mesEtudiants.add(e1);
		mesEtudiants.add(e2);
		mesEtudiants.add(e3);
		
		Collections.sort(mesEtudiants);
		
		System.out.println(mesEtudiants);
		
	}
			
}

package gestion_notes;

public class main {

	public static void main(String[] args) {

		
		Etudiant e1,e2,e3,e4;
		e1=new Etudiant(0,"mouad");
		e2=new Etudiant(1,"achraf");
		e3=new Etudiant(2,"adil");
		e4=new Etudiant(0,"Abdellah");
				
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		
		System.out.println(e1.equals(e3));
		System.out.println(e1.equals(e4));
	}
			
}
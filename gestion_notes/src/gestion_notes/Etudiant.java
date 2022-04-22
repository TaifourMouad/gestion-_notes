package gestion_notes;

public class Etudiant implements Comparable<Etudiant> {
	private int id;
	private String nom;
	private double note;
	
	public int getId() {
		return id;
	}
	
	public double getNote() {
		return note;
	}
	
	public void setNote(double note) {
		this.note = note;
	}

	Etudiant(int id, String nom){
		this.id=id;
		this.nom=nom;
		this.note=10.0;
	}
	
	@Override
	public String toString() {
		return this.nom+" : "+this.note;
	}

//redefinition de la methode equals
	@Override
	public boolean equals(Object obj) {
		if(! (obj instanceof Etudiant)) {
			return false;
		}
		return ((Etudiant)obj).id==this.id;
	}

//on implement l'interface compare etudiant et on crée la méthode compareTo
	@Override
	public int compareTo(Etudiant e) {
		if(this.note==e.note) return 0;
		else if(this.note>e.note) return 1;
		return -1;
	}
}

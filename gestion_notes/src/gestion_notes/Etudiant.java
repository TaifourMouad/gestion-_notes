package gestion_notes;

public class Etudiant {
	private int id;
	private String nom;
	private double note;

	Etudiant(int id, String nom){
		this.id=id;
		this.nom=nom;
		this.note=10.0;
	}
	
	@Override
	public String toString() {
		return this.nom+" : "+this.note;
	}

	@Override
	public boolean equals(Object obj) {
		if(! (obj instanceof Etudiant)) {
			return false;
		}
		return ((Etudiant)obj).id==this.id;
	}
}

package gestion_notes;

public class Etudiant implements Comparable<Etudiant> {
	private int id;
	private String nom;
	private double note;
	
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

	@Override
	public boolean equals(Object obj) {
		if(! (obj instanceof Etudiant)) {
			return false;
		}
		return ((Etudiant)obj).id==this.id;
	}

	@Override
	public int compareTo(Etudiant e) {
		if(this.note==e.note) return 0;
		if(this.note>e.note) return 1;
		return -1;
	}
}

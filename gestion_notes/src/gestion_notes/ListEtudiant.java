package gestion_notes;

import java.util.ArrayList;
import java.util.List;

public class ListEtudiant extends ArrayList<Etudiant> {
	
	@Override
	public boolean add(Etudiant e) {
		if(this.indexOf(e)>=0) {
			   int i=indexOf(e);
			   super.set(i, e);
			   return false;
	    }
		return super.add(e);
	}
	
	public List<Etudiant> filtrer(Condition c) {
		ListEtudiant L=new ListEtudiant();
		for(int i=0; i<this.size(); i++) {
			if(c.estVrai(this.get(i))) {
				L.add(get(i));
			}
		}
		return L;
	}
}

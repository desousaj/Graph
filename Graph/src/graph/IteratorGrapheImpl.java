package graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorGrapheImpl implements Iterator<Node> {
	
	IGraph graphe;
	Node positionCourante;
	List<Node> noeudsMarques;
	List<Node> file;

	
	public IteratorGrapheImpl(IGraph graphe, Node sommetDepart){
		this.graphe = graphe;
		file = new LinkedList<Node>(graphe.getAllNodes());
		noeudsMarques = new LinkedList<Node>();
		this.positionCourante = sommetDepart;

		//initialise les listes
		file.remove(positionCourante);
		noeudsMarques.add(positionCourante);
	}
	
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}
	
	public Node next() {
		if(!file.isEmpty()){
			positionCourante = file.get(0);
			positionCourante.toString();
			for(Node node : graphe.getAdjNodes(positionCourante)){
				if(noeudsMarques.contains(node)){
					file.add(node);
					noeudsMarques.add(node);
				}
			}
		}
	}
	
}

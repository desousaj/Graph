package graph;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Graph implements IDirectedGraph {
	
	Set<Node> nodes;
	Set<Arc> arcs;
	
	public Graph() {
		nodes = new HashSet<Node>();
		arcs = new HashSet<Arc>();
	}

	public Graph(Set<Node> nodes, Set<Arc> arcs) {
		super();
		this.nodes = nodes;
		this.arcs = arcs;
	}

	public void addNode(Node _node) {
		if(nodes !=null && !nodes.contains(_node)){
			nodes.add(_node);
		}
	}

	public Set<Node> getAllNodes() {
			return nodes;
	}

	public int getNbNodes() {
		if(nodes != null){
			return nodes.size();
		}else{
			return 0;
		}
	}

	public List<Node> getAdjNodes(Node _n) {
		List<Node> adjNodes = new LinkedList<Node>();
		for(Arc arc : arcs){
			if(arc.getSource().equals(_n)){
				adjNodes.add(arc.getDestination());
			}
		}
		return adjNodes;
	}

	public boolean hasArc(Node _n1, Node _n2) {
		for(Arc arc : arcs){
			if(arc.getSource().equals(_n1) && arc.getDestination().equals(_n2)){
				return true;
			}
		}
		return false;
	}

	public void addArc(Arc _edge) {
		if(arcs != null){
			arcs.add(_edge);
		}

	}

	public List<Arc> getArc(Node _n) {
		List<Arc> rarcs = new LinkedList<Arc>();
		for(Arc arc : arcs){
			if(arc.getSource().equals(_n)){
				rarcs.add(arc);
			}
		}
		return rarcs;
	}

}

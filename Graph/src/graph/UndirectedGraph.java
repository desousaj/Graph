package graph;

import java.util.List;
import java.util.Set;

public class UndirectedGraph extends Graph implements IUndirectedGraph {

	public void addEdge(Node _node1, Node _node2) {
		super.addArc(new Arc(_node1, _node2, null ));
		super.addArc(new Arc(_node2, _node1, null ));
	}

	public boolean hasEdge(Node _node1, Node _node2) {
		if(super.hasArc(_node1, _node2)){
			return true;
		}else{
			if(super.hasArc(_node2, _node1)){
				return true;
			}
		}
		return false;
	}

}

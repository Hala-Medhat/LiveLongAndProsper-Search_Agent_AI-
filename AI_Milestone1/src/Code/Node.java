package Code;

public class Node {
	Action state;
	Node parentNode;
	ActionEnum operator;
	int depth;
	int pathCost;
	public Node(Action state, Node parentNode, ActionEnum operator, int depth, int pathCost) {
		this.state = state;
		this.parentNode = parentNode;
		this.operator = operator;
		this.depth = depth;
		this.pathCost = pathCost;
	}

	

}

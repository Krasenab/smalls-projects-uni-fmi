package fmiGraph;

public class Link {
	
	private Node relatedNode;
	private int type;
	private int lenght;
	
	
	public Node getRelatedNode() {
		return relatedNode;
	}
	
	public int getType() {
		return type;
	}
	
	public int getLenght() {
		return lenght;
	}

	
	public Link(Node relatedNode) {
		super();
		this.relatedNode = relatedNode;
	}
	public Link(Node relatedNode,int lenght) {
		super();
		this.relatedNode = relatedNode;
		this.lenght = lenght;
	}
	

}

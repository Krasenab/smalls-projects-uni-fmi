package fmi.Algo;

import java.util.ArrayList;
import java.util.List;

import fmiGraph.Graph;
import fmiGraph.Link;
import fmiGraph.Node;

public class BreadthSearch implements SearchInterfaces {

	
	private Graph graph;
	
	public BreadthSearch(Graph gr) 
	{
		this.graph = gr;
	}
	
	@Override
	public boolean search(String startName, String goalName) {
		Node startNode = graph.getNode(goalName);
		Node goalNode = graph.getNode(goalName);
		List<Node> fakeQueue = new ArrayList<>();
		
		
		if(startNode==null || goalNode==null) 
		{
			System.out.println("There are no such nodes in the graph !");
			return false;
		}
		
		fakeQueue.add(startNode);
		
		Node tempNode;
		
		while(!fakeQueue.isEmpty()) 
		{
			tempNode = fakeQueue.get(0);
			System.out.println("Test node: " + tempNode.getName());
			if(tempNode.getName().equals(goalName)) 
			{
				return true;
			}
			
			tempNode.setVisited(true);
			fakeQueue.remove(0);
			addNodesToFakeQueue(fakeQueue,tempNode.getLinks());
			
		}// end while
		
				
		return false;
	}
	
	private void addNodesToFakeQueue(List<Node> fakeQueue,List<Link> list) 
	{
		for(Link l:list) 
		{
			if(l.getRelatedNode().isVisited()==false && fakeQueue.contains(l)) 
			{
				fakeQueue.add(l.getRelatedNode());
			}
			//fakeQueue.add(l.getRelatedNode());
		}
	}

}

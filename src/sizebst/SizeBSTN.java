package sizebst;

/**
 * Instances of class SizeBSTN are Nodes of the Size Binary Search Tree 
 * @author lou
 *
 */
public class SizeBSTN {
	SizeBSTN LSubtree;  // left subtree of this tree (may be null)
	SizeBSTN RSubtree;  // right subtree of this tree (may be null)
	int data; // data at this node of the tree
	int size; // number of tree entries that are less than or equal to data

/**
 * create a new leaf of the tree with the given data
 * @param data
 */
	public SizeBSTN(int data){
		LSubtree = null;
		RSubtree = null;
		this.data = data;
		size = 1;
	}
	
	/* see assignment for proper format for nodeString
	 */
	public static String nodeString(SizeBSTN node){
		String temp = "";
		if(node == null){
			return "null";
		}
		else{
			temp = " " + Integer.toString(node.data) + "," +Integer.toString(node.size) + " ";
		}
		return "[" + nodeString(node.LSubtree) + temp + nodeString(node.RSubtree) + "]";
//		return ""; // replace this line
	}
	
	/**
	 * search for the number target in the tree this node is the root of
	 * @param target number to search for
	 * @return either the node that holds target,
	 * if there is one, or the node which should point to the node that 
	 * will hold target if it is added now  
	 */
	public static SizeBSTN getNode(SizeBSTN node, int target){
		if(node == null){
			return node;
		}
		else if(target == node.data){
			return node;
		}
		else if(target > node.data){
			if(node.RSubtree == null){
				return node;
			}
			else{
				return getNode(node.RSubtree, target);
			}
		}
		else{
			if(node.LSubtree == null){
				return node;
			}
			else{
				return getNode(node.LSubtree, target);
			}
		}
//		else{
//		return node; // replace this line
//		}
	}
	
	/**
	 * like getNode but increments size fields as appropriate
	 * @param target number to search for
	 */
	public static void getNodeIncr(SizeBSTN node, int target){
		SizeBSTN temp = node;
		if(node == null){
			return;
		}
		while(temp != null){
			if(target == temp.data){
				break;
			}
			else if(target < temp.data){
				temp.size++;
				temp = temp.LSubtree;
				continue;
			}
			else{
				temp = temp.RSubtree;
			}
		}
		// fill in here
	}
	
	/**
	 * actually calculates number of numbers <= target.  
	 * Does search for target like getNode but adds up 
	 * the size fields of all nodes whose data is <= target.
	 * @return the number of nodes with data <= target in the
	 * tree this node is the root of.
	 */
	public static int sumNodesLeq(SizeBSTN node, int target){
		int count = 0;
		SizeBSTN temp = node;
		if(node == null){
			return -1;  // replace this line
		}
		else{
			while(temp != null){
				if(target < temp.data){
					if(temp.LSubtree == null){
						break;
					}
					else{
						temp = temp.LSubtree;
					}
				}
				else{
					count+=temp.size;
					temp=temp.RSubtree;
				}
			}
			return count;
		}
//		if(node == null){
//			return 0;
//		}
//		else if(target >= node.data){
//			return node.size + sumNodesLeq(node.LSubtree, target) + sumNodesLeq(node.RSubtree, target);
//		}
//		else{
//			return sumNodesLeq(node.LSubtree, target);
//		}
//		return 0;  // replace this line
	}	
}
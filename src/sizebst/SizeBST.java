package sizebst;


/**
 * Class SizeBST represents a Binary Search Tree that can also be used, for any integer j,
 *  to answer the question "how many numbers in the tree are less than or equal to j" in worst 
 *  case time h where h is the height of the tree (not the number of nodes).
 * 
 *  The actual nodes of the tree are of class SizeBSTN.  SizeBST represents the overall tree.
 *  IF instance variable rootNode is null, the tree is empty, otherwise rootNode is the root
 *  of the tree of SizeBSTN's
 * @author lou
 *
 */
public class SizeBST {
	SizeBSTN rootNode;

	public SizeBST(SizeBSTN root){
		rootNode =  root;
	}

	public String toString(){
		if (rootNode == null)
			return "(null)";
		else {
			return "("+ SizeBSTN.nodeString(rootNode) + ")";
		}
	}

	/**
	 * @param target the number to search for
	 * @return true iff target is in this tree
	 */
	public boolean search(int target){
		if(this.rootNode == null){
			return false;
		}
		else if(SizeBSTN.getNode(this.rootNode, target).data == target){
			return true;
		}
		return false; // replace this line
	}

	/**
	 * insert newData into tree;  if already there, do not change tree
	 * @param newData int to insert
	 */
	public void insert(int newData){
		SizeBSTN temp = this.rootNode;
		if(this.rootNode == null){
			this.rootNode = new SizeBSTN(newData);
		}
		else if(SizeBSTN.getNode(this.rootNode, newData).data == newData){
			return;
		}
		else{
			SizeBSTN.getNodeIncr(this.rootNode, newData);
			temp = this.rootNode;
//			if(this.rootNode == null){
//				this.rootNode = new SizeBSTN(newData);
//			}
//			else{
				while(temp != null){
					if(newData < temp.data){
//						temp.size++;
						if(temp.LSubtree == null){
							temp.LSubtree = new SizeBSTN(newData);
							return;
						}
						else{
							temp=temp.LSubtree;
							continue;
						}
					}
					else{
						if(temp.RSubtree == null){
							temp.RSubtree = new SizeBSTN(newData);
							return;
						}
						else{
							temp=temp.RSubtree;
							continue;
//						}
					}
				}
			}
		}
		// fill in here
	}

	/**
	 * @return returns how many numbers in the tree are less than or equal to target.  Returns -1 if tree is empty
	 * @param target
	 */
	public int numLEq(int target){
		return SizeBSTN.sumNodesLeq(this.rootNode, target);
	}

	public static void main(String args []){
		SizeBST tree1 = new SizeBST(null);
		System.out.println("empty: "+tree1);
		tree1.insert(40);
		System.out.println("40 "+tree1);
		// add any test code you want here - this is not graded.  Just be sure it compiles
	}
}

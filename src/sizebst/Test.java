package sizebst;

public class Test {
	public static void main(String[] args){
		//Create and insert()
		SizeBST temp = new SizeBST(null);
//		System.out.println(temp);
		temp.insert(40);
//		System.out.println(temp);
		temp.insert(60);
//		System.out.println(temp);
		temp.insert(50);
//		System.out.println(temp);
		temp.insert(55);
//		System.out.println(temp);
		temp.insert(53);
		temp.insert(20);
		temp.insert(30);
		temp.insert(10);
//		System.out.println(temp);
		
		//nodeString
//		System.out.println(SizeBSTN.nodeString(temp.rootNode));
		
		//getNode
//		System.out.println(SizeBSTN.getNode(temp.rootNode, 11));
//		System.out.println(SizeBSTN.getNode(temp.rootNode, 15));
		
		//getNodeIncr
//		System.out.println(temp.rootNode.LSubtree.RSubtree.size);
//		SizeBSTN.getNodeIncr(temp.rootNode, 25);
//		SizeBSTN.getNodeIncr(temp.rootNode, 15);
//		System.out.println(temp.rootNode.LSubtree.RSubtree.size);
		
		//sumNodesLeq
		SizeBST temp1 = new SizeBST(null);
		temp1.insert(40);
		temp1.insert(60);
		temp1.insert(50);
		temp1.insert(55);
		temp1.insert(53);
		temp1.insert(20);
		temp1.insert(30);
		temp1.insert(10);
//		System.out.println(temp1.rootNode.data);
//		System.out.println(temp1.rootNode.size);
		
//		System.out.println(SizeBSTN.sumNodesLeq(temp1.rootNode, 53));
		
		//numLEq
//		System.out.println(temp1.numLEq(53));
System.out.println(temp1);		
		//search()
//		System.out.println(temp.search(10));
	}
}

package datastructures;

class treenode{
	int data;
	treenode left;
	treenode right;
	treenode(int x){
		data=x;
		right=left=null;
	}
}
//==========================================\\

public class binarysearchtree {
	treenode root;
	
	public void insert(int x) 
				{
					root=inserthelper(root,x);
					
				}
	public treenode inserthelper(treenode root,int x)				//  ACTUAL INSERTION
				{
					
					if(root==null) {
						root=new treenode(x);
						return root;
					}
					if(x<root.data) {
						root.left=inserthelper(root.left,x);
					}
					else {
						root.right=inserthelper(root.right,x);
						
					}
					return root;
					
				}
	public void delete(int x) {
				root=deletehelper(root,x);
	}
	public treenode deletehelper(treenode root,int x) 			// Actual deletion 
	{		
			if(root==null) {
				return null;
			}
			if(x<root.data) {
				root.left=deletehelper(root.left,x);
				
			}
			else if(x>root.data) {
				root.right=deletehelper(root.right,x);
			}
			else {
				if(root.left==null && root.right==null) {
					return null;
				}
				else if(root.left==null) {
					return root.right;
				}
				else if(root.right==null) {
					return root.left;
				}
				else {
					int minValue=minValue(root.right);
					root.data=minValue;
					root.right=deletehelper(root.right,minValue);
				}
			}
			return root;
	}
	int minValue(treenode root)			//finding minimum  value in tree
	{
		int minv=root.data;
		while(root.left!=null)
		{
			minv=root.left.data;
			root=root.left;
			
		}
		return minv;
		
	}
	public treenode search(treenode root,int x)            //			SEARCHING ALGO 
									{
										if(root.data==x||root==null) {
											return root;
										}
										if(x>root.data) {
											return search(root.right,x);
											
										}
										
										else {
											return search(root.left,x);
										}
									}
	//===============================================================================
	
	void printlevelorder()					// Breadth First search order
	{
		int h=gettotalheight(root);
		int i;
		for(i=0;i<h;i++) {
			printgivenlevel(root,i);
		}
	}
	public int gettotalheight(treenode r) {
		if(r==null) {
			return 0;
		}
		else {
			return 1+Math.max(gettotalheight(r.left), gettotalheight(r.right));
		}
	}
	
	void printgivenlevel(treenode r,int level) {
			if(r==null) {
				return;
			}
			if(level==0) {
				System.out.print(r.data+" ");
			}
			else if(level>0) {
				printgivenlevel(r.left,level-1);
				printgivenlevel(r.right,level-1);
			}
		
				}
	//=========================================================================From here depth first starts and its three types
	
	void preorder() 									//PRE ORDER ,,,,,,,,,
		{
			preorderhelper(root);
		}
		void preorderhelper(treenode r) {
			if(r!=null) {
				System.out.println(r.data+" ");
				preorderhelper(r.left);
				preorderhelper(r.right);
			}
		}													//  INORDER,,,,,, 
	void inorder()
			{
				inorderhelper(root);
			}
			void inorderhelper(treenode r) {
				if(r!=null) {
					inorderhelper(r.left);
					System.out.println(r.data+" ");
					inorderhelper(r.right);
				}
			}
	void postorder() 										//POST ORDER,,,,,,
	{
		postorderhelper(root);
	}
	void postorderhelper(treenode r) {
		if(r!=null) {
			inorderhelper(r.left);
			inorderhelper(r.right);
			System.out.println(r.data+" ");
			
		}
	}
	
	public static void main(String args[])
	{
		binarysearchtree tree=new binarysearchtree();
		
		tree.insert(10);
		tree.insert(5);
		tree.insert(15);
//		tree.inorder();
//		tree.printlevelorder();
//		tree.search(tree.root,5);
//		tree.delete(5);
//		System.out.println("\n");
//		tree.printlevelorder();

	}
}


public class learningthreads {

	public static void main(String[] args) {
	
		Thread t=Thread.currentThread();// gives present thread
		System.out.println(t);
		
		t.setName("praveen");//sets present thread name
		System.out.println(t);
		System.out.println(t.getName());//gets present thread name
		t.setPriority(2);
		System.out.println(t.getPriority());
		System.out.println(t.getClass());

	}

}


class Output implements Runnable{	       //输出线程类
	private Storage1 st ;
	Output(Storage1 st){
		this.st = st;
	}
	public void run(){
		while(true){
			st.get();
		}
	}
}

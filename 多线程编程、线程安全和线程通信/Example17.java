public class Example17 {
	public static void main(String[] args) {
		Storage1 st = new Storage1(); // �������ݴ洢�����
		Input input = new Input(st);	// ����Input������Storage����
		Output output = new Output(st); 	// ����Output������Storage����
		new Thread(input).start();		// �������߳�
		new Thread(output).start();		// �������߳�
	}
}

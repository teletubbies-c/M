
class Storage1 {
	// ���ݴ洢����
	private int[] cells = new int[10];
	// inPos��ʾ����ʱ�����±꣬outPos��ʾȡ��ʱ�����±�
	private int inPos, outPos;
    // ����һ��put()�����������д�������
	public void put(int num) {
		cells[inPos] = num;
		System.out.println("��cells[" + inPos + "]�з�������---" + cells[inPos]);
		inPos++;// ����Ԫ����λ�ü�1
		if (inPos == cells.length)
			inPos = 0;      // ��inPosΪ���鳤��ʱ��������Ϊ0
	}
    // ����һ��get()������������ȡ������
	public void get() {
		int data = cells[outPos];
		System.out.println("��celss[" + outPos + "]��ȡ������" + data);
		outPos++;            // ȡ��Ԫ����λ�ü�1
		if (outPos == cells.length)
			outPos = 0;
	}
}

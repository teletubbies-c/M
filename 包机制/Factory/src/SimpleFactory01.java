import jisuanfactory.*;
public class SimpleFactory01 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		JiSuan01 jiSuan = JiSuanFactory01.createJiSuan("+");
        jiSuan.setNumOne(10);
        jiSuan.setNumTwo(20);
        double number = jiSuan.JiSuan01();
        System.out.println("计算结果为"+number);
	}

}

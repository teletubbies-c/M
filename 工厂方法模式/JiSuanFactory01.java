public class JiSuanFactory01
 {
    public static JiSuan01 createJiSuan(String yunSuanFu)
	{
        JiSuan01 open = null;
        switch (yunSuanFu)
		{
            case "+":
                open = new JiaFa01();
                break;
            case "-":
                open = new JianFa01();
                break;
        }
        return open;
    }
}
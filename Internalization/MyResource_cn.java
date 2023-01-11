import java.util.ListResourceBundle;

public class MyResource_cn extends ListResourceBundle{
	protected Object[][] getContents(){
		return new Object[][] {
			{"Student", "学生"},
			{"has", "拥有"},
			{"correct count", "正确答案"},
			{".", "。"},
			{"Locale is not provided", "未设置语言环境"}
		};
	}
}

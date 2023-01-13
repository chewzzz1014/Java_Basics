import java.util.ListResourceBundle;

public class MyResource_zh_SG extends ListResourceBundle{
	protected Object[][] getContents(){
		return new Object[][] {
			{"Student", "学生"},
			{"has", "拥有"},
			{"correct count", "正确答案"},
			{".", "。"},
			{"Locale is not provided", "未设置语言环境"},
			{"Invalid locale", "错误语言环境"}
		};
	}
}

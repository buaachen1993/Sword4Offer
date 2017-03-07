package Problem4;
/***
 * 第四题 替换空格
 * @author chandler
 * Stringbuffer 更加适合对字符串的插入 删除等操作 线程安全的
 */
public class ReplaceBlank {
	public String replaceBlank(String s){
		//牢记进行安全判断
		if(s == null)
			return null;
		StringBuffer sb = new StringBuffer();
		for(int i =0;i < s.length();i++)
		{
			if(s.charAt(i) == ' ')
			{
				sb.append("%20");
			}
			else
				sb.append(s.charAt(i));
		}

		return sb.toString();
	}
}

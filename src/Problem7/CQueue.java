package Problem7;

import java.util.Stack;

/***
 * 使用两个堆栈实现一个队列  能够实现appendtail 和deleteHead两个函数
 * @author chandler
 * 控制两个stack 1 和2 
 * appendtail 
 * 直接把数压入1中  
 * delete的时候 判定stack是否为空 如果是空 则弹出stack1到stack2中
 * 如果不为空 则弹出stack2栈顶元素
 */
public class CQueue {
	Stack stack1 = new Stack();
	Stack stack2 = new Stack();
	public void appendTail(int number){
		stack1.push(number);
	}
	public void deleteHead() throws Exception{
		if(!stack2.isEmpty())
			stack2.pop();
		else//将stack1内容弹出到stack2
		{
			while(!stack1.isEmpty())
			{
				stack2.push(stack1.pop());
			}
		}
		//如果此时stack2还是空 则意味着队列无法删除 边界条件
		if(stack2.isEmpty())
			throw new Exception("queue is null");
	}
}

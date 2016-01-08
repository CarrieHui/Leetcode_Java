package iCoding;


/**
 * 使用数组实现堆栈，包括入栈、出栈、获取栈长度、判断堆栈是否为空等
 * @author carrieli
 */
class Stack { //堆栈类
	char[] data;
	int maxSize;
	int top;
	
	public Stack(int maxSize){  //构造函数
		this.maxSize = maxSize;
		data = new char[maxSize];
		top = -1;
	}
	
	public int getSize(){
		return maxSize;
	}
	
	public int getElementCount(){
		return top+1;
	}
	
	public boolean isEmpty(){
		return top==-1;
	}
	
	public boolean isFull(){
		return top==maxSize-1;
	}
	
	/**
	 * 获取栈顶元素
	 * @return 栈顶元素
	 */
	public char peek(){
		return data[top];
	}
	
	
	/**
	 * 入栈
	 * @param ch 入栈元素
	 * @return 是否入栈成功
	 */
	public boolean push(char ch){
		if(top < maxSize-1){
			data[++top] = ch;
			return true;
		}
		else
			return false;
	}
	
	/**
	 * 出栈
	 * @return 栈顶元素
	 */
	public char pop(){
		try{
			return data[top--];
		}catch(Exception e){
			System.out.println("Stack is empty!");
			return ' ';
		}
	}
	
}

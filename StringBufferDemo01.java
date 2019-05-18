package day08;
/*
 * StringBuffer
 * 
 * 构造方法:
 * StringBuffer()				常用
 * StringBuffer(int capacity)	指定了初始化缓存区大写,不必深究
 * StringBuffer(String str)		常用,把一个字符串转换成StringBuffer类型
 * 
 * 成员方法:
 * 	添加功能:
 * 		append(String str)
 * 		insert(int offset,String str)	从该索引前面插入一个字符串
 * 
 * 	删除功能:
 * 		deleteCharAt(int index)
 * 		delete(int star,int end)
 * 
 * 	替换功能
 * 		replace(int statr,int end,String str)
 * 
 * 	反转功能
 * 		reverse()
 * 
 * 	截取功能
 * 		subString(int start)
 * 		subString(int start,int end)
 */
public class StringBufferDemo01 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
//添加功能
		System.out.println("sb:" + sb);
		sb.append("hello");
		System.out.println("sb:" + sb);//sb:hello
		sb.append("world");
		System.out.println("sb:" + sb);//sb:helloworld
		
		//insert(int offset,String str)	从该索引前面插入一个字符串
		sb.insert(5, " my ");//5是w
		System.out.println("sb:" + sb);//sb:hello my world
		
		//链式编程:
		StringBuffer sb1 = new StringBuffer();
		sb1.append("hello").append("world");
		System.out.println("sb1:" + sb1);//sb1:helloworld		
//删除功能
		StringBuffer sb2 = new StringBuffer();
		sb2.append("hellomyfriend");
		sb2.deleteCharAt(5);
		System.out.println("sb2:" + sb2);//sb2:helloyfriend
		
		sb2.delete(5, 12);
		System.out.println(sb2);//hello	
//替换功能
		StringBuffer sb3 = new StringBuffer();
		sb3.append("hellomyfriend");
		sb3.replace(7, 13, "dear");
		System.out.println(sb3);//hellomydear		
//反转功能
		//reverse()	反转字符串
		System.out.println(sb1.reverse());//dlrowolleh
//截取功能
		StringBuffer sb4 = new StringBuffer();
		sb4.append("hellomyfriend");
		//subString(int start)
		String sb5 = sb4.substring(7);
		System.out.println(sb5);//friend
		
		//subString(int start,int end)
		String sb6 = sb4.substring(5, 7);
		System.out.println(sb6);
		
		

		
		
		
		

	}

}

package Changhenge;
	 import java.util.*; 
	 import java.util.regex.*; 
	 public class Shici { 
	 String d = "������ɫ˼�����������󲻵������Ů���������������δʶ��������������һ��ѡ�ھ��������һЦ������������������ɫ������ԡ�������Ȫˮ��ϴ��֬�̶���������ʼ���³ж���ʱ���޻��ս�ҡܽ����ů�ȴ�����������ո���Ӵ˾������糯�л���������Ͼ���Ӵ���ҹרҹ�󹬼�����ǧ����ǧ�谮��һ�����ױ�ɽ���ҹ��¥�����ʹ���õ��ֽ���ʿ����������Ż��������¸�ĸ�Ĳ�����������Ů�깬�ߴ����������ַ�Ʈ�����Ż���������˿���վ�������������ܱ�Ķ����������������������س����̳���ǧ������������"; 
	 StringBuffer s = new StringBuffer(d); 
	 String j ; 
	 int g; 
	 int last = s.length(); 
	         public Shici(String j) 
	 { 
	   for(int i = last - 7; i > 0; i-=7)  
	 { 
	 if(i%14==0) 
	 { 
	 s.insert(i,'��'); 
	 s.insert(i+1,'\n'); 
	 } 
	 else s.insert(i,'��'); 
	 } 
	     StringTokenizer a = new StringTokenizer(d,j); 
	 int number = a.countTokens(); 
	 while(a.hasMoreTokens())  
	 { 
	 String k = a.nextToken(); 
	   } 
	 if(j.equals("��")) 
	 { 
	 number = number; 
	 } 
	 else if(j.equals("��"))  
	 { 
	 number = number; 
	 } 
	 else  
	 { 
	 number=number-1; 
	 } 
	 g = number; 
	 } 
	           public String toString()  
	 { 
	 return s + "��" + '\n' +"�����ֳ��ֹ���"+g+"�Ρ�"; 
	 } 
	   } 


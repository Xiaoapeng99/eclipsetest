package demo1;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Random;
import java.util.Set;
import java.util.StringTokenizer;

public class Onedemo {

	public static String a() {
		String name = "zs";
		return name;
	}


	public static void main(String[] args) {
		// // TODO Auto-generated method stub
		// String str=null;
		// System.out.println(Objects.equals(str, "a"));
		// int ����=11;
		// System.out.println(����);
		//
		// System.out.println((int)(Math.random()*900)+100);
		// Random ran=new Random();
		// System.out.println(ran.nextInt(3)+2);
//		String name1=a();
//		System.out.println(name1);
//		String phone="00-1111";
		//String a[]=phone.split("-");
		//System.out.println(a[0]+" "+a[1]);
//		StringTokenizer token=new StringTokenizer(phone, "-");
//		while(token.hasMoreElements()){
//			System.out.println(token.nextElement());
//		Collection<String> a=new ArrayList<>();
//		a.add("1");
//		a.add("1");a.add("1");a.add("1");a.add("1");a.add("1");
//		System.out.println(a);
//		//������
//		Iterator<String> iter=a.iterator();
//		while(iter.hasNext()){
//			String next = iter.next();
//			System.out.println(next);
//			
//		}
//		List<String> list=new ArrayList<String>();
//		list.add("1");
//		list.add("1");
//		list.add("1");
//		list.add(1, "a");
//		System.out.println(list);
//		HashMap map=new HashMap();
//		map.put("1", "zs");
//		map.put("2", "ls");
//		map.put("3", "ww");
//		System.out.println(map);
//		Object object = map.get("1");
//		System.out.println(object);
//		Object remove = map.remove("2");
//		System.out.println(map);
//		//�Ƿ����key
//		boolean containsKey = map.containsKey("1");
//		System.out.println(containsKey);
//		//�Ƿ����value
//		boolean containsValue = map.containsValue("ww");
//		System.out.println(containsValue);
//		//keyתΪ���飨KeyΨһ��
//		Set<String> set=map.keySet();
//		System.out.println(set);
//		//valueתΪ����
//		Collection<String> list=map.values();
//		System.out.println(list);
		//����map
		HashMap map=new HashMap<>();
		map.put("1", "zs");
		map.put("2", "ls");
		map.put("3", "ww");
		System.out.println(map);
		//key��value�ֿ�ȡ
		//ȡkey
		Set key=map.keySet();
		Iterator iterator = key.iterator();
		while(iterator.hasNext()){
			Object next = iterator.next();
			Object object = map.get(next);
			System.out.println("key "+next+" value "+object);
		}
		//������entry
		Set entrySet = map.entrySet();
		for(Object ent:entrySet){
			//ֱ��ȡ������key��value
			
//			System.out.println(ent);
			//objectǿתentry
			Map.Entry et=(Map.Entry)ent;
			Object key2 = et.getKey();
			Object value = et.getValue();
			System.out.println("key"+key2+" value "+value);
		}
		}

	}



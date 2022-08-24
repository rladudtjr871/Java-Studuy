package com.test.java.question.io_inout;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Q07 {

	public static void main(String[] args) {
		
		try {
			
			File file = new File("C:\\class\\q자료\\fileinout_Q\\출결.dat");
						
			if(file.exists()) {
				
				BufferedReader reader = new BufferedReader(new FileReader(file));
				HashMap<String, Integer> mlate = new HashMap<String, Integer>();
				HashMap<String, Integer> mearly = new HashMap<String, Integer>();
				HashSet<String> setName = new HashSet<String>();
				
				
				String line = null;
				
				while ((line = reader.readLine()) != null) {
					
					String date = line.split(",")[0]; //날짜
					String name = line.split(",")[1]; //이름
					String goWork = line.split(",")[2]; //출근시간
					String goHome = line.split(",")[3]; //퇴근시간
					
					setName.add(name);
					
					int goHour = Integer.parseInt(goWork.split(":")[0]);
					int goMinute = Integer.parseInt(goWork.split(":")[1]);
					
					int leaveHour = Integer.parseInt(goHome.split(":")[0]);
					int leaveMinute = Integer.parseInt(goHome.split(":")[1]);
					
					//지각
					if((goHour==9 && goMinute>0) || (goHour>9 && goMinute>-1)) {
						//이 사람이 지각일 경우
						if(mlate.containsKey(name)) {
							//해당 사람이 이미 있을 경우
							mlate.put(name, mlate.get(name)+1);
							
						} else {
							mlate.put(name, 1);
							
						}
					
					//지각 아님
					} else {
						//mlate에 없으면 value = 0
						if(!mlate.containsKey(name)) {
							mlate.put(name, 0);
						
						//mlate에 있으면 value = 원래값
						} else {
							mlate.put(name, mlate.get(name));
						}
						
					}
					
					
					
					if(leaveHour<18 && leaveMinute>-1) {
						//이 사람이 조퇴일 경우
						if(mearly.containsKey(name)) {
							//해당 사람이 이미 있을 경우
							mearly.put(name, mearly.get(name)+1);
							
						} else {
							mearly.put(name, 1);
						}	
						
					} else {
						//mearly에 없으면 value = 0
						if(!mearly.containsKey(name)) {
					
							mearly.put(name, 0);
							
						//mearly에 있으면 value = 원래값
						} else {
							mearly.put(name, mearly.get(name));
						}
					}
					
					
				}
				
				Iterator<String> iter = setName.iterator(); 
				
				System.out.println("[이름]    [지각]    [조퇴]");
				//for(int i=0; i<setName.size(); i++) {
					//System.out.println(setName.size());
					//System.out.println(iter.next());
					//if(iter.hasNext()) {
					System.out.println(iter.hasNext());
					while(iter.hasNext()) {
						String s = iter.next();
						System.out.printf("%s    %2d회    %d회\n"
										,s
										,mlate.get(s)
										,mearly.get(s));
					}
					//} else {
						//break;
					//}
				}
				
				
			//}
				
			
			
		} catch (Exception e) {

			
			System.out.println("Q07.main");
			e.printStackTrace();
		}

	}//main

}

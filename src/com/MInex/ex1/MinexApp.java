package com.MInex.ex1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class MinexApp {

	public static void main(String[] args) throws IOException {

				// 입력 값 넣기 스캐너
				Scanner sc = new Scanner(System.in);
				
				// 컴퓨터 내부 자료 가져오기
				Reader fr = new FileReader("E:\\javaStudy\\강의자료\\java-programming\\미니프로젝트\\PhoneDB.txt");
				BufferedReader br = new BufferedReader(fr);
				
				int i=0;
				
				//1. 메모장에 있는거 배열에다가 넣기
				List<Min> pList = new ArrayList<Min>();
				while(true) {
					
					String str = br.readLine();
					if(str==null) {
					break;
					
					}
					
					String[] sArray = str.split(",");
					Min p = new Min(sArray[0], sArray[1], sArray[2]);
					pList.add(p);
				}
				br.close();
				System.out.println("********************************");
				System.out.println("       전화번호 관리 프로그램       ");
				System.out.println("********************************");
				while(i==0) {
					System.out.println("");
					System.out.println("1.리스트 2.등록 3.삭제 4.검색 5.종료");
					System.out.println("--------------------------------");
					System.out.print("메뉴번호:");
					int put = sc.nextInt();
					
					switch (put) {
					case 1 :
						System.out.println("1.리스트");
						for(int r=0; r<pList.size(); r++) {
							int s = r+1;
							System.out.println(s+".\t"+pList.get(r).getName()+"\t"+pList.get(r).getHp()+"\t"+pList.get(r).getCompany());
						}
						break;
					case 2 :
						System.out.println("2.등록");
						sc.nextLine();//개행문자 제거
						System.out.print("이름:");
						String name = sc.nextLine();
						System.out.print("휴대전화:");
						String hp = sc.nextLine();
						System.out.print("회사전화:");
						String company = sc.nextLine();
						
												
						Min p1 = new Min(name, hp, company);
						pList.add(p1);
						
						//배열 목록 출력
						for(int r=0; r<pList.size(); r++) {
							int s = r+1;
							System.out.println(s+".\t"+pList.get(r).getName()+"\t"+pList.get(r).getHp()+"\t"+pList.get(r).getCompany());
							
						}
						
						
						
						Writer fw = new FileWriter("E:\\javaStudy\\강의자료\\java-programming\\미니프로젝트\\PhoneDB.txt");
						BufferedWriter bfw = new BufferedWriter(fw);

						
						
						//메모장으로 출력
						
						for(Min ps:pList) {
							String a = ps.getName()+","+ps.getHp()+","+ps.getCompany();
							bfw.write(a);
							bfw.newLine();
							bfw.flush();
						}
						
						break;
						
					case 3 :
						System.out.println("3.삭제");
						System.out.print("번호:");
						int	numput = sc.nextInt();
						pList.remove(--numput);
						
						fw = new FileWriter("E:\\javaStudy\\강의자료\\java-programming\\미니프로젝트\\PhoneDB.txt");
						bfw = new BufferedWriter(fw);
						
						for(int r=0; r<pList.size(); r++) {
							int s = r+1;
							String str = pList.get(r).getName() + "," + pList.get(r).getHp() + "," + pList.get(r).getCompany();
							System.out.println(s+".\t"+pList.get(r).getName()+"\t"+pList.get(r).getHp()+"\t"+pList.get(r).getCompany());
							bfw.write(str);
							bfw.newLine();
							bfw.flush();
						}
						
						System.out.println("삭제되었습니다.");
						break;
					case 4 :
						System.out.println("4.검색");
						sc.nextLine();
						System.out.print("이름:");
						break;
					case 5 :
						System.out.println("********************************");
						System.out.println("*           감사합니다           *");
						System.out.println("********************************");
						i++;
						break;
					default :
						System.out.println("다시 입력해 주세요.");
						break;
					}
				}
				sc.close();
			}
		}
	


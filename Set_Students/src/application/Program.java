package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> courseA = new HashSet<>();
		Set<Integer> courseB = new HashSet<>();
		Set<Integer> courseC = new HashSet<>();
		
		System.out.print("How many students for course A? ");
		int numberA = sc.nextInt();
		
		for (int i = 0; i < numberA; i++) {
			int codStudent = sc.nextInt();
			courseA.add(codStudent);
		}
		
		System.out.print("How many students for course B? ");
		int numberB = sc.nextInt();
		
		for (int i = 0; i < numberB; i++) {
			int codStudent = sc.nextInt();
			courseA.add(codStudent);
		}
		
		System.out.print("How many students for course C? ");
		int numberC = sc.nextInt();
		
		for (int i = 0; i < numberC; i++) {
			int codStudent = sc.nextInt();
			courseA.add(codStudent);
		}
		
		Set<Integer> total = new HashSet<>();
		total.addAll(courseA);
		total.addAll(courseB);
		total.addAll(courseC);
		
		System.out.println("Total students: " + total.size());
		
		sc.close();
	}
}

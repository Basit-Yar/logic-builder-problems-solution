package com.learning.hackathon.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Solution_01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int numberOfStudents = scan.nextInt();

        Student[] students = new Student[numberOfStudents];

        for(int i=0; i<numberOfStudents; i++) {

            System.out.println("Enter students details : ");
            int studentId = scan.nextInt();
            scan.nextLine(); // to consume the next line.
            String studentName = scan.nextLine();
            int studentTotalMarks = scan.nextInt();

//            System.out.println("Student Id : " + studentId + ", name: " + studentName + ", and marks: " + studentTotalMarks + ".");

            if (studentTotalMarks > 400 || studentTotalMarks < 0) {
                throw new RuntimeException("Please provide a valid value.");
            }

            students[i] = new Student(studentId, studentName, studentTotalMarks);
        }

        String str = findStudentWithhighestTotal(students);
        List<Integer> studentIds = searchStudentsBypercentage(students);
//        System.out.println("********************");
        System.out.println(str);
        if (studentIds != null)
            studentIds.forEach(id -> System.out.println(id));
        else
            System.out.println("No Student found with mentioned attribute.");
    }

    public static String findStudentWithhighestTotal(Student[] students) {
        int highestTotal = 0;
        String highestmarksObtainStudentName = "";

        for (int i=0; i< students.length; i++) {

            if (highestTotal < students[i].getTotalMarksobt()) {
                highestmarksObtainStudentName = students[i].getName();
                highestTotal = students[i].getTotalMarksobt();
            }
        }
        return highestmarksObtainStudentName.toUpperCase();
    }

    public static List<Integer> searchStudentsBypercentage(Student[] students) {
        int totalSubjects = 4;
        List<Integer> studentsIds = Arrays.stream(students)
                .filter(student -> student.getTotalMarksobt() * 1/ (double) totalSubjects > 70)
                .map(student -> student.getId())
                .sorted()
                .collect(Collectors.toList());

        return studentsIds;
    }
}

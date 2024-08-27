package extend_lesson.buoi8.lab1.service;

import extend_lesson.buoi8.lab1.entities.Family;
import extend_lesson.buoi8.lab1.entities.Member;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberService {
    // Nhập thông tin cho 1 member
    public Member inputMember(Scanner sc){
        System.out.println("Mời b nhập tên: ");
        String name = sc.nextLine();
        return new Member(name);
    }

    public ArrayList<Member> inputMembers(Scanner sc, int n){
        ArrayList<Member> members = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Mời b nhập tên: ");
            String name = sc.nextLine();
            Member member = new Member(name);
            members.add(member);
        }
        return members;
    }

}

package extend_lesson.buoi8.lab1;

import extend_lesson.buoi8.lab1.entities.Member;
import extend_lesson.buoi8.lab1.service.MemberService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Mời b nhập số thành viên: ");
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        MemberService memberService = new MemberService();
        /*ArrayList<Member> members = new ArrayList<>();

        for (int i=0; i< n;i++){
            Member member = memberService.inputMember(sc);
            members.add(member);
        }
        System.out.println(members);*/

        ArrayList<Member> members = memberService.inputMembers(sc, n);
        System.out.println(members);
    }
}

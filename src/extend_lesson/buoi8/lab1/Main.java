package extend_lesson.buoi8.lab1;

import extend_lesson.buoi8.lab1.entities.Family;
import extend_lesson.buoi8.lab1.entities.Member;
import extend_lesson.buoi8.lab1.service.FamilyService;
import extend_lesson.buoi8.lab1.service.MemberService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FamilyService familyService = new FamilyService();
        Scanner scanner = new Scanner(System.in);
        Family family = familyService.inputFamily(scanner);
        System.out.println(family);

    }
}

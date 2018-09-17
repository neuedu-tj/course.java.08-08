package cases.bank.service;

import java.util.Scanner;

public class IndexService {

    public void main() {
        System.out.println("欢迎进入  bank 系统  .,.....");
        System.out.println("1. 存钱");
        System.out.println("2. 存钱");
        System.out.println("3. 存钱");

        Scanner sc = new Scanner(System.in);

        String choice = sc.next();

        System.out.println("你输入了   , " + choice);

    }



}

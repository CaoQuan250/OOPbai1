package OOP;

import java.util.Scanner;
public class Bai1 {
    public void NhiPhan(int num){
        int binary[] = new int[40];
        int index = 0;
        while(num > 0){
            binary[index++] = num%2;
            num = num/2;
        }
        for(int i = index-1;i >= 0;i--){
            System.out.print(binary[i]);
        }
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số mà bạn muốn chuyển: ");
        int number = sc.nextInt();
        System.out.print("Hệ nhị phân của " + number +" là :");
        new Bai1().NhiPhan(number);
    }
}
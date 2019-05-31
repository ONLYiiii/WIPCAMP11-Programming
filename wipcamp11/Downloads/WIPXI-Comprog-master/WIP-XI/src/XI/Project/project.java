/*
 * Copyright (C) 2019 wipcamp11.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301  USA
 */
package XI.Project;

import java.util.Scanner;

/**
 *
 * @author wipcamp11
 */
public class project {

    public static void main(String[] args) {
        int item = 0;
        int limit = 10;

        System.out.println("โกดังสินค้า");
        System.out.println("เลือกเมนู1234");
        System.out.println("เมนูที่1คือadd");
        System.out.println("เมนูที่2คือremove");
        System.out.println("เมนูที่3คือcheck");

        Scanner input = new Scanner(System.in);
        int menu = input.nextInt();
        int amount;
        if (menu == 1) {
            System.out.println("");
            if (item < limit) {
                System.out.println("เพิ่มเท่าไหร่");
                amount = input.nextInt();

                if (item + amount > limit) {
                    System.out.println("ไอเทมเกินลิมิต");
                } else {
                    item = item + amount;
                    System.out.println("item : " + item);
                    System.out.println("limit: " + limit);
                }

            } else {
                System.out.println("ไอเท็มเต็มเเล้ว");

            }
        }else if(menu == 2){
            System.out.println("");
            if(item > 0) {
                System.out.println("เอาออกเท่าไหร่");
                amount = input.nextInt();
                
                if (item + amount < limit) {
                    System.out.println("ไอเทมมีไม่พอให้ลบ");
                } else {
                    item = item - amount;
                    System.out.println("item : " + item);
                    System.out.println("limit: " + limit);
        }}
            else if(menu == 3){   
            System.out.println("item : " + item);
                    System.out.println("limit: " + limit);
                }    
                else{
                System.out.println(เมนูไม่ถูกต้อง);
            }
        }
    }
}

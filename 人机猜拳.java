package com.Scanner;

import java.util.Scanner;

public class 人机猜拳 {
    public static void main(String[] args){
        while(true){
            System.out.println("---------------------------");

            System.out.println("-------欢迎进入猜拳游戏-------");

            System.out.println("轮到你出拳！(1:剪刀,2:石头,3:布)");

            Scanner sc= new Scanner(System.in); //定义scanner，等待输入

            int person=sc.nextInt();//获取用户的输入

//电脑随机出拳(序号)

            int computer=(int)(Math.random()*3)+1;//三以内随机数+1；

//定义变量记录出拳

            String per="用户"; //初始化

            String com="计算机";

//用户出拳

            switch (person){
                case 1:

                    per="剪刀";

                    break;

                case 2:

                    per="石头";

                    break;

                case 3:

                    per="布";

                    break;

            }

//计算机出拳

            switch (computer){
                case 1:

                    com="剪刀";

                    break;

                case 2:

                    com="石头";

                    break;

                case 3:

                    com="布";

                    break;

            }

//逻辑判断

            if(person==1&&computer==2||person==2&&computer==3||person==3&&computer==1){ //逆序

                System.out.println("你出的是("+per+")计算机出的是("+com+")");

                System.out.println(" 再来！ ");

            }

            else if(person==1&&computer==1||person==2&&computer==2||person==3&&computer==3) {
                System.out.println(" 平局 ");

                System.out.println(" 再来！ ");

            }

            else{
                System.out.println("你出的是("+per+")计算机出的是("+com+")");

                System.out.println(" 你赢了！即将退出游戏 ");

                try {
                    Thread.sleep(2000);

                } catch (InterruptedException e) {
                    e.printStackTrace();

                }

                break;

            }

        }

    }

}

}

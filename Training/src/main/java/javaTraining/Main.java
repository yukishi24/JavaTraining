package javaTraining;

import java.util.Scanner;
import constant.Constant;
import module.Human;

/**
 * メインクラス
 * 
 * @author yukishi
 *
 */
public class Main {

  /**
   * メインメソッド
   * 
   * @param args
   */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    contall con = new contall();
    System.out.println(Constant.partition);
    System.out.println(Constant.messeageWrite);

    System.out.println(Constant.partition);
    // 名前を聞く
    con.question(Constant.name);
    String name = sc.next();

    // 年齢を聞く
    con.question(Constant.age);
    int age = sc.nextInt();

    // 体重を聞く
    con.question(Constant.weight);
    double weight = sc.nextDouble();

    // 身長
    con.question(Constant.height);
    double height = sc.nextDouble();

    // インスタンス化
    Human human = new Human(name, age, weight, height);

    // 取得情報をすべて出力
    human.printAll();
  }

}

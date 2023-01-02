package module;

import constant.Constant;

/**
 * 取得した情報を出力または、計算するクラス
 * 
 * @author yukishi
 *
 */
public class Human {
  /**
   * 名前
   */
  private String name;

  /**
   * 年齢
   */
  private int age;
  /**
   * 体重
   */
  private double weight;
  /**
   * 身長
   */
  private double height;

  /**
   * コンストラクター
   * 
   * @param name
   * @param age
   * @param weight
   * @param height
   */
  public Human(String name, int age, double weight, double height) {
    this.name = name;
    this.age = age;
    this.weight = weight;
    this.height = height;
  }

  /**
   * 取得した情報を一括表示
   */
  public void printAll() {
    System.out.println(Constant.name + this.name);
    System.out.println(Constant.age + this.age + "歳");
    System.out.println(Constant.weight + this.weight + "kg");
    System.out.println(Constant.height + this.height + "m");
    System.out.println(check(this.age) + "です");

    // BMIの数値を算出する
    double bmi = BMI.bmi(this.weight, this.height);
    System.out.println("BMI：" + bmi);
    System.out.println(BMI.isHealth(bmi,height));

  }


  /**
   * 成人か未成年かをチェックする
   * 
   * @param age
   * @return
   */
  public String check(int age) {
    if (age >= 20) {
      return (Constant.adalt);
    } else {
      return (Constant.notAdalt);
    }
  }


}

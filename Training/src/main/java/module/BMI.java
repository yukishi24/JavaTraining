package module;

import constant.Constant;

/**
 * BMIの計算用のクラス
 * 
 * @author yukishi
 *
 */
public class BMI {
  /**
   * BMIの数値を返す
   * 
   * @param weight
   * @param height
   * @return
   */
  public static double bmi(double weight, double height) {
    // 体重と身長からBMIを計算する
    double calculationBmi = calculationBmi(weight, height);

    // 計算した数値を小数点第一位までに整形する
    double shapingBmi = shapingBmi(calculationBmi);
    return shapingBmi;

  }

  /**
   * BMI計算
   * 
   * @param weight
   * @param height
   * @return
   */
  public static double calculationBmi(double weight, double height) {
    return weight / height / height;
  }

  /**
   * BMIの数値を正しくする※小数点第二位で四捨五入する
   * 
   * @param bmi
   * @return
   */
  public static double shapingBmi(double bmi) {
    double tmp = Math.round(bmi * 10) / 10;
    return tmp;
  }

  /**
   * bmiの数値から返すメッセージを切り替える
   * 
   * @param bmi
   * @param height
   * @return
   */
  public static String isHealth(double bmi, double height) {
    if (bmi >= Constant.underBmi && Constant.topBmi >= bmi) {
      return Constant.TureIsHealth;
    } else {
      return healthMessage(height);
    }
  }

  /**
   * 標準体重を算出してメッセージを作成するメソッド
   * 
   * @param height
   * @return
   */
  public static String healthMessage(double height) {
    double standardWeight = shapingBmi(height * height * 22.0);
    String standardWeightStr = String.valueOf(standardWeight);
    String message = Constant.FalseIsHealth + Constant.standardWeightMessage + standardWeightStr + "kgです";
    return message;
  }

}

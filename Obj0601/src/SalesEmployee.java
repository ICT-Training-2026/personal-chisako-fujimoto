
public class SalesEmployee {
	/******** フィールド ******************************************/
	/**
	 * 
	 *
	 * 名前
	 */
	static final String COMPANY_NAME="○○商事";
	static int instanceCnt=0;
	
	String name;

	/**
	 * 売上合計金額
	 */
	int salesAmt;
	
	

	SalesEmployee(String name, int salesAmt) {
		this.name = name;
		this.salesAmt = salesAmt;
		instanceCnt++;
		System.out.println("コンストラクタ内");
		System.out.println("インスタンス数："+instanceCnt);
	}

	/******** メソッド ******************************************/
	/**
	 * 売上げる
	 * @param amt	売上金額
	 * @return		処理後の売上合計金額
	 */
	static void displayCompany() {
		System.out.println("■会社名："+COMPANY_NAME);
	}
	int sell(int amt) {
		return salesAmt += amt;
	}

	/**
	 * 返品を受け付ける
	 * @param amt	返品金額（売上マイナス）
	 * @return		処理後の売上合計金額
	 */
	int refund(int amt) {
		return salesAmt -= amt;
	}
	
	/**
	 * 情報表示
	 */
	void displayInfo() {
		System.out.println("名前：" + name);
		System.out.println("売上：" + salesAmt + "円");
	}
}


public class Driver {
	public static void main (String[] args) {
	System.out.println();
	SalesEmployee.displayCompany();
	
	// インスタンス数の表示
	System.out.println();
	System.out.println("インスタンス数：" + SalesEmployee.instanceCnt);

	// インスタンス化・情報表示
	SalesEmployee hayami = new SalesEmployee("速水剛留", 1000000);
	System.out.println();
	hayami.displayInfo();

	// インスタンス化・情報表示
	SalesEmployee kawai = new SalesEmployee("河合彩香", 500000);
	System.out.println();
	kawai.displayInfo();

	// インスタンス数の表示
	System.out.println();
	System.out.println("インスタンス数：" + SalesEmployee.instanceCnt);
}
}

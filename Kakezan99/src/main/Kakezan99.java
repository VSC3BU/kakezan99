package main;

/**
 * 掛け算九九プログラム
 * 
 * @author genhirano
 *
 */
public class Kakezan99 {

	/**
	 * メインメソッド
	 * 
	 * @param args なし
	 */
	public static void main(String[] args) {
		
		for(int i = 1; i<=9; i++){
			for(int j = 1; j<=9; j++){
				System.out.print(i*j + " ");
			}
			System.out.println();
		}
		
	}

}

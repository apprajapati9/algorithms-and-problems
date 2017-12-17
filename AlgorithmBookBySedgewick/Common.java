/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlgorithmBookBySedgewick;

/**
 *
 * @author apprajapati
 */
public class Common {
    
	public static Common mCommonInstance; 
	
	public static Common getInstance() {
		if( mCommonInstance == null) {
			return new Common();
		}else
			return mCommonInstance;
	}
}

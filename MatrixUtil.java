package java_20170105;

//다 +1 해보자
public class MatrixUtil {
	
	static void getMatrixElementCount(int rowSize, int m_array[][]){
		for (int i = 0; i < m_array.length; i++) {
			for (int j = 0; j < m_array.length; j++) {
				m_array[i][j]++;
			}
		}
//		matrix print
		for (int i = 0; i < m_array.length; i++) {
			for (int j = 0; j < m_array.length; j++) {
				System.out.print((++m_array[i][j])+" ");
			}
			System.out.println();
		}
		
	} 
	

}

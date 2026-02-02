import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Exam1_fuku {
    public static void main(String[] args) {
		
		// 接続情報
		String url = "jdbc:postgresql://localhost:5432/Student";
		String user = "postgres";
		String password = "0710";

		Connection con = null; // 使用する変数の宣言
		PreparedStatement pstmt = null;
		String sql = null;
 
		try {
			// (1)データベースに接続
			con = DriverManager.getConnection(url, user, password);

			// (2)SQL文を作成
		sql = "INSERT INTO test_members(id,name,age,dep_id) VALUE(?,?,?,?)";
		

			// (3)SQL実行準備
			pstmt = con.prepareStatement(sql);

			// (4)SQL実行
			// ※ここにSQL実行処理を書く
		   int id = pstmt.executeUpdate();
             
			// (5)結果の操作
			// ※ここに結果の操作処理を書く
        
       
               System.out.println(id);
                
       
		} catch (SQLException ex) {
			System.err.println("SQL = " + sql);
			System.out.println("SQLが実行されません");
			ex.printStackTrace();
		} finally {
			try {
				// (6) メモリの解放(切断)
				  if( con != null){
				con.close();
                }
                if( pstmt  != null){
				pstmt.close();
                }
          
			} catch (Exception ex) {
                System.out.println(ex);
            }
		}
	}
}

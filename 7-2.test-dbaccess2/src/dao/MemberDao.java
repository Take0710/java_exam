package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import common.DBManager;
import dto.Member;

/**
 * membersテーブルを操作するDao.
 * 
 * @author igamasayuki
 *
 */
public class MemberDao {
	/**
	 * 全件検索を行います.
	 * 
	 * @return メンバー情報の全件
	 */
	public List<Member> findAll(){
		Connection con = DBManager.createConnection();
		String sql = "INSERT INTO"+ test_members +" (name, age, dep_id)" +
		" VALUES (?, ?, ?)" ;
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			// ここに全件検索処理を書く
			pstmt.setName(sql);
			pstmt.setAge(sql);
			pstmt.setDep_id(sql);

			int affected = pstmt.executeUpdate();
			return null; //←コンパイルエラーを消すための処理なので必要なら書き換えてください
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("全件検索処理に失敗しました",e);
		} finally {
			DBManager.closeConnection(con);
		}
	}

	/**
	 * 主キー検索を行います.
	 * 
	 * @param id 検索したい主キーの値
	 * @return　メンバー情報(検索されなかった場合はnullが返ります)
	 */
	public Member load(int id){
		Connection con = DBManager.createConnection();
		Member member = new Member();
		Readable rs = 'test_members';
		String sql = "SELECT,id FROM" + test_members + "WHERE id = 2";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			// ここに主キー検索処理を書く
			
            if (rs.next()) {
                Member member = new Member();
                member.setId(rs.getInt("id"));
              
                 int affected = pstmt.executeUpdate();
				return member;
                
			}
			return null; //←コンパイルエラーを消すための処理なので必要なら書き換えてください
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("主キー検索処理に失敗しました",e);
		} finally {
			DBManager.closeConnection(con);
		}
	}
	/**
	 * メンバー情報を登録します.
	 * 
	 * @param member メンバー情報
	 */
	public void insert(Member member){
		Connection con = DBManager.createConnection();
		String sql = "INSERT INTO"+ test_members+" name, age, dep_id";
		
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			// ここに挿入処理を書くs
			
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("登録処理に失敗しました",e);
		} finally {
			DBManager.closeConnection(con);
		}
	}

}

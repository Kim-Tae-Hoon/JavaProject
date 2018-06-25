import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

public class ServerDAO {
	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost/test?serverTimezone=UTC";
	private static final String USER = "root";
	private static final String PASS = "1234";

	public Connection getConn() {
		Connection con = null;
		try {
			Class.forName(DRIVER);
			con = DriverManager.getConnection(URL, USER, PASS);
		} catch (Exception e) {
			e.printStackTrace();
		} // try - catch
		return con;
	} // getConn : 연결 메소드 작성

	public int insertScore(ServerDTO dto) {
		Connection con = null;
		PreparedStatement ps = null;
		int result = 0;
		try {
			con = getConn();
			String sql = "insert into score values(?,?,?,?,?,?)";
			ps = con.prepareStatement(sql);
			ps.setString(1, dto.getNick());
			ps.setString(2, dto.getChat());
			result = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e2) {
					e2.printStackTrace();
				} // ps try - catch
			} // ps if
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e2) {
					e2.printStackTrace();
				} // con try - catch
			} // con if
		} // try - catch - finally
		return result;
	}
}
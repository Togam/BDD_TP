package persistance;

import java.sql.Connection;
import java.sql.DriverManager;

public class Oracle {

	private static Connection c;
	private static String username;
	private static String password;

	public static Connection getConnection() {
		if (c == null)
			Oracle.c = new Oracle().c;
		return Oracle.c;
	};

	public Oracle() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
			c = DriverManager.getConnection(
					"jdbc:oracle:thin:@oracle.fil.univ-lille1.fr:1521:filora",
					username, password);
			c.setAutoCommit(false);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void setPassword(final String password) {
		Oracle.password = password;
	}

	public static void setUsername(final String username) {
		Oracle.username = username;
	}

	// QUESTION 1 DU TP 2
	// /**
	// * @param args
	// * @throws Exception
	// * On rempli les photos de quelques candidats
	// */
	// public static void main(String[] args) throws Exception {
	//
	// Connection connect = getConnection("SIX", "g6xgg1ya");
	//
	// // Insertion photos
	// connect.setAutoCommit(false);
	// String sql_photos = "INSERT INTO CANDIDATS_PHOTOS VALUES (?,?)";
	// PreparedStatement ps_photos = connect.prepareStatement(sql_photos);
	//
	// ps_photos.setInt(1, 709);
	// File photo1 = new File(
	// "/home/m1miage/six/Documents/photos_ident/01.jpg");
	// FileInputStream fis1 = new FileInputStream(photo1);
	// ps_photos.setBinaryStream(2, fis1, (int) photo1.length());
	// ps_photos.execute();
	// connect.commit();
	// fis1.close();
	//
	// ps_photos.setInt(1, 710);
	// File photo2 = new File(
	// "/home/m1miage/six/Documents/photos_ident/02.jpg");
	// FileInputStream fis2 = new FileInputStream(photo2);
	// ps_photos.setBinaryStream(2, fis2, (int) photo2.length());
	// ps_photos.execute();
	// connect.commit();
	// fis1.close();
	//
	// ps_photos.setInt(1, 711);
	// File photo3 = new File(
	// "/home/m1miage/six/Documents/photos_ident/03.jpg");
	// FileInputStream fis3 = new FileInputStream(photo3);
	// ps_photos.setBinaryStream(2, fis3, (int) photo3.length());
	// ps_photos.execute();
	// connect.commit();
	// fis1.close();
	//
	// ps_photos.setInt(1, 712);
	// File photo4 = new File(
	// "/home/m1miage/six/Documents/photos_ident/04.png");
	// FileInputStream fis4 = new FileInputStream(photo4);
	// ps_photos.setBinaryStream(2, fis4, (int) photo4.length());
	// ps_photos.execute();
	// connect.commit();
	// fis1.close();
	//
	// ps_photos.setInt(1, 713);
	// File photo5 = new File(
	// "/home/m1miage/six/Documents/photos_ident/05.jpg");
	// FileInputStream fis5 = new FileInputStream(photo5);
	// ps_photos.setBinaryStream(2, fis5, (int) photo5.length());
	// ps_photos.execute();
	// connect.commit();
	// fis1.close();
	//
	// connect.close();
	// }
}
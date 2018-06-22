package fr.epita.iamcoremy;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.inject.Inject;
import javax.sql.DataSource;

import fr.epita.iamcoremy.Identity;

public class IdentityJDBCDAO {

	@Inject
	private DataSource ds;

	private static final String IDENTITY_UID = "IDENTITY_UID";
	private static final String QUERY_ALL_IDENTITIES = "select * from IDENTITIES where IDENTITY_DISPLAYNAME = ? and IDENTITY_EMAIL = ?";
	private static final String QUERY_UPDATE_IDENTITY =
			"update IDENTITIES set IDENTITY_EMAIL=?,IDENTITY_DISPLAYNAME=? where IDENTITY_UID=?";
	private static final String QUERY_DELETE_IDENTITY =
			"delete from IDENTITIES where IDENTITY_UID=?";
	private static final String COLUMN_IDENTITY_DISPLAYNAME = "IDENTITY_DISPLAYNAME";



	public void save(Identity identity) {
		try {
			final Connection connection = ds.getConnection();
			final PreparedStatement pstmt =
					connection.prepareStatement("insert into IDENTITIES (IDENTITY_DISPLAYNAME, IDENTITY_EMAIL) values( ?, ?)");

			pstmt.setString(1, identity.getDisplayName());
			pstmt.setString(2, identity.getEmail());
			pstmt.execute();
			pstmt.close();
			connection.close();

		} catch (final SQLException sqle) {

			sqle.printStackTrace();
		}

	}
}
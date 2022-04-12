package br.edu.utfpr.dv.sireata.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DaoUtils {
    
    
    public void validateFinally(ResultSet rs, PreparedStatement stmt, Connection conn) throws SQLException {
        if((rs != null) && !rs.isClosed())
            rs.close();
        if((stmt != null) && !stmt.isClosed())
            stmt.close();
        if((conn != null) && !conn.isClosed())
            conn.close();
        }
        
     public void validateFinally(ResultSet rs, Statement stmt, Connection conn) throws SQLException {
        if((rs != null) && !rs.isClosed())
            rs.close();
        if((stmt != null) && !stmt.isClosed())
            stmt.close();
        if((conn != null) && !conn.isClosed())
            conn.close();
        }
    
}

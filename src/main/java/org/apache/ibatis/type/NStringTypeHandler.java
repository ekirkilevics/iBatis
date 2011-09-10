package org.apache.ibatis.type;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class NStringTypeHandler extends BaseTypeHandler<String> {

  public void setNonNullParameter(PreparedStatement ps, int i, String parameter, JdbcType jdbcType)
      throws SQLException {
//    ps.setNString(i, ((String) parameter));
    ps.setString(i, parameter);
  }

  public String getNullableResult(ResultSet rs, String columnName)
      throws SQLException {
//    return rs.getNString(columnName);
    return rs.getString(columnName);
  }

  public String getNullableResult(CallableStatement cs, int columnIndex)
      throws SQLException {
//    return cs.getNString(columnIndex);
    return cs.getString(columnIndex);
  }

}
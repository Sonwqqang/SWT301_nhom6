package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Supplier;

public class DAO extends DBContext {

    public List<Supplier> getBySearch(String searchBy, String key) {
        List<Supplier> list = new ArrayList<>();

        try {

            String sql = "SELECT [SupplierID]\n"
                    + "      ,[SupplierName]\n"
                    + "      ,[BirthDate]\n"
                    + "      ,[Gender]\n"
                    + "      ,[Address]\n"
                    + "  FROM [dbo].[Suppliers] WHERE 1=1";

            switch (searchBy) {
                case "name":
                    sql += " AND SupplierName like '%" + key + "%'";
                    break;
                case "year":
                    sql += " AND YEAR(BirthDate) IN (" + key;
                    break;
                default:
                    throw new AssertionError();
            }
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                Supplier sp = new Supplier(rs.getString(1), rs.getString(2), rs.getDate(3), rs.getBoolean(4), rs.getString(5));
                list.add(sp);
            }

        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }

    public List<Supplier> getAll() {
        List<Supplier> list = new ArrayList<>();

        try {

            String sql = "SELECT [SupplierID]\n"
                    + "      ,[SupplierName]\n"
                    + "      ,[BirthDate]\n"
                    + "      ,[Gender]\n"
                    + "      ,[Address]\n"
                    + "  FROM [dbo].[Suppliers] WHERE 1=1";

            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                Supplier sp = new Supplier(rs.getString(1), rs.getString(2), rs.getDate(3), rs.getBoolean(4), rs.getString(5));
                list.add(sp);
            }

        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }

    public List<Supplier> delete(String code) {
        List<Supplier> list = new ArrayList<>();

        try {

            String sql = "DELETE FROM [dbo].[Suppliers] WHERE SupplierID = ?";

            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, code);
            
            st.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }
}

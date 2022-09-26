package DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Util.JDBCUtil;
import entity.Student;

public class StudentDAOImp implements IDao {

	@Override
	public List<Student> data() {
		List<Student> dataList = new ArrayList<Student>();
		Connection conn = JDBCUtil.getConnection();
		try {
			PreparedStatement pStatement = conn.prepareStatement("select * from Student");
			ResultSet rSet = pStatement.executeQuery();
			while (rSet.next()) {
				Student student = new Student();
				student.setStuId(rSet.getInt("StuId"));
				student.setFullName(rSet.getString("FullName"));
				student.setGender(rSet.getBoolean("Gender"));
				student.setBirthday(rSet.getDate("Birthday"));
				student.setAddress(rSet.getString("Address"));
				student.setClassName(rSet.getString("ClassName"));
				student.setScholarShip(rSet.getDouble("ScholarShip"));
				dataList.add(student);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

		return dataList;
	}

	@Override
	public boolean insertStudent(Student student) {
		// TODO Auto-generated method stub
		boolean bl = false;
		Connection conn = JDBCUtil.getConnection();
		try {
			PreparedStatement sPreparedStatement = conn.prepareStatement(
					"Insert into Student (FullName,Gender,Birthday,Address,ClassName,ScholarShip) values (?,?,?,?,?,?)");
			sPreparedStatement.setString(1, student.getFullName());
			sPreparedStatement.setBoolean(2, student.isGender());
			sPreparedStatement.setDate(3, new Date(student.getBirthday().getTime()));
			sPreparedStatement.setString(4, student.getAddress());
			sPreparedStatement.setString(5, student.getClassName());
			sPreparedStatement.setDouble(6, student.getScholarShip());
			int ketQua = sPreparedStatement.executeUpdate();
			if (ketQua > 0) {
				return bl = true;
			}
			return bl = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return bl;
	}

	@Override
	public boolean deleteStudent(int id) {
		// TODO Auto-generated method stub
		boolean bl = false;
		Connection conn = JDBCUtil.getConnection();
		try {
			PreparedStatement sPreparedStatement = conn.prepareStatement("delete from Student where StuId = ?");
			sPreparedStatement.setInt(1, id);
			int ketQua = sPreparedStatement.executeUpdate();
			if (ketQua > 0) {
				return bl = true;
			}
			return bl = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return bl;
	}

	@Override
	public Student getById(int id) {
		Student student = new Student();
		Connection conn = JDBCUtil.getConnection();
		try {
			PreparedStatement pStatement = conn.prepareStatement("select * from Student where StuId=?");
			pStatement.setInt(1,id);
			ResultSet rSet = pStatement.executeQuery();
			while (rSet.next()) {
				student.setStuId(rSet.getInt("StuId"));
				student.setFullName(rSet.getString("FullName"));
				student.setGender(rSet.getBoolean("Gender"));
				student.setBirthday(rSet.getDate("Birthday"));
				student.setAddress(rSet.getString("Address"));
				student.setClassName(rSet.getString("ClassName"));
				student.setScholarShip(rSet.getDouble("ScholarShip"));	
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return student;
	}

	@Override
	public boolean updateStudent(Student student) {
		// TODO Auto-generated method stub
		boolean bl=false;
		Connection connection = JDBCUtil.getConnection();
		try {
			PreparedStatement pStatement = connection.prepareStatement("Update Student set FullName=?,Gender=?,Birthday=?,Address=?,ClassName=?,ScholarShip=? where StuId=?");
			pStatement.setString(1, student.getFullName());
			pStatement.setBoolean(2, student.isGender());
			pStatement.setDate(3, new Date(student.getBirthday().getTime()));
			pStatement.setString(4, student.getAddress());
			pStatement.setString(5, student.getClassName());
			pStatement.setDouble(6, student.getScholarShip());
			pStatement.setInt(7, student.getStuId());
			int ketQua = pStatement.executeUpdate();
			if (ketQua > 0) {
				return bl = true;
			}
			return bl = true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return bl;
	}

}

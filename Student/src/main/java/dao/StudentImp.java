package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.Student;
import util.JDBCUtil;

public class StudentImp implements DaoImp<Student, String>{

	@Override
	public List<Student> getAll() {
		List<Student> data = new ArrayList<Student>();
		Connection con =  JDBCUtil.getConnection();
		try {
			PreparedStatement ps = con.prepareStatement("select * from Student ");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Student s = new Student();
				s.setId(rs.getString("id"));
				s.setName(rs.getString("name"));
				s.setStatus(rs.getInt("status"));
				s.setBit(rs.getBoolean("sex"));
				s.setBirthday(rs.getDate("birthday"));
				data.add(s);	
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return data;
	}

	@Override
	public Student getById(Integer id) {
		// TODO Auto-generated method stub
		Connection con =  JDBCUtil.getConnection();
		Student s = new Student();
		try {
			PreparedStatement ps = con.prepareStatement("select * from Student where id=? ");
			ps.setInt(1, id);
			ResultSet rsResultSet = ps.executeQuery();
			while (rsResultSet.next()) {
				s.setId(rsResultSet.getString("id"));
				s.setName(rsResultSet.getString("name"));
				s.setStatus(rsResultSet.getInt("status"));
				s.setBit(rsResultSet.getBoolean("sex"));
				s.setBirthday(rsResultSet.getDate("birthday"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return s ;
	}

	@Override
	public boolean add(Student student) {
		// TODO Auto-generated method stub
		Connection con =  JDBCUtil.getConnection();
		try {
			PreparedStatement ps = con.prepareStatement("insert into Student (id,name,status,sex,birthday) values(?,?,?,?,?) ");
			ps.setString(1, student.getId());
			ps.setString(2, student.getName());
			ps.setInt(3, student.getStatus());
			ps.setBoolean(4, student.isBit());
			ps.setDate(5, new Date(student.getBirthday().getTime()));
			int ketQua = ps.executeUpdate();
			if(ketQua>0) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean edit(Student student) {
		Connection con =  JDBCUtil.getConnection();
		try {
			PreparedStatement ps = con.prepareStatement("update Student set name = ? , status=? , sex=? , brithday=?  where id =?");
			ps.setString(1, student.getName());
			ps.setInt(2, student.getStatus());
			ps.setBoolean(3, student.isBit());
			ps.setDate(4, new Date(student.getBirthday().getTime()));
			ps.setString(5, student.getId());
			int ketQua = ps.executeUpdate();
			if(ketQua>0) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean remote(String id) {
		// TODO Auto-generated method stub
		Connection con = JDBCUtil.getConnection();
		try {
			PreparedStatement ps = con.prepareStatement("delete from Student where id =?");
			ps.setString(1, id);
			int ketQua = ps.executeUpdate();
			if(ketQua>0) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}

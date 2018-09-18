package com.jzh.news.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jzh.news.entity.News_content;
import com.jzh.news.entity.News_pinglun;
import com.jzh.news.entity.User;

public class UserDaoImpl extends BaseDaoImpl {
	List<User> list = new ArrayList<User>();
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	Connection conn = null;

	/**
	 * ��ѯ����ע���û�
	 * 
	 * @return
	 */
	public List<User> Search() {
		conn = this.getYantaodbConnection();
		try {

			pstmt = conn.prepareStatement("select * from tb_user");
			rs = pstmt.executeQuery();
			while (rs.next()) {
				User content = new User();
				content.setId(rs.getInt("UserID"));
				content.setUser(rs.getString("Account"));
				content.setPassword(rs.getString("password"));
				//content.setQq(rs.getString("qq"));
				content.setIcon(rs.getString("HeadImagePath"));
				content.setNickname(rs.getString("name"));
				//content.setCity(rs.getString("city"));
				content.setSex(rs.getString("sex"));
				//content.setYears(rs.getString("years"));
				content.setQianming(rs.getString("qianming"));
				list.add(content);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			this.closeAll(rs, pstmt, conn);

		}
		return list;

	}

	/**
	 * �����û�����ѯע���û�
	 * 
	 * @return
	 */
	public User Search_xmpp_message(String user) {
		conn = this.getYantaodbConnection();
		User content = null;
		try {

			pstmt = conn.prepareStatement("select * from tb_user where user='"
					+ user + "'");
			rs = pstmt.executeQuery();
			while (rs.next()) {
				content = new User();
				content.setId(rs.getInt("UserID"));
				content.setUser(rs.getString("Account"));
				//content.setQq(rs.getString("qq"));
				content.setIcon(rs.getString("HeadImagePath"));
				content.setNickname(rs.getString("name"));
				//content.setCity(rs.getString("city"));
				content.setSex(rs.getString("sex"));
				//content.setYears(rs.getString("years"));
				content.setQianming(rs.getString("qianming"));

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			this.closeAll(rs, pstmt, conn);

		}
		return content;

	}

	/**
	 * �����û�����ѯ�û�
	 * 
	 * @return
	 */
	public User Search_one(String user) {
		conn = this.getYantaodbConnection();
		User content = null;
		try {

			pstmt = conn.prepareStatement("select * from tb_user where user='"
					+ user + "'");
			rs = pstmt.executeQuery();
			while (rs.next()) {
				content = new User();
				content.setIcon(rs.getString("HeadImagePath"));
				content.setNickname(rs.getString("name"));
				content.setSex(rs.getString("sex"));

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			this.closeAll(rs, pstmt, conn);

		}
		return content;

	}

	/**
	 * �����˺��ж��Ƿ��Ѿ�ע��ͻ�ȡ�û�����
	 * 
	 * @return
	 */
	public List<User> Search(String user) {
		conn = this.getYantaodbConnection();
		User content = null;
		try {

			pstmt = conn.prepareStatement("select * from tb_user where user='"
					+ user + "'");
			rs = pstmt.executeQuery();
			while (rs.next()) {
				content = new User();
				content.setId(rs.getInt("UserID"));
				content.setUser(rs.getString("Account"));
				content.setPassword(rs.getString("password"));
				content.setQq(rs.getString("qq"));
				content.setIcon(rs.getString("HeadImagePath"));
				content.setNickname(rs.getString("name"));
				content.setCity(rs.getString("city"));
				content.setSex(rs.getString("sex"));
				content.setYears(rs.getString("years"));
				content.setLocation(rs.getString("location"));
				content.setQianming(rs.getString("qianming"));
				list.add(content);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			this.closeAll(rs, pstmt, conn);

		}
		return list;

	}

	/**
	 * �����û����������ж��Ƿ��¼�ɹ�
	 * 
	 * @return
	 */
	public List<User> Search(String user, String password) {
		conn = this.getYantaodbConnection();
		User content = null;
		try {

			pstmt = conn.prepareStatement("select * from tb_user where Account='"
					+ user + "'and password='" + password + "'");
			rs = pstmt.executeQuery();
			while (rs.next()) {
				content = new User();
				content.setId(rs.getInt("UserID"));
				content.setUser(rs.getString("Account"));
				content.setPassword(rs.getString("password"));
				content.setQq(rs.getString("qq"));
				content.setIcon(rs.getString("HeadImagePath"));
				content.setNickname(rs.getString("name"));
				content.setCity(rs.getString("city"));
				content.setLocation(rs.getString("location"));
				content.setSex(rs.getString("sex"));
				content.setYears(rs.getString("years"));
				content.setQianming(rs.getString("qianming"));
				list.add(content);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			this.closeAll(rs, pstmt, conn);

		}
		return list;

	}

	/**
	 * �������û�
	 * 
	 * @param news
	 */
	public boolean Save(User user) {
		conn = this.getYantaodbConnection();
		try {
			pstmt = conn
					.prepareStatement("insert into tb_user(Account,password,qq,HeadImagePath,name,city,sex,years,location,qianming)values(?,?,?,?,?,?,?,?,?,?)");
			pstmt.setString(1, user.getUser());
			pstmt.setString(2, user.getPassword());
			pstmt.setString(3, user.getQq());
			pstmt.setString(4, user.getIcon());
			pstmt.setString(5, user.getNickname());
			pstmt.setString(6, user.getCity());
			pstmt.setString(7, user.getSex());
			pstmt.setString(8, user.getYears());
			pstmt.setString(9, user.getLocation());
			pstmt.setString(10, user.getQianming());
			pstmt.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		} finally {
			this.closeAll(null, pstmt, conn);
		}
	}

	/**
	 * �޸��û�����
	 * 
	 * @param news
	 */
	public boolean update_message(User user) {
		conn = this.getYantaodbConnection();
		try {
			pstmt = conn
					.prepareStatement("update tb_user set qq=?,nickname=?,city=?,sex=?,years=?,qianming=? where Account='"
							+ user.getUser() + "'");

			pstmt.setString(1, user.getQq());
			pstmt.setString(2, user.getNickname());
			pstmt.setString(3, user.getCity());
			pstmt.setString(4, user.getSex());
			pstmt.setString(5, user.getYears());
			pstmt.setString(6, user.getQianming());
			pstmt.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		} finally {
			this.closeAll(null, pstmt, conn);
		}
	}

	/**
	 * �޸��û�����
	 * 
	 * @param news
	 */
	public boolean update_qianming(String user) {
		conn = this.getYantaodbConnection();
		try {
			pstmt = conn
					.prepareStatement("update tb_user set location=? where Account='"
							+ user + "'");

			pstmt.setString(1, "δ֪����");

			pstmt.executeUpdate();
			System.out.println(user + "δ֪�����޸ĳɹ�");
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		} finally {
			this.closeAll(null, pstmt, conn);
		}
	}

	/**
	 * �޸�xmpp�û�����
	 * 
	 * @param news
	 */
	public boolean update_xmpp_message(String user, String name) {
		conn = this.getOpenfireConnection();
		try {
			pstmt = conn
					.prepareStatement("update ofuser set NAME=? where username='"
							+ user + "'");

			pstmt.setString(1, name);

			pstmt.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		} finally {
			this.closeAll(null, pstmt, conn);
		}
	}

	/**
	 * �޸�����
	 * 
	 * @param news
	 */
	public boolean update_message(String user, String password) {
		conn = this.getYantaodbConnection();
		try {
			pstmt = conn
					.prepareStatement("update tb_user set password=? where Account='"
							+ user + "'");

			pstmt.setString(1, password);

			pstmt.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		} finally {
			this.closeAll(null, pstmt, conn);
		}
	}

	/**
	 * �޸�ͷ��
	 * 
	 * @param news
	 */
	public boolean update_icon(String user, String HeadImagePath) {
		conn = this.getYantaodbConnection();
		try {
			pstmt = conn
					.prepareStatement("update tb_user set HeadImagePath=? where Account='"
							+ user + "'");

			pstmt.setString(1, HeadImagePath);

			pstmt.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		} finally {
			this.closeAll(null, pstmt, conn);
		}
	}

}

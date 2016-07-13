package com.hzmc.nbgsyn.business.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.hzmc.nbgsyn.business.IUserManager;
import com.hzmc.nbgsyn.exception.UserInfoException;
import com.hzmc.nbgsyn.persistence.UserInfoBean;
import com.hzmc.nbgsyn.resource.UserProperties;
import com.hzmc.nbgsyn.util.ConnectionManager;

/**
 * 用户注册服务
 * 
 * @author zhul
 *
 */
@Service
public class UserManagerImpl implements IUserManager {

	private Logger log = Logger.getLogger(UserManagerImpl.class);

	@Override
	public Boolean validateUser(String userName, String userPassword) {
		Boolean res = false;
		// 验证用户 未完成 在缓存中验证 这个是接口认证用户 和其他不同
		// 模拟通过
		String pUserName = UserProperties.getInstacne().getProperty("username").trim();
		String pPwd = UserProperties.getInstacne().getProperty("pwd").trim();

		if (StringUtils.equals(pUserName, userName) && StringUtils.equals(userPassword, pPwd)) {
			res = true;
		}
		return res;
	}

	/**
	 * 查找用户信息
	 * 
	 * @param userInfoBean
	 * @return
	 */
	public List<UserInfoBean> findAllUserInfo() {
		List<UserInfoBean> ulist = new ArrayList<UserInfoBean>();
		Connection conn = ConnectionManager.getInstance().getConnection();
		PreparedStatement pstmt = null;
		ResultSet rslt = null;
		String sql = "select MD_CODE,SYS_CODE,ENTITY_CODE,SERVICE_NAME,USERNAME,PASSWORD from MAP_SERVICE_REGISTER";
		try {
			pstmt = conn.prepareStatement(sql);
			rslt = pstmt.executeQuery();
			while (rslt.next()) {
				UserInfoBean userInfoBean = new UserInfoBean();
				userInfoBean.setMD_CODE(rslt.getString(1));
				userInfoBean.setSYS_CODE(rslt.getString(2));
				userInfoBean.setENTITY_CODE(rslt.getString(3));
				userInfoBean.setSERVICE_NAME(rslt.getString(4));
				userInfoBean.setUsername(rslt.getString(5));
				userInfoBean.setPassword(rslt.getString(6));
				ulist.add(userInfoBean);
			}
		} catch (Exception e) {
			log.error(e.getMessage());
		} finally {
			close(rslt, pstmt, conn);
		}

		return ulist;
	}

	@Override
	public void saveRegisterUserInfo(UserInfoBean userInfoBean) throws UserInfoException {
		Connection conn = ConnectionManager.getInstance().getConnection();
		String md_code = userInfoBean.getMD_CODE();
		String sys_code = userInfoBean.getSYS_CODE();
		String entity_code = userInfoBean.getENTITY_CODE();

		// 是否已注册
		// if ("A".equals(md_code) && "B".equals(sys_code) &&
		// "C".equals(entity_code)) {
		// throw new UserInfoException("md_code:" + md_code + ",sys_code:" +
		// sys_code + ",entity_code" + entity_code
		// + "已注册！");
		// }
		// 添加用户
		PreparedStatement pstmt = null;
		ResultSet rslt = null;
		String sql = "insert into MAP_SERVICE_REGISTER (ID,MD_CODE,SYS_CODE,ENTITY_CODE,SERVICE_NAME,USERNAME,PASSWORD,REGISTER_TIME) values"
				+ "(SEQ_MAP_SERVICE_REGISTER.nextval,?,?,?,?,?,?,?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, md_code);
			pstmt.setString(2, sys_code);
			pstmt.setString(3, entity_code);
			pstmt.setString(4, userInfoBean.getSERVICE_NAME());
			pstmt.setString(5, userInfoBean.getUsername());
			pstmt.setString(6, userInfoBean.getPassword());
			pstmt.setTimestamp(7, new Timestamp(new Date().getTime()));
			pstmt.execute();
		} catch (Exception e) {
			throw new UserInfoException(
					"md_code:" + md_code + ",sys_code:" + sys_code + ",entity_code" + entity_code + "注册失败！");
		} finally {
			close(rslt, pstmt, conn);
		}
	}

	@Override
	public void removeUserInfo(UserInfoBean userInfoBean) throws UserInfoException {
		Connection conn = ConnectionManager.getInstance().getConnection();
		String md_code = userInfoBean.getMD_CODE();
		String sys_code = userInfoBean.getSYS_CODE();
		String entity_code = userInfoBean.getENTITY_CODE();
		// if (temp == null)
		// throw new UserInfoException("md_code:" + md_code + ",sys_code:" +
		// sys_code + ",entity_code" + entity_code
		// + "找不到用户信息！");
		// 删除用户
		PreparedStatement pstmt = null;
		ResultSet rslt = null;
		String sql = "delete from MAP_SERVICE_REGISTER where MD_CODE = ? and SYS_CODE = ? and ENTITY_CODE = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, md_code);
			pstmt.setString(2, sys_code);
			pstmt.setString(3, entity_code);
			pstmt.execute();
		} catch (Exception e) {
			throw new UserInfoException(
					"md_code:" + md_code + ",sys_code:" + sys_code + ",entity_code" + entity_code + "删除注册信息失败！");
		} finally {
			close(rslt, pstmt, conn);
		}
	}

	/**
	 * 查找用户信息
	 * 
	 * @param userInfoBean
	 * @return
	 */
	@SuppressWarnings("unused")
	private UserInfoBean findUserInfo(UserInfoBean userInfoBean) {
		// 查找用户
		UserInfoBean temp = null;
		// temp = findUser(temp);
		return temp;
	}

	@Override
	public void modifyUserInfo(UserInfoBean userInfoBean) throws UserInfoException {
		Connection conn = ConnectionManager.getInstance().getConnection();
		String md_code = userInfoBean.getMD_CODE();
		String sys_code = userInfoBean.getSYS_CODE();
		String entity_code = userInfoBean.getENTITY_CODE();
		// UserInfoBean temp = this.findUserInfo(userInfoBean);
		// if (temp == null)
		// throw new UserInfoException("md_code:" + md_code + ",sys_code:" +
		// sys_code + ",entity_code" + entity_code
		// + "找不到用户信息！");
		// 更新
		// 是否已注册
		// if ("A".equals(md_code) && "B".equals(sys_code) &&
		// "C".equals(entity_code)) {
		// throw new UserInfoException("md_code:" + md_code + ",sys_code:" +
		// sys_code + ",entity_code" + entity_code
		// + "已注册！");
		// }
		// 添加用户
		PreparedStatement pstmt = null;
		ResultSet rslt = null;
		String sql = "update MAP_SERVICE_REGISTER set (SERVICE_NAME,USERNAME,PASSWORD) values"
				+ "(?,?,?) where MD_CODE = ? and SYS_CODE = ? and ENTITY_CODE = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userInfoBean.getSERVICE_NAME());
			pstmt.setString(2, userInfoBean.getUsername());
			pstmt.setString(3, userInfoBean.getPassword());
			pstmt.setString(4, md_code);
			pstmt.setString(5, sys_code);
			pstmt.setString(6, entity_code);
			pstmt.execute();
		} catch (Exception e) {
			throw new UserInfoException(
					"md_code:" + md_code + ",sys_code:" + sys_code + ",entity_code" + entity_code + "修改注册信息失败！");
		} finally {
			close(rslt, pstmt, conn);
		}
	}

	private void close(ResultSet rslt, PreparedStatement pstmt, Connection conn) {
		try {
			if (rslt != null) {
				rslt.close();
			}
			if (pstmt != null) {
				pstmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

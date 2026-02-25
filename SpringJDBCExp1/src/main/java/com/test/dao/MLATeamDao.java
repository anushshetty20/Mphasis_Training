package com.test.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.test.model.MLATeam;

public class MLATeamDao {
	
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int saveMLATeam(MLATeam obj) {
		String sql = "insert into mlateam values("+obj.getId()+", '"+obj.getName()+"', '"+obj.getSkill()+"', '"+obj.getManager()+"')";
		return jdbcTemplate.update(sql);
		
	}
	
	public int updateMLATeam(MLATeam obj) {
		String sql = "update mlateam set e_name = '"+obj.getName()+"', e_skill = '"+obj.getSkill()+"', t_manager = '"+obj.getManager()+"' where id = "+obj.getId()+" ";
		return jdbcTemplate.update(sql);
	}
	
	public int deleteMLATeamMember(MLATeam obj) {
		String sql = "delete from mlateam where id = "+obj.getId()+" ";
		return jdbcTemplate.update(sql);
	}
	
	public List<MLATeam> getAllMember(){
		return jdbcTemplate.query("select * from mlateam", 
				new ResultSetExtractor<List<MLATeam>>() {
						public List<MLATeam> extractData(ResultSet rs) 
						throws SQLException,DataAccessException
						{
							List<MLATeam> listTeam = new ArrayList<>();
							while(rs.next()) {
								MLATeam team = new MLATeam();
								team.setId(rs.getInt(1));
								team.setName(rs.getString(2));
								team.setSkill(rs.getString(3));
								team.setManager(rs.getString(4));
								listTeam.add(team);
							}
							return listTeam;
						}
				});
	}
	
}

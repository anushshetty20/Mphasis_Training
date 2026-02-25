package com.test.dao;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.test.model.MLATeam;

public class MLAteamDao1 {
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	public void setNamedParameterJdbcTemplate(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
		this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
	}
	
	public void createMLATeam(MLATeam obj) {
		String sql = "insert into mlateam(id, e_name, e_skill, t_manager) values (:e_id, :e_name, :e_skill, :t_manager) ";
		MapSqlParameterSource msp = new MapSqlParameterSource();
		msp.addValue("e_id", obj.getId());
		msp.addValue("e_name", obj.getName());
		msp.addValue("e_skill", obj.getSkill());
		msp.addValue("t_manager", obj.getManager());
		
		namedParameterJdbcTemplate.update(sql, msp);
	}
	
	public void updateMLATeam(MLATeam obj) {
		String sql = "update mlateam set  e_name = :e_name, e_skill = :e_skill, t_manager = :t_manager where id = :e_id ";
		MapSqlParameterSource msp = new MapSqlParameterSource();
		msp.addValue("e_id", obj.getId());
		msp.addValue("e_name", obj.getName());
		msp.addValue("e_skill", obj.getSkill());
		msp.addValue("t_manager", obj.getManager());
		
		namedParameterJdbcTemplate.update(sql, msp);
	}
	
	public void deleteMLATeam(MLATeam obj) {
		String sql = "delete from mlateam where id = :e_id ";
		MapSqlParameterSource msp = new MapSqlParameterSource();
		msp.addValue("e_id", obj.getId());
		
		namedParameterJdbcTemplate.update(sql, msp);
	}
	
}

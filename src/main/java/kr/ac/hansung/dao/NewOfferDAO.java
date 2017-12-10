package kr.ac.hansung.dao;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import kr.ac.hansung.model.Offer;


//@Component("offerDAO") // 얘를 Bean으로 등록하겠다 근데 스캔할 패키지는 지정해줘야한다
@Repository
public class NewOfferDAO {
	private JdbcTemplate jdbcTemplate;
	
	@Autowired // 이 데이터 소스를 가진 Bean을 찾아 자동으로 주입해준다
	public void setDataSource(DataSource datasource) {
		jdbcTemplate = new JdbcTemplate(datasource);
	}
	
	public int getRowCount() {
		String sqlStatement = "select count(*) from newsubject";
		return jdbcTemplate.queryForObject(sqlStatement, Integer.class);
	}
	
	// query and return a single objects
		public Offer getOffer(String code) {
			// name을 줘서 해당되는 레코드를 읽어오겠다
			String sqlStatement = "select * from newsubject where newsubject=?";
			
			return jdbcTemplate.queryForObject(sqlStatement, new Object[] {code},
					new RowMapper<Offer>() {

						public Offer mapRow(ResultSet rs, int rowNum) throws SQLException {
							Offer offer = new Offer();
							
							offer.setYear(rs.getInt("year")); 
							offer.setSemester(rs.getInt("semester"));
							offer.setCode(rs.getString("code"));
							offer.setSubject(rs.getString("subject"));
							offer.setSort(rs.getString("sort"));
							offer.setCredit(rs.getInt("credit"));
							
							return offer;
						}
				
			});
		}
	
	// query and return multiple objects
	public List<Offer> getOffers() {
		String sqlStatement = "select * from newsubject";
		
		return jdbcTemplate.query(sqlStatement,
				new RowMapper<Offer>() {

					public Offer mapRow(ResultSet rs, int rowNum) throws SQLException {
						Offer offer = new Offer();
						
						offer.setYear(rs.getInt("year"));
						offer.setSemester(rs.getInt("semester"));
						offer.setCode(rs.getString("code"));
						offer.setSubject(rs.getString("subject"));
						offer.setSort(rs.getString("sort"));
						offer.setCredit(rs.getInt("credit"));
						
						return offer;
					}
			
		});
	}
	
	public boolean insert(Offer offer) {
		int year = offer.getYear();
		int semester = offer.getSemester();
		String code = offer.getCode();
		String subject = offer.getSubject();
		String sort = offer.getSort();
		int credit = offer.getCredit();
		
		String sqlStratement = "insert into newsubject (year, semester, code, subject, sort, credit) values (?, ?, ?, ?, ?, ?)";
		
		return (jdbcTemplate.update(sqlStratement, new Object[] {year, semester, code, subject, sort, credit}) == 1);
	}
	
/*	public boolean update(Offer offer) {
		int year = offer.getYear();
		int semester = offer.getSemester();
		String code = offer.getCode();
		String subject = offer.getSubject();
		String sort = offer.getSort();
		int credit = offer.getCredit();
		
		
		String sqlStatement = "update offers set name=?, email=?, text=? where id=?";
		
		return (jdbcTemplate.update(sqlStatement, new Object[] {name, email, text, id}) == 1);
	}*/
	
	public boolean delete (String code) {
		String sqlStatement = "delete from newsubject where code=?";
		
		return (jdbcTemplate.update(sqlStatement, new Object[] {code}) == 1);
		
	}

	
}

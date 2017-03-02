import java.sql.ResultSet;  
import java.sql.SQLException;  
import java.util.List;  
import org.springframework.jdbc.core.BeanPropertyRowMapper;  
import org.springframework.jdbc.core.JdbcTemplate;  
import org.springframework.jdbc.core.RowMapper;  

public class ClientDAO {
	
	JdbcTemplate template;  
	  
	public void setTemplate(JdbcTemplate template) {  
	    this.template = template;  
	}  
	
	// Cria um novo cliente no banco de dados.
	public int save(Client c) {
		String sql = "INSERT INTO Client(cnpj,name,contactName,maxBillingTerm,companyType,phone1,phone2,contactEmail,billingEmail,financialEmail) "
				+ "VALUES (?,?,?,?,?,?,?,?,?,?)";
		return this.template.update(sql, c.getCnpj(), c.getName(), c.getContactName(), c.getMaxBillingTerm(), c.getCompanyType(), 
				c.getPhone1(), c.getPhone2(), c.getContactEmail(), c.getBillingEmail(), c.getFinancialEmail());
	}
	
	// Atualiza um cliente no banco de dados.
	public int update(Client c) {
		String sql = "UPDATE Client SET name=?, contactName=?, maxBillingTerm=?, "
				+ "companyType=?, phone1=?, phone2=?, contactEmail=?, billingEmail=?, financialEmail=? "
				+ "WHERE cnpj = ?";
		return this.template.update(sql, c.getName(), c.getContactName(), c.getMaxBillingTerm(), c.getCompanyType(), 
				c.getPhone1(), c.getPhone2(), c.getContactEmail(), c.getBillingEmail(), c.getFinancialEmail(), c.getCnpj());
	}
	
	// Exclui um cliente do banco de dados.
	public int delete(String cnpj) {
		String sql = "DELETE FROM Client WHERE cnpj = ?";
		return this.template.update(sql, cnpj);
	}
	
	// Pesquisa um cliente com base no CNPJ.
	public Client getClientByCnpj(String cnpj) {
		String sql = "SELECT * FROM Client WHERE cnpj = ?";
		return template.queryForObject(sql,new Object[]{cnpj} , new BeanPropertyRowMapper<Client>(Client.class));
	}
	
	// Retorna a lista de todos os clientes.
	public List<Client> getClients() {
		
		String sql = "SELECT cnpj, name, contactName, maxBillingTerm, creationDate, companyType, phone1, phone2, contactEmail, "
				+ "billingEmail, financialEmail FROM Client";
		
		return template.query(sql, new RowMapper<Client>(){
			public Client mapRow(ResultSet rs, int row) throws SQLException {
				Client c = new Client();
				c.setCnpj(rs.getString(1));
				c.setName(rs.getString(2));
				c.setContactName(rs.getString(3));
				c.setMaxBillingTerm(rs.getInt(4));
				c.setCreationDate(rs.getDate(5));
				c.setCompanyType(rs.getInt(6));
				c.setPhone1(rs.getInt(7));
				c.setPhone2(rs.getInt(8));
				c.setContactEmail(rs.getString(9));
				c.setBillingEmail(rs.getString(10));
				c.setFinancialEmail(rs.getString(11));
				return c;
			}
		});
	}
	
}

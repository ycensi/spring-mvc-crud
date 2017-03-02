import java.util.Date;

public class Client {

	private String cnpj;
	private String name;
	private String contactName;
	private int maxBillingTerm;
	private Date creationDate;
	private int companyType;
	private int phone1;
	private int phone2;
	private String contactEmail;
	private String billingEmail;
	private String financialEmail;
	
	// Retorna o CNPJ.
	public String getCnpj() {
		return this.cnpj;
	}
	
	// Altera o CNPJ.
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	// Retorna a Razão Social.
	public String getName() {
		return this.name;
	}
	
	// Altera a Razão Social.
	public void setName(String name) {
		this.name = name;
	}
	
	// Retorna o nome de contato.
	public String getContactName() {
		return this.contactName;
	}
	
	// Altera o nome de contato.
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	
	// Retorna o prazo máximo de faturamento.
	public int getMaxBillingTerm() {
		return this.maxBillingTerm;
	}
	
	// Altera o prazo máximo de faturamento.
	public void setMaxBillingTerm(int maxBillingTerm) {
		this.maxBillingTerm = maxBillingTerm;
	}
	
	// Retorna a data de criação.
	public Date getCreationDate() {
		return this.creationDate;
	}
	
	// Altera a data de criação.
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	
	// Retorna o tipo de empresa.
	public int getCompanyType() {
		return this.companyType;
	}
	
	// Altera o tipo de empresa.
	public void setCompanyType(int companyType) {
		this.companyType = companyType;
	}
	
	// Retorna o telefone 1.
	public int getPhone1() {
		return this.phone1;
	}
	
	// Altera o telefone 1.
	public void setPhone1(int phone1) {
		this.phone1 = phone1; 
	}
	
	// Retorna o telefone 2.
	public int getPhone2() {
		return this.phone2;
	}
	
	// Altera o telefone 2.
	public void setPhone2(int phone2) {
		this.phone2 = phone2;
	}
	
	// Retorna o e-mail de contato.
	public String getContactEmail() {
		return this.contactEmail;
	}
	
	// Altera o e-amil de contat.
	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}
	
	// Retorn o e-mail de faturamento (XML).
	public String getBillingEmail() {
		return this.billingEmail;
	}
	
	// Altera o e-mail de faturamento (XML).
	public void setBillingEmail(String billingEmail) {
		this.billingEmail = billingEmail;
	}
	
	// Retorna o e-mail financeiro.
	public String getFinancialEmail() {
		return this.financialEmail;
	}
	
	// Altera o e-mail financeiro.
	public void setFinancialEmail(String financialEmail) {
		this.financialEmail = financialEmail;
	}
	
	public void displayInfo(){  
	    System.out.println("Cliente: "+ getName());  
	}  
	
}

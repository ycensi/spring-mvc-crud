<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" ></script>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
 
 
 <style>
	.formCli > form > .row {
		margin-top: 10px;
	}
</style>  
  
  
 <div class="container formCli">
 	<h2>Editar Cliente</h2>	
 	<form:form method="post" action="/SpringMVCCRUD/editsave"> 
 		<div class="row" style="display:none;">
			<div class="col-md-4">
				<div class="input-group">
					<label for="cnpj" >CNPJ</label>
					<form:hidden path="cnpj" max="999999999999999" class="form-control" />
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-md-4">
				<div class="input-group">
					<label for="name">Razão Social</label>
					<form:input path="name" type="text" required="true" maxlength="50" class="form-control" />
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-md-4">
				<div class="input-group">
					<label for="contactName">Nome de Contato</label>
					<form:input path="contactName" type="text" required="true" maxlength="30" class="form-control" />
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-md-4">
				<div class="input-group">
					<label for="maxBillingTerm">Prazo Máximo de Faturamento</label>
					<form:input path="maxBillingTerm" type="number" required="true" type="number" max="999" class="form-control" />
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-md-4">
				<div class="input-group">
					<label for="companyType">Tipo de Empresa</label>
					<form:input path="companyType" type="number" required="true" max="99" class="form-control" />
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-md-4">
				<div class="input-group">
					<label for="phone1">Telefone 1</label>
					<form:input path="phone1" type="number" required="true" max="999999999" class="form-control" />
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-md-4">
				<div class="input-group">
					<label for="phone2">Telefone 2 </label>
					<form:input path="phone2" type="number" required="true" max="999999999" class="form-control" />
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-md-4">
				<div class="input-group">
					<label for="contactEmail">E-mail de Contato</label>
					<form:input path="contactEmail" type="email" required="true" maxlength="30" class="form-control" />
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-md-4">
				<div class="input-group">
					<label for="financialEmail">E-mail Financeiro</label>
					<form:input path="financialEmail" type="email" required="true" maxlength="30" class="form-control" />
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-md-4">
				<div class="input-group">
					<label for="billingEmail">E-mail de Faturamento</label>
					<form:input path="billingEmail" type="email" required="true" maxlength="30" class="form-control" />
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-md-1">
				<input class="btn btn-md btn-primary" type="submit" value="Confirmar" />
			</div>
			<div class="col-md-1">
				<a href="/SpringMVCCRUD" class="btn btn-md btn-danger">Cancelar</a>
			</div>
		</div>
	</form:form>
 </div>  
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<style>
	
</style>


<div class="container">
	<h2>Lista de Clientes</h2>
	<div class="row">
		<div class="col-md-12" style="overflow: auto;">
			<table class="table">
				<thead>
					<tr>
						<th>CNPJ</th>
						<th>Razão Social</th>
						<th>Nome Contato</th>
						<th>Prazo Max. Fat.</th>
						<th>Tipo Empresa</th>
						<th>Telefone 1</th>
						<th>Telefone 2</th>
						<th>E-mail Contato</th>
						<th>E-mail Financeiro</th>
						<th>E-mail Faturamento</th>
						<th>Data Cadastro</th>
						<th></th>
						<th></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="cli" items="${clients}">
						<tr>
							<td>${cli.cnpj}</td>
							<td>${cli.name}</td>
							<td>${cli.contactName}</td>
							<td>${cli.maxBillingTerm}</td>
							<td>${cli.companyType}</td>
							<td>${cli.phone1}</td>
							<td>${cli.phone2}</td>
							<td>${cli.contactEmail}</td>
							<td>${cli.financialEmail}</td>
							<td>${cli.billingEmail}</td>
							<td>${cli.creationDate}</td>
							<td><a class="btn btn-md btn-default" role="button"
								href="editclient/${cli.cnpj}">Editar</a></td>
							<td><a class="btn btn-md btn-danger" role="button"
								href="deleteclient/${cli.cnpj}">Excluir</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
	<div class="row">
		<div class="col-md-2">
			<a class="btn btn-md btn-primary" href="clientform">Novo Cliente</a>
		</div>
	</div>
</div>

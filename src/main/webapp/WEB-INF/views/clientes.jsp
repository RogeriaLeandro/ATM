<%@ include file="header.jsp"%>
<body>
	<div class="container">
		<br>
		<h3>Lista de Clientes</h3>
		<table class="table table-striped">
			<thead>
				<tr>
					<th scope="col">ID</th>
					<th scope="col">Nome</th>
					<th scope="col">Saldo</th>
					<th scope="col">Estado</th>
					<th scope="col">Cidade</th>
					<th scope="col">Bairro</th>
					<th scope="col">CEP</th>
					<th scope="col">Rua</th>
					<th scope="col">Número</th>
				</tr>
			</thead>
			<tbody>

				<c:forEach var="cliente" items="${clientes }">
					<tr>
						<th scope="row">${cliente.id }</th>
						<td>${cliente.nome }</td>
						<td>${cliente.saldoDevedor }</td>
						<td>${cliente.endereco.estado }</td>
						<td>${cliente.endereco.cidade }</td>
						<td>${cliente.endereco.bairro }</td>
						<td>${cliente.endereco.cep }</td>
						<td>${cliente.endereco.rua }</td>
						<td>${cliente.endereco.numero }</td>
					</tr>
				</c:forEach>

			</tbody>
		</table>



		<br>

		<h3>Cadastro de Cliente</h3>

		<form method="POST" modelAttribute="cliente">
			<div class="form-group">
				<label for="nome">Nome</label> <input type="text"
					class="form-control" id="nome" name="nome"
					aria-describedby="Nome do Cliente" placeholder="Nome do Cliente">
			</div>
			<div class="form-group">
				<label for="saldo">Estado</label> <input type="text"
					class="form-control" id="endereco.estado" name="endereco.estado"
					placeholder="Estado">
			</div>

			<div class="form-group">
				<label for="saldo">Cidade</label> <input type="text"
					class="form-control" id="endereco.cidade" name="endereco.cidade"
					placeholder="Cidade">
			</div>

			<div class="form-group">
				<label for="saldo">Bairro</label> <input type="text"
					class="form-control" id="endereco.bairro" name="endereco.bairro"
					placeholder="Bairro">
			</div>

			<div class="form-group">
				<label for="saldo">CEP</label> <input type="text"
					class="form-control" id="endereco.cep" name="endereco.cep"
					placeholder="CEP">
			</div>

			<div class="form-group">
				<label for="saldo">Rua</label> <input type="text"
					class="form-control" id="endereco.rua" name="endereco.rua"
					placeholder="Rua">
			</div>

			<div class="form-group">
				<label for="saldo">Número</label> <input type="text"
					class="form-control" id="endereco.numero" name="endereco.numero"
					placeholder="Número">
			</div>

			<button type="submit" class="btn btn-primary">Cadastrar</button>
		</form>
		<br>
	</div>
</body>

<%@ include file="footer.jsp"%>

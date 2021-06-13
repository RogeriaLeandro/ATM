<%@ include file="header.jsp"%>
<body>
	<div class="container">
		<br>
		<h3>Lista de Coletores</h3>
		<table class="table table-striped">
			<thead>
				<tr>
					<th scope="col">ID</th>
					<th scope="col">Nome</th>
				</tr>
			</thead>
			<tbody>

				<c:forEach var="coletor" items="${coletores }">
					<tr>
						<th scope="row">${coletor.id }</th>
						<td>${coletor.nome }</td>
					</tr>
				</c:forEach>

			</tbody>
		</table>



		<br>

		<h3>Cadastro de Coletor</h3>

		<form method="POST" modelAttribute="coletor">
			<div class="form-group">
				<label for="nome">Nome</label> <input type="text"
					class="form-control" id="nome" name="nome"
					aria-describedby="Nome do Coletor" placeholder="Nome do Coletor">
			</div>

			<button type="submit" class="btn btn-primary">Cadastrar</button>
		</form>
		<br>
	</div>
</body>

<%@ include file="footer.jsp"%>

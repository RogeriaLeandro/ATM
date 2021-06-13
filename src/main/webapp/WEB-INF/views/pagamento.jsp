
<%@ include file="header.jsp"%>

<body>

	<div class="container">
		<br>
		<h3>Pagamento</h3>
		<table class="table table-striped">
			<thead>
				<tr>
					<th scope="col">ID</th>
					<th scope="col">Vencimento</th>
					<th scope="col">Valor</th>
					<th scope="col">Juros</th>
				</tr>
			</thead>
			<tbody>

					<tr>
						<th scope="row">${pagamento.id }</th>
						<td>${pagamento.data }</td>
						<td>${pagamento.montanteAPagar }</td>
						<td>${pagamento.jurosPagos }</td>
						<td>${pagamento.observacoes }</td> 
					</tr>

			</tbody>
		</table>
		
		<form method="POST" modelAttribute="pagamento">
		
			<div class="form-group">
				<label for="nome">Observações</label> 
				<input type="text" class="form-control" id="observacoes" name="observacoes"
					 placeholder="Observações sobre o pagamento">
			</div>
		
			<input type="hidden" class="form-control" id="id" name="id"
					 value=${pagamento.id }>
		
			

			<button type="submit" class="btn btn-primary">Efetuar Pagamento</button>
		</form>

		<br>


	</div>
</body>


<%@ include file="footer.jsp"%>

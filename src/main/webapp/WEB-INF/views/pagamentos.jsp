
<%@ include file="header.jsp"%>

<body>

	<div class="container">
		<br>
		<h3>Empréstimo</h3>
			<table class="table table-striped">
			<thead>
				<tr>
					<th scope="col">ID</th>
					<th scope="col">Cliente</th>
					<th scope="col">Coletor</th>
					<th scope="col">Data</th>
					<th scope="col">Vencimento</th>
					<th scope="col">Montante</th>
					<th scope="col">Juros</th>
					<th scope="col">Total a pagar</th>
					<th scope="col">Parcelas</th>
					<th scope="col">Parcelas Quitadas</th>
				</tr>
			</thead>
			<tbody>

					<tr>
						<th scope="row">${emprestimo.id }</th>
						<td>${emprestimo.cliente.nome }</td>
						<td>${emprestimo.coletor.nome }</td>
						<td>${emprestimo.dataEmprestimo }</td>
						<td>${emprestimo.diaVencimento }</td>
						<td>R$: ${emprestimo.montante }</td>
						<td>${emprestimo.taxaDeJuro }</td>
						<td>R$: ${emprestimo.total }</td>
						<td>${emprestimo.numeroParcelas }</td>
						<td>${emprestimo.parcelasPagas }</td>
					</tr>

			</tbody>
		</table>
		
		<h3>Pagamentos</h3>
		<table class="table table-striped">
			<thead>
				<tr>
					<th scope="col">ID</th>
					<th scope="col">Data</th>
					<th scope="col">Valor</th>
					<th scope="col">Juros</th>
					<th scope="col">observacoes</th>
					<th scope="col"> - </th>
				</tr>
			</thead>
			<tbody>

				<c:forEach var="pagamento" items="${pagamentos }">
					<tr>
						<th scope="row">${pagamento.id }</th>
						<td>${pagamento.data }</td>
						<td>${pagamento.montanteAPagar }</td>
						<td>${pagamento.jurosPagos }</td>
						<td>${pagamento.observacoes }</td> 
						<td>
							<c:if test="${pagamento.pago == true }">Pago</c:if>
							<c:if test="${pagamento.pago == false }"><a href="/emprestimo/pagamento?pagamentoId=${pagamento.id }">Pagar</a></c:if>
						</td> 
					</tr>
				</c:forEach>

			</tbody>
		</table>

		<br>


	</div>
</body>


<%@ include file="footer.jsp"%>

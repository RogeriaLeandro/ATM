<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html>
<html>

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="Infnet-Java" content="">

<title>Empréstimos</title>

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<link
	href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
	rel="stylesheet">


</head>
<header>
	
	<nav class="navbar navbar-expand-lg navbar-light bg-primary">
  <a class="navbar-brand" href="/emprestimo"><img
			src='<c:url value="/resources/assets/loan.svg"/>' height="50"
			width="150"></a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item">
        <a class="nav-link" href="/emprestimo">Empréstimos</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/emprestimo/clientes">Clientes</a>
      </li>
       <!--  <li class="nav-item">
        <a class="nav-link" href="/emprestimo/pagamentos">Pagamentos</a>
      </li> -->
       <li class="nav-item">
        <a class="nav-link" href="/emprestimo/coletores">Coletores</a>
      </li>
    </ul>
  </div>
</nav>
	
	
</header>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro de Funcion�rios</title>
<%@include file='/template/header.jsp'%>
</head>
<body>
<%@include file='/template/menu.jsp'%>
<div id="page-wrapper" style="min-height: 598px;">
            <div class="row">
                
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                           Lista de Funcion�rios
                        </div>
                        <div class="panel-body">
                            <div class="row">
                                <div class="col-lg-6">
                                	<table class="table-bordered">
                                		<thead>
                                			<tr>
	                                			<th>Nome</th>
	                                			<th>Endere�o</th>
	                                			<th>Telefone</th>
	                                			<th>Celular</th>
	                                			<th>Email</th>
	                                			<th>Data de Nascimento</th>
	                                		</tr>	
                                		</thead>
                                		<tbody>
                                			<c:forEach items="${listFuncionarios}" var="f">
	                                			<tr>
	                                				<td>${f.nomeFuncionario}</td>
	                                				<td>${f.enderecoFuncionario}</td>
	                                				<td>${f.telFuncionario}</td>
	                                				<td>${f.celFuncionario}</td>
	                                				<td>${f.emailFuncionario}</td>
	                                				<td>${f.dataNasc}</td>
	                                			</tr>
                                			</c:forEach>
                                		</tbody>
                                	</table>
                                </div>
                                <!-- /.col-lg-6 (nested) -->
                            </div>
                            <!-- /.row (nested) -->
                        </div>
                        <!-- /.panel-body -->
                    </div>
                    <!-- /.panel -->
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
        </div>
</body>
</html>
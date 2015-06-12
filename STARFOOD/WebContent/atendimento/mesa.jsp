<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Insert title here</title>
	<%@include file='/template/header.jsp'%>
</head>
<body>
	<%@include file='/template/menu.jsp'%>
	<div id="page-wrapper">
		<div class="col-lg-12">
	        <div class="panel panel-default">
	            <div class="panel-heading">
	                Escolha sua Mesa
	            </div>
	            <div class="panel-body">
	                <div class="row">
	                    <div class="col-lg-12">
	                        <form role="form" action="Atendimento?acao=abrirPedido" method="post">
	                            <div class="form-group">
	                                <label>Mesa</label>
	                                <label class="radio-inline">
	                                    <input type="radio" name="optionsRadiosInline" id="optionsRadiosInline1" value="1" checked="">1
	                                </label>
	                                <label class="radio-inline">
	                                    <input type="radio" name="optionsRadiosInline" id="optionsRadiosInline2" value="2">2
	                                </label>
	                                <label class="radio-inline">
	                                    <input type="radio" name="optionsRadiosInline" id="optionsRadiosInline3" value="3">3
	                                </label>
	                            </div>
	                             <input type="submit" class="btn btn-default" value="Iniciar Pedido"/>
	                             <a href="fazerPedido.jsp" class="btn btn-default">Iniciar Pedido</a>
	                        </form>
	                    </div>
					</div>
				</div>
			</div>	
	    </div>           
    </div>
</body>
</html>
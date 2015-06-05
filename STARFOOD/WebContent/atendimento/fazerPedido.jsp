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
	                Aproveite nosso cardápio especial!
	            </div>
	            <div class="panel-body">
	                <div class="row">
	                    <div class="col-lg-12">
	                        <form role="form">
	                            <div class="form-group">
                                            <label>Bebidas</label>
                                            <div class="checkbox">
                                                <label>
                                                    <input type="checkbox" value="">Refrigerante
                                                </label>
                                            </div>
                                            <div class="checkbox">
                                                <label>
                                                    <input type="checkbox" value="">Suco
                                                </label>
                                            </div>
                                            <div class="checkbox">
                                                <label>
                                                    <input type="checkbox" value="">Cerveja
                                                </label>
                                            </div>
                                        </div>
	                            <button type="submit" class="btn btn-default">Enviar Pedido</button>
	                            <a href="caixa.jsp" class="btn btn-default">Fechar Conta</a>
	                        </form>
	                    </div>
					</div>
				</div>
			</div>	
	    </div>           
    </div>
</body>
</html>
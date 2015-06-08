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
	                Conta
	            </div>
	            <div class="panel-body">
	                <div class="row">
	                    <div class="col-lg-12">
	                        <form role="form">
	                            <div class="form-group">
	                                <label>Itens do Pedido</label>
	                                <label class="radio-inline">
	                                    <input type="radio" name="optionsRadiosInline" id="optionsRadiosInline1" value="option1" checked="">1
	                                </label>
	                                <label class="radio-inline">
	                                    <input type="radio" name="optionsRadiosInline" id="optionsRadiosInline2" value="option2">2
	                                </label>
	                                <label class="radio-inline">
	                                    <input type="radio" name="optionsRadiosInline" id="optionsRadiosInline3" value="option3">3
	                                </label>
	                            </div>
	                            <button type="submit" class="btn btn-default">Finalizar Pagamento</button>
	                            
	                        </form>
	                    </div>
					</div>
				</div>
			</div>	
	    </div>           
    </div>
</body>
</html>
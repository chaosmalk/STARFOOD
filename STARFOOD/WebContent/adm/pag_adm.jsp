<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@include file='/template/header.jsp'%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Administrador</title>
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
                           Tela do Administrador
                        </div>
                        <div class="panel-body">
                            <div class="row">
                                <div class="col-lg-6">
                                    <form role="form">
                                        <a href="${pageContext.request.contextPath}/formularios/formFornecedor.jsp" class="btn btn-default">Fornecedores</a>
                                        <a href="${pageContext.request.contextPath}/formularios/formFuncionario.jsp" class="btn btn-default">Funcionários</a>
                                        <a href="${pageContext.request.contextPath}/formularios/formProduto.jsp" class="btn btn-default">Produtos</a>
										<a href="${pageContext.request.contextPath}/formularios/formSolicitanteMesa.jsp" class="btn btn-default">Mesas</a>
                                        <a href="${pageContext.request.contextPath}/formularios/formFormaDePagamento.jsp" class="btn btn-default">Formas de Pagamento</a>
                                        <a href="${pageContext.request.contextPath}/formularios/formFuncao.jsp" class="btn btn-default">Cargos</a>
                                                                                                                       
                                       
                                    </form>
                                     </div>
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
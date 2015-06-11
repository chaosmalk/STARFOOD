<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro de Produtos</title>
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
                            Cadastro de Produtos
                        </div>
                        <div class="panel-body">
                            <div class="row">
                                <div class="col-lg-6">
                                    <form role="form" action="${pageContext.request.contextPath}/Administrador" method="post">
                                        <input type="hidden" name="acao" value="cadastrarProduto"/>
                                         <div class="form-group">
                                            <label>Descrição do Produto</label>
                                            <input class="form-control" name="descProduto" required="">
                                         
                                        </div>
                                        <div class="form-group">
                                            <label>Quantidade</label>
                                            <select class="form-control" name="quantidade" required="">
                                                <option>1</option>
                                                <option>2</option>
                                                <option>3</option>
                                                <option>4</option>
                                                <option>5</option>
                                            </select>
                                        </div>
                                         <div class="form-group">
                                            <label>Volumetria</label>
                                            <input class="form-control" name="volumetria" required="">
                                        
                                        </div>
                                         <div class="form-group">
                                            <label>Id do Fornecedor	</label>
                                            <input class="form-control" name="idFornecedor" required="">
                                        
                                        </div>
                                         <div class="form-group">
                                            <label>Data da Compra</label>
                                            <input class="form-control" name="dataCompra" required="">
                                       
                                        </div>
                                         <div class="form-group">
                                            <label>Data de Validade</label>
                                            <input class="form-control" name="dataValidade" required="">
                                           
                                        </div>
                                         <div class="form-group">
                                            <label>Valor da Compra</label>
                                            <input class="form-control" name="valorCompra" required="">
                                        
                                        </div>
                                         <div class="form-group">
                                            <label>Valor da Venda</label>
                                            <input class="form-control" name="valorVenda" required="">
                                        
                                        </div>
                                         <div class="form-group">
                                            <label>Barra do Produto</label>
                                            <input class="form-control" name="barraProduto" required="">
                                         
                                        </div>
                                         <div class="form-group">
                                            <label>Barra Interna</label>
                                            <input class="form-control" name="barraInterna" required="">
                                       
                                        </div>
                                         <div class="form-group">
                                            <label>Copa da Cozinha</label>
                                            <input class="form-control" name="copaCozinha" required="">
                                       
                                        </div>
                                        <input type="submit" class="btn btn-default" value="Incluir"/>
                                        <button type="reset" class="btn btn-default">Alterar</button>
                                        <button type="submit" class="btn btn-default">Excluir</button>
                                        <button type="reset" class="btn btn-default">Pesquisar</button>
                                        </div>
                                    </form>
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
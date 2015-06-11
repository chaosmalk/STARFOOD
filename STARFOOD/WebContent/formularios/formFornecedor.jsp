<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro Fornecedor</title>
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
                            Cadastro de Fornecedores
                        </div>
                        <div class="panel-body">
                            <div class="row">
                                <div class="col-lg-6">
                                    <form role="form" action="${pageContext.request.contextPath}/Administrador" method="post">
                                    <input type="hidden" name="acao" value="cadastrarFornecedor"/>
                                         <div class="form-group">
                                            <label>Razão Social</label>
                                            <input class="form-control" name="razaoSocial" required="">
                                         
                                        </div>
                                    
                                         <div class="form-group">
                                            <label>Data de Cadastro</label>
                                            <input class="form-control" name="dataCadastro" required="">
                                        
                                        </div>
                                         <div class="form-group">
                                            <label>Endereço	</label>
                                            <input class="form-control" name="endereco" required="">
                                        
                                        </div>
                                         <div class="form-group">
                                            <label>Telefone</label>
                                            <input class="form-control" name="telefone" required="">
                                       
                                        </div>
                                         <div class="form-group">
                                            <label>Celular</label>
                                            <input class="form-control" name="celular" required="">
                                           
                                        </div>
                                         <div class="form-group">
                                            <label>E-mail</label>
                                            <input class="form-control" name="email" required="">
                                        
                                        </div>
                                         <div class="form-group">
                                            <label>CNPJ</label>
                                            <input class="form-control" name="cnpj" required="">
                                        
                                        </div>
                                         <div class="form-group">
                                            <label>Inscrição Estadual</label>
                                            <input class="form-control" name="inscricaoEstadual" required="">
                                         
                                        </div>
                                         <div class="form-group">
                                            <label>Observações</label>
                                            <input class="form-control" name="observacoes" required="">
                                       
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
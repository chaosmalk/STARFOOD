<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro de Funcionários</title>
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
                            Cadastro de Funcionários
                        </div>
                        <div class="panel-body">
                            <div class="row">
                                <div class="col-lg-6">
                                    <form role="form">
                                        <div class="form-group">
                                            <label>Id do Funcionário</label>
                                            <input class="form-control">
                                        </div>
                                         <div class="form-group">
                                            <label>Nome</label>
                                            <input class="form-control">
                                         
                                        </div>
                                        <div class="form-group">
                                            <label>Id da Função</label>
                                            <select class="form-control">
                                                <option>1</option>
                                                <option>2</option>
                                                <option>3</option>
                                                <option>4</option>
                                                <option>5</option>
                                            </select>
                                        </div>
                                         <div class="form-group">
                                            <label>Endereço</label>
                                            <input class="form-control">
                                        
                                        </div>
                                         <div class="form-group">
                                            <label>Telefone	</label>
                                            <input class="form-control">
                                        
                                        </div>
                                         <div class="form-group">
                                            <label>Celular</label>
                                            <input class="form-control">
                                       
                                        </div>
                                         <div class="form-group">
                                            <label>E-mail</label>
                                            <input class="form-control">
                                           
                                        </div>
                                         <div class="form-group">
                                            <label>Data de admissão</label>
                                            <input class="form-control">
                                        
                                        </div>
                                         <div class="form-group">
                                            <label>Data de demissão</label>
                                            <input class="form-control">
                                        
                                        </div>
                                         <div class="form-group">
                                            <label>Senha</label>
                                            <input class="form-control">
                                         
                                        </div>
                                         <div class="form-group">
                                            <label>RG</label>
                                            <input class="form-control">
                                       
                                        </div>
                                         <div class="form-group">
                                            <label>CPF</label>
                                            <input class="form-control">
                                       
                                        </div>
                                        <div class="form-group">
                                            <label>Data de Nascimento</label>
                                            <input class="form-control">
                                       
                                        </div>
                                        <div class="form-group">
                                            <label>Estado</label>
                                            <input class="form-control">
                                       
                                        </div>
                                        <button type="submit" class="btn btn-default">Incluir</button>
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
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Formulário de Dados Pessoais</title>
</head>
<body>
    <h1>Formulário de Dados Pessoais</h1>
    <form action="/aula18/DadosCalculados" method="get">
        <label for="anoNascimento">Ano de Nascimento:</label>
        <input type="number" name="anoNascimento" id="anoNascimento" required><br><br>

        <label for="fezAniversario">Já fez aniversário este ano?</label>
        <input type="radio" name="fezAniversario" value="sim" required>Sim
        <input type="radio" name="fezAniversario" value="nao" required>Não<br><br>

        <label for="nome">Nome:</label>
        <input type="text" name="nome" id="nome" required><br><br>

        <label for="endereco">Endereço:</label>
        <input type="text" name="endereco" id="endereco" required><br><br>

        <input type="submit" value="Enviar">
    </form>
</body>
</html>
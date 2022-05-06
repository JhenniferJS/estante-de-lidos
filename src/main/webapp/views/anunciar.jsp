<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="pt-BR">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width">
        <title>Anunciar</title>

        <link rel="stylesheet" type="text/css" href="../css/reset.css">
        <link rel="stylesheet" type="text/css" href="../css/style.css">
        <link href="https://fonts.googleapis.com/css2?family=Poppins&display=swap" rel="stylesheet">
    </head>
    <body>
        <header>
            <h1 class="img-cabecalho">     
                <img class="img-logo" src="../images/logo.png" alt="Logo Estante de Lidos">
            </h1>
            <nav>
                <a class="anunciar" href="anunciar.html">ANUNCIAR</a>
            </nav>
        </header>
        <main>
            <form>
                <fieldset>
                    <legend>O que você deseja anunciar?</legend>
                    <label for="radio-livro" class="label-livro">
                        <input type="radio" name="produto-tipo" value="livro" id="radio-livro" class="radio">Livro</label>

                    <label for="radio-material" class="label-material">
                        <input type="radio" name="produto-tipo" value="material" id="radio-material" class="radio">Material didático</label>
                </fieldset>

                <label for="nome" class="label-padrao">Qual o nome do conteúdo?</label>
                <input type="text" id="nome" class="input-padrao" name="produto-nome" placeholder="Nome do conteúdo" required>

                <label for="valor" class="label-padrao">Qual o valor do conteúdo?</label>

                <section>
                    <input type="text" id="valor" placeholder="Valor" name="produto-valor" class="input-valor">
                    <input type="checkbox" id="gratis" name="produto-gratis">
                    <label for="gratis" class="label-gratis">Grátis</label>
                </section>

                <label for="contato" class="label-padrao">Deixe seu contato para venda</label>
                <input type="text" id="contato-nome" placeholder="Nome" class="input-padrao" name="vendedor-nome">
                <input type="text" id="contato-telefone" placeholder="Telefone" class="input-padrao" name="telefone">

                <input type="submit" value="Salvar" class="enviar">
            </form>
        </main>
        <footer>
            <svg viewBox="0 0 1366 52" fill="none" xmlns="http://www.w3.org/2000/svg">
                <path d="M1366 0L0 0L0 52C683 0 1366 52 1366 52V0Z" fill="#FAF4FF"/>
            </svg>
            <div class="conteudo-footer">
                <h1 class="img-footer">
                    <img class="img-logo" src="../images/logo.png" alt="Logo Estante de Lidos">
                </h1>
                <svg class="linha-footer" viewBox="0 0 2 81" fill="none" xmlns="http://www.w3.org/2000/svg">
                    <line x1="1" x2="1" y2="81" stroke="white" stroke-width="2"/>
                </svg>                    
                <section class="endereco-footer">
                    <p class="conteudo-endereco">Av. João de Camargo, 510</p>
                    <p class="conteudo-endereco">Centro, Santa Rita do Sapucaí, MG</p>
                    <p class="conteudo-endereco">37540-000</p>
                </section>
            </div>
        </footer>
    </body>
</html>

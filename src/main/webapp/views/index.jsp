<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html lang="pt-BR">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width">
        <title>Estante de lidos</title>

        <link rel="stylesheet" href="../css/reset.css">
        <link rel="stylesheet" href="../css/style.css">
        <link href="https://fonts.googleapis.com/css2?family=Poppins&display=swap" rel="stylesheet">
    </head>
    <body>
        <header>
            <h1 class="img-cabecalho">     
                <img class="img-logo" src="../images/logo.png" alt="Logo Estante de Lidos">
            </h1>
            <nav>
                <a class="anunciar" href="anunciar.jsp">ANUNCIAR</a>
            </nav>
        </header>
        <main>
            <div class="conteudo-main">
                <h1 class="titulo">O que você precisa hoje?</h1>
            </div>
            <div class="opcoes">
                <a class="livro" href="livros.jsp">
                    <div>
                        <svg class="svg-livro" width="55" height="55" viewBox="0 0 55 55" fill="none" xmlns="http://www.w3.org/2000/svg">
                            <rect x="0.453278" width="54.5467" height="54.5467" rx="27.2734" fill="#79CFFF"/>
                            <path fill-rule="evenodd" clip-rule="evenodd" d="M34.7817 16.9038H19.5352C18.3372 16.9038 17.3571 17.884 17.3571 19.0819V34.3285C17.3571 35.5264 18.3372 36.5066 19.5352 36.5066H34.7817C35.9797 36.5066 36.9598 35.5264 36.9598 34.3285V19.0819C36.9598 17.884 35.9797 16.9038 34.7817 16.9038ZM33.6927 21.8045H28.2475V23.9826H33.6927V21.8045ZM33.6927 29.4278H28.2475V31.6059H33.6927V29.4278ZM19.5352 34.3285H34.7817V19.0819H19.5352V34.3285ZM26.0694 20.1709H20.6242V25.6161H26.0694V20.1709ZM21.7133 24.5271H24.9804V21.26H21.7133V24.5271ZM26.0694 27.7942H20.6242V33.2394H26.0694V27.7942ZM21.7133 32.1504H24.9804V28.8833H21.7133V32.1504Z" fill="white"/>
                        </svg>                            
                        <h3 class="titulo-livro">Livro</h3>
                        <span class="legenda">Românce, ficção, poesia, ciência e muito mais</span>
                    </div>
                </a>
                <a class="material" href="materiais.jsp">
                    <div>
                        <svg class="svg-material" width="55" height="55" viewBox="0 0 55 55" fill="none" xmlns="http://www.w3.org/2000/svg">
                            <rect x="0.453247" width="54.5467" height="54.5467" rx="27.2734" fill="#F3849F"/>
                            <path fill-rule="evenodd" clip-rule="evenodd" d="M34.7817 16.9038H19.5351C18.3372 16.9038 17.3571 17.884 17.3571 19.0819V34.3285C17.3571 35.5264 18.3372 36.5066 19.5351 36.5066H34.7817C35.9796 36.5066 36.9598 35.5264 36.9598 34.3285V19.0819C36.9598 17.884 35.9796 16.9038 34.7817 16.9038ZM33.6926 21.8045H28.2474V23.9826H33.6926V21.8045ZM33.6926 29.4278H28.2474V31.6059H33.6926V29.4278ZM19.5351 34.3285H34.7817V19.0819H19.5351V34.3285ZM26.0693 20.1709H20.6241V25.6161H26.0693V20.1709ZM21.7132 24.5271H24.9803V21.26H21.7132V24.5271ZM26.0693 27.7942H20.6241V33.2394H26.0693V27.7942ZM21.7132 32.1504H24.9803V28.8833H21.7132V32.1504Z" fill="white"/>
                        </svg>                            
                        <h3 class="titulo-material">Material didático</h3>
                        <span class="legenda">Materias impressos e livros didáticos</span>
                    </div>
                </a>
            </div>
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
                    <p class="conteudo-endereco">Centro, Santa Rita do Sapucaí­, MG</p>
                    <p class="conteudo-endereco">37540-000</p>
                </section>
            </div>
        </footer>
    </body>
</html>

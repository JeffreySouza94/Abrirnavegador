#Author: jeferson.souza

Feature: Pesquisar no google
  Eu como usuario quero acessar o site para realizar uma pesquisa


  Scenario: Abrir pagina google
    Given que eu esteja no site "https://www.google.com/"  
    When pesquisar nike  
    Then valido as informacoes
   

  
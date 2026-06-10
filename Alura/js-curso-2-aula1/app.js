let numeroSecreto = GerarNumeroAleatorio();
let contador = 1;
function ExibirTextoNaTela(tag, texto) {
  let campo = document.querySelector(tag);
  campo.innerHTML = texto;
}
ExibirTexto();
function ExibirTexto() {
  ExibirTextoNaTela("h1", "Jogo do número secreto");
  ExibirTextoNaTela("p", "Escolha um número entre 1 e 10");
}
function VerificarChute() {
  let chute = document.querySelector("input").value;
  if (chute === "") {
    ExibirTextoNaTela("h1", "Coloque algum numero");
    ExibirTextoNaTela("p", "");
    return;
  }
  if (chute == numeroSecreto) {
    let exibirTentativas = "Voce acertou com " + contador + " tentativas!";
    ExibirTextoNaTela("h1", "Parabens");
    ExibirTextoNaTela("p", exibirTentativas);
    document.getElementById("reiniciar").removeAttribute("disabled");
  } else {
    if (chute > numeroSecreto)
      ExibirTextoNaTela("p", "O número secreto é menor");
    else ExibirTextoNaTela("p", "O número secreto é maior");
  }
  contador++;
  LimparCampo();
  console.log(chute == numeroSecreto);
}
function LimparCampo() {
  let chute = document.querySelector("input");
  chute.value = "";
}
function GerarNumeroAleatorio() {
  return parseInt(Math.random() * 10 + 1);
}
function Reiniciar(){
  numeroSecreto = GerarNumeroAleatorio();
  LimparCampo();
  contador = 1;
  ExibirTexto();
  document.getElementById("reiniciar").setAttribute("disabled", true);
}
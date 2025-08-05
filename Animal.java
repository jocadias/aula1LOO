public class Animal {
    // atributos da classe
    String tipoAnimal;
    String nomeAnimal;
    int numeroDePatas;
    boolean temRabo;
    String cor;
    int idade;
    double peso;
    String tipoAlimentacao;
    char genero;
    String somAnimal;
    
//Método para imprimir os atributos do animal
public void printStatus() {
    System.out.println("Qual é o animal: " + tipoAnimal);
    System.out.println("Nome: " + nomeAnimal);
    System.out.println("Número de patas: " + numeroDePatas);
    System.out.println("Tem rabo? " + temRabo);
    System.out.println("Cor: " + cor);
    System.out.println("Idade: " + idade);
    System.out.println("Peso: " + peso);
    System.out.println("Tipo de alimentação: " + tipoAlimentacao);
    System.out.println("Gênero: " + genero);
    System.out.println("Som que ele emite: " + somAnimal);
    System.out.println("-------------------");
}
// Método principal (main)
public static void main(String[] args) {
    // Criando o primeiro animal
    Animal cachorro = new Animal();
    cachorro.tipoAnimal = "Cachorro";
    cachorro.nomeAnimal = "Euclides";
    cachorro.numeroDePatas = 4;
    cachorro.temRabo = true;
    cachorro.cor = "Branco e preto";
    cachorro.idade = 3;
    cachorro.peso = 12.5;
    cachorro.tipoAlimentacao = "Ração";
    cachorro.genero = 'M';
    cachorro.somAnimal = "AuAuaAu";
//Criando o segundo animal
    Animal gato = new Animal();
    gato.tipoAnimal = "Gato";
    gato.nomeAnimal = "Mingau";
    gato.numeroDePatas = 4;
    gato.temRabo = true;
    gato.cor = "Cinza";
    gato.idade = 36;
    gato.peso = 4.2;
    gato.tipoAlimentacao = "Ração e peixe";
    gato.genero = 'F';
    gato.somAnimal = "Miau";
// Criando o terceiro animal
    Animal camelo = new Animal();
    camelo.tipoAnimal = "Camelo";
    camelo.nomeAnimal = "Arthur";
    camelo.numeroDePatas = 4;
    camelo.temRabo = true;
    camelo.cor = "bege";
    camelo.idade = 43;
    camelo.peso = 120;
    camelo.tipoAlimentacao = "Cactos verdes";
    camelo.genero = 'M';
    camelo.somAnimal = "Beeee";
     // Imprime status dos animais
        cachorro.printStatus();
        gato.printStatus();
        camelo.printStatus();
}

}

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.setNumeroConta(123456);
        conta.setSaldo(2500);
        conta.titular = "Vítor";

        System.out.println("Número da conta: " + conta.getNumeroConta());
        System.out.println("Saldo da conta: " + conta.getSaldo());
        System.out.println("Nome do titular da conta: " + conta.titular);

        conta.setSaldo(1500);
        System.out.println("Novo Saldo: " + conta.getSaldo());

        IdadePessoa idade = new IdadePessoa();
        idade.setIdade(26);
        idade.setNome("Vítor");
        System.out.println("Nome: " + idade.getNome());
        System.out.println("Idade: " + idade.getIdade() + " anos");
        idade.verificarIdade();
        idade.setIdade(15);
        System.out.println("Idade: " + idade.getIdade() + " anos");
        idade.verificarIdade();

        Produto produto = new Produto();
        produto.setNome("PS5");
        produto.setPreco(4500);
        System.out.println("Nome do produto: " + produto.getNome());
        System.out.println("Preço do produto: " + produto.getPreco());
        produto.aplicarDesconto(15);
        System.out.println("Preço do produto com 15% de desconto: " + produto.getPreco());

        Aluno aluno = new Aluno();
        aluno.setNome("Vítor");
        System.out.println("Nome do aluno: " + aluno.getNome());
        aluno.setNota1(8);
        System.out.println("Primeira nota: " + aluno.getNota1());
        aluno.setNota2(9);
        System.out.println("Segunda nota: " + aluno.getNota2());
        aluno.setNota3(3);
        System.out.println("Terceira nota: " + aluno.getNota3());
        aluno.setNota4(5);
        System.out.println("Quarta nota: " + aluno.getNota4());
        aluno.calcularMedia();


        Livro livro = new Livro();
        livro.setTitulo("Harry Potter e a Pedra Filosofal");
        livro.setAutor("J.K. Rowling");
        livro.exibirDetalhes();


    }
}
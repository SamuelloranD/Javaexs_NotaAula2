class Conta {
    private String titular;
    private double saldo;
    private double chequeEspecial = 1000.00;

    public Conta(String titular) {
        this.titular = titular;
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente. Tentando cheque especial...");
            usarChequeEspecial(valor);
        }
    }

    private void usarChequeEspecial(double valor) {
        if (valor <= saldo + chequeEspecial) {
            double saldoRestante = valor - saldo;
            chequeEspecial -= saldoRestante;
            saldo = 0;
            System.out.println("Cheque especial utilizado. Saldo agora é R$ " + saldo + ". Cheque especial disponível: R$ " + chequeEspecial);
        } else {
            System.out.println("Saldo insuficiente, mesmo com cheque especial.");
        }
    }

    public void calcularRendimento(double selic) {
        double rendimento;
        if (selic > 8.5) {
            rendimento = saldo * 0.005;
        } else {
            rendimento = saldo * (0.7 * (selic / 100) / 12);
        }
        saldo += rendimento;
        System.out.println("Rendimento de " + rendimento + " aplicado. Novo saldo: R$ " + saldo);
    }

    public void exibirDados() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: R$ " + saldo);
        System.out.println("Cheque especial disponível: R$ " + chequeEspecial);
    }
}

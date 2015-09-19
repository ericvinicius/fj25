package br.com.caelum.financas.teste;

import javax.persistence.EntityManager;

import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.modelo.Movimentacao;
import br.com.caelum.financas.util.JPAUtil;

public class insereMovimentacao {
	public static void main(String... args) {
		EntityManager manager = new JPAUtil().getEntityManager();

		Conta conta = new Conta().autoCreate();
		Movimentacao movimentacao = new Movimentacao().autoCreate();
		movimentacao.setConta(conta);

		manager.getTransaction().begin();
		manager.persist(movimentacao);
		manager.getTransaction().commit();
		manager.close();

	}
}

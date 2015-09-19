package br.com.caelum.financas.teste;

import javax.persistence.EntityManager;

import br.com.caelum.financas.dao.ContaDao;
import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.util.JPAUtil;

public class TestaInsereConta {

	public static void main(String[] args) {
		long incio = System.currentTimeMillis();

		EntityManager manager = new JPAUtil().getEntityManager();
		ContaDao contaDao = new ContaDao(manager);

		Conta conta = new Conta().autoCreate();

		manager.getTransaction().begin();
		contaDao.adiciona(conta);
		manager.getTransaction().commit();
		manager.close();

		long fim = System.currentTimeMillis();
		System.out.println("Tempo = " + (fim - incio) + "ms");
		System.out.println("Conta Gravada Com Sucesso!");

	}

}

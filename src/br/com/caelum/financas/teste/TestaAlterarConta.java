package br.com.caelum.financas.teste;

import javax.persistence.EntityManager;

import br.com.caelum.financas.dao.ContaDao;
import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.util.JPAUtil;

public class TestaAlterarConta {
	public static void main(String... args){
		long incio = System.currentTimeMillis();

		EntityManager manager = new JPAUtil().getEntityManager();
		ContaDao contaDao = new ContaDao(manager);

		manager.getTransaction().begin();

		Conta conta = contaDao.busca(1);
		conta.setTitular("BLAAAA");

		manager.getTransaction().commit();
		manager.close();

		long fim = System.currentTimeMillis();
		System.out.println("Tempo = " + (fim - incio) + "ms");
	}
}

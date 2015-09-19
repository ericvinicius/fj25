package br.com.caelum.financas.teste;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.caelum.financas.dao.ContaDao;
import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.util.JPAUtil;

public class TestaListagemConta {
	public static void main(String... args) {
		long incio = System.currentTimeMillis();

		EntityManager manager = new JPAUtil().getEntityManager();
		ContaDao contaDao = new ContaDao(manager);
		
		manager.getTransaction().begin();
		
		List<Conta> lista = contaDao.lista();
		
		for (Conta conta : lista) {
			System.out.println(conta.getNumero());
		}
		
		manager.getTransaction().commit();
		manager.close();

		long fim = System.currentTimeMillis();
		System.out.println("Tempo = " + (fim - incio) + "ms");
	}
}

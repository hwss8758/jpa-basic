package me.wonsang

import javax.persistence.Persistence

class KotlinMain

fun main(args: Array<String>) {
    val emf = Persistence.createEntityManagerFactory("hello")

    val em = emf.createEntityManager()

    // entityManager에서 transaction을 얻어온다.
    val transaction = em.transaction

    // transaction 시작
    transaction.begin()

    val resultList = em.createQuery("select m from Member as m", Member::class.java)
            .resultList

    println(resultList)

    // transaction commit
    transaction.commit()

    em.close()

    emf.close()
}
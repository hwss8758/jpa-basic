package me.wonsang

import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class Member(
        @Id
        var id: Long? = null,
        var name: String? = null
)